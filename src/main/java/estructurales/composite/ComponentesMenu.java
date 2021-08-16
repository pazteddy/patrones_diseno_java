package estructurales.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class ComponentesMenu {
    String nombre;
    String url;
    List<ComponentesMenu> ComponentesMenus = new ArrayList<>();

    public ComponentesMenu add(ComponentesMenu ComponentesMenu) {
        throw new UnsupportedOperationException("Esta opcion no esta implementada en este nivel");
    }

    public ComponentesMenu remove(ComponentesMenu ComponentesMenu) {
        throw new UnsupportedOperationException("Esta opcion no esta implementada en este nivel");
    }

    public String getNombre() {
        return nombre;
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();

    String mostrar(ComponentesMenu ComponentesMenu) {
        StringBuilder builder = new StringBuilder(nombre);
        builder.append(": ");
        builder.append(url);
        builder.append("\n");
        return builder.toString();
    }
}
