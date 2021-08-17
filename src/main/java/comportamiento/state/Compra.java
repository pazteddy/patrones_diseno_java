package comportamiento.state;

public class Compra {
    private EstadoCompra estado;

    public Compra() {
        setEstado(new NoCompra());
    }

    public void setEstado(EstadoCompra estado) {
        this.estado = estado;
        this.estado.setCompra(this);
    }

    public void reservar(){
        this.estado.reservar();
    }
    public void enEspera(){
        this.estado.enEspera();
    }
    public void verificar(){
        this.estado.verificar();
    }
    public void compra(){
        this.estado.compra();
    }
    public void cancelar(){
        this.estado.cancelar();
    }
    public void anular(){
        this.estado.anular();
    }
}
