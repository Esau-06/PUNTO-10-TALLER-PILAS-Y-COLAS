import java.util.Scanner;
import java.util.Stack;

public class Metodos {

    public Stack<ObjDato> LLenarPila(Stack<ObjDato> p, Scanner sc) {
        boolean continuar = true;

        while (continuar) {
            ObjDato o = new ObjDato();

            System.out.println("Digite el numero:");
            o.setNumero(sc.nextInt());

            p.push(o);

            System.out.println("Desea ingresar otro numero 1) si, 2) no");
            int opt = sc.nextInt();

            if (opt == 2) {
                continuar = false;
            }
        }

        return p;
    }

    public void MostrarPila(Stack<ObjDato> p) {
        for (ObjDato o : p) {
            System.out.print(o.getNumero() + " ");
        }
        System.out.println();
    }

    public void Punto10(Stack<ObjDato> p) {
        Stack<ObjDato> aux = new Stack<>();

        String normal = "";
        String invertido = "";

        while (!p.isEmpty()) {
            ObjDato o = p.pop();

            normal = normal + o.getNumero();
            invertido = o.getNumero() + invertido;

            aux.push(o);
        }

        while (!aux.isEmpty()) {
            p.push(aux.pop());
        }

        System.out.println("Forma normal: " + normal);
        System.out.println("Forma invertida: " + invertido);

        if (normal.equals(invertido)) {
            System.out.println("La pila es capicua");
        } else {
            System.out.println("La pila no es capicua");
        }
    }
}