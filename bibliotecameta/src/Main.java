import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        livroview view = new livroview();
        livrocontroller controller = new livrocontroller(view);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Inserir Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Atualizar Livro");
            System.out.println("4. Deletar Livro");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    controller.inserirLivro();
                    break;
                case 2:
                    System.out.println("Livros listados:");
                    controller.listarLivros();
                    break;
                case 3:
                    controller.atualizarLivro();
                    break;
                case 4:
                    controller.deletarLivro();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
