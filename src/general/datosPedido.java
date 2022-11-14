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

        fechaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fechaFieldKeyTyped(evt);
            }
        });

        lbValues.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        lbValues.setForeground(new java.awt.Color(120, 21, 22));
        lbValues.setText("Nombre:");

        nombreField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreFieldKeyTyped(evt);
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
        lbValues1.setText("Información de los pedidos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbValues1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbValues2)
                            .addComponent(lbValues))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fechaField, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(nombreField))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbValues4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cumpleField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbValues5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbValues1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbValues2)
                    .addComponent(lbValues5)
                    .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValues)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbValues4)
                    .addComponent(cumpleField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
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
