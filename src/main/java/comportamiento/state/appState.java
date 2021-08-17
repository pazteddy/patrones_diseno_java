package comportamiento.state;

public class appState {
    public void displayState() {
        Compra compra = new Compra();
        new Menu(compra).display();
    }
}
