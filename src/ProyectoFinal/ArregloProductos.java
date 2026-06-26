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
    public void ordenarPorPrecio() {
        for (int i = 0; i < lista.size() - 1; i++) {
            for(int j = 0; j < lista.size() - 1 - i; j++) {
                if (lista.get(j).getPrecio() > lista.get(j + 1).getPrecio()){
                    Producto aux = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1,aux);
                }
            }
        }
    }
    public void ordenarPorStock() {
        for (int i = 0; i < lista.size() - 1; i++) {
            for(int j = 0; j < lista.size() - 1 - i; j++) {
                if (lista.get(j).getStock() > lista.get(j + 1).getStock()){
                    Producto aux = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1,aux);
                }
            }
        }
    }
    public ArrayList<Producto> obtenerProductosStockBajo(int limite) {
        ArrayList<Producto> resultado = new ArrayList<>();
        
        for (int i = 0; i < lista.size(); i++) {
            Producto p = lista.get(i);
            
            if (p.getStock() <= limite) {
                resultado.add(p);
            }
        }
        return resultado;
    }
}