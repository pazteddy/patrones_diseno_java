package estructurales.composite;

public class MenuItem extends ComponentesMenu {

    public MenuItem(String nombre, String url) {
        this.nombre = nombre;
        this.url = url;
    }

    @Override
    public String toString() {
        return mostrar(this);
    }
}
