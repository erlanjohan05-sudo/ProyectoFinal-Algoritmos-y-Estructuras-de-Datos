
package ProyectoFinal;

import java.util.LinkedList;
import java.util.Queue;

public class ColaClientes {
    
    private Queue<Cliente> cola;
    
    public ColaClientes(){
        cola = new LinkedList<>();
    }
    
    public void encolar(Cliente cliente) {
        cola.add(cliente);
    }
    
    public Cliente desencolar() {
        if (estaVacia()) {
            return null;
        }
        
        return cola.poll();
    }
    
    public Cliente verPrimero() {
        if (estaVacia()) {
            return null;
        }
        
        return cola.peek();
    }
    
    public boolean estaVacia() {
        return cola.isEmpty();
    }
    
    public int tamaño(){
        return cola.size();
    }
    
    public Cliente[] obtenerClientes() {
        return cola.toArray(new Cliente[0]);
    }
}
