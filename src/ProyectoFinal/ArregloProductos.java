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
    public int generarNuevoId(){
        int mayor = 0;
        
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).getId() > mayor){
                mayor = lista.get(i).getId();
            }
        }
        return mayor + 1;
    }
    public boolean eliminarPodId(int idBusqueda) {
        for (int i = 0; i < lista.size(); i++) {
            Producto p = lista.get(i);
            
            if (p.getId() == idBusqueda) {
                lista.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean actualizarProducto(int idBusqueda, String nombre, String marca, double precio,int stock) {
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
}