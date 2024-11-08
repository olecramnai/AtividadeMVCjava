import java.util.Scanner;

public class alunoview {
    private Scanner scanner;

    public alunoview() {
        scanner = new Scanner(System.in);
    }

    public Alunos coletarDadosAlunos() {
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        scanner.nextLine(); 

        System.out.println("Digite a idade do aluno:");
        int idade = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Digite o ano escolar do aluno:");
        String ano_escolar = scanner.nextLine();

        return new Alunos(nome, idade, ano_escolar);
    }

    public int coletarId() {
        System.out.println("Digite o ID do aluno:");
        return scanner.nextInt();
    }

    public Alunos coletarDadosAtualizados() {
        System.out.println("Digite o novo nome do aluno:");
        String nome = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Digite a nova idade do aluno:");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o novo ano escolar do aluno:");
        String ano_escolar = scanner.nextLine();

        return new Alunos(nome, idade, ano_escolar);
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
