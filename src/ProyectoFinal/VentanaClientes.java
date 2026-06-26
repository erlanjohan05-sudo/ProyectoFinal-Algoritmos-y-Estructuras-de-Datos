package ProyectoFinal;

import javax.swing.table.DefaultTableModel;

public class VentanaClientes extends javax.swing.JFrame {
    
    ArregloClientes clientes = DatosSistema.clientes;
    DefaultTableModel modeloClientes;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaClientes.class.getName());

    /**
     * Creates new form VentanaClientes
     */
    public VentanaClientes() {
        initComponents();
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        String[] columnas ={"DNi", "Nombres", "Apellidos", "Teléfono", "Dirección"};
        modeloClientes = new DefaultTableModel(null, columnas);
        JTableClientes.setModel(modeloClientes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableClientes = new javax.swing.JTable();
        btnCargarDatos = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DNI");

        jLabel2.setText("Nombres");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Dirección");

        jLabel5.setText("Teléfono");

        JTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombres", "Apellidos", "Teléfono", "Dirección"
            }
        ));
        jScrollPane1.setViewportView(JTableClientes);

        btnCargarDatos.setText("Cargar Datos");
        btnCargarDatos.addActionListener(this::btnCargarDatosActionPerformed);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(this::btnActualizarActionPerformed);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCargarDatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnCargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosActionPerformed
        if (clientes.tamaño() == 0) {
            clientes.agregar(new Cliente("76365098", "Erlan Giovanny", "Ubillus Cabellos", "990113338", "San Martin de Porres"));
            clientes.agregar(new Cliente("47638270", "Lucero Elizabeth", "Ubillus Cabellos", "979395067", "Lima"));
            clientes.agregar(new Cliente("09886202", "Maria Natividad", "Cabellos Alania", "984769735", "San German"));
            clientes.agregar(new Cliente("08492017", "Saul Zarjachenko", "Ubillus Purizaca", "956446398", "Los Olivos"));
        }
        mostrarClientes();
    }//GEN-LAST:event_btnCargarDatosActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       String dni = txtDni.getText().trim();
       String nombres = txtNombres.getText().trim();
       String apellidos = txtApellidos.getText().trim();
       String telefono = txtTelefono.getText().trim();
       String direccion = txtDireccion.getText().trim();
       
       if (dni.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || telefono.isEmpty() || direccion.isEmpty()){
           javax.swing.JOptionPane.showMessageDialog(this,
                   "Completa todos los campos del cliente.");
           return;
       }
       
       if (!dni.matches("\\d{8}")) {
           javax.swing.JOptionPane.showMessageDialog(this,
                   "El DNI debe tener 8 dígitos numéricos");
       }
       
       if (!telefono.matches("\\d{9}")) {
           javax.swing.JOptionPane.showMessageDialog(this,
                   "El teléfono debe tener 9 dígitos numéricos");
           return;
       }
       
       if (clientes.existenDni(dni)) {
           javax.swing.JOptionPane.showMessageDialog(this,
                   "Ya existe un cliente registrado con ese DNI");
           return;
       }
       
       Cliente nuevo = new Cliente(dni, nombres, apellidos, telefono, direccion);
       clientes.agregar(nuevo);
       
       mostrarClientes();
       limpiarCampos();
       
       javax.swing.JOptionPane.showMessageDialog(this,
               "Cliente registrado correctamente");
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       String dni = javax.swing.JOptionPane.showInputDialog(this,
               "Ingrese el DNI del cliente a buscar");
       if (dni == null) {
           return;
       }
       
       dni = dni.trim();
       
       if (dni.isEmpty()) {
           javax.swing.JOptionPane.showMessageDialog(this,
                   "Debe ingresar un DNI.");
           return;
       }
       if (!dni.matches("\\d{8}")) {
           javax.swing.JOptionPane.showMessageDialog(this,
                   "El DNI debe tener 8 dígitos númericos.");
           return;
       }
       
       Cliente c = clientes.buscarPorDni(dni);
       
       if (c != clientes.buscarPorDni(dni));
       
       if (c != null) {
           modeloClientes.setRowCount(0);
           
           Object[] fila = {
               c.getDni(),
               c.getNombres(),
               c.getApellidos(),
               c.getTelefono(),
               c.getDireccion()
           };
           
           modeloClientes.addRow(fila);
           
           txtDni.setText(c.getDni());
           txtNombres.setText(c.getNombres());
           txtApellidos.setText(c.getApellidos());
           txtTelefono.setText(c.getTelefono());
           txtDireccion.setText(c.getDireccion());
           
           javax.swing.JOptionPane.showMessageDialog(this,
                   "Cliente encontrado");
           
       } else {
           javax.swing.JOptionPane.showMessageDialog(this,
                   "No existe un cliente con ese DNI");
       }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String dni = javax.swing.JOptionPane.showInputDialog(this,
                "Ingrese el DNI del cliente a eliminar.");
        
        if (dni == null) {
            return;
        }
        
        dni = dni.trim();
        
        if (dni.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Debe ingresar un DNI");
            return;
        }
        
        if (!dni.matches("\\d{8}")) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "El DNI debe tener 8 dígitos númericos.");
            return;
        }
        
        Cliente c = clientes.buscarPorDni(dni);
        
        if (c == null) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "No existe un cliente con ese DNI.");
            return;
        }
        
        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this,
                "¿Está seguro que desea eliminar este cliente?\n\n"
                + "DNI: " + c.getDni() + "\n"
                + "Nombres: " + c.getNombres() + "\n"
                + "Apellidos: " + c.getApellidos() + "\n",
                "Confirmar eliminación",
                javax.swing.JOptionPane.YES_NO_CANCEL_OPTION);
        
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
            boolean eliminado = clientes.eliminarPorDni(dni);
            
            if (eliminado) {
                mostrarClientes();
                limpiarCampos();
                
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Cliente eliminado correctamente");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String dni = javax.swing.JOptionPane.showInputDialog(this,
                "Ingrese el DNI del cliente a actualizar.");
        
        if (dni == null){
            return;
        }
        
        dni = dni.trim();
        
        if (dni.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Debe ingresar un DNI.");
            return;
        }
        
        if (!dni.matches("\\d{8}")) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "El DNI debe tener 8 dígitos númericos.");
            return;
        }
        
        Cliente c = clientes.buscarPorDni(dni);
        
        if (c == null) { 
            javax.swing.JOptionPane.showMessageDialog(this,
                    "No existe un cliente con ese DNI.");
            return;
        }
        
        String nombres = txtNombres.getText().trim();
        String apellidos = txtApellidos.getText().trim();
        String telefono = txtTelefono.getText().trim();
        String direccion = txtDireccion.getText().trim();
        
        if (nombres.isEmpty() || apellidos.isEmpty() || telefono.isEmpty() || direccion.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Completa todos los campos del cliente");
            return;
        }
        
        if (!telefono.matches("\\d{9}")) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "El teléfono debe tener 9 dígitos númericos.");
            return;
        }
        
        boolean actualizado = clientes.actualizarCliente(dni, nombres, apellidos, telefono, direccion);
        
        if(actualizado) {
            mostrarClientes();
            limpiarCampos();
            
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Cliente actualizado correctamente");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void mostrarClientes(){
        modeloClientes.setRowCount(0);
        
        for (int i = 0; i < clientes.tamaño(); i++) {
            Cliente c = clientes.obtener(i);
            
            Object[] fila = {
                c.getDni(),
                c.getNombres(),
                c.getApellidos(),
                c.getTelefono(),
                c.getDireccion(),
            };
            
            modeloClientes.addRow(fila);
        }
    }
    
    private void limpiarCampos(){
        txtDni.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtDni.requestFocus();
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
        java.awt.EventQueue.invokeLater(() -> new VentanaClientes().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableClientes;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
