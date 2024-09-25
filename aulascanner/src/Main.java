public class Main {
    public static void main(String[] args) throws Exception {
        PessoaView view = new PessoaView();
        PessoaController controller = new PessoaController(view);
        controller.cadastrarPessoa();
    }
}
