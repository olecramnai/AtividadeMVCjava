import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        alunoview view = new alunoview();
        alunocontroller controller = new alunocontroller(view);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Inserir Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Atualizar Aluno");
            System.out.println("4. Deletar Aluno");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    controller.inserirAluno();
                    break;
                case 2:
                    System.out.println("Alunoa listados:");
                    controller.listaralunos();
                    break;
                case 3:
                    controller.atualizarAluno();
                    break;
                case 4:
                    controller.deletarAluno();
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