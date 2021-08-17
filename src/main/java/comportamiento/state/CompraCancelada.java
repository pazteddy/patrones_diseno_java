package comportamiento.state;

public class CompraCancelada implements EstadoCompra {
    private Compra compra;

    @Override
    public void reservar() {
        System.out.println("No se puede reservar cuando esta cancelado");
    }

    @Override
    public void enEspera() {
        System.out.println("No se puede poner en espera cuando esta cancelado");
    }

    @Override
    public void verificar() {
        System.out.println("No se puede verificar cuando esta cancelado");
    }

    @Override
    public void compra() {
        System.out.println("No se puede comprar cuando esta cancelado");
    }

    @Override
    public void cancelar() {
        System.out.println("Se cancelo la compra");
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
