import comportamiento.visitor.appVisitor;
import creacionales.builder.appBuilder;
import creacionales.factorymethod.appFactory;
import creacionales.singleton.appSingleton;
import estructurales.adapter.appAdapter;
import estructurales.bridge.appBridge;
import estructurales.composite.appComposite;

import java.util.Scanner;

public class Menu {
    appSingleton singleton = new appSingleton();
    appFactory factory = new appFactory();
    appBuilder builder = new appBuilder();
    appBridge bridge = new appBridge();
    appAdapter adapter = new appAdapter();
    appComposite composite = new appComposite();
    appVisitor visitor = new appVisitor();
    public void display() {
        Scanner scanner = new Scanner(System.in);
        char opcion;
        System.out.println("Patrones de diseño");
        System.out.println("-------------------------------------------");
        String mensajeOpciones = "\nRealizar:\n" +
                "------Patrones creacionales-----\n" +
                "1) Conexion base de datos(singleton)\n" +
                "2) Compras(Builder)\n" +
                "3) Pagos(FactoryMethod)\n" +
                "------Patrones estructurales-----\n" +
                "4) Envio Comprobantes(Bridge)\n"+
                "5) Nuevo conector Hotels Disponibles(Adapter)\n" +
                "6) Menus dinamicos(Composite)\n" +
                "------Patrones de comportamiento-----\n" +
                "7) Calculo Total de Ventas(Visitor)\n" +
                "s) salir";

        while (true) {
            System.out.println(mensajeOpciones);
            System.out.print(">> ");
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case '1': singleton.displaySingleton(); break;
                case '2': builder.displayBuilder(); break;
                case '3': factory.displayFactory(); break;
                case '4': bridge.displayBridge(); break;
                case '5': adapter.displayAdapter(); break;
                case '6': composite.displayComposite(); break;
                case '7': visitor.displayVisitor(); break;
                case 's': System.out.println("Hasta pronto, gracias por su visita!"); System.exit(0);
                default: System.out.println("Opcion no válida");
            }
        }
    }
}
