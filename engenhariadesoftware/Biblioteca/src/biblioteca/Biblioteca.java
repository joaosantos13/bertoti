package biblioteca;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Usuario> usuarios;
    private List<Livro> livros;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.usuarios = new ArrayList<>();
        this.livros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        if (usuario == null) {
            System.out.println("Não é possível adicionar um usuário nulo.");
            return;
        }

        for (Usuario u : usuarios) {
            if (u.getId().equals(usuario.getId())) {
                System.out.println("Usuário com esse ID já existe.");
                return;
            }
        }

        usuarios.add(usuario);
        System.out.println("Usuário adicionado com sucesso: " + usuario.getNome());
         
    }
    
    public void adicionarLivro(Livro livro) {
        if (livro == null) {
            System.out.println("Não é possível adicionar um livro nulo.");
            return;
        }

        for (Livro l : livros) {
            if (l.getNome().equalsIgnoreCase(livro.getNome()) &&
                l.getAutor().equalsIgnoreCase(livro.getAutor())) {
                System.out.println("Esse livro já está registrado na biblioteca.");
                return;
            }
        }

        livros.add(livro);
        System.out.println("Livro adicionado com sucesso: " + livro.getNome());
    }
    
    public void emprestarLivro(String idUsuario, String tituloLivro) {
        Usuario usuarioEncontrado = null;
        for (Usuario u : usuarios) {
            if (u.getId().equals(idUsuario)) {
                usuarioEncontrado = u;
                break;
            }
        }

        if (usuarioEncontrado == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }

        Livro livroEncontrado = null;
        for (Livro l : livros) {
            if (l.getNome().equalsIgnoreCase(tituloLivro)) {
                livroEncontrado = l;
                break;
            }
        }

        if (livroEncontrado == null) {
            System.out.println("Livro não encontrado.");
            return;
        }

        if (!livroEncontrado.isDisponivel()) {
            System.out.println("Livro não está disponível para empréstimo.");
            return;
        }

        livroEncontrado.setDisponivel(false);
        Emprestimo emprestimo = new Emprestimo(usuarioEncontrado, livroEncontrado);
        emprestimos.add(emprestimo);

        System.out.println("Livro emprestado com sucesso!");
        System.out.println(emprestimo);
    }


    public void listarUsuarios() {
        System.out.println("Lista de usuários:");
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }
    
    public void listarLivros() {
        System.out.println("Lista de livros na biblioteca:");
        for (Livro l : livros) {
            System.out.println(l);
        }
    }
    
    public void listarEmprestimos() {
        System.out.println("Empréstimos registrados:");
        for (Emprestimo e : emprestimos) {
            System.out.println(e);
        }
    }
}
