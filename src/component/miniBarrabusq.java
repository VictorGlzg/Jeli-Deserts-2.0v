package component;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import swing.Table;

public class miniBarrabusq extends javax.swing.JPanel {
public Table t;
public int index;
    public miniBarrabusq() { //AGREGAR INDEX DE FORM Y LOS OTROS TIPOS DE FORM PARA LA BUSQUEDA EN TABLAS DISTITNAS
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        searchText1 = new swing.SearchText();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N

        searchText1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchText1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchText1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchText1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchText1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchText1KeyReleased
    String ss = searchText1.getText();
    DefaultTableModel modelo2 = (DefaultTableModel) t.getModel();
    TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelo2);
    t.setRowSorter(trs);
    trs.setRowFilter(RowFilter.regexFilter(ss));
    }//GEN-LAST:event_searchText1KeyReleased

    private void searchText1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchText1KeyTyped
    if(searchText1.getText().length()>=20){
        evt.consume();
        }
    }//GEN-LAST:event_searchText1KeyTyped
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(0, 0, 25, getHeight());
        g2.fillRect(getWidth() - 25, getHeight() - 25, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public swing.SearchText searchText1;
    // End of variables declaration//GEN-END:variables
}
