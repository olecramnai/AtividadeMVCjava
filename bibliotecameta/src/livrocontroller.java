public class livrocontroller {
    private livroview view;

    public livrocontroller(livroview view) {
        this.view = view;
    }

    public void inserirLivro() {
        Livros livros = view.coletarDadosLivros();
        Livros.salvarLivro(livros);
        view.mostrarMensagem("Livro inserido com sucesso!");
    }

    public void listarLivros() {
        Livros.listarlivros();
    }

    public void atualizarLivro() {
        int id = view.coletarId();
        Livros livroAtualizado = view.coletarDadosAtualizados();
        Livros.atualizarLivro(id, livroAtualizado.getTitulo(), livroAtualizado.getAutor(), livroAtualizado.getAno_publicacao());
    }

    public void deletarLivro() {
        int id = view.coletarId();
        Livros.deletarLivro(id);
    }
}
