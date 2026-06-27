
package ProyectoFinal;

public class NodoProducto {
    
    Producto producto;
    NodoProducto izquierda;
    NodoProducto derecha;
    
    public NodoProducto(Producto producto) {
        this.producto = producto;
        this.izquierda = null;
        this.derecha = null;
    }
    
}
