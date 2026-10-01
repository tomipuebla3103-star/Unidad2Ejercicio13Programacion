public class ControladorDeAcesso {
    String zonaPermitida;
    int nivelNecesario;

    public ControladorDeAcesso(String zonaPermitida, int nivelNecesario) {
        this.zonaPermitida = zonaPermitida;
        this.nivelNecesario = nivelNecesario;
    }

    public boolean verificarAcceso(TarjetRFID tarjeta, String zona) {

        if (zona.equals(zonaPermitida) && tarjeta.nivelAcceso >= nivelNecesario) {
            return true;
        } else {
            return false;
        }
    }
}
