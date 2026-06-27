
package ProyectoFinal;

import javax.swing.table.DefaultTableModel;

public class VentanaHistorial extends javax.swing.JFrame {
    
    PïlaHistorial historial = DatosSistema.historial;
    DefaultTableModel modeloHistorial;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaHistorial.class.getName());

    /**
     * Creates new form VentanaHistorial
     */
    public VentanaHistorial() {
        initComponents();
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        String[] columnas = {"N°", "Operación"};
        modeloHistorial = new DefaultTableModel(null, columnas);
        jTableHistorial.setModel(modeloHistorial);
        
        mostrarHistorial();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHistorial = new javax.swing.JTable();
        btnActualizarHistorial = new javax.swing.JButton();
        btnUltimaAccion = new javax.swing.JButton();
        btnSalirHistorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("HISTORIAL DE OPERACIONES");

        jTableHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "N°", "Operación"
            }
        ));
        jScrollPane1.setViewportView(jTableHistorial);

        btnActualizarHistorial.setText("Actualizar");
        btnActualizarHistorial.addActionListener(this::btnActualizarHistorialActionPerformed);

        btnUltimaAccion.setText("Ultima Acción");
        btnUltimaAccion.addActionListener(this::btnUltimaAccionActionPerformed);

        btnSalirHistorial.setText("Salir");
        btnSalirHistorial.addActionListener(this::btnSalirHistorialActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizarHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUltimaAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalirHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnActualizarHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUltimaAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalirHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarHistorialActionPerformed
        mostrarHistorial();
        
        javax.swing.JOptionPane.showMessageDialog(this,
                "Historial actualizado correctamente.");
    }//GEN-LAST:event_btnActualizarHistorialActionPerformed

    private void btnUltimaAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimaAccionActionPerformed
        String ultima = historial.peek();
        
        if (ultima == null) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "No hay acciones registradas.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Última acción:\n");
        }
    }//GEN-LAST:event_btnUltimaAccionActionPerformed

    private void btnSalirHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirHistorialActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirHistorialActionPerformed
    
    private void mostrarHistorial(){
        modeloHistorial.setRowCount(0);
        
        if (historial.estaVacia()) {
            return;
        }
        
        int numero = 1;
        
        for (int i = historial.tamaño() -1; i >= 0; i--) {
            Object[] fila = {
                numero,
                historial.obtener(i),
            };
            
            modeloHistorial.addRow(fila);
            numero++;
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
        java.awt.EventQueue.invokeLater(() -> new VentanaHistorial().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarHistorial;
    private javax.swing.JButton btnSalirHistorial;
    private javax.swing.JButton btnUltimaAccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHistorial;
    // End of variables declaration//GEN-END:variables
}
