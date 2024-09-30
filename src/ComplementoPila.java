import java.util.Stack;

public class ComplementoPila {
    private Stack<String> pila;

    public PilaConStack() {

        pila = new Stack<>();

    }

    public void push(String elemento) {
        pila.push(elemento);
        System.out.println("Cadena " + elemento + " apilada.");
    }

    public String pop() {
        if (pila.isEmpty()) {
            System.out.println("Error: La pila está vacía.");
            return null;
        } else {
            return pila.pop();
        }
    }

    public String peek() {
        if (pila.isEmpty()) {
            System.out.println("Error: La pila está vacía.");
            return null;
        } else {
            return pila.peek();
        }
    }

    public boolean estaVacia() {
        return pila.isEmpty();
    }

    public void mostrarPila() {

        int x = Integer.parseInt(pila.lastElement());
        if (pila.isEmpty() || x == -1) {
            System.out.println("La pila está vacía.");
            System.out.println(pila.lastElement());

        } else {
            System.out.print("Contenido de la pila: ");
            for (String elemento : pila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}