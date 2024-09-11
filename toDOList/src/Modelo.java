public class Modelo {
    private String[] tarefas;
    private int quantidade;

    public Modelo(int tamanho){
        tarefas = new String[tamanho];
        quantidade = 0;
    }

    public void adicionarTarefa(String tarefa){
        if (quantidade < tarefas.length){
            tarefas[quantidade++] = tarefa;
        }
    }

    public String[] obterTarefas(){
        return tarefas;
    }

    public int obterQuantidade() {
        return quantidade;
    }
}
