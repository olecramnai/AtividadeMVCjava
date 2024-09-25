public class PessoaController {
    private PessoaView view;

    public PessoaController(PessoaView view) {
        this.view = view;
    }

    public void cadastrarPessoa() {
        String nome = view.solicitarNome();
        int idade = view.solicitarIdade();
        Pessoa pessoa = new Pessoa(nome, idade);
        view.exibirPessoa(pessoa);
    }
}
