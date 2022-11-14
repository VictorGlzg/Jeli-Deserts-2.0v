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

public class Form_cliente extends javax.swing.JPanel {
    public Form_cliente() {
        initComponents();
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
        table.sqlConexionCliente("CALL Mostrar_Clientes()");
        
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
        datosCliente1 = new general.datosCliente();

        setBackground(new java.awt.Color(245, 243, 243));
        setForeground(new java.awt.Color(245, 243, 243));

        panelBorder1.setForeground(new java.awt.Color(255, 255, 255));

        lbValues1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbValues1.setForeground(new java.awt.Color(105, 105, 105));
        lbValues1.setText("Tabla de clientes:");

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
                .addGap(18, 18, 18)
                .addComponent(lbValues1)
                .addContainerGap(636, Short.MAX_VALUE))
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

        javax.swing.GroupLayout panelBorderModify1Layout = new javax.swing.GroupLayout(panelBorderModify1);
        panelBorderModify1.setLayout(panelBorderModify1Layout);
        panelBorderModify1Layout.setHorizontalGroup(
            panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderModify1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datosCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorderModify1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(trashbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorderModify1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cleanbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorderModify1Layout.setVerticalGroup(
            panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderModify1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(trashbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cleanbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorderModify1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(datosCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
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
    
    private boolean isEmpty(String s, String mensaje){
    boolean flag;   
        if(s.equals("")){
        flag = false;
        JOptionPane.showMessageDialog(null, "No se ha registrado información en el campo: "+mensaje+".");
        }
        else{
            flag = true;
        }
    return flag;
    }
    
    public void actualizar(){
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            table.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            String sql = "";
            sql = "CALL Mostrar_Clientes()";
                /*if ("".equals(campo)) {
                sql = "CALL Mostrar_Clientes()";
                } else {
                sql = "CALL Mostrar_Cliente('" + campo + "')";
            }*/
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Correo");
            modelo.addColumn("Dirección");
            modelo.addColumn("Telefono");
            modelo.addColumn("Cumpleaños");
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
            datosCliente1.limpiar();
            actualizar();
        }
        
    }
    
    public void Eliminar_cliente(){
        
        PreparedStatement ps = null;
                try {
                    Conexion objCon = new Conexion();
                    Connection conn = objCon.getConexion();
                    String id = datosCliente1.idField;
                    String sql = "SELECT Baja_Cliente('" + id + "')";
                    System.out.println(sql);
                    ps = conn.prepareStatement(sql);
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "El cliente fue eliminado correctamente.");
                    datosCliente1.limpiar();
                    actualizar();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al Eliminar al empleado.");
                    System.out.println(ex.toString());
                    }
    }
    
    private void modificar(){
        PreparedStatement ps = null;
        String id = "",nombre = "", correo = "", direccion = "", telefono = "", cumpleaños ="";
            try {
                Conexion objCon = new Conexion();
                Connection conn = objCon.getConexion();
                id = datosCliente1.idField;
                nombre = datosCliente1.nombreField.getText();
                correo = datosCliente1.correoField.getText();
                direccion = datosCliente1.direccionField.getText();
                telefono = datosCliente1.telefonoField.getText();
                cumpleaños = datosCliente1.cumpleField.getText();
                String sql = "SELECT Mod_client("+id+",'"+nombre+"','"+correo+"','"+direccion+"','"+telefono+"','"+cumpleaños+"')";
                ps = conn.prepareStatement(sql);
                ps.execute();
                datosCliente1.limpiar();
                actualizar();
                JOptionPane.showMessageDialog(this, "Cliente se ha modificado con exito.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al modificar al cliente.");
                System.out.println(ex);
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
        String id = "", nombre = "", correo = "", direccion = "", telefono = "", cumple = "";
        
        try {
            Conexion objCon = new Conexion();
            Connection conn = objCon.getConexion();

            int Fila = table.getSelectedRow();
            String id_client = table.getValueAt(Fila, 0).toString();

            String sql = "CALL Mostrar_ClienteID('" + id_client + "')";

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                id = rs.getString("id_client");
                nombre = rs.getString("nom_client");
                correo = rs.getString("correo");
                direccion = rs.getString("dir_client");
                telefono = rs.getString("tel_client");
                cumple = rs.getString("cumpleA");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        datosCliente1.llenarDatos(id,nombre,correo,telefono,direccion,cumple);
        datosCliente1.cumpleField.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_tableMouseClicked

    private void modbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modbuttonActionPerformed
    table.setRowSorter(null); 
    String nombre = "", correo = "", direccion = "", telefono = "", cumpleaños = "";
    nombre = datosCliente1.nombreField.getText();
    correo = datosCliente1.correoField.getText();
    direccion = datosCliente1.direccionField.getText();
    telefono = datosCliente1.telefonoField.getText();
    cumpleaños = datosCliente1.cumpleField.getText();
    if(v.verAlfa(nombre, "Nombre")&&(v.verTel(telefono, "Teléfono")&&v.verFecha(cumpleaños, "Cumpleaños"))
            &&v.verCorreo(correo,"Correo")&&isEmpty(direccion,"Dirección")){
        modificar();
        }
    }//GEN-LAST:event_modbuttonActionPerformed

    private void cleanbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanbuttonActionPerformed
    table.setRowSorter(null);
    datosCliente1.limpiar();
    }//GEN-LAST:event_cleanbuttonActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        table.setRowSorter(null);   
        String nombre = "", correo = "", direccion = "", telefono = "", cumpleaños = "";
            nombre = datosCliente1.nombreField.getText();
            correo = datosCliente1.correoField.getText();
            direccion = datosCliente1.direccionField.getText();
            telefono = datosCliente1.telefonoField.getText();
            cumpleaños = datosCliente1.cumpleField.getText();
            if(v.verAlfa(nombre, "Nombre")&&(v.verTel(telefono, "Teléfono"))&&v.verCorreo(correo,"Correo")&&isEmpty(direccion,"Dirección")&&v.verFecha(cumpleaños, "Cumpleaños")){
            PreparedStatement ps = null;
            try {
                Conexion objCon = new Conexion();
                Connection conn = objCon.getConexion();
                String sql = "SELECT Alta_Cliente('"+ nombre + "','" + correo + "','" + direccion + "','" + telefono +"','" + cumpleaños +"')";
                ps = conn.prepareStatement(sql);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Cliente registrado con exito.");
                datosCliente1.limpiar();
                actualizar();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al registrar al cliente. \n Asegurese que el telefono no este repetido");
                System.out.println(ex);
                    }    
                }            
    }//GEN-LAST:event_addbuttonActionPerformed

    private void trashbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trashbuttonActionPerformed
        table.setRowSorter(null);
        if (!"".equals(datosCliente1.idField.trim())) {
        int action = JOptionPane.showConfirmDialog(null, "Estas por eliminar un registro de la base de datos.","ELIMINAR",JOptionPane.YES_NO_OPTION);
            if(action == 0){
                    Eliminar_cliente(); 
                    }       
        }else{
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningun cliente de la lista.");
        } 
    }//GEN-LAST:event_trashbuttonActionPerformed
    Validar v = new Validar();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton addbutton;
    private swing.MyButton cleanbutton;
    private general.datosCliente datosCliente1;
    private javax.swing.JLabel lbValues1;
    private swing.MyButton modbutton;
    private swing.PanelBorder panelBorder1;
    private swing.PanelBorderModify panelBorderModify1;
    private javax.swing.JScrollPane spTable;
    public swing.Table table;
    private swing.MyButton trashbutton;
    // End of variables declaration//GEN-END:variables
}
