package ProyectoFinal;

import javax.swing.table.DefaultTableModel;

public class VentanaVentas extends javax.swing.JFrame {
    
    ArregloProductos inventario = DatosSistema.inventario;
    ArregloClientes clientes = DatosSistema.clientes;
    ArregloVentas ventas = DatosSistema.ventas;
    
    DefaultTableModel modeloDetalle;
    
    Cliente clienteSeleccionado = null;
    Producto productoSeleccionado = null;
    Venta ventaActual = null;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaVentas.class.getName());

    public VentanaVentas() {
        initComponents();
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        String[] columnas = {"ID Producto", "Producto", "Precio", "Cantidad", "Subtotal"};
        modeloDetalle = new DefaultTableModel(null, columnas);
        jTableDetalleVenta.setModel(modeloDetalle);
        
        lblCliente.setText("Sin cliente seleccionado");
        lblProducto.setText("Sin producto seleccionado");
        lblPrecio.setText("S/ 0.00");
        lblStock.setText("0");
        lblTotal.setText("Total: S/ 0.00");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDniVenta = new javax.swing.JTextField();
        btnBuscarClienteVenta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDetalleVenta = new javax.swing.JTable();
        btnFinalizarVenta = new javax.swing.JButton();
        btnNuevaVenta = new javax.swing.JButton();
        btnSalirVentas = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCantidadVenta = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        btnBuscarProductoVenta = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtProductoVenta = new javax.swing.JTextField();
        btnBuscarProductoVenta1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registro de Ventas");

        jLabel2.setText("Cliente");

        jLabel3.setText("DNI Cliente");

        btnBuscarClienteVenta.setText("Buscar Cliente");
        btnBuscarClienteVenta.addActionListener(this::btnBuscarClienteVentaActionPerformed);

        jTableDetalleVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Producto", "Producto", "Precio", "Cantidad", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(jTableDetalleVenta);

        btnFinalizarVenta.setText("Finalizar Venta");
        btnFinalizarVenta.addActionListener(this::btnFinalizarVentaActionPerformed);

        btnNuevaVenta.setText("Nueva Venta");
        btnNuevaVenta.addActionListener(this::btnNuevaVentaActionPerformed);

        btnSalirVentas.setText("Salir");
        btnSalirVentas.addActionListener(this::btnSalirVentasActionPerformed);

        lblTotal.setText("Total: S/0.00");

        jLabel5.setText("ID Producto");

        jLabel6.setText("Precio del Producto:");

        jLabel7.setText("Producto Selecionado");

        btnBuscarProductoVenta.setText("Buscar Producto");
        btnBuscarProductoVenta.addActionListener(this::btnBuscarProductoVentaActionPerformed);

        jLabel8.setText("Canitdad:");

        btnBuscarProductoVenta1.setText("Agregar Producto");
        btnBuscarProductoVenta1.addActionListener(this::btnBuscarProductoVenta1ActionPerformed);

        jLabel9.setText("Stock Disponible:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnFinalizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(btnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(btnSalirVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDniVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(lblCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBuscarProductoVenta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscarProductoVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscarClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDniVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarProductoVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidadVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(239, 239, 239)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFinalizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalirVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarProductoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoVentaActionPerformed
        String dato = txtProductoVenta.getText().trim();
        
        if (dato.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Ingrese el ID del producto");
            return;
        }
        
        try {
            int idProducto = Integer.parseInt(dato);
            
            productoSeleccionado = inventario.buscarPorId(idProducto);
            
            if (productoSeleccionado != null) {
                lblProducto.setText(productoSeleccionado.getNombre());
                lblPrecio.setText("S/ " + productoSeleccionado.getPrecio());
                lblStock.setText(String.valueOf(productoSeleccionado.getStock()));
                
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Producto encontrado");
            }else {
                lblProducto.setText("Sin producto seleccionado");
                lblPrecio.setText("S/ 0.00");
                lblStock.setText("0");
                
                javax.swing.JOptionPane.showMessageDialog(this,
                        "No existe un producto con ese ID");
            }
        } 
        catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "El ID del producto debe ser un número entero.",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarProductoVentaActionPerformed

    private void btnBuscarClienteVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteVentaActionPerformed
        String dni = txtDniVenta.getText().trim();
        
        if (dni.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Ingrese el DNi del cliente.");
            return;
        }
        
        if (!dni.matches("\\d{8}")) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "El DNI debe tener 8 dígitos númericos.");
            return;
        }
        
        clienteSeleccionado = clientes.buscarPorDni(dni);
        
        if (clienteSeleccionado != null){
            lblCliente.setText(clienteSeleccionado.getNombres() + " " + clienteSeleccionado.getApellidos());
            
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Cliente encontrado");
        } else {
            lblCliente.setText("Sin cliente seleccionado");
            
            javax.swing.JOptionPane.showMessageDialog(this,
                    "No existe un cliente con ese DNI");
        }
    }//GEN-LAST:event_btnBuscarClienteVentaActionPerformed

    private void btnBuscarProductoVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoVenta1ActionPerformed
        if (clienteSeleccionado == null) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Primero debe buscar y seleccionar un cliente.");
            return;
        }
        
        if (productoSeleccionado == null) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Primero debe buscar y seleccionar un producto.");
            return;
        }
        
        String datoCantidad = txtCantidadVenta.getText().trim();
        
        if (datoCantidad.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Ingrese la cantidad a vender.");
            return;
        }
        
       
        try {
            int cantidad = Integer.parseInt(datoCantidad);
            
            if (cantidad <= 0) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "La cantidad debe ser mayor a 0.");
                return;
            }
            
            if (ventaActual == null) {
                ventaActual = new Venta(ventas.generarNuevoId(), clienteSeleccionado);
            }
            
            DetalleVenta detalle = new DetalleVenta(productoSeleccionado, cantidad);
            ventaActual.agregarDetalle(detalle);
            
            Object[] fila = {
                productoSeleccionado.getId(),
                productoSeleccionado.getNombre(),
                productoSeleccionado.getPrecio(),
                cantidad,
                detalle.getSubtotal()
            };
            
            modeloDetalle.addRow(fila);
            
            lblTotal.setText("Total: S/ " + ventaActual.getTotal());
            
            txtProductoVenta.setText("");
            txtCantidadVenta.setText("");
            lblProducto.setText("Sin producto seleccionado");
            lblPrecio.setText("S/ 0.00");
            lblStock.setText("0");
            
            productoSeleccionado = null;
            
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Producto agregado a la venta.");
        }
        catch (NumberFormatException e){
            javax.swing.JOptionPane.showMessageDialog(this,
                    "La cantidad debe ser un número entero.",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarProductoVenta1ActionPerformed

    private void btnFinalizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarVentaActionPerformed
        if (ventaActual == null || ventaActual.getDetalles().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "No hay productos agregados a la venta.");
            return;
        }
        
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this,
                "¿Desea finalizar la venta?\n\n"
                + "Cliente: " + clienteSeleccionado.getNombres() + " " + clienteSeleccionado.getApellidos() + "\n"
                + "Total; " + ventaActual.getTotal(),
                "Confirmar venta",
                javax.swing.JOptionPane.YES_NO_OPTION);
        
        if(confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            
            for (int i = 0; i < ventaActual.getDetalles().size(); i++){
                
            DetalleVenta detalle = ventaActual.getDetalles().get(i);
            
            Producto producto = detalle.getProducto();
            int nuevoStock = producto.getStock() - detalle.getCantidad();
            
            producto.setStock(nuevoStock);
        }
        
        ventas.agregar(ventaActual);
        
        javax.swing.JOptionPane.showMessageDialog(this,
                "Venta finalizada correctamente.\n"
                + "Total vendido: S/ " + ventaActual.getClass());

         nuevaVenta();
    }//GEN-LAST:event_btnFinalizarVentaActionPerformed
}
    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
    nuevaVenta();
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

    private void btnSalirVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirVentasActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirVentasActionPerformed

    private void nuevaVenta() {
        clienteSeleccionado = null;
        productoSeleccionado = null;
        ventaActual = null;
        
        txtDniVenta.setText("");
        txtProductoVenta.setText("");
        txtCantidadVenta.setText("");
        
        lblCliente.setText("Sin cliente seleccionado");
        lblProducto.setText("Sin producto seleccionado");
        lblPrecio.setText("S/ 0.00");
        lblStock.setText("0");
        lblTotal.setText("Total: S/ 0.00");
        
        modeloDetalle.setRowCount(0);
        
        txtDniVenta.requestFocus();    
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new VentanaVentas().setVisible(true));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarClienteVenta;
    private javax.swing.JButton btnBuscarProductoVenta;
    private javax.swing.JButton btnBuscarProductoVenta1;
    private javax.swing.JButton btnFinalizarVenta;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton btnSalirVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDetalleVenta;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtCantidadVenta;
    private javax.swing.JTextField txtDniVenta;
    private javax.swing.JTextField txtProductoVenta;
    // End of variables declaration//GEN-END:variables
}
