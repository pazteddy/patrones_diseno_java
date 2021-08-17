package comportamiento.visitor;

public class CalcularPrecioVisitor implements Visitor{
    @Override
    public void visitHotel(Hotel hotel) {
        double impuestos = hotel.getCostoHospedaje() * hotel.getImpuestoTransaccion();
        double costoTotal = hotel.getCostoHospedaje() + impuestos;
        System.out.println("El precio final del hotel "+hotel.getNombreHotel()+" es: "+costoTotal);
    }

    @Override
    public void visitVuelo(Vuelo vuelo) {
        double impuestos = (vuelo.getImpuestoValorAgregado() * vuelo.getCostoVuelo()) + (vuelo.getImpuestoTransaccion() * vuelo.getCostoVuelo());
        double costoTotal = vuelo.getCostoVuelo() + impuestos;
        System.out.println("El precio final del vuelo para la compañia "+vuelo.getNombreCompania()+ " es "+costoTotal);
    }
}
