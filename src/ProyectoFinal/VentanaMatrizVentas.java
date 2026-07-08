package ProyectoFinal;

import javax.swing.table.DefaultTableModel;

public class VentanaMatrizVentas extends javax.swing.JFrame {
    
    MatrizVentas matrizVentas = new MatrizVentas();
    DefaultTableModel modeloMatriz;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaMatrizVentas.class.getName());

    public VentanaMatrizVentas() {
        initComponents();
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        
        String[] columnas = {"Producto", "Día 1", "Día 2", "Día 3", "Toal"};
        modeloMatriz = new DefaultTableModel(null, columnas);
        jTableMatrizVentas.setModel(modeloMatriz);
        
        lblTotalGeneral.setText("Total general: S/ 0.00");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMatrizVentas = new javax.swing.JTable();
        btnSalirMatriz = new javax.swing.JButton();
        btnCargarMatriz = new javax.swing.JButton();
        btnCalcularTotales = new javax.swing.JButton();
        lblTotalGeneral = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MATRIZ DE VENTAS POR PRODUCTO Y DÍA");

        jTableMatrizVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producto", "Día 1", "Dia 2", "Día 3", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTableMatrizVentas);

        btnSalirMatriz.setText("Salir");
        btnSalirMatriz.addActionListener(this::btnSalirMatrizActionPerformed);

        btnCargarMatriz.setText("Cargar Matriz");
        btnCargarMatriz.addActionListener(this::btnCargarMatrizActionPerformed);

        btnCalcularTotales.setText("Calcular Totales");
        btnCalcularTotales.addActionListener(this::btnCalcularTotalesActionPerformed);

        lblTotalGeneral.setText("Total general: S/ 0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnCargarMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnCalcularTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnSalirMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotalGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTotalGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargarMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcularTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalirMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void mostrarMatriz(){
        modeloMatriz.setRowCount(0);
        
        for (int i = 0; i < matrizVentas.cantidadProductos(); i++){
            Object[] fila = {
                matrizVentas.obtenerProducto(i),
                matrizVentas.obtenerVenta(i, 0),
                matrizVentas.obtenerVenta(i, 1),
                matrizVentas.obtenerVenta(i, 2),
                matrizVentas.calcularTotalProducto(i)
            };
            
            
            modeloMatriz.addRow(fila);
        }
    }
    private void btnCalcularTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularTotalesActionPerformed
        mostrarMatriz();
        
        double totalGeneral = matrizVentas.calcularTotalGeneral();
        
        lblTotalGeneral.setText("Total general: S/ " + totalGeneral);
        
        javax.swing.JOptionPane.showMessageDialog(this,
                "Totales calculados correctamente.");
    }//GEN-LAST:event_btnCalcularTotalesActionPerformed

    private void btnCargarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarMatrizActionPerformed
        mostrarMatriz();
        
        javax.swing.JOptionPane.showMessageDialog(this,
                "Matriz de venras cargada correctamente.");
    }//GEN-LAST:event_btnCargarMatrizActionPerformed

    private void btnSalirMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirMatrizActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirMatrizActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new VentanaMatrizVentas().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularTotales;
    private javax.swing.JButton btnCargarMatriz;
    private javax.swing.JButton btnSalirMatriz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMatrizVentas;
    private javax.swing.JLabel lblTotalGeneral;
    // End of variables declaration//GEN-END:variables
}
