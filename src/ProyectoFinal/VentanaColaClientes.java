
package ProyectoFinal;

import javax.swing.table.DefaultTableModel;

public class VentanaColaClientes extends javax.swing.JFrame {
    
    ArregloClientes clientes = DatosSistema.clientes;
    ColaClientes colaClientes = DatosSistema.colaClientes;
    
    DefaultTableModel modeloCola;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaColaClientes.class.getName());

    public VentanaColaClientes() {
        initComponents();
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        String[] columnas = {"N°", "DNI", "Cliente", "Teléfono"};
        modeloCola = new DefaultTableModel(null, columnas);
        jTableColaClientes.setModel(modeloCola);
        
        mostrarCola();
       
                }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarCola = new javax.swing.JButton();
        btnAtenderCliente = new javax.swing.JButton();
        btnVerPrimero = new javax.swing.JButton();
        btnActualizarCola = new javax.swing.JButton();
        btnSalirCola = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableColaClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtDniCola = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAgregarCola.setText("Agregar a Cola");
        btnAgregarCola.addActionListener(this::btnAgregarColaActionPerformed);

        btnAtenderCliente.setText("Atender Cliente");
        btnAtenderCliente.addActionListener(this::btnAtenderClienteActionPerformed);

        btnVerPrimero.setText("Ver Primero");
        btnVerPrimero.addActionListener(this::btnVerPrimeroActionPerformed);

        btnActualizarCola.setText("Actualizar Cola");
        btnActualizarCola.addActionListener(this::btnActualizarColaActionPerformed);

        btnSalirCola.setText("Salir");
        btnSalirCola.addActionListener(this::btnSalirColaActionPerformed);

        jTableColaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N°", "DNI", "Cliente", "Teléfono"
            }
        ));
        jScrollPane1.setViewportView(jTableColaClientes);

        jLabel1.setText("DNI Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarCola, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtenderCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizarCola, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalirCola, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtDniCola, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDniCola, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarCola, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtenderCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizarCola, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalirCola, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarColaActionPerformed
        String dni = txtDniCola.getText().trim();
        
        if (dni.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Ingrese el DNI del cliente.");
            
            return;
        }
        
        if(!dni.matches("\\d{8}")) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "El DNI debe tener 8 dígitos númericos.");
            
            return;
        }
        
        Cliente c = clientes.buscarPorDni(dni);
        
        if (c == null) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "No existe un cliente con ese DNI");
            return;
        }
        
        colaClientes.encolar(c);
        mostrarCola();
        
        txtDniCola.setText("");
        txtDniCola.requestFocus();
        
        javax.swing.JOptionPane.showMessageDialog(this,
                "Cliente agregado a la cola correctamente.");
    }//GEN-LAST:event_btnAgregarColaActionPerformed

    private void btnAtenderClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderClienteActionPerformed
        Cliente atendido = colaClientes.desencolar();
        
        if (atendido == null) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "No hay clientes en la cola");
            return;
        }
        
        mostrarCola();
        
        javax.swing.JOptionPane.showConfirmDialog(this,
                "Cliente atendido:\n"
                + atendido.getNombres() + " " + atendido.getApellidos());
    }//GEN-LAST:event_btnAtenderClienteActionPerformed

    private void btnVerPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPrimeroActionPerformed
      Cliente primero = colaClientes.verPrimero();
      
      if (primero == null) {
          javax.swing.JOptionPane.showMessageDialog(this,
                  "No hay clientes en cola.");
          return;
      }
      
      javax.swing.JOptionPane.showMessageDialog(this,
              "Primer cliente en la cola:\n"
              + primero.getDni() + " - "
              + primero.getNombres() + " " + primero.getApellidos());
    }//GEN-LAST:event_btnVerPrimeroActionPerformed

    private void btnActualizarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarColaActionPerformed
        mostrarCola();
        
        javax.swing.JOptionPane.showMessageDialog(this,
                "Cola actualizada correctamente.");
    }//GEN-LAST:event_btnActualizarColaActionPerformed

    private void btnSalirColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirColaActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirColaActionPerformed
    
    private void mostrarCola() {
        modeloCola.setRowCount(0);
        
        Cliente[] arregloClientes = colaClientes.obtenerClientes();
        
        for (int i = 0; i < arregloClientes.length; i++) {
            Cliente c = arregloClientes[i];
            
            Object[] fila = {
                c.getDni(),
                c.getNombres() + " " + c.getApellidos(),
                c.getTelefono()
            };
            
            modeloCola.addRow(fila);
        } 
    }
    /**
     * @param args the command line arguments
     */
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
        java.awt.EventQueue.invokeLater(() -> new VentanaColaClientes().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCola;
    private javax.swing.JButton btnAgregarCola;
    private javax.swing.JButton btnAtenderCliente;
    private javax.swing.JButton btnSalirCola;
    private javax.swing.JButton btnVerPrimero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableColaClientes;
    private javax.swing.JTextField txtDniCola;
    // End of variables declaration//GEN-END:variables
}
