package comportamiento.visitor;

public class Hotel implements Element{
    private final String nombreHotel;
    private final double impuestoTransaccion;
    private final double costoHospedaje;
    public Hotel(String nombreHotel, double impuestoTransaccion, double costoHospedaje){
        this.nombreHotel = nombreHotel;
        this.impuestoTransaccion = impuestoTransaccion;
        this.costoHospedaje = costoHospedaje;
    }
    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitHotel(this);
    }
    public String getNombreHotel() {
        return nombreHotel;
    }

    public double getImpuestoTransaccion() {
        return impuestoTransaccion;
    }

    public double getCostoHospedaje() {
        return costoHospedaje;
    }
}
