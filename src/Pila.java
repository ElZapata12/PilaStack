import java.util.Scanner;
import java.util.Stack;

public class Pila {
    private Stack<String> pilaNombres = new Stack<String>();
    private Scanner scanner = new Scanner(System.in);


    public void definirLimite() {
        System.out.println("Defina el limite: ");
        int limite = scanner.nextInt();

        for (int i = 0; i < limite; i++) {
            if (pilaNombres.lastElement() < limite) {

            }
        }
    }

    public void agregarElemento() {
        System.out.print("Ingrese un nombre: ");
        String nombre = scanner.next();


        pilaNombres.push(nombre);
        System.out.println("Elemento agregado a la pila.");
    }

    public void verUltimoElemento() {
        if (!pilaNombres.isEmpty()) {
            System.out.println("Último elemento: " + pilaNombres.peek());
        } else {
            System.out.println("La pila está vacía.");
        }
    }

    public String eliminarUltimoElemento() {
        if (!pilaNombres.isEmpty()) {
            return pilaNombres.pop();
        } else {
            System.out.println("La pila está vacía.");
            return null;
        }
    }

    public boolean estaVacia() {
        return pilaNombres.isEmpty();
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar elemento a la pila");
            System.out.println("2. Ver último elemento agregado");
            System.out.println("3. Eliminar último elemento");
            System.out.println("4. Consultar si la pila está vacía");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarElemento();

                    break;
                case 2:
                    verUltimoElemento();
                    break;
                case 3:
                    String eliminado = eliminarUltimoElemento();
                    if (eliminado != null) {
                        System.out.println("Elemento eliminado: " + eliminado);
                    }
                    break;
                case 4:
                    if (estaVacia()) {
                        System.out.println("La pila está vacía.");
                    } else {
                        System.out.println("La pila no está vacía.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Numero no valido.");
            }
        } while (opcion != 5);
    }
}
