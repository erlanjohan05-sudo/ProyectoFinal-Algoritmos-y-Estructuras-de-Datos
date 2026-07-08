package ProyectoFinal;

public class ColaClientes {

    private Cliente[] cola;
    private int frente;
    private int fin;
    private int contador;

    public ColaClientes() {
        cola = new Cliente[50];
        frente = 0;
        fin = 0;
        contador = 0;
    }

    public void encolar(Cliente cliente) {
        if (contador == cola.length) {
            aumentarCapacidad();
        }

        cola[fin] = cliente;
        fin++;
        contador++;
    }

    public Cliente desencolar() {
        if (estaVacia()) {
            return null;
        }

        Cliente cliente = cola[frente];

        for (int i = 0; i < contador - 1; i++) {
            cola[i] = cola[i + 1];
        }

        cola[contador - 1] = null;
        contador--;
        frente = 0;
        fin = contador;

        return cliente;
    }

    public Cliente verPrimero() {
        if (estaVacia()) {
            return null;
        }

        return cola[frente];
    }

    public boolean estaVacia() {
        return contador == 0;
    }

    public int tamaño() {
        return contador;
    }

    public Cliente[] obtenerClientes() {
        Cliente[] resultado = new Cliente[contador];

        for (int i = 0; i < contador; i++) {
            resultado[i] = cola[i];
        }

        return resultado;
    }

    private void aumentarCapacidad() {
        Cliente[] nuevaCola = new Cliente[cola.length * 2];

        for (int i = 0; i < contador; i++) {
            nuevaCola[i] = cola[i];
        }

        cola = nuevaCola;
        frente = 0;
        fin = contador;
    }
}