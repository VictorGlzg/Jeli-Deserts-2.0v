package main;
//              LIBRERÍAS
import event.EventMenuSelected;
import form.Form_cliente;
import form.Form_info;
import form.Form_pedido;
import form.Form_producto;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class Main extends javax.swing.JFrame {
ImageIcon logo = new ImageIcon(".\\src\\icons\\jeliHD.png");
    public Form_cliente formclient;
    public Form_producto formprod;
    public Form_pedido formpedidos;
    public Form_info forminfo;
    
    public Main() {
        initComponents();
        setTitle("Sistema de ventas Jeli-deserts");
        setIconImage(logo.getImage());
        setLocationRelativeTo(null); //Centraliza la pantalla 
        setBackground(new Color(0,0,0,0)); //Le da el fondo blanco
        formclient = new Form_cliente();
        formprod = new Form_producto();
        forminfo = new Form_info();
        formpedidos = new Form_pedido();
        
        minButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        menu.initMoving(this); //Llama a un método de la clase menu, para que el frame se pueda mover através de un evento de mouse.
        menu.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                switch (index) {
                case 1:
                    setForm(formclient);
                    header1.index = 0;
                     break;
                case 2:
                    setForm(formprod);
                    formprod.actualizar();
                    header1.index = 1;
                     break;
                case 3:
                    setForm(formpedidos);
                    header1.index = 2;
                    break;
                case 6:
                    setForm(forminfo);
                     break;
                case 7:
                    exit();
                    break;
            }
            if(!header1.searchText1.getText().equals("")){
            formclient.search("");
            formprod.search("");
            }
            header1.searchText1.setText("");
            }
        });
        setForm(formclient);
        mandarForms(formclient,formprod,formpedidos);
    }
    
    private void exit(){
        WindowEvent cw = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(cw);
    }
    
    private void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    private void mandarForms(Form_cliente fc, Form_producto fp, Form_pedido fpp){
        header1.formClient = fc;
        header1.formProd = fp;
        header1.formpedidos = fpp;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new swing.PanelBorder();
        menu = new component.Menu();
        header1 = new component.Header();
        mainPanel = new javax.swing.JPanel();
        minButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setForeground(new java.awt.Color(255, 255, 255));

        header1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        mainPanel.setBackground(new java.awt.Color(227, 227, 227));
        mainPanel.setForeground(new java.awt.Color(227, 227, 227));
        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());

        minButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/encogimiento (1).png"))); // NOI18N
        minButton.setToolTipText("minimizar");
        minButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minButton)
                        .addContainerGap())
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(minButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minButtonMouseClicked
    this.setState(this.ICONIFIED);
    }//GEN-LAST:event_minButtonMouseClicked

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.Header header1;
    private javax.swing.JPanel mainPanel;
    private component.Menu menu;
    private javax.swing.JLabel minButton;
    private swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
