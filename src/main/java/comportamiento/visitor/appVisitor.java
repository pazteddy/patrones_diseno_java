package comportamiento.visitor;

public class appVisitor {
    public void displayVisitor() {
        // Los elementos
        Hotel hotel = new Hotel("Hotel Cancun", 0.15, 200);
        Vuelo vuelo = new Vuelo("BOA", 0.15, 0.13, 200);
        Visitor visitor = new CalcularPrecioVisitor();
        hotel.aceptar(visitor);
        vuelo.aceptar(visitor);
    }
}
