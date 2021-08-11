import creacionales.builder.appBuilder;
import creacionales.factorymethod.appFactory;
import creacionales.singleton.appSingleton;
import estructurales.bridge.appBridge;

import java.util.Scanner;

public class Menu {
    appSingleton singleton = new appSingleton();
    appFactory factory = new appFactory();
    appBuilder builder = new appBuilder();
    appBridge bridge = new appBridge();
    public void display() {
        Scanner scanner = new Scanner(System.in);
        char opcion;
        System.out.println("-------------------------------------------");
        System.out.println("Patrones de diseño");
        String mensajeOpciones = "Realizar:\n " +
                "1) Conexion base de datos(singleton)\n 2) Compras(Builder)\n 3) Pagos(FactoryMethod)\n " +
                "4) Envio Comprobantes(Bridge)\n s) salir";

        while (true) {
            System.out.println(mensajeOpciones);
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case '1': singleton.displaySingleton(); break;
                case '2': builder.displayBuilder(); break;
                case '3': factory.displayFactory(); break;
                case '4': bridge.displayBridge(); break;
                case 's': System.out.println("Hasta pronto, gracias por su visita!"); System.exit(0);
                default: System.out.println("Opcion no válida");
            }
        }
    }
}
