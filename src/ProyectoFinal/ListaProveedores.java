
package ProyectoFinal;

public class ListaProveedores {
    
    private NodoProveedor inicio;
    private int contador;
    
    public ListaProveedores() {
        inicio = null;
        contador = 0;
    }
    
    public void agregar(Proveedor proveedor) {
        NodoProveedor nuevo = new NodoProveedor(proveedor);
        
        if (inicio == null) {
            
            inicio = nuevo;
        }
        else {
            NodoProveedor actual = inicio;
            
            while (actual.siguiente != null){
                actual = actual.siguiente;
            }
            
            actual.siguiente = nuevo;
        }
        
        contador++;
    }
    
    public int tamaño() {
        return contador;
    }
    
    public Proveedor obtener(int posicion) {
        if (posicion < 0 || posicion >= contador) {
            return null;
        }
        
        NodoProveedor actual = inicio;
        int indice = 0;
        
        while (actual != null) {
            if (indice == posicion) {
                return actual.proveedor;
            }
            
            actual = actual.siguiente;
            indice++;
        }
        
        return null;
    }
    
    
    
    public Proveedor buscarPorId(int idBusqueda) {
        NodoProveedor actual = inicio;
        
        while (actual != null){
            if(actual.proveedor.getIdProveedor() == idBusqueda){
                return actual.proveedor;
            }
            
            actual = actual.siguiente;
        }
        
        return null;
    }
    
    public boolean eliminarPorId(int idBusqueda) {
        if (inicio == null) {
            return false;
        }

        if (inicio.proveedor.getIdProveedor() == idBusqueda) {
            inicio = inicio.siguiente;
            contador--;
            return true;
        }

        NodoProveedor actual = inicio;

        while (actual.siguiente != null) {
            if (actual.siguiente.proveedor.getIdProveedor() == idBusqueda) {
                actual.siguiente = actual.siguiente.siguiente;
                contador--;
                return true;
            }

            actual = actual.siguiente;
        }

        return false;
    }

    public boolean actualizarProveedor(int idBusqueda, String nombre, String ruc, String telefono, String direccion) {
        Proveedor proveedor = buscarPorId(idBusqueda);

        if (proveedor != null) {
            proveedor.setNombre(nombre);
            proveedor.setRuc(ruc);
            proveedor.setTelefono(telefono);
            proveedor.setDireccion(direccion);
            return true;
        }

        return false;
    }

    public int generarNuevoId() {
        int mayor = 0;

        NodoProveedor actual = inicio;

        while (actual != null) {
            if (actual.proveedor.getIdProveedor() > mayor) {
                mayor = actual.proveedor.getIdProveedor();
            }

            actual = actual.siguiente;
        }

        return mayor + 1;
    }

    public boolean estaVacia() {
        return inicio == null;
    }
    
}
