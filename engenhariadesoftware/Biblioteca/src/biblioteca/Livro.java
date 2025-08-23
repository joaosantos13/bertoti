package biblioteca;

public class Livro {
    private String Nome;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.Nome = titulo;
        this.autor = autor;
        this.disponivel = true; 
    }

    public String getNome() {
        return Nome;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
    
    public void setDisponivel(Boolean b) {
        this.disponivel = b;
    }

    public void emprestar() {
        if (!disponivel) {
            System.out.println("Livro já está emprestado.");
        } else {
            disponivel = false;
            System.out.println("Livro emprestado: " + Nome);
        }
    }

    public void devolver() {
        if (disponivel) {
            System.out.println("Livro já está disponível.");
        } else {
            disponivel = true;
            System.out.println("Livro devolvido: " + Nome);
        }
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + Nome + '\'' +
                ", autor='" + autor + '\'' +
                ", disponivel=" + (disponivel ? "Sim" : "Não") +
                '}';
    }
}
