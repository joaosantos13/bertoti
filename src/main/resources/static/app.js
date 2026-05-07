const API_URL = '/produtos';

function mostrarTela(idTela) {
    document.querySelectorAll('.tela').forEach(tela => {
        tela.classList.remove('ativa');
    });

    document.getElementById(idTela).classList.add('ativa');

    if (idTela === 'comprar-produtos') {
        carregarProdutos();
    }
}

async function carregarProdutos() {
    const listaContainer = document.getElementById('lista-produtos');

    try {
        const resposta = await fetch(API_URL);

        if (!resposta.ok) {
            throw new Error('Erro ao buscar produtos');
        }

        const produtos = await resposta.json();

        listaContainer.innerHTML = '';

        if (produtos.length === 0) {
            listaContainer.innerHTML =
                '<p>Nenhum produto cadastrado.</p>';
            return;
        }

        produtos.forEach(produto => {

            if (produto.estoque === undefined) {
                produto.estoque = 0;
            }

            const card = document.createElement('div');

            card.className = 'card-produto';

            card.innerHTML = `
                <h3>${produto.nome}</h3>

                <p class="preco">
                    R$ ${produto.preco.toFixed(2).replace('.', ',')}
                </p>

                <p class="estoque">
                    Estoque: ${produto.estoque}
                </p>

                <button
                    class="btn-comprar"
                    onclick='comprarProduto(${JSON.stringify(produto)})'
                    ${produto.estoque <= 0 ? 'disabled' : ''}
                >
                    ${produto.estoque <= 0 ? 'Sem estoque' : 'Comprar'}
                </button>
            `;

            listaContainer.appendChild(card);
        });

    } catch (erro) {
        console.error(erro);

        listaContainer.innerHTML =
            '<p class="erro">Erro ao carregar produtos.</p>';
    }
}

async function comprarProduto(produto) {

    if (produto.estoque <= 0) {
        alert('Produto sem estoque.');
        return;
    }

    try {

        produto.estoque = produto.estoque - 1;

        const resposta = await fetch(`${API_URL}/${produto.id}`, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(produto)
        });

        if (!resposta.ok) {
            throw new Error('Erro ao atualizar estoque');
        }

        carregarProdutos();

    } catch (erro) {
        console.error('Erro ao comprar produto:', erro);
        alert('Erro ao comprar produto.');
    }
}

document.getElementById('form-produto').addEventListener('submit', async function(evento) {

    evento.preventDefault();

    const produto = {
        nome: document.getElementById('nome').value,
        preco: parseFloat(document.getElementById('preco').value),
        estoque: parseInt(document.getElementById('estoque').value)
    };

    try {

        const resposta = await fetch(API_URL, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(produto)
        });

        if (resposta.ok) {

            alert('Produto adicionado com sucesso!');

            document.getElementById('form-produto').reset();

            mostrarTela('comprar-produtos');

        } else {
            alert('Erro ao salvar produto.');
        }

    } catch (erro) {
        console.error('Erro:', erro);
    }
});
