package ProyectoFinal;

public class Main{

public static void main(String[] args) {
 
    ArregloProductos inventario = new ArregloProductos();

    inventario.agregar(new Producto(1, "Martillo", "Stanley", 25.50, 10));
    inventario.agregar(new Producto(2, "Alicate", "Tramontina", 15.00, 5));

    System.out.println("--- LISTA DE FERRETERÍA ---");
    for (int i = 0; i < inventario.tamaño(); i++) {
        Producto p = inventario.obtener(i);
        System.out.println("ID: " + p.getId() + " | " + p.getNombre() + " (" + p.getMarca() + ")");
    }
    System.out.println("\n--- BUSCANDO PRODUCTO CON ID 2---");
    Producto encontrado = inventario.buscarPorId(2);
    if (encontrado != null){
       System.out.println("Se encontro: " + encontrado.getNombre()+ " | Stock: " + encontrado.getStock()); 
    }
    else {
        System.out.println("Error: Producto no registrado");
    }
}
    
}

