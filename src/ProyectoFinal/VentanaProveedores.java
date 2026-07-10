
package ProyectoFinal;

import javax.swing.table.DefaultTableModel;

public class VentanaProveedores extends javax.swing.JFrame {
    
    ListaProveedores proveedores = DatosSistema.proveedores;
    DefaultTableModel modeloProveedores;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaProveedores.class.getName());

    public VentanaProveedores() {
        initComponents();
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        String[] columnas = {"ID", "Nombre", "RUC", "Teléfono", "Dirección"};
        modeloProveedores = new DefaultTableModel(null, columnas);
        jTableProveedores.setModel(modeloProveedores);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProveedores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreProveedor = new javax.swing.JTextField();
        txtRucProveedor = new javax.swing.JTextField();
        txtTelefonoProveedor = new javax.swing.JTextField();
        txtDireccionProveedor = new javax.swing.JTextField();
        btnCargarProveedores = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        btnRegistrarProveedor = new javax.swing.JButton();
        btnActualizarProveedor = new javax.swing.JButton();
        btnBuscarProveedor = new javax.swing.JButton();
        btnSalirProveedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "RUC", "Teléfono", "Dirección"
            }
        ));
        jScrollPane1.setViewportView(jTableProveedores);

        jLabel1.setText("Nombre");

        jLabel2.setText("RUC");

        jLabel3.setText("Telefono");

        jLabel4.setText("Dirección");

        btnCargarProveedores.setText("Cargar Datos");
        btnCargarProveedores.addActionListener(this::btnCargarProveedoresActionPerformed);

        btnEliminarProveedor.setText("Eliminar");
        btnEliminarProveedor.addActionListener(this::btnEliminarProveedorActionPerformed);

        btnRegistrarProveedor.setText("Registrar");
        btnRegistrarProveedor.addActionListener(this::btnRegistrarProveedorActionPerformed);

        btnActualizarProveedor.setText("Actualizar");
        btnActualizarProveedor.addActionListener(this::btnActualizarProveedorActionPerformed);

        btnBuscarProveedor.setText("Buscar");
        btnBuscarProveedor.addActionListener(this::btnBuscarProveedorActionPerformed);

        btnSalirProveedor.setText("Exit");
        btnSalirProveedor.addActionListener(this::btnSalirProveedorActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalirProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreProveedor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txtRucProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDireccionProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCargarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRucProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCargarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalirProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarProveedoresActionPerformed
        if (proveedores.tamaño() == 0) {
    proveedores.agregar(new Proveedor(1, "Stanley Perú", "20123456789", "987654321", "Lima"));
    proveedores.agregar(new Proveedor(2, "Tramontina SAC", "20987654321", "956123456", "Los Olivos"));
    proveedores.agregar(new Proveedor(3, "Truper Distribuciones", "20456789123", "912345678", "San Martín de Porres"));
    }

        mostrarProveedores();
    }//GEN-LAST:event_btnCargarProveedoresActionPerformed

    private void btnRegistrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProveedorActionPerformed
        String nombre = txtNombreProveedor.getText().trim();
        String ruc = txtRucProveedor.getText().trim();
        String telefono = txtTelefonoProveedor.getText().trim();
        String direccion = txtDireccionProveedor.getText().trim();

        if (nombre.isEmpty() || ruc.isEmpty() || telefono.isEmpty() || direccion.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Completa todos los campos del proveedor.");
        return;
    }

        if (!ruc.matches("\\d{11}")) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "El RUC debe tener 11 dígitos numéricos.");
        return;
    }

        if (!telefono.matches("\\d{9}")) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "El teléfono debe tener 9 dígitos numéricos.");
        return;
    }

        int nuevoId = proveedores.generarNuevoId();

        Proveedor nuevo = new Proveedor(nuevoId, nombre, ruc, telefono, direccion);
        proveedores.agregar(nuevo);

        mostrarProveedores();
        limpiarCampos();

        javax.swing.JOptionPane.showMessageDialog(this,
                "Proveedor registrado correctamente.");
    }//GEN-LAST:event_btnRegistrarProveedorActionPerformed

    private void btnBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProveedorActionPerformed
        String dato = javax.swing.JOptionPane.showInputDialog(this,
        "Ingrese el ID del proveedor a buscar:");
        
        if (dato == null) {
        return;
    }

        dato = dato.trim();

        if (dato.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Debe ingresar un ID.");
        return;
    }

        try {
        int idBuscar = Integer.parseInt(dato);

        Proveedor p = proveedores.buscarPorId(idBuscar);

        if (p != null) {
        modeloProveedores.setRowCount(0);

        Object[] fila = {
            p.getIdProveedor(),
            p.getNombre(),
            p.getRuc(),
            p.getTelefono(),
            p.getDireccion()
        };

        modeloProveedores.addRow(fila);

        txtNombreProveedor.setText(p.getNombre());
        txtRucProveedor.setText(p.getRuc());
        txtTelefonoProveedor.setText(p.getTelefono());
        txtDireccionProveedor.setText(p.getDireccion());

        javax.swing.JOptionPane.showMessageDialog(this,
                "Proveedor encontrado.");

    } else {
        javax.swing.JOptionPane.showMessageDialog(this,
                "No existe un proveedor con ese ID.");
    }

    } 
        catch (NumberFormatException e) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "El ID debe ser un número entero.",
            "Error",
            javax.swing.JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_btnBuscarProveedorActionPerformed

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
        String dato = javax.swing.JOptionPane.showInputDialog(this,
        "Ingrese el ID del proveedor a eliminar:");

    if (dato == null) {
    return;
    }

    dato = dato.trim();

    if (dato.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Debe ingresar un ID.");
    return;
    }

    try {
    int idEliminar = Integer.parseInt(dato);

    Proveedor p = proveedores.buscarPorId(idEliminar);

    if (p == null) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "No existe un proveedor con ese ID.");
        return;
    }

    int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this,
            "¿Está seguro que desea eliminar este proveedor?\n\n"
            + "ID: " + p.getIdProveedor() + "\n"
            + "Nombre: " + p.getNombre() + "\n"
            + "RUC: " + p.getRuc(),
            "Confirmar eliminación",
            javax.swing.JOptionPane.YES_NO_OPTION);

    if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
        boolean eliminado = proveedores.eliminarPorId(idEliminar);

        if (eliminado) {
            mostrarProveedores();
            limpiarCampos();

            javax.swing.JOptionPane.showMessageDialog(this,
                    "Proveedor eliminado correctamente.");
        }
    }

    } 
        catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
            "El ID debe ser un número entero.",
            "Error",
            javax.swing.JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void btnActualizarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProveedorActionPerformed
        String dato = javax.swing.JOptionPane.showInputDialog(this,
        "Ingrese el ID del proveedor a actualizar:");

    if (dato == null) {
    return;
    }

    dato = dato.trim();

    if (dato.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Debe ingresar un ID.");
    return;
    }

    try {
    int idActualizar = Integer.parseInt(dato);

    Proveedor p = proveedores.buscarPorId(idActualizar);

    if (p == null) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "No existe un proveedor con ese ID.");
        return;
    }

    String nombre = txtNombreProveedor.getText().trim();
    String ruc = txtRucProveedor.getText().trim();
    String telefono = txtTelefonoProveedor.getText().trim();
    String direccion = txtDireccionProveedor.getText().trim();

    if (nombre.isEmpty() || ruc.isEmpty() || telefono.isEmpty() || direccion.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Completa todos los campos del proveedor.");
        return;
    }

    if (!ruc.matches("\\d{11}")) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "El RUC debe tener 11 dígitos numéricos.");
        return;
    }

    if (!telefono.matches("\\d{9}")) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "El teléfono debe tener 9 dígitos numéricos.");
        return;
    }

    boolean actualizado = proveedores.actualizarProveedor(
            idActualizar,
            nombre,
            ruc,
            telefono,
            direccion
    );

    if (actualizado) {
        mostrarProveedores();
        limpiarCampos();

        javax.swing.JOptionPane.showMessageDialog(this,
                "Proveedor actualizado correctamente.");
    }

    } catch (NumberFormatException e) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "El ID debe ser un número entero.",
            "Error",
            javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    
    }//GEN-LAST:event_btnActualizarProveedorActionPerformed

    private void btnSalirProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirProveedorActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirProveedorActionPerformed
    
    
    private void mostrarProveedores() {
    modeloProveedores.setRowCount(0);

    for (int i = 0; i < proveedores.tamaño(); i++) {
        Proveedor p = proveedores.obtener(i);

        if (p != null) {
            Object[] fila = {
                p.getIdProveedor(),
                p.getNombre(),
                p.getRuc(),
                p.getTelefono(),
                p.getDireccion()
            };

            modeloProveedores.addRow(fila);
        }
    }
    }
    
    private void limpiarCampos() {
        txtNombreProveedor.setText("");
        txtRucProveedor.setText("");
        txtTelefonoProveedor.setText("");
        txtDireccionProveedor.setText("");
        txtNombreProveedor.requestFocus();
    
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VentanaProveedores().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarProveedor;
    private javax.swing.JButton btnBuscarProveedor;
    private javax.swing.JButton btnCargarProveedores;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnRegistrarProveedor;
    private javax.swing.JButton btnSalirProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProveedores;
    private javax.swing.JTextField txtDireccionProveedor;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtRucProveedor;
    private javax.swing.JTextField txtTelefonoProveedor;
    // End of variables declaration//GEN-END:variables
}
