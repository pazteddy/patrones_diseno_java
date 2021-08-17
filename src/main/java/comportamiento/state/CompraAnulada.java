package comportamiento.state;

public class CompraAnulada implements EstadoCompra {
    private Compra compra;

    @Override
    public void reservar() {
        System.out.println("No se puede reservar cuando esta anulado");
    }

    @Override
    public void enEspera() {
        System.out.println("No se puede poner en espera cuando esta anulado");
    }

    @Override
    public void verificar() {
        System.out.println("No se puede verificar cuando esta anulado");
    }

    @Override
    public void compra() {
        System.out.println("No se puede comprar cuando esta anulado");
    }

    @Override
    public void cancelar() { System.out.println("No se puede cancelar cuando esta reservado"); }

    @Override
    public void anular() {
        System.out.println("Compra anulada satisfactoriamente");
        compra.setEstado(new NoCompra());
    }

    @Override
    public void setCompra(Compra compra) {
        this.compra = compra;
    }
}
