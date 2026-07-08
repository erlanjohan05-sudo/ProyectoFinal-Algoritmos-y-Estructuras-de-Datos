package ProyectoFinal;

public class MatrizVentas {
    
    private String[] productos;
    private String[] dias;
    private double[][] ventas;
    
    public MatrizVentas() {
        productos = new String[3];
        dias = new String[3];
        ventas = new double[3][3];
        
        cargarDatos();
    }
    
    private void cargarDatos() {
        productos[0] = "Martillo";
        productos[1] = "Alicate";
        productos[2] = "Destornillador";
        
        dias[0] = "Día 1";
        dias[1] = "Día 2";
        dias[2] = "Día 3";
        
        ventas[0][0] = 50.0;
        ventas[0][1] = 30.0;
        ventas[0][2] = 70.0;
        
        ventas[1][0] = 20.0;
        ventas[1][1] = 40.0;
        ventas[1][2] = 60.0;
        
        ventas[2][0] = 80.0;
        ventas[2][1] = 10.0;
        ventas[2][2] = 90.0;
    }
    
    public int cantidadProductos() {
        return productos.length;
    }
    
    public int cantidadDias() {
        return dias.length;
    }
    
    public String obtenerProducto(int i) {
        return productos[i];
    }
    
    public String obtenerDia(int j) {
        return dias[j];
    }
    
     public double obtenerVenta(int i, int j) {
        return ventas[i][j];
    }
     
     
    public double calcularTotalProducto(int fila) {
        double total = 0;
        
        for (int j = 0; j < dias.length; j++) {
            total += ventas[fila][j];
        }
        
        return total;
    }
    
    public double calcularTotalDia(int columna) {
        double total = 0;
        
        for (int i = 0; i < productos.length; i++) {
            total += ventas[i][columna];
        }
        
        return total;
    }
    
    public double calcularTotalGeneral() {
        double total = 0;
        
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < dias.length; j++) {
                total += ventas[i][j];
            } 
        }
        
        return total;
    }
    
    
}
