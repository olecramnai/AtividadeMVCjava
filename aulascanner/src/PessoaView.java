import java.util.Scanner;

    public class PessoaView {
        private Scanner scanner = new Scanner(System.in);
    
    public String solicitarNome() {
        System.out.print("Digite o nome: ");
        return scanner.nextLine();
    }
    
    public int solicitarIdade() {
        System.out.print("Digite a idade: ");
        return scanner.nextInt();
    }
    
    public void exibirPessoa (Pessoa pessoa){
        System.out.println("Pessoa cadastrada:");
        System.out.println("Nome: "+ pessoa.getNome() + "Idade: "+ pessoa.getIdade());
    }
}
