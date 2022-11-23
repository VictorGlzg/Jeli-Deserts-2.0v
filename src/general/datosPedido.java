package general;

import java.awt.Color;

public class datosPedido extends javax.swing.JPanel {
public String idField ="";
    public datosPedido() {
        initComponents();
    }
    
    public void llenarDatos(String id, String nombre,String fecha,String telefono,String cumple){
        idField = id;
        fechaField.setText(fecha);
        nombreField.setText(nombre);
        telefonoField.setText(telefono);
        cumpleField.setText(cumple);
    }
    
    public void limpiar(){
        idField ="";
        fechaField.setText("");
        nombreField.setText("");
        telefonoField.setText("");
        cumpleField.setText("AAAA-MM-DD");
        cumpleField.setForeground(new Color(153,153,153));
    }
    
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbValues2 = new javax.swing.JLabel();
        fechaField = new javax.swing.JTextField();
        lbValues = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        telefonoField = new javax.swing.JTextField();
        lbValues5 = new javax.swing.JLabel();
        lbValues4 = new javax.swing.JLabel();
        cumpleField = new javax.swing.JTextField();
        lbValues1 = new javax.swing.JLabel();

        setOpaque(false);

        lbValues2.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        lbValues2.setForeground(new java.awt.Color(120, 21, 22));
        lbValues2.setText("Fecha:");

        fechaField.setEditable(false);
        fechaField.setForeground(new java.awt.Color(153, 153, 153));
        fechaField.setText("AAAA-MM-DD");
        fechaField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fechaFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fechaFieldFocusLost(evt);
            }
        });
        fechaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fechaFieldKeyTyped(evt);
            }
        });

        lbValues.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        lbValues.setForeground(new java.awt.Color(120, 21, 22));
        lbValues.setText("Nombre:");

        nombreField.setEditable(false);
        nombreField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreFieldKeyTyped(evt);
            }
        });

        telefonoField.setForeground(new java.awt.Color(255, 255, 255));
        telefonoField.setText("0000000000");
        telefonoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telefonoFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefonoFieldFocusLost(evt);
            }
        });
        telefonoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoFieldKeyTyped(evt);
            }
        });

        lbValues5.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        lbValues5.setForeground(new java.awt.Color(120, 21, 22));
        lbValues5.setText("*Teléfono:");

        lbValues4.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        lbValues4.setForeground(new java.awt.Color(120, 21, 22));
        lbValues4.setText("Cumpleaños:");

        cumpleField.setEditable(false);
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
        lbValues1.setText("Información de los pedidos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbValues2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechaField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbValues)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbValues5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbValues4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cumpleField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lbValues1))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbValues1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValues5)
                    .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbValues)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValues2)
                    .addComponent(fechaField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbValues4)
                    .addComponent(cumpleField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fechaFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaFieldKeyTyped
    if(fechaField.getText().length()>=10){
        evt.consume();
        }
    }//GEN-LAST:event_fechaFieldKeyTyped

    private void nombreFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreFieldKeyTyped
    if(nombreField.getText().length()>=50){
        evt.consume();
        }
    }//GEN-LAST:event_nombreFieldKeyTyped

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

    private void fechaFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaFieldFocusGained
    if(fechaField.getText().equals("AAAA-MM-DD")){
        fechaField.setText("");
        fechaField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_fechaFieldFocusGained

    private void fechaFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaFieldFocusLost
    if(fechaField.getText().equals("")){
        fechaField.setText("AAAA-MM-DD");
        fechaField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_fechaFieldFocusLost

    private void telefonoFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonoFieldFocusLost
    if(telefonoField.getText().equals("")){
        telefonoField.setText("0000000000");
        telefonoField.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_telefonoFieldFocusLost

    private void telefonoFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonoFieldFocusGained
    if(telefonoField.getText().equals("0000000000")){
        telefonoField.setText("");
        }
    telefonoField.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_telefonoFieldFocusGained
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField cumpleField;
    public javax.swing.JTextField fechaField;
    private javax.swing.JLabel lbValues;
    private javax.swing.JLabel lbValues1;
    private javax.swing.JLabel lbValues2;
    private javax.swing.JLabel lbValues4;
    private javax.swing.JLabel lbValues5;
    public javax.swing.JTextField nombreField;
    public javax.swing.JTextField telefonoField;
    // End of variables declaration//GEN-END:variables
}
