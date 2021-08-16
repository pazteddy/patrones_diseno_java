package estructurales.adapter;

import java.util.ArrayList;

public class appAdapter {
    public void displayAdapter() {
        ObtenerDisponibilidadExterna hoteles = new DisponibilidadAdapter(new MostrarHoteles());
        ArrayList<String> hotelesHabitaciones = new ArrayList<>();
        hotelesHabitaciones.add("hotel|Hotel Miami");
        hotelesHabitaciones.add("habitacion|Habitacion Soleada");
        hotelesHabitaciones.add("habitacion|Habitacion confotable");
        hotelesHabitaciones.add("hotel|Hotel Palmeras Inn");
        hoteles.obteniendoDisponibilidades(hotelesHabitaciones);
    }
}
