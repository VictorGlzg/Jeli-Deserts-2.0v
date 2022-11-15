package general;

public class tinydatosProducto extends javax.swing.JPanel {
public String idField ="";
    public tinydatosProducto() {
        initComponents();
    }
    
    public void llenarDatos(String id, String tipo,String costo,String sabor){
        idField = id;
        tipoField.setText(tipo);
        costoField.setText(costo);
        saborField.setText(sabor);
        
    }
    
    public void limpiar(){
        tipoField.setText("");
        costoField.setText("");
        saborField.setText("");
        
    }
    
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbValues2 = new javax.swing.JLabel();
        tipoField = new javax.swing.JTextField();
        lbValues = new javax.swing.JLabel();
        costoField = new javax.swing.JTextField();
        lbValues3 = new javax.swing.JLabel();
        saborField = new javax.swing.JTextField();
        lbValues1 = new javax.swing.JLabel();

        setOpaque(false);

        lbValues2.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        lbValues2.setForeground(new java.awt.Color(120, 21, 22));
        lbValues2.setText("Producto:");

        tipoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tipoFieldKeyTyped(evt);
            }
        });

        lbValues.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        lbValues.setForeground(new java.awt.Color(120, 21, 22));
        lbValues.setText("Cantidad:");

        costoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoFieldActionPerformed(evt);
            }
        });
        costoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                costoFieldKeyTyped(evt);
            }
        });

        lbValues3.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        lbValues3.setForeground(new java.awt.Color(120, 21, 22));
        lbValues3.setText("Aditivo:");

        saborField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                saborFieldKeyTyped(evt);
            }
        });

        lbValues1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbValues1.setForeground(new java.awt.Color(115, 115, 115));
        lbValues1.setText("Información pedidos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(35, Short.MAX_VALUE)
                        .addComponent(lbValues2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbValues1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbValues)
                            .addComponent(lbValues3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(costoField, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(saborField))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbValues1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbValues2))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValues)
                    .addComponent(costoField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saborField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbValues3))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tipoFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tipoFieldKeyTyped
    if(tipoField.getText().length()>=20){
        evt.consume();
        }
    }//GEN-LAST:event_tipoFieldKeyTyped

    private void costoFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costoFieldKeyTyped
    if(costoField.getText().length()>=10){
        evt.consume();
        }
    }//GEN-LAST:event_costoFieldKeyTyped

    private void saborFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saborFieldKeyTyped
    if(saborField.getText().length()>=20){
        evt.consume();
        }
    }//GEN-LAST:event_saborFieldKeyTyped

    private void costoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoFieldActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField costoField;
    private javax.swing.JLabel lbValues;
    private javax.swing.JLabel lbValues1;
    private javax.swing.JLabel lbValues2;
    private javax.swing.JLabel lbValues3;
    public javax.swing.JTextField saborField;
    public javax.swing.JTextField tipoField;
    // End of variables declaration//GEN-END:variables
}
