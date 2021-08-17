package comportamiento.visitor;

public class Vuelo implements Element{
    private final String nombreCompania;
    private final double impuestoValorAgregado;
    private final double impuestoTransaccion;
    private final double costoVuelo;

    public Vuelo(String nombreCompania, double impuestoValorAgregado, double impuestoTransaccion, double costoVuelo){
        this.nombreCompania = nombreCompania;
        this.impuestoValorAgregado = impuestoValorAgregado;
        this.impuestoTransaccion = impuestoTransaccion;
        this.costoVuelo = costoVuelo;
    }

    public String getNombreCompania() {
        return nombreCompania;
    }

    public double getImpuestoValorAgregado() {
        return impuestoValorAgregado;
    }

    public double getImpuestoTransaccion() {
        return impuestoTransaccion;
    }

    public double getCostoVuelo() {
        return costoVuelo;
    }

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitVuelo(this);
    }
}
