package creacionales.factorymethod;

public class TarjetaCredito implements Pago{
    @Override
    public void realizarPago(double dinero) {
        System.out.printf("Pago con tarjeta de credito: %.2f\n", dinero);
    }
}
