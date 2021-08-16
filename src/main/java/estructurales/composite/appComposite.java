package estructurales.composite;

public class appComposite {
    public void displayComposite() {
        // Menu principal
        Menu menuPrincipal = new Menu("Principal", "/principal");
        // Menu Hoteles
        Menu menuHotel = new Menu("Hotel", "/hotel");
        menuPrincipal.add(menuHotel);
        MenuItem ventasHoteles = new MenuItem("Ventas hoteles", "/ventasHoteles");
        menuHotel.add(ventasHoteles);
        // Menu de Vuelos
        Menu menuVuelos = new Menu("Vuelos", "/vuelos");
        menuPrincipal.add(menuVuelos);
        MenuItem ventasVuelos = new MenuItem("Ventas vuelos", "/ventasVuelos");
        menuVuelos.add(ventasVuelos);
        MenuItem quejasVuelos = new MenuItem("Quejas vuelos", "/quejasVuelos");
        menuVuelos.add(quejasVuelos);
        //Mostramos el menu actual
        System.out.println(menuPrincipal.toString());
        //Removemos quejas
        menuVuelos.remove(quejasVuelos);
        System.out.println(menuPrincipal.toString());
        //Removemos el menu de vuelos
        menuPrincipal.remove(menuVuelos);
        System.out.println(menuPrincipal.toString());
    }
}
