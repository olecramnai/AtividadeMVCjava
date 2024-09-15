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
            System.out.println("Digite um comando (adicionar filme, remover filme, listar filmes, sair): ");
            comando = scanner.nextLine();
            switch (comando) {
                case "adicionar filme", "adicionar","filme":
                    System.out.println("Digite um filme que deseja adicionar a lista: ");
                    String filme = scanner.nextLine();
                    modelo.adicionarFilme(filme);
                    break;

                case "remover filme", "remover":
                    System.out.println("Digite o nome do filme que deseja remover:");
                    String tituloParaRemover = scanner.nextLine();
                    boolean removido = modelo.removerFilme(tituloParaRemover);
                        if (removido) {
                            System.out.println("Filme '" + tituloParaRemover + "' removido com sucesso.");
                        } else {
                            System.out.println("Filme '" + tituloParaRemover + "' não encontrado.");
                        }
                break;

                case "listar filmes", "listar", "lista":
                    visao.exibirFilmes(modelo.obterFilmes(), modelo.obterQuantidade());
                break;

                case "sair":
                    System.out.println("Saindo...");
                break;
            
                default:
                    System.out.println("Comando desconhecido");
                break;
            }
        }while (!comando.equals("sair"));
    }
}
