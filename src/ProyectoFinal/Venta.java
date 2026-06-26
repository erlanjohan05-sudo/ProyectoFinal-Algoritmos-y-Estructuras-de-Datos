package ProyectoFinal;

import java.util.ArrayList;

public class Venta {
    
    private int idVenta;
    private Cliente cliente;
    private ArrayList<DetalleVenta> detalles;
    private double total;
    
    
    public Venta(int idVenta, Cliente cliente){
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.detalles = new ArrayList<>();
        this.total = 0;
    }
    
    public void agregarDetalle(DetalleVenta detalle) {
        detalles.add(detalle);
        calcularTotal();
    }
    
    public void calcularTotal() {
        total = 0;
        
        for (int i = 0; i < detalles.size(); i++) {
        total += detalles.get(i).getSubtotal();
        }
    }
    public int getIdVenta() {
        return idVenta;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public ArrayList<DetalleVenta> getDetalles(){
        return detalles;
    }
    public double getTotal(){
        return total;
    }
}
