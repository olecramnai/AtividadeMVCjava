public class alunocontroller {
    private alunoview view;

    public alunocontroller(alunoview view) {
        this.view = view;
    }

    public void inserirAluno() {
        Alunos alunos = view.coletarDadosAlunos();
        Alunos.salvarAluno(alunos);
        view.mostrarMensagem("Aluno inserido com sucesso!");
    }

    public void listaralunos() {
        Alunos.listarAlunos();
    }

    public void atualizarAluno() {
        int id = view.coletarId();
        Alunos alunoAtualizado = view.coletarDadosAtualizados();
        Alunos.atualizarAluno(id, alunoAtualizado.getNome(), alunoAtualizado.getIdade(), alunoAtualizado.getAno_escolar());
    }

    public void deletarAluno() {
        int id = view.coletarId();
        Alunos.deletarAluno(id);
    }
}
