public class Visao {
    public void exibirFilmes (String[] filmes, int quantidade){
        System.out.println("Lista de Filmes: ");
        for (int i = 0; i < quantidade; i++){
            System.out.println((i + 1) + ". "+ filmes[i]);
        }
    }
}
