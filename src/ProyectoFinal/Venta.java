package ProyectoFinal;

public class Venta {
    
    private int idVenta;
    private Cliente cliente;
    private DetalleVenta[] detalles;
    private int contadorDetalles;
    private double total;

    public Venta(int idVenta, Cliente cliente) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.detalles = new DetalleVenta[50];
        this.contadorDetalles = 0;
        this.total = 0;
    }

    public void agregarDetalle(DetalleVenta detalle) {
        if (contadorDetalles == detalles.length) {
            aumentarCapacidad();
        }

        detalles[contadorDetalles] = detalle;
        contadorDetalles++;

        calcularTotal();
    }

    private void aumentarCapacidad() {
        DetalleVenta[] nuevoArreglo = new DetalleVenta[detalles.length * 2];

        for (int i = 0; i < detalles.length; i++) {
            nuevoArreglo[i] = detalles[i];
        }

        detalles = nuevoArreglo;
    }

    public void calcularTotal() {
        total = 0;

        for (int i = 0; i < contadorDetalles; i++) {
            total += detalles[i].getSubtotal();
        }
    }

    public int getIdVenta() {
        return idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getTotal() {
        return total;
    }

    public int cantidadDetalles() {
        return contadorDetalles;
    }

    public DetalleVenta obtenerDetalle(int i) {
        return detalles[i];
    }

    public boolean tieneDetalles() {
        return contadorDetalles > 0;
    }
}