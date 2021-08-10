package creacionales.builder;

import java.time.LocalDate;

public class Compra {
    private final String nombre; // Requerido
    private final String apellido; // Requerido
    private final LocalDate fechaNacimiento; // Requerido
    private final Integer carnetIdentidad; // Requerido
    private final String tipoVenta; // Requerido
    private final String nroAsiento; // Opcional
    private final String nroHabitacion; // Opcional
    private final String nombreHotel; // Opcional
    private final String empresaVuelo; // Opcional
    private final String voucherHotel; // Opcional
    private final String ticketVuelo;  // Opcional

    private Compra(CompraBuilder builder) {
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.fechaNacimiento = builder.fechaNacimiento;
        this.carnetIdentidad = builder.carnetIdentidad;
        this.tipoVenta = builder.tipoVenta;
        this.nroAsiento = builder.nroAsiento;
        this.nroHabitacion= builder.nroHabitacion;
        this.nombreHotel= builder.nombreHotel;
        this.empresaVuelo= builder.empresaVuelo;
        this.voucherHotel= builder.voucherHotel;
        this.ticketVuelo= builder.ticketVuelo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Integer getCarnetIdentidad() {
        return carnetIdentidad;
    }

    public String getTipoVenta() {
        return tipoVenta;
    }

    @Override
    public String toString() {
        return "Comprador: "+this.nombre +" "+this.apellido +", "+this.fechaNacimiento +", "+this.carnetIdentidad +", "+this.tipoVenta;
    }

    public static class CompraBuilder {
        private final String nombre;
        private final String apellido;
        private final LocalDate fechaNacimiento;
        private final Integer carnetIdentidad;
        private final String tipoVenta;
        private  String nroAsiento;
        private  String nroHabitacion;
        private  String nombreHotel;
        private  String empresaVuelo;
        private  String voucherHotel;
        private  String ticketVuelo;

        public CompraBuilder(String nombre, String apellido, LocalDate fechaNacimiento, Integer carnetIdentidad, String tipoVenta) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaNacimiento = fechaNacimiento;
            this.carnetIdentidad = carnetIdentidad;
            this.tipoVenta = tipoVenta;
        }
        public CompraBuilder nroAsiento(String nroAsiento) {
            this.nroAsiento = nroAsiento;
            return this;
        }
        public CompraBuilder nroHabitacion(String nroHabitacion) {
            this.nroHabitacion = nroHabitacion;
            return this;
        }
        public CompraBuilder nombreHotel(String nombreHotel) {
            this.nombreHotel = nombreHotel;
            return this;
        }
        public CompraBuilder empresaVuelo(String empresaVuelo) {
            this.empresaVuelo = empresaVuelo;
            return this;
        }
        public CompraBuilder voucherHotel(String voucherHotel) {
            this.voucherHotel = voucherHotel;
            return this;
        }
        public CompraBuilder ticketVuelo(String ticketVuelo) {
            this.ticketVuelo = ticketVuelo;
            return this;
        }
        public Compra build() {
            Compra compra =  new Compra(this);
            return compra;
        }
    }
}
