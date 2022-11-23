package form;

import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import main.Conexion;
import main.Validar;
import swing.ScrollBar;

public class Form_producto extends javax.swing.JPanel {
    public Form_producto() {
        initComponents();
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
        table.sqlConexionProducto("CALL Mostrar_Productos()");
        
        addbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        trashbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        modbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cleanbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        invbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new swing.PanelBorder();
        lbValues1 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table = new swing.Table();
        panelBorderModify1 = new swing.PanelBorderModify();
        addbutton = new swing.MyButton();
        trashbutton = new swing.MyButton();
        cleanbutton = new swing.MyButton();
        modbutton = new swing.MyButton();
        datosProducto1 = new general.datosProducto();
        invbutton = new swing.MyButton();

        setBackground(new java.awt.Color(245, 243, 243));
        setForeground(new java.awt.Color(245, 243, 243));
        setPreferredSize(new java.awt.Dimension(829, 553));
        setRequestFocusEnabled(false);

        panelBorder1.setForeground(new java.awt.Color(255, 255, 255));

        lbValues1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbValues1.setForeground(new java.awt.Color(105, 105, 105));
        lbValues1.setText("Tabla de productos:");

        table = new swing.Table(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Sabor", "Costo", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        spTable.setViewportView(table);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbValues1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spTable)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbValues1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );

        addbutton.setBorder(null);
        addbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        addbutton.setToolTipText("Agregar");
        addbutton.setRadius(65);
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        trashbutton.setBorder(null);
        trashbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/trash.png"))); // NOI18N
        trashbutton.setToolTipText("Borrar");
        trashbutton.setRadius(65);
        trashbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trashbuttonActionPerformed(evt);
            }
        });

        cleanbutton.setBorder(null);
        cleanbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clean.png"))); // NOI18N
        cleanbutton.setToolTipText("Limpiar");
        cleanbutton.setRadius(65);
        cleanbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanbuttonActionPerformed(evt);
            }
        });

        modbutton.setBorder(null);
        modbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mod.png"))); // NOI18N
        modbutton.setToolTipText("Modificar");
        modbutton.setRadius(65);
        modbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modbuttonActionPerformed(evt);
            }
        });

        invbutton.setBorder(null);
        invbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/inven.png"))); // NOI18N
        invbutton.setToolTipText("Limpiar");
        invbutton.setRadius(65);
        invbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorderModify1Layout = new javax.swing.GroupLayout(panelBorderModify1);
        panelBorderModify1.setLayout(panelBorderModify1Layout);
        panelBorderModify1Layout.setHorizontalGroup(
            panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderModify1Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(datosProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorderModify1Layout.createSequentialGroup()
                        .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(trashbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorderModify1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(cleanbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(invbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        panelBorderModify1Layout.setVerticalGroup(
            panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorderModify1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(trashbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cleanbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addGroup(panelBorderModify1Layout.createSequentialGroup()
                .addGroup(panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorderModify1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(datosProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorderModify1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(invbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBorderModify1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBorderModify1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void actualizar(){
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            table.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            String sql = "";
            sql = "CALL Mostrar_Productos()";
           
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("ID");
            modelo.addColumn("Tipo");
            modelo.addColumn("Costo");
            modelo.addColumn("Sabor");
            modelo.addColumn("Stock");
            
            table.getColumnModel().getColumn(0).setMaxWidth(50);

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
            datosProducto1.limpiar();
            actualizar();
        }
        
    }
    
    public void Eliminar_producto(){
        //BAJA
        table.setRowSorter(null);
        PreparedStatement ps = null;
        try {
            Conexion objCon = new Conexion();
            Connection conn = objCon.getConexion();
            String id = datosProducto1.idField;
            String sql = "SELECT Baja_Productos(" + id + ")";
            System.out.println(sql);
            ps = conn.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(this, "El producto fue eliminado correctamente.");
            datosProducto1.limpiar();
            actualizar();
            datosProducto1.limpiar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al Eliminar el producto.");
            System.out.println(ex.toString());
        }
    }
    
    private void modificar(){
        table.setRowSorter(null);
        PreparedStatement ps = null;
        String id = "",tipo = "", costo = "", sabor = "";
            try {
                Conexion objCon = new Conexion();
                Connection conn = objCon.getConexion();
                id = datosProducto1.idField;
                costo = datosProducto1.costoField.getText(); 
                tipo = datosProducto1.tipoField.getText(); 
                sabor = datosProducto1.saborField.getText();
                String sql = "SELECT Mod_tipo("+ id +",'" + tipo +"','"+costo+"','"+sabor+"')";
                ps = conn.prepareStatement(sql);
                ps.execute();
                datosProducto1.limpiar();
                actualizar();
                JOptionPane.showMessageDialog(this, "Producto se ha modificado con exito.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al modificar el producto.");
                System.out.println(ex);
            }
    }
    
    public void search(String s){
        DefaultTableModel modelo2 = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelo2);
        table.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(s));
    }
    
    private void modbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modbuttonActionPerformed
      table.setRowSorter(null);
      String id = "", tipo = "", costo = "", sabor = "";
      id = datosProducto1.idField;
      costo = datosProducto1.costoField.getText(); 
      tipo = datosProducto1.tipoField.getText(); 
      sabor = datosProducto1.saborField.getText();
    if(v.verAlfa(tipo, "Tipo")&&(v.verDec(costo, "Costo"))&&(v.verAlfa(sabor, "Sabor"))){
        modificar();
        }
    }//GEN-LAST:event_modbuttonActionPerformed

    private void cleanbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanbuttonActionPerformed
    table.setRowSorter(null);
    datosProducto1.limpiar();
    }//GEN-LAST:event_cleanbuttonActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
         //ALTA
       table.setRowSorter(null);
       String id = "", tipo = "", costo = "", sabor = "";
            id = datosProducto1.idField;
            costo = datosProducto1.costoField.getText(); 
            tipo = datosProducto1.tipoField.getText(); 
            sabor = datosProducto1.saborField.getText();
            
       if(v.verAlfa(tipo, "Tipo")&&v.verDec(costo, "Costo")&&(v.verAlfa(sabor, "Sabor"))){
       PreparedStatement ps = null;
           
            try {
                Conexion objCon = new Conexion();
                Connection conn = objCon.getConexion();
                String sql = "SELECT Alta_Productos('"+ tipo + "'," + costo + ",'" + sabor + "')";
                ps = conn.prepareStatement(sql);
                ps.execute();
                JOptionPane.showMessageDialog(this, "Producto registrado con exito.");
                datosProducto1.limpiar();
                actualizar();
                datosProducto1.limpiar();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al registrar un producto.");
                System.out.println(ex);
            }
       }//END IF      
    }//GEN-LAST:event_addbuttonActionPerformed

    private void trashbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trashbuttonActionPerformed
        table.setRowSorter(null);
        if (!"".equals(datosProducto1.idField.trim())) {
        int action = JOptionPane.showConfirmDialog(null, "Estas por eliminar un registro de la base de datos.","ELIMINAR",JOptionPane.YES_NO_OPTION);
            if(action == 0){            
            Eliminar_producto();    
            }else{
                JOptionPane.showMessageDialog(this, "No ha seleccionado ningun producto de la lista.");
                 }
            }           
    }//GEN-LAST:event_trashbuttonActionPerformed

    private void agregarStock(String s){
        table.setRowSorter(null);
        String id = datosProducto1.idField;
        PreparedStatement ps = null;
            try {
                Conexion objCon = new Conexion();
                Connection conn = objCon.getConexion();
                String sql = "SELECT Mod_stock("+id+","+s+")";
                ps = conn.prepareStatement(sql);
                ps.execute();
                datosProducto1.limpiar();
                actualizar();
                datosProducto1.limpiar();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al modificar stock.");
                System.out.println(ex);
            }  
    }
    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        PreparedStatement ps = null;
        ResultSet rs = null;
        String id = "", tipo = "", costo = "", sabor = "";

        try {
            Conexion objCon = new Conexion();
            Connection conn = objCon.getConexion();

            int Fila = table.getSelectedRow();
            String idPROD = table.getValueAt(Fila, 0).toString();

            String sql = "CALL Mostrar_ProductoID(" + idPROD + ")";

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                id = rs.getString("id");
                tipo = rs.getString("tipo");
                costo = rs.getString("costo");
                sabor = rs.getString("sabor");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        datosProducto1.llenarDatos(id,tipo,costo,sabor);

    }//GEN-LAST:event_tableMouseClicked

    private void invbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invbuttonActionPerformed
    table.setRowSorter(null);
        if (!"".equals(datosProducto1.idField.trim())) {
        agregarStock(JOptionPane.showInputDialog("Ingrese la cantidad de producto en almacen:"));
        }
        else{
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningun producto de la lista.");
            }
        
        
    }//GEN-LAST:event_invbuttonActionPerformed
    Validar v = new Validar();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton addbutton;
    private swing.MyButton cleanbutton;
    private general.datosProducto datosProducto1;
    private swing.MyButton invbutton;
    private javax.swing.JLabel lbValues1;
    private swing.MyButton modbutton;
    private swing.PanelBorder panelBorder1;
    private swing.PanelBorderModify panelBorderModify1;
    private javax.swing.JScrollPane spTable;
    public swing.Table table;
    private swing.MyButton trashbutton;
    // End of variables declaration//GEN-END:variables
}
