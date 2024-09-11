public class Principal {
    public static void main(String[] args) throws Exception {
        Modelo modelo = new Modelo(10);
        Visao visao = new Visao();
        Controlador controlador = new Controlador(modelo, visao);

        controlador.iniciar();
    }
}
