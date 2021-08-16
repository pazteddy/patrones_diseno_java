package estructurales.composite;
import java.util.Iterator;

public class Menu extends ComponentesMenu{

    public Menu(String nombre, String url) {
        this.nombre = nombre;
        this.url = url;
    }

    @Override
    public ComponentesMenu add(ComponentesMenu componenteMenu) {
        ComponentesMenus.add(componenteMenu);
        return componenteMenu;
    }

    @Override
    public ComponentesMenu remove(ComponentesMenu componenteMenu) {
        ComponentesMenus.remove(componenteMenu);
        return componenteMenu;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(); //builder pattern

        builder.append(mostrar(this));

        Iterator<ComponentesMenu> itr = ComponentesMenus.iterator();
        while(itr.hasNext()) {
            ComponentesMenu componenteMenu = itr.next();
            builder.append(componenteMenu.toString());
        }

        return builder.toString();
    }

}
