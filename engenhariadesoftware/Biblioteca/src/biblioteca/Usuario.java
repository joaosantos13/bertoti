package biblioteca;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Usuario {
    private String nome;
    private String id;
    private List<Emprestimo> emprestimos;

    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
        this.emprestimos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void realizarEmprestimo(Livro livro) {
        if (livro == null || !livro.isDisponivel()) {
            System.out.println("Livro indisponível para empréstimo.");
            return;
        }

        Emprestimo novoEmprestimo = new Emprestimo(this, livro);
        emprestimos.add(novoEmprestimo);
        livro.setDisponivel(false);
        System.out.println("Empréstimo registrado para " + nome + ": " + livro.getNome());
    }

    public void devolverLivro(String tituloLivro) {
        Iterator<Emprestimo> iterator = emprestimos.iterator();
        boolean devolvido = false;

        while (iterator.hasNext()) {
            Emprestimo e = iterator.next();
            if (e.getLivro().getNome().equalsIgnoreCase(tituloLivro)) {
                e.getLivro().setDisponivel(true);
                iterator.remove(); 
                devolvido = true;
                System.out.println("Livro devolvido com sucesso: " + tituloLivro);
                break;
            }
        }

        if (!devolvido) {
            System.out.println("Este usuário não possui esse livro emprestado.");
        }
    }

    public void listarEmprestimos() {
        System.out.println("Empréstimos de " + nome + ":");
        for (Emprestimo e : emprestimos) {
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return "Usuário{" +
                "nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
