package ProyectoFinal;

public class ArbolProductos {
    
    private NodoProducto raiz;

    public ArbolProductos() {
        raiz = null;
    }

    public void insertar(Producto producto) {
        raiz = insertarRecursivo(raiz, producto);
    }

    private NodoProducto insertarRecursivo(NodoProducto nodo, Producto producto) {
        if (nodo == null) {
            return new NodoProducto(producto);
        }

        if (producto.getId() < nodo.producto.getId()) {
            nodo.izquierda = insertarRecursivo(nodo.izquierda, producto);
        } else if (producto.getId() > nodo.producto.getId()) {
            nodo.derecha = insertarRecursivo(nodo.derecha, producto);
        }

        return nodo;
    }

    public Producto buscar(int id) {
        return buscarRecursivo(raiz, id);
    }

    private Producto buscarRecursivo(NodoProducto nodo, int id) {
        if (nodo == null) {
            return null;
        }

        if (id == nodo.producto.getId()) {
            return nodo.producto;
        }

        if (id < nodo.producto.getId()) {
            return buscarRecursivo(nodo.izquierda, id);
        } else {
            return buscarRecursivo(nodo.derecha, id);
        }
    }

    public Producto[] recorridoInOrden() {
        int cantidad = contarNodos(raiz);
        Producto[] productos = new Producto[cantidad];

        llenarInOrden(raiz, productos, new int[]{0});

        return productos;
    }

    private void llenarInOrden(NodoProducto nodo, Producto[] productos, int[] posicion) {
        if (nodo != null) {
            llenarInOrden(nodo.izquierda, productos, posicion);

            productos[posicion[0]] = nodo.producto;
            posicion[0]++;

            llenarInOrden(nodo.derecha, productos, posicion);
        }
    }

    private int contarNodos(NodoProducto nodo) {
        if (nodo == null) {
            return 0;
        }

        return 1 + contarNodos(nodo.izquierda) + contarNodos(nodo.derecha);
    }

    public boolean estaVacio() {
        return raiz == null;
    }

    public void limpiar() {
        raiz = null;
    }
}