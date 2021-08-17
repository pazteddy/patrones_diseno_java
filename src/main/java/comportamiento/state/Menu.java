package comportamiento.state;

import java.util.Scanner;

public class Menu {
    Compra compra;

    public Menu(Compra compra) {
        this.compra = compra;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        char opcion;
        System.out.println("-------------------------------------------");
        System.out.println("Desea comprar de un vuelo a Cancun?");
        String mensajeOpciones = "Realizar: " +
                "r) reserva, p) pago, v) verificar, x) cancelar, c) comprar, a) anular s) salir";

        while (true) {
            System.out.println(mensajeOpciones);
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case 'r': compra.reservar(); break;
                case 'p': compra.enEspera(); break;
                case 'v': compra.verificar(); break;
                case 'x': compra.cancelar(); break;
                case 'c': compra.compra(); break;
                case 'a': compra.anular(); break;
                case 's': System.out.println("Hasta pronto, gracias por su compra!"); System.exit(0);
                default: System.out.println("Opcion no válida");
            }
        }
    }
}