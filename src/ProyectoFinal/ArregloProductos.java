package ProyectoFinal;

import java.util.ArrayList;

public class ArregloProductos {

    private ArrayList<Producto> lista;
    public ArregloProductos(){
        lista = new ArrayList<>();
    }
    public void agregar(Producto p){
        lista.add(p);
    }
    public int tamaño(){
        return lista.size();
    }
     
    public Producto obtener(int i){
        return lista.get(i);
    }
}
