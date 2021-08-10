package creacionales.factorymethod;

public class appFactory {
    public void displayFactory() {
        Pago pago = PagoFactory.crearPago(TipoPago.TARJETA);
        pago.realizarPago(100.50);
    }
}
