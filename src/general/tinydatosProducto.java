package general;

public class tinydatosProducto extends javax.swing.JPanel {
public String idField ="";
    public tinydatosProducto() {
        initComponents();
    }
    
    public void llenarDatos(String id, String tipo,String costo,String sabor){
        idField = id;
        tipoField.setText(tipo);
        cantidadField.setText(costo);
        aditivoField.setText(sabor);
        
    }
    
    public void limpiar(){
        tipoField.setText("");
        cantidadField.setText("");
        aditivoField.setText("");
        
    }
    
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbValues2 = new javax.swing.JLabel();
        tipoField = new javax.swing.JTextField();
        lbValues = new javax.swing.JLabel();
        cantidadField = new javax.swing.JTextField();
        lbValues3 = new javax.swing.JLabel();
        aditivoField = new javax.swing.JTextField();
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

        cantidadField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadFieldActionPerformed(evt);
            }
        });
        cantidadField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadFieldKeyTyped(evt);
            }
        });

        lbValues3.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        lbValues3.setForeground(new java.awt.Color(120, 21, 22));
        lbValues3.setText("Aditivo:");

        aditivoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aditivoFieldKeyTyped(evt);
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
                            .addComponent(cantidadField, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(aditivoField))))
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
                    .addComponent(cantidadField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aditivoField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbValues3))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tipoFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tipoFieldKeyTyped
    if(tipoField.getText().length()>=20){
        evt.consume();
        }
    }//GEN-LAST:event_tipoFieldKeyTyped

    private void cantidadFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadFieldKeyTyped
    if(cantidadField.getText().length()>=10){
        evt.consume();
        }
    }//GEN-LAST:event_cantidadFieldKeyTyped

    private void aditivoFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aditivoFieldKeyTyped
    if(aditivoField.getText().length()>=20){
        evt.consume();
        }
    }//GEN-LAST:event_aditivoFieldKeyTyped

    private void cantidadFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadFieldActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField aditivoField;
    public javax.swing.JTextField cantidadField;
    private javax.swing.JLabel lbValues;
    private javax.swing.JLabel lbValues1;
    private javax.swing.JLabel lbValues2;
    private javax.swing.JLabel lbValues3;
    public javax.swing.JTextField tipoField;
    // End of variables declaration//GEN-END:variables
}
