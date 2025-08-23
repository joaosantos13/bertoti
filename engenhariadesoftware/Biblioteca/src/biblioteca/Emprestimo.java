package biblioteca;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataEmprestimo;

    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public boolean isAtrasado() {
        long dias = ChronoUnit.DAYS.between(dataEmprestimo, LocalDate.now());
        return dias > 14;
    }

    public long diasDesdeEmprestimo() {
        return ChronoUnit.DAYS.between(dataEmprestimo, LocalDate.now());
    }

    @Override
    public String toString() {
        return "Empréstimo{" +
                "usuario=" + usuario.getNome() +
                ", livro=" + livro.getNome() +
                ", data=" + dataEmprestimo +
                ", atrasado=" + (isAtrasado() ? "Sim" : "Não") +
                '}';
    }
}


