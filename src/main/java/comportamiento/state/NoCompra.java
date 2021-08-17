package comportamiento.state;

public class NoCompra implements EstadoCompra{
    private Compra compra;

    @Override
    public void reservar() {
        System.out.println("Pasaje reservado");
        compra.setEstado(new CompraCreada());
    }

    @Override
    public void enEspera() {
        System.out.println("No se puede pagar sin compra");
    }

    @Override
    public void verificar() {
        System.out.println("No se puede verificar sin realizar una compra");
    }

    @Override
    public void compra() {
        System.out.println("No hay reserva para comprar");
    }

    @Override
    public void cancelar() {
        System.out.println("No se puede cancelar si se realizo la compra, solo se puede anular");
    }

    @Override
    public void anular() {
        System.out.println("Compra anulada satisfactoriamente");
    }

    @Override
    public void setCompra(Compra compra) {
        this.compra = compra;
    }
}
