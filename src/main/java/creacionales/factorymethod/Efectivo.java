package creacionales.factorymethod;

public class Efectivo implements Pago{

    @Override
    public void realizarPago(double dinero) {
        System.out.printf("Pago con efectivo: %.2f\n", dinero);
    }
}
