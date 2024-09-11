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
    
    public void removerFilme(String filme){
        if (quantidade < filmes.length){
            filmes[quantidade--] = filme;
        }
    }

    public String[] obterFilmes(){
        return filmes;
    } 

    public int obterQuantidade(){
        return quantidade;
    }
}
