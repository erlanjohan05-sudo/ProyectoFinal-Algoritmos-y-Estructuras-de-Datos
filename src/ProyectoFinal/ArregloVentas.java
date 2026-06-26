package ProyectoFinal;

import java.util.ArrayList;

public class ArregloVentas {
    
    private ArrayList<Venta> lista;
    
    public ArregloVentas(){
        lista = new ArrayList<>();
    }
    
    public void agregar(Venta v) {
        lista.add(v);
    }
    
    public int tamaño() {
        return lista.size();
    }
    public Venta obtener(int i) {
        return lista.get(i);
    }
    public int generarNuevoId() {
        return lista.size() + 1;
    }
    public double calcularTotalVendido() {
        double total = 0;
        
        for (int i =0; i < lista.size(); i++) {
            total += lista.get(i).getTotal();
        }
        
        return total;
    }
    
}
