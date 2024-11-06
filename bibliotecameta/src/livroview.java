import java.util.Scanner;

public class livroview {
    private Scanner scanner;

    public livroview() {
        scanner = new Scanner(System.in);
    }

    public Livros coletarDadosLivros() {
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();

        System.out.println("Digite o nome do autor:");
        String autor = scanner.nextLine();
        //scanner.nextLine(); 

        System.out.println("Digite o ano de publicação do livro:");
        int ano_publicacao = scanner.nextInt();

        return new Livros(titulo, autor, ano_publicacao);
    }

    public int coletarId() {
        System.out.println("Digite o ID do livro: ");
        return scanner.nextInt();
    }

    public Livros coletarDadosAtualizados() {
        System.out.println("Digite o novo título do livro:");
        String titulo = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Digite o novo autor do livro:");
        String autor = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Digite o novo ano de publicação do livro:");
        int ano_publicacao = scanner.nextInt();

        return new Livros(titulo, autor, ano_publicacao);
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
