package comportamiento.state;

public interface EstadoCompra {
    void reservar();
    void enEspera();
    void verificar();
    void compra();
    void cancelar();
    void anular();
    void setCompra(Compra compra);
}
