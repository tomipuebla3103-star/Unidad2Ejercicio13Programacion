//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ControladorDeAcesso controlador = new ControladorDeAcesso(
            "Laboratorio",
            2
    );

    LectorTarjeta lector = new LectorTarjeta(controlador);

    TarjetRFID tarjetaValida = new TarjetRFID(
            "RFID001",
            3
    );

    TarjetRFID tarjetaInvalida = new TarjetRFID(
            "RFID002",
            1
    );

    System.out.println("--- TARJETA VALIDA ---");
    lector.pasarTarjeta(tarjetaValida, "Laboratorio");

    System.out.println("\n--- TARJETA INVALIDA ---");
    lector.pasarTarjeta(tarjetaInvalida, "Laboratorio");
}
