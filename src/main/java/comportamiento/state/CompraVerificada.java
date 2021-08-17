package comportamiento.state;

public class CompraVerificada implements EstadoCompra {
    private Compra compra;

    @Override
    public void reservar() {
        System.out.println("Ya se realizo la compra");
    }

    @Override
    public void enEspera() {
        System.out.println("Ya se realizo la espera");
    }

    @Override
    public void verificar() {
        System.out.println("Ya se realizo la verificación");
    }

    @Override
    public void compra() {
        System.out.println("Se realizo la compra, gracias por su compra!");
        compra.setEstado(new NoCompra());
    }

    @Override
    public void cancelar() {
        System.out.println("No se puede cancelar una compra, solo se la puede anular");
    }

    @Override
    public void anular() {
        System.out.println("Anulada satisfactoriamente!");
        compra.setEstado(new NoCompra());
    }

    @Override
    public void setCompra(Compra compra) {
        this.compra = compra;
    }
}
