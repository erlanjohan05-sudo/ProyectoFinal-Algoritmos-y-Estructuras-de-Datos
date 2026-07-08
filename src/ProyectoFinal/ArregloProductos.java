package ProyectoFinal;

public class ArregloProductos {

    private Producto[] lista;
    private int contador;

    public ArregloProductos() {
        lista = new Producto[50];
        contador = 0;
    }

    public void agregar(Producto p) {
        if (contador == lista.length) {
            aumentarCapacidad();
        }

        lista[contador] = p;
        contador++;
    }

    private void aumentarCapacidad() {
        Producto[] nuevaLista = new Producto[lista.length * 2];

        for (int i = 0; i < lista.length; i++) {
            nuevaLista[i] = lista[i];
        }

        lista = nuevaLista;
    }

    public int tamaño() {
        return contador;
    }

    public Producto obtener(int i) {
        return lista[i];
    }

    public Producto buscarPorId(int idBusqueda) {
        for (int i = 0; i < contador; i++) {
            Producto p = lista[i];

            if (p.getId() == idBusqueda) {
                return p;
            }
        }

        return null;
    }

    public Producto buscarPorNombre(String nombreBusqueda) {
        for (int i = 0; i < contador; i++) {
            Producto p = lista[i];

            if (p.getNombre().equalsIgnoreCase(nombreBusqueda)) {
                return p;
            }
        }

        return null;
    }

    public boolean eliminarPorId(int idBusqueda) {
        for (int i = 0; i < contador; i++) {
            Producto p = lista[i];

            if (p.getId() == idBusqueda) {

                for (int j = i; j < contador - 1; j++) {
                    lista[j] = lista[j + 1];
                }

                lista[contador - 1] = null;
                contador--;

                return true;
            }
        }

        return false;
    }

    public boolean actualizarProducto(int idBusqueda, String nombre, String marca, double precio, int stock) {
        Producto p = buscarPorId(idBusqueda);

        if (p != null) {
            p.setNombre(nombre);
            p.setMarca(marca);
            p.setPrecio(precio);
            p.setStock(stock);
            return true;
        }

        return false;
    }

    public void ordenarPorPrecio() {
        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - 1 - i; j++) {
                if (lista[j].getPrecio() > lista[j + 1].getPrecio()) {
                    Producto aux = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = aux;
                }
            }
        }
    }

    public void ordenarPorStock() {
        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - 1 - i; j++) {
                if (lista[j].getStock() > lista[j + 1].getStock()) {
                    Producto aux = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = aux;
                }
            }
        }
    }

    public int generarNuevoId() {
        int mayor = 0;

        for (int i = 0; i < contador; i++) {
            if (lista[i].getId() > mayor) {
                mayor = lista[i].getId();
            }
        }

        return mayor + 1;
    }

    public Producto[] obtenerProductosStockBajo(int limite) {
        int cantidad = 0;

        for (int i = 0; i < contador; i++) {
            if (lista[i].getStock() <= limite) {
                cantidad++;
            }
        }

        Producto[] resultado = new Producto[cantidad];
        int posicion = 0;

        for (int i = 0; i < contador; i++) {
            if (lista[i].getStock() <= limite) {
                resultado[posicion] = lista[i];
                posicion++;
            }
        }

        return resultado;
    }
}