package creacionales.factorymethod;

public class PagoFactory {
    public static Pago crearPago(TipoPago tipoPago) {
        switch (tipoPago) {
            case EFECTIVO:
                return new Efectivo();
            case TARJETA:
                return new TarjetaCredito();
            default:
                System.out.println("No se pudo efectuar el pago");
                return null;
        }
    }
}
