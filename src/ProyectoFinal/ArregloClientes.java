package ProyectoFinal;

import java.util.ArrayList;

public class ArregloClientes {
    
    private ArrayList<Cliente> lista;
    
    public ArregloClientes(){
        lista = new ArrayList<>();
    }
    
    public void agregar(Cliente c) {
        lista.add(c);
    }
    
    public int tamaño() {
        return lista.size();
    }
    
    public Cliente obtener(int i){
        return lista.get(i);
    }
    
    public Cliente buscarPorDni(String dniBusqueda) {
        for (int i = 0; i < lista.size(); i++){
            Cliente c = lista.get(i);
            
            if (c.getDni().equals(dniBusqueda)){
                return c;
            }
        }
        return null;
    }
    
    public boolean eliminarPorDni(String dniBusqueda){
        for (int i =0; i < lista.size(); i++){
            Cliente c = lista.get(i);
            
            if (c.getDni().equals(dniBusqueda)){
                lista.remove(i);
                return true;
            } 
        }
        return false;
        
        }
    
        public boolean actualizarCliente(String dniBusqueda, String nombres, String apellidos, String telefono, String direccion){
            Cliente c = buscarPorDni(dniBusqueda);
            
            if (c != null) {
                c.setNombres(nombres);
                c.setApellidos(apellidos);
                c.setTelefono(telefono);
                c.setDireccion(direccion);
                return true;
            }
            return false;
        }
        
        public boolean existenDni(String dniBusqueda){
            return buscarPorDni(dniBusqueda) != null;
    }
}
