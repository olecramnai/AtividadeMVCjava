public class Modelo {
    private String[] filmes;
    private int quantidade;

    public Modelo(int tamanho){
        filmes = new String[tamanho];
        quantidade = 0;
    }

    public void adicionarFilme(String filme){
        if (quantidade < filmes.length){
            filmes[quantidade++] = filme;
        }
    }
    
    public boolean removerFilme(String filme) {
        for (int i = 0; i < quantidade; i++) {
            if (filmes[i].equals(filme)) {
                for (int j = i; j < quantidade - 1; j++) {
                    filmes[j] = filmes[j + 1];
                }
                filmes[quantidade - 1] = null; 
                quantidade--;
                return true; 
            }
        }
        return false; 
    }

    public String[] obterFilmes(){
        return filmes;
    } 

    public int obterQuantidade(){
        return quantidade;
    }
}
