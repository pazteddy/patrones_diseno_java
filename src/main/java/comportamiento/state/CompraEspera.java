package comportamiento.state;

public class CompraEspera implements EstadoCompra {
    private Compra compra;

    @Override
    public void reservar() {
        System.out.println("Ya se realizo la compra");
    }

    @Override
    public void enEspera() {
        System.out.println("Se realizo la espera");
    }

    @Override
    public void verificar() {
        System.out.println("Pago correcto");
        System.out.println("Verificando el trayecto del vuelo..");
        compra.setEstado(new CompraVerificada());
    }

    @Override
    public void compra() {
        System.out.println("Todavia no se puede comprar, la compra esta en espera");
    }

    @Override
    public void cancelar() {
        System.out.println("Se revirtio el pago");
        System.out.println("Se cancelo la compra");
        compra.setEstado(new NoCompra());
    }
    @Override
    public void anular() {
        System.out.println("Todavia no se puede anular, la compra esta en espera");
    }

    @Override
    public void setCompra(Compra compra) {
        this.compra = compra;
    }
}
