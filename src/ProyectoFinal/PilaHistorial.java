package ProyectoFinal;

public class PilaHistorial {

    private String[] pila;
    private int contador;

    public PilaHistorial() {
        pila = new String[50];
        contador = 0;
    }

    public void push(String accion) {
        if (contador == pila.length) {
            aumentarCapacidad();
        }

        pila[contador] = accion;
        contador++;
    }

    public String pop() {
        if (estaVacia()) {
            return null;
        }

        String accion = pila[contador - 1];
        pila[contador - 1] = null;
        contador--;

        return accion;
    }

    public String peek() {
        if (estaVacia()) {
            return null;
        }

        return pila[contador - 1];
    }

    public boolean estaVacia() {
        return contador == 0;
    }

    public int tamaño() {
        return contador;
    }

    public String obtener(int i) {
        return pila[i];
    }

    private void aumentarCapacidad() {
        String[] nuevaPila = new String[pila.length * 2];

        for (int i = 0; i < pila.length; i++) {
            nuevaPila[i] = pila[i];
        }

        pila = nuevaPila;
    }
}