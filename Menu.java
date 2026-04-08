import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Stack<ObjDato> pila = new Stack<>();

        boolean seguir = true;

        while (seguir) {
            System.out.println("\n--- MENU ---");
            System.out.println("1) Llenar pila");
            System.out.println("2) Mostrar pila");
            System.out.println("3) Verificar si es capicua");
            System.out.println("4) Salir");

            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    pila = m.LLenarPila(pila, sc);
                    break;

                case 2:
                    m.MostrarPila(pila);
                    break;

                case 3:
                    m.Punto10(pila);
                    break;

                case 4:
                    seguir = false;
                    System.out.println("Gracias por usar el programa");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }

        sc.close();
    }
}