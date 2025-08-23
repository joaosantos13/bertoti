package biblioteca;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.time.LocalDate;


public class main 
{
	public static void main(String[] args)
	{
        Biblioteca biblioteca = new Biblioteca();

        Usuario usuario = new Usuario("Maria", "U001");

        Livro livro = new Livro("Dom Casmurro", "Machado de Assis");

        biblioteca.adicionarUsuario(usuario);
        biblioteca.adicionarLivro(livro);

        biblioteca.emprestarLivro("U001", "Dom Casmurro");

        livro.devolver(); 
        usuario.realizarEmprestimo(livro); 

        usuario.listarEmprestimos();

        usuario.devolverLivro("Dom Casmurro");

        Emprestimo emprestimo = new Emprestimo(usuario, livro);
        System.out.println(emprestimo);

        System.out.println("Dias desde o empréstimo: " + emprestimo.diasDesdeEmprestimo());
        System.out.println("Está atrasado? " + (emprestimo.isAtrasado() ? "Sim" : "Não"));
		
	}
}
