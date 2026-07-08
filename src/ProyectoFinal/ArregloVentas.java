package ProyectoFinal;

public class ArregloVentas {
    
    private Venta[] lista;
    private int contador;

    public ArregloVentas() {
        lista = new Venta[50];
        contador = 0;
    }

    public void agregar(Venta v) {
        if (contador == lista.length) {
            aumentarCapacidad();
        }

        lista[contador] = v;
        contador++;
    }

    private void aumentarCapacidad() {
        Venta[] nuevaLista = new Venta[lista.length * 2];

        for (int i = 0; i < lista.length; i++) {
            nuevaLista[i] = lista[i];
        }

        lista = nuevaLista;
    }

    public int tamaño() {
        return contador;
    }

    public Venta obtener(int i) {
        return lista[i];
    }

    public int generarNuevoId() {
        return contador + 1;
    }

    public double calcularTotalVendido() {
        double total = 0;

        for (int i = 0; i < contador; i++) {
            total += lista[i].getTotal();
        }

        return total;
    }
}