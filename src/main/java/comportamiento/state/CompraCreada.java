package comportamiento.state;

public class CompraCreada implements EstadoCompra {
    private Compra compra;

    @Override
    public void reservar() {
        System.out.println("Ya se realizo la compra");
    }

    @Override
    public void enEspera() {
        System.out.println("Realizando pago...");
        compra.setEstado(new CompraEspera());
    }

    @Override
    public void verificar() {
        System.out.println("No se puede verificar antes del pago");
    }

    @Override
    public void compra() {
        System.out.println("No se puede comprar antes de reservar");
    }

    @Override
    public void cancelar() {
        System.out.println("Se cancelo la reserva");
        compra.setEstado(new NoCompra());
    }
    @Override
    public void anular() {
        System.out.println("No se puede anular cuando no esta comprado");
    }

    @Override
    public void setCompra(Compra compra) {
        this.compra = compra;
    }
}
