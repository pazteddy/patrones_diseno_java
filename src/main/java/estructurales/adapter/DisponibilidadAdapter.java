package estructurales.adapter;

import java.util.List;

public class DisponibilidadAdapter implements ObtenerDisponibilidadExterna {
    private MostrarHoteles adaptee;
    public DisponibilidadAdapter(MostrarHoteles adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void obteniendoDisponibilidades(List<String> hotelesHabitacionesDisponibles) {
        for(String hotelHabitacion : hotelesHabitacionesDisponibles)
        {
            if(hotelHabitacion.contains("hotel")){
                String[] nombre = hotelHabitacion.split("\\|");
                adaptee.hotelesDisponibles(nombre[1]);
            }
        }
    }
}
