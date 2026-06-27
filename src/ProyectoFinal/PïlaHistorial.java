package ProyectoFinal;

import java.util.ArrayList;

public class PïlaHistorial {
    
    private ArrayList<String> pila;
    
    public PïlaHistorial(){
        pila = new ArrayList<>();
    }
    
    public void push(String accion) {
        pila.add(accion);
    }
    
    public String pop() {
        if (estaVacia()){
            return null;
        }
        
        return pila.remove(pila.size() - 1);
    }
    
    public String peek() {
        if(estaVacia()) {
            return null;
        }
        
        return pila.get(pila.size() - 1);
    }
    
    public boolean estaVacia(){
        return pila.isEmpty();
    }
    public int tamaño(){
        return pila.size();
    }
    public String obtener(int i){
        return pila.get(i);
    }
    
}
