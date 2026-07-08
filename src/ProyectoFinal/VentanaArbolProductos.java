
package ProyectoFinal;

import javax.swing.table.DefaultTableModel;

public class VentanaArbolProductos extends javax.swing.JFrame {
    
    ArregloProductos inventario = DatosSistema.inventario;
    ArbolProductos arbol = new ArbolProductos();
    
    DefaultTableModel modeloArbol;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaArbolProductos.class.getName());

    public VentanaArbolProductos() {
        initComponents();
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        String[] columnas = {"ID", "Nombre", "Marca", "Precio", "Stock"};
        modeloArbol = new DefaultTableModel(null, columnas);
        jTableArbolProductos.setModel(modeloArbol);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdArbol = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableArbolProductos = new javax.swing.JTable();
        btnConstruirArbol = new javax.swing.JButton();
        btnMostrarInOrden = new javax.swing.JButton();
        btnSalirArbol = new javax.swing.JButton();
        btnBuscarArbol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ÁRBOL BINARIO DE PRODUCTOS");

        jLabel2.setText("ID PRODUCTO");

        jTableArbolProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Marca", "Precio", "Stock"
            }
        ));
        jScrollPane1.setViewportView(jTableArbolProductos);

        btnConstruirArbol.setText("Construir Árbol");
        btnConstruirArbol.addActionListener(this::btnConstruirArbolActionPerformed);

        btnMostrarInOrden.setText("Mostrar InOrden");
        btnMostrarInOrden.addActionListener(this::btnMostrarInOrdenActionPerformed);

        btnSalirArbol.setText("Salir");
        btnSalirArbol.addActionListener(this::btnSalirArbolActionPerformed);

        btnBuscarArbol.setText("Buscar por ID");
        btnBuscarArbol.addActionListener(this::btnBuscarArbolActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnSalirArbol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConstruirArbol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarArbol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostrarInOrden, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnConstruirArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnMostrarInOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalirArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConstruirArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConstruirArbolActionPerformed
        if (inventario.tamaño() == 0){
            javax.swing.JOptionPane.showMessageDialog(this,
                    "No hay productos en el inventario. Primero cargue o registre productos.");
            return;
        }
        
        arbol.limpiar();
        
        for (int i =0; i < inventario.tamaño(); i++) {
            Producto p = inventario.obtener(i);
            arbol.insertar(p);
        }
        
        javax.swing.JOptionPane.showMessageDialog(this,
                "Árbol construido correctamente con los productos del inventario.");
    }//GEN-LAST:event_btnConstruirArbolActionPerformed

    private void btnBuscarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarArbolActionPerformed
        String dato = txtIdArbol.getText().trim();
        
        if (dato.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Ingrese el ID del producto.");
            
            return;
        }
        
        try {
            int id = Integer.parseInt(dato);
            
            Producto p = arbol.buscar(id);
            
            if (p == null) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "No se encontro un producto con ese ID en el árbol.");
                return;
            }
            
            modeloArbol.setRowCount(0);
            
            Object[] fila = {
                p.getId(),
                p.getNombre(),
                p.getMarca(),
                p.getPrecio(),
                p.getStock(),
            };
            
            modeloArbol.addRow(fila);
            
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Producto encontrado en el árbol.");
        }
        catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "El ID debe ser un número entero.",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarArbolActionPerformed

    private void btnMostrarInOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarInOrdenActionPerformed
        if (arbol.estaVacio()){
            javax.swing.JOptionPane.showMessageDialog(this,
                    "PRimero debe construir el árbol.");
            return;
        }
        
        Producto[] lista = arbol.recorridoInOrden();
        mostrarListaProductos(lista);
        
        javax.swing.JOptionPane.showMessageDialog(this,
                "Productos mostrados en recorrido InOrden.");
    }//GEN-LAST:event_btnMostrarInOrdenActionPerformed

    private void btnSalirArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirArbolActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirArbolActionPerformed

    private void mostrarListaProductos(Producto[] lista) {
    modeloArbol.setRowCount(0);

    for (int i = 0; i < lista.length; i++) {
        Producto p = lista[i];

        Object[] fila = {
            p.getId(),
            p.getNombre(),
            p.getMarca(),
            p.getPrecio(),
            p.getStock()
        };

        modeloArbol.addRow(fila);
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
        java.awt.EventQueue.invokeLater(() -> new VentanaArbolProductos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarArbol;
    private javax.swing.JButton btnConstruirArbol;
    private javax.swing.JButton btnMostrarInOrden;
    private javax.swing.JButton btnSalirArbol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableArbolProductos;
    private javax.swing.JTextField txtIdArbol;
    // End of variables declaration//GEN-END:variables
}
