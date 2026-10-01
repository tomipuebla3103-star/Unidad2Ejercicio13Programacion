public class LectorTarjeta {
    ControladorDeAcesso controlador;

    public LectorTarjeta(ControladorDeAcesso controlador) {
        this.controlador = controlador;
    }

    public void pasarTarjeta(TarjetRFID tarjeta, String zona) {

        System.out.println("Leyendo tarjeta " + tarjeta.codigo);

        boolean acceso = controlador.verificarAcceso(tarjeta, zona);

        if (acceso) {
            System.out.println("Acceso permitido.");
        } else {
            System.out.println("Acceso denegado.");
        }
    }
}
