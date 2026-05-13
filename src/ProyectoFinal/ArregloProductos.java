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
    public Producto buscarPorId(int idBusqueda){
        for (int i = 0; i < lista.size(); i++){
            Producto p = lista.get(i);
            if (p.getId() == idBusqueda){
            return p;
        }
    }
    return null;
}
}