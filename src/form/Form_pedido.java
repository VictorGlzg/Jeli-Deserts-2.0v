package form;

import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import main.Conexion;
import main.FramePedidos;
import main.Validar;
import swing.ScrollBar;

public class Form_pedido extends javax.swing.JPanel {
    public Form_pedido() {
        initComponents();
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        datosPedido1.nombreField.setEditable(false);
        datosPedido1.cumpleField.setEditable(false);
        table.sqlConexionPedido("CALL Mostrar_Pedidos()");
        
        addbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        trashbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        modbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cleanbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        
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
        datosPedido1 = new general.datosPedido();
        framePedidosbutton = new swing.MyButton();

        setBackground(new java.awt.Color(245, 243, 243));
        setForeground(new java.awt.Color(245, 243, 243));
        setPreferredSize(new java.awt.Dimension(829, 553));

        panelBorder1.setForeground(new java.awt.Color(255, 255, 255));

        lbValues1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbValues1.setForeground(new java.awt.Color(105, 105, 105));
        lbValues1.setText("Tabla de pedidos:");

        table = new swing.Table(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Correo", "Dirección", "Teléfono", "Cumpleaños"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(5);
            table.getColumnModel().getColumn(0).setMaxWidth(50);
            table.getColumnModel().getColumn(1).setPreferredWidth(18);
            table.getColumnModel().getColumn(3).setPreferredWidth(60);
            table.getColumnModel().getColumn(4).setMinWidth(12);
            table.getColumnModel().getColumn(4).setPreferredWidth(12);
            table.getColumnModel().getColumn(5).setMinWidth(10);
            table.getColumnModel().getColumn(5).setPreferredWidth(10);
        }

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbValues1))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        framePedidosbutton.setBorder(null);
        framePedidosbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icono_doc.png"))); // NOI18N
        framePedidosbutton.setToolTipText("Abrir pedidos");
        framePedidosbutton.setRadius(65);
        framePedidosbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                framePedidosbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorderModify1Layout = new javax.swing.GroupLayout(panelBorderModify1);
        panelBorderModify1.setLayout(panelBorderModify1Layout);
        panelBorderModify1Layout.setHorizontalGroup(
            panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderModify1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datosPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(framePedidosbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        panelBorderModify1Layout.setVerticalGroup(
            panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderModify1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelBorderModify1Layout.createSequentialGroup()
                            .addGroup(panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(trashbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cleanbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(modbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelBorderModify1Layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(framePedidosbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(datosPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
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
            sql = "CALL Mostrar_Pedidos()";
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("ID");
            modelo.addColumn("Cliente");
            modelo.addColumn("Cumpleaños");
            modelo.addColumn("Telefono");
            modelo.addColumn("Fecha");
            
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
            datosPedido1.limpiar();
            actualizar();
        }
        
    }
    
    private void modificar(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        String id = "",fecha = "", cliente = "";
            try {
                Conexion objCon = new Conexion();
                Connection conn = objCon.getConexion();
                id = datosPedido1.idField;
                fecha = datosPedido1.fechaField.getText();
                cliente = datosPedido1.telefonoField.getText();
                
                String sql = "CALL Mostrar_ClienteTel('" + cliente + "')";
                ps = conn.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                rs.getString("id_client"); //PARA QUE MARQUE ERROR
                }
                
                sql = "SELECT Mod_ped("+ id +",'"+fecha+"','" + cliente + "')";
                ps = conn.prepareStatement(sql);
                ps.execute();
                
                JOptionPane.showMessageDialog(this, "Pedido se ha modificado con exito.");
                datosPedido1.limpiar();
                actualizar();
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al modificar el campo. \n Asegurese que el Telefono este registrado");
                System.out.println(ex);
            }
    }
    
    public void Eliminar_pedido(){
        //BAJA
        table.setRowSorter(null);
        PreparedStatement ps = null;
        try {
            Conexion objCon = new Conexion();
            Connection conn = objCon.getConexion();
            String id = datosPedido1.idField;
            String sql = "SELECT Baja_Pedidos('" + id + "')";
            System.out.println(sql);
            ps = conn.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(this, "El pedido fue eliminado correctamente.");
            datosPedido1.limpiar();
            actualizar();
            datosPedido1.limpiar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al Eliminar el pedido.");
            System.out.println(ex.toString());
        }
    }
    
    public void search(String s){
        DefaultTableModel modelo2 = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelo2);
        table.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(s));
    }
    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        PreparedStatement ps = null;
        ResultSet rs = null;
        String id="",fecha2="",nom_client="",tel_client="",idPED = "", fecha = "", idclient = "";

        try {
            Conexion objCon = new Conexion();
            Connection conn = objCon.getConexion();

            int Fila = table.getSelectedRow();
            String id_ped = table.getValueAt(Fila, 0).toString();

            String sql = "CALL Mostrar_Pedido('"+id_ped+"')";

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                ID = rs.getString("id");
                fecha2 = rs.getString("cumpleA");
                nombre=rs.getString("nom_client");
                tel_client=rs.getString("tel_client");
                IDCLIENT = rs.getString("id_client");
                fecha = rs.getString("fecha");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        datosPedido1.llenarDatos(ID,nombre,fecha,tel_client,fecha2);
        datosPedido1.cumpleField.setForeground(new Color(0,0,0));
        datosPedido1.fechaField.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_tableMouseClicked

    private void modbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modbuttonActionPerformed
    
    String telefono = "", fecha = "";
    fecha = datosPedido1.fechaField.getText();
    telefono = datosPedido1.telefonoField.getText();
    table.setRowSorter(null);
    
    if(v.verTel(telefono,"Teléfono")&&(v.verFecha(fecha, "Fecha"))){
    modificar();
        }
    }//GEN-LAST:event_modbuttonActionPerformed

    private void cleanbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanbuttonActionPerformed
    table.setRowSorter(null);
    datosPedido1.limpiar();
    }//GEN-LAST:event_cleanbuttonActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
    //ALTA
       date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
       
       String tel_client = "", resultado="";
       tel_client = datosPedido1.telefonoField.getText();
       
       if(v.verTel(tel_client,"Teléfono")&&(v.verFecha(date, "Fecha"))){
       table.setRowSorter(null);
       PreparedStatement ps = null;
       ResultSet rs = null;
            
            try {
                Conexion objCon = new Conexion();
                Connection conn = objCon.getConexion();
                if(v.verNum(tel_client,"Teléfono")){
                String sql = "CALL Mostrar_Pedido_Tel('"+tel_client+"')";   
                ps = conn.prepareStatement(sql);
                rs = ps.executeQuery();
                
                while (rs.next()) {
                resultado = rs.getString("Cliente.nom_client"); //REVISAR SI EXISTE CLIENTE
                }
                
                sql = "SELECT Alta_Pedidos('"+ date + "','" + tel_client + "')";
                ps = conn.prepareStatement(sql);
                rs = ps.executeQuery();
                
                
                JOptionPane.showMessageDialog(this, "Pedido registrado con exito.");
                actualizar();
                datosPedido1.limpiar();
                }//END IF TELF
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al registrar un pedido.");
                System.out.println(ex);
            }
       } //FINAL IF         
    }//GEN-LAST:event_addbuttonActionPerformed

    private void trashbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trashbuttonActionPerformed
        table.setRowSorter(null);
        if (!"".equals(datosPedido1.idField.trim())) {
        int action = JOptionPane.showConfirmDialog(null, "Estas por eliminar un registro de la base de datos.","ELIMINAR",JOptionPane.YES_NO_OPTION);
            if(action == 0){
                    Eliminar_pedido(); 
                    }       
        }else{
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningun pedido de la lista.");
        }
    }//GEN-LAST:event_trashbuttonActionPerformed

    private void framePedidosbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_framePedidosbuttonActionPerformed
    if(ID.equals("")){
        JOptionPane.showMessageDialog(this, "No se ha ingresado ningún pedido a checar.");
    }else{
        fp = new FramePedidos();
        fp.obtenerID(ID,nombre,IDCLIENT);
        fp.iniciar();
        fp.show();}
    }//GEN-LAST:event_framePedidosbuttonActionPerformed
    FramePedidos fp;
    String ID="",IDCLIENT,nombre, date;
    Validar v = new Validar();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton addbutton;
    private swing.MyButton cleanbutton;
    private general.datosPedido datosPedido1;
    private swing.MyButton framePedidosbutton;
    private javax.swing.JLabel lbValues1;
    private swing.MyButton modbutton;
    private swing.PanelBorder panelBorder1;
    private swing.PanelBorderModify panelBorderModify1;
    private javax.swing.JScrollPane spTable;
    public swing.Table table;
    private swing.MyButton trashbutton;
    // End of variables declaration//GEN-END:variables
}
