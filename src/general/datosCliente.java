package general;

import java.awt.Color;

public class datosCliente extends javax.swing.JPanel {
public String idField ="";
    public datosCliente() {
        initComponents();
    }
    
    public void llenarDatos(String id, String nombre,String correo,String telefono,String direccion,String cumple){
        idField = id;
        nombreField.setText(nombre);
        correoField.setText(correo);
        telefonoField.setText(telefono);
        direccionField.setText(direccion);
        cumpleField.setText(cumple);
    }
    
    public void limpiar(){
        nombreField.setText("");
        correoField.setText("");
        direccionField.setText("");
        telefonoField.setText("");
        cumpleField.setText("AAAA-MM-DD");
        cumpleField.setForeground(new Color(153,153,153));
    }
    
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbValues2 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        lbValues = new javax.swing.JLabel();
        correoField = new javax.swing.JTextField();
        lbValues3 = new javax.swing.JLabel();
        direccionField = new javax.swing.JTextField();
        telefonoField = new javax.swing.JTextField();
        lbValues5 = new javax.swing.JLabel();
        lbValues4 = new javax.swing.JLabel();
        cumpleField = new javax.swing.JTextField();
        lbValues1 = new javax.swing.JLabel();

        setOpaque(false);

        lbValues2.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        lbValues2.setForeground(new java.awt.Color(120, 21, 22));
        lbValues2.setText("Nombre:");

        nombreField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreFieldKeyTyped(evt);
            }
        });

        lbValues.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        lbValues.setForeground(new java.awt.Color(120, 21, 22));
        lbValues.setText("Correo:");

        correoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                correoFieldKeyTyped(evt);
            }
        });

        lbValues3.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        lbValues3.setForeground(new java.awt.Color(120, 21, 22));
        lbValues3.setText("Dirección:");

        direccionField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direccionFieldKeyTyped(evt);
            }
        });

        telefonoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoFieldKeyTyped(evt);
            }
        });

        lbValues5.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        lbValues5.setForeground(new java.awt.Color(120, 21, 22));
        lbValues5.setText("Teléfono:");

        lbValues4.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        lbValues4.setForeground(new java.awt.Color(120, 21, 22));
        lbValues4.setText("Cumpleaños:");

        cumpleField.setForeground(new java.awt.Color(153, 153, 153));
        cumpleField.setText("AAAA-MM-DD");
        cumpleField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cumpleFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cumpleFieldFocusLost(evt);
            }
        });
        cumpleField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cumpleFieldKeyTyped(evt);
            }
        });

        lbValues1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbValues1.setForeground(new java.awt.Color(115, 115, 115));
        lbValues1.setText("Información de los clientes:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbValues3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbValues1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbValues2)
                                    .addComponent(lbValues))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombreField, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                    .addComponent(correoField))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbValues5)
                                    .addComponent(lbValues4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cumpleField, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(telefonoField))))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbValues1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbValues2)
                    .addComponent(lbValues5)
                    .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValues)
                    .addComponent(correoField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbValues4)
                    .addComponent(cumpleField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValues3)
                    .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombreFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreFieldKeyTyped
    if(nombreField.getText().length()>=50){
        evt.consume();
        }
    }//GEN-LAST:event_nombreFieldKeyTyped

    private void correoFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoFieldKeyTyped
    if(correoField.getText().length()>=50){
        evt.consume();
        }
    }//GEN-LAST:event_correoFieldKeyTyped

    private void direccionFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionFieldKeyTyped
    if(direccionField.getText().length()>=100){
        evt.consume();
        }
    }//GEN-LAST:event_direccionFieldKeyTyped

    private void telefonoFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoFieldKeyTyped
    if(telefonoField.getText().length()>=10){
        evt.consume();
        }
    }//GEN-LAST:event_telefonoFieldKeyTyped

    private void cumpleFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cumpleFieldKeyTyped
    if(cumpleField.getText().length()>=10){
        evt.consume();
        }
    }//GEN-LAST:event_cumpleFieldKeyTyped

    private void cumpleFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cumpleFieldFocusLost
    if(cumpleField.getText().equals("")){
        cumpleField.setText("AAAA-MM-DD");
        cumpleField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_cumpleFieldFocusLost

    private void cumpleFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cumpleFieldFocusGained
    if(cumpleField.getText().equals("AAAA-MM-DD")){
        cumpleField.setText("");
        cumpleField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_cumpleFieldFocusGained
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField correoField;
    public javax.swing.JTextField cumpleField;
    public javax.swing.JTextField direccionField;
    private javax.swing.JLabel lbValues;
    private javax.swing.JLabel lbValues1;
    private javax.swing.JLabel lbValues2;
    private javax.swing.JLabel lbValues3;
    private javax.swing.JLabel lbValues4;
    private javax.swing.JLabel lbValues5;
    public javax.swing.JTextField nombreField;
    public javax.swing.JTextField telefonoField;
    // End of variables declaration//GEN-END:variables
}
