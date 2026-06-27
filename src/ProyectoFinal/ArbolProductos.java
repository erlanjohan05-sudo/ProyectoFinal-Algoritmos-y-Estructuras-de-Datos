
package ProyectoFinal;

import java.util.ArrayList;

public class ArbolProductos {
    
    private NodoProducto raiz;
    
    public ArbolProductos(){
        raiz = null;
    }
    
    public void insertar(Producto producto) {
        raiz = insertarRecursivo(raiz, producto);
    }
    
    private NodoProducto insertarRecursivo(NodoProducto nodo, Producto producto){
        if (nodo == null) {
            return new NodoProducto(producto);
        }
        
        if (producto.getId() < nodo.producto.getId()){
            nodo.izquierda = insertarRecursivo(nodo.izquierda, producto);
        } else if (producto.getId() > nodo.producto.getId()){
            nodo.derecha = insertarRecursivo(nodo.derecha, producto);
        }
        
        return nodo;
    }
    public Producto buscar(int id) {
        return buscarRecursivo(raiz, id);
    }
    
    private Producto buscarRecursivo(NodoProducto nodo, int id) {
        if (nodo == null){
            return null;
        }
        if(id == nodo.producto.getId()){
            return nodo.producto;
        }
        
        if (id < nodo.producto.getId()) {
            return buscarRecursivo(nodo.izquierda, id);
        } else {
            return buscarRecursivo(nodo.derecha, id);
        }
    }
    public ArrayList<Producto> recorridoInOrden() {
        ArrayList<Producto> lista = new ArrayList<>();
        inOrdenRecursivo(raiz, lista);
        return lista;
    }
    private void inOrdenRecursivo(NodoProducto nodo, ArrayList<Producto> lista) {
        if (nodo != null){
            inOrdenRecursivo(nodo.izquierda, lista);
            lista.add(nodo.producto);
            inOrdenRecursivo(nodo.derecha, lista);
        }
    }
    public boolean estaVacio() {
        return raiz == null;
    }
    
    public void limpiar() {
        raiz = null;
    }
}
