package creacionales.singleton;

public class appSingleton {
    public void displaySingleton() {
        coneccionBaseDatos primeraConeccion= coneccionBaseDatos.getConfigurador("miurl", "mibaseDatos");
        coneccionBaseDatos segundaConeccion= coneccionBaseDatos.getConfigurador("miurl2", "mibaseDatos2");
        System.out.println("Comparando instancias");
        if (primeraConeccion.getClass() == segundaConeccion.getClass() ){
            System.out.println("Solo se creo una instancia");
        }
    }
}
