
package ProyectoFinal;

public class MenuPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuPrincipal.class.getName());

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnClientes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        btnColaClientes = new javax.swing.JButton();
        btnArbolProductos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sistema de Gestión de Ventas - Ferretería");

        btnClientes.setText("Clientes");
        btnClientes.addActionListener(this::btnClientesActionPerformed);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(this::btnSalirActionPerformed);

        btnProductos.setText("Productos");
        btnProductos.addActionListener(this::btnProductosActionPerformed);

        btnVentas.setText("Ventas");
        btnVentas.addActionListener(this::btnVentasActionPerformed);

        btnReportes.setText("Reportes");
        btnReportes.addActionListener(this::btnReportesActionPerformed);

        btnHistorial.setText("Historial");
        btnHistorial.addActionListener(this::btnHistorialActionPerformed);

        btnColaClientes.setText("Cola Clientes");
        btnColaClientes.addActionListener(this::btnColaClientesActionPerformed);

        btnArbolProductos.setText("Árbol Productos");
        btnArbolProductos.addActionListener(this::btnArbolProductosActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnArbolProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnColaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnColaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArbolProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        VentanaHerramientas ventana = new VentanaHerramientas();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        VentanaClientes ventana = new VentanaClientes();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int option = javax.swing.JOptionPane.showConfirmDialog(this,
                "¿Desea salir del sistema?",
                "Confirmar Salida.",
                javax.swing.JOptionPane.YES_NO_OPTION);
        
        if (option == javax.swing.JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        VentanaVentas ventana = new VentanaVentas();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        
        VentanaReportes ventana = new VentanaReportes();
        
        ventana.setVisible(true);
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        VentanaHistorial ventana = new VentanaHistorial();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnColaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColaClientesActionPerformed
        VentanaColaClientes ventana = new VentanaColaClientes();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnColaClientesActionPerformed

    private void btnArbolProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArbolProductosActionPerformed
       VentanaArbolProductos ventana = new VentanaArbolProductos();
       ventana.setVisible(true);
    }//GEN-LAST:event_btnArbolProductosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
        java.awt.EventQueue.invokeLater(() -> new MenuPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArbolProductos;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnColaClientes;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
