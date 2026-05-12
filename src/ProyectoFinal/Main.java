package ProyectoFinal;

public class Main {
    public static void main(String[] args){
        Producto p1 = new Producto(1, "Martillo", "Stanley", 25.50, 10);
        
        System.out.println("Producto creado: " + p1.getNombre());
        System.out.println("Marca: " + p1.getMarca());
        System.out.println("Precio: S/ " + p1.getPrecio());
    }
    
}

