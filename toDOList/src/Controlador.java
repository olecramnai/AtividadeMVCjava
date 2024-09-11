import java.util.Scanner;

public class Controlador {
    private Modelo modelo;
    private Visao visao;
    private Scanner scanner;

    public Controlador(Modelo modelo, Visao visao){
        this.modelo = modelo;
        this.visao = visao;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar(){
        String comando;
        do{
            System.out.println("Digite um comando (adicionar, listar, sair): ");
            comando = scanner.nextLine();
            switch (comando) {
                case "adicionar":
                    System.out.println("Digite a tarefa para adicionar: ");
                    String tarefa = scanner.nextLine();
                    modelo.adicionarTarefa(tarefa);
                    break;
                
                case "listar":
                    visao.exibirTarefas(modelo.obterTarefas(), modelo.obterQuantidade());
                    break;

                case "sair":
                    System.out.println("Saindo...");
                    break;
            
                default:
                    System.out.println("Comando desconhecido");
                    break;
            }
        } while (!comando.equals("sair"));
    }
}
