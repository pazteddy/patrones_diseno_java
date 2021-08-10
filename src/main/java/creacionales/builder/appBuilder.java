package creacionales.builder;

import java.time.LocalDate;
import java.time.Month;


public class appBuilder {
    public void displayBuilder() {
        Compra compraPasaje = new Compra.CompraBuilder("Teddy", "Paz", LocalDate.of( 1985 , Month.JANUARY , 1 ),
                4844035,"Avion")
                .empresaVuelo("BOA")
                .nroAsiento("A3")
                .ticketVuelo("HGR123")
                .build();
        System.out.println(compraPasaje);
        System.out.println("Se guarda en la base de datos correspondiente a pasajes de Avion");
        Compra reservaHotel = new Compra.CompraBuilder("Teddy", "Paz", LocalDate.of( 1985 , Month.JANUARY , 1 ),
                4844035,"Hotel")
                .nombreHotel("Hotel Presidente")
                .nroHabitacion("5A")
                .voucherHotel("HP-569")
                .build();
        System.out.println(reservaHotel);
        System.out.println("Se guarda en la base de datos correspondiente a la reserva de Hotel");
    }
}
