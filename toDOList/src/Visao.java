public class Visao {
    public void exibirTarefas(String[] tarefas, int quantidade) {
        System.out.println("Lista de Tarefas: ");
        for (int i = 0; i < quantidade; i++){
            System.out.println((i + 1) + ". "+ tarefas[i]);
        }
    }
}
