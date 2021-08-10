import creacionales.factorymethod.appFactory;
import creacionales.singleton.appSingleton;

import java.util.Scanner;

public class Menu {
    appSingleton singleton = new appSingleton();
    appFactory factory = new appFactory();
    public void display() {
        Scanner scanner = new Scanner(System.in);
        char opcion;
        System.out.println("-------------------------------------------");
        System.out.println("Patrones de diseño");
        String mensajeOpciones = "Realizar: " +
                "1) singleton, 2) Factory Method, 3) builder, s) salir";

        while (true) {
            System.out.println(mensajeOpciones);
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case '1': singleton.displaySingleton(); break;
                case '2': factory.displayFactory(); break;
                case '3': System.out.println("Builder"); break;
                case 's': System.out.println("Hasta pronto, gracias por su visita!"); System.exit(0);
                default: System.out.println("Opcion no válida");
            }
        }
    }
}
