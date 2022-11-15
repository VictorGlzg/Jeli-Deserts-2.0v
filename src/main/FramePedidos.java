package main;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import static java.lang.Float.parseFloat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import swing.ScrollBar;

public class FramePedidos extends javax.swing.JFrame {

    public FramePedidos() {
        initComponents();
        panelMoving.changeColors("#5bbbf2","#b8dbcb");
        setBackground(new Color(0,0,0,0));
        initMoving(this);
        setTitle("Apartado de pedidos de los clientes");
        setIconImage(logo.getImage());
        setLocationRelativeTo(null); //Centraliza la pantalla
        
        spTable1.setVerticalScrollBar(new ScrollBar());
        spTable1.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable1.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable1.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
        spTable = spTable1;
        
        closeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        minButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        addbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        trashbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        modbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cleanbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cumplebutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        factbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new swing.PanelBorder();
        panelMoving = new swing.PanelBorderModify();
        minButton = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        pedidoIDlabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        panelBorder2 = new swing.PanelBorder();
        tinydatosProducto1 = new general.tinydatosProducto();
        spTable1 = new javax.swing.JScrollPane();
        tableProductos = new swing.Table();
        panelBorderModify1 = new swing.PanelBorderModify();
        nombreLabel1 = new javax.swing.JLabel();
        addbutton = new swing.MyButton();
        trashbutton = new swing.MyButton();
        cleanbutton = new swing.MyButton();
        modbutton = new swing.MyButton();
        factbutton = new swing.MyButton();
        cumplebutton = new swing.MyButton();
        spTable = new javax.swing.JScrollPane();
        table = new swing.Table();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setForeground(new java.awt.Color(229, 229, 229));

        minButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/encogimiento (1).png"))); // NOI18N
        minButton.setToolTipText("minimizar");
        minButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minButtonMouseClicked(evt);
            }
        });

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/closex.png"))); // NOI18N
        closeButton.setToolTipText("cerrar");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        pedidoIDlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pedidoIDlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/jeliHD.png"))); // NOI18N
        pedidoIDlabel.setText("PEDIDO: #0000");

        nombreLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nombreLabel.setText("[NOMBRE]");

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMovingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pedidoIDlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minButton)
                .addGap(18, 18, 18)
                .addComponent(closeButton)
                .addGap(25, 25, 25))
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pedidoIDlabel)
                        .addComponent(nombreLabel))
                    .addGroup(panelMovingLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(closeButton)
                            .addComponent(minButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBorder2.setForeground(new java.awt.Color(255, 255, 255));

        table = new swing.Table(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Sabor", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProductos.getTableHeader().setReorderingAllowed(false);
        tableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductosMouseClicked(evt);
            }
        });
        spTable1.setViewportView(tableProductos);

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tinydatosProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(tinydatosProducto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        nombreLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nombreLabel1.setText("Productos agregados:");

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

        factbutton.setBorder(null);
        factbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/factura.png"))); // NOI18N
        factbutton.setToolTipText("Modificar");
        factbutton.setRadius(65);
        factbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factbuttonActionPerformed(evt);
            }
        });

        cumplebutton.setBorder(null);
        cumplebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cumple.png"))); // NOI18N
        cumplebutton.setToolTipText("Modificar");
        cumplebutton.setRadius(65);
        cumplebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cumplebuttonActionPerformed(evt);
            }
        });

        table = new swing.Table(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Sabor", "Cantidad", "Aditivos", "Costo"
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
            table.getColumnModel().getColumn(3).setHeaderValue("Cantidad");
            table.getColumnModel().getColumn(4).setHeaderValue("Aditivos");
        }

        javax.swing.GroupLayout panelBorderModify1Layout = new javax.swing.GroupLayout(panelBorderModify1);
        panelBorderModify1.setLayout(panelBorderModify1Layout);
        panelBorderModify1Layout.setHorizontalGroup(
            panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderModify1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spTable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorderModify1Layout.createSequentialGroup()
                        .addComponent(factbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cumplebutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorderModify1Layout.createSequentialGroup()
                        .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(trashbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorderModify1Layout.createSequentialGroup()
                        .addComponent(cleanbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        panelBorderModify1Layout.setVerticalGroup(
            panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorderModify1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(nombreLabel1)
                .addGroup(panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorderModify1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trashbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cleanbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(panelBorderModify1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(factbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cumplebutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(panelBorderModify1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorderModify1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBorderModify1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeButtonMouseClicked

    private void minButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minButtonMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_minButtonMouseClicked

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
    //ALTA
       String tipo = "", idped="",idprod="",cant="",adit="";
        tipo = tinydatosProducto1.tipoField.getText();
        cant = tinydatosProducto1.cantidadField.getText();
        adit = tinydatosProducto1.aditivoField.getText();
       if(v.verAlfa(tipo,"Producto")&&(v.verNum(cant, "Cantidad"))){
       table.setRowSorter(null);
       PreparedStatement ps = null;
            try {
                Conexion objCon = new Conexion();
                Connection conn = objCon.getConexion();
                idped = ID_pedido;
                idprod = ID_prod;
                String sql = "SELECT Alta_Detalle("+ idped + "," + idprod + "," + cant + ",'"+ adit +"')";
                System.out.println(sql);
                ps = conn.prepareStatement(sql);
                ps.execute();
                JOptionPane.showMessageDialog(this, "Producto registrado con exito.");
                tinydatosProducto1.limpiar();
                actualizar();
                tinydatosProducto1.limpiar();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al registrar un producto.");
                System.out.println(ex);
            }
       }//END IF  
    }//GEN-LAST:event_addbuttonActionPerformed

    private void trashbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trashbuttonActionPerformed
        table.setRowSorter(null);
        if (!"".equals(ID_detalle.trim())) {
            int action = JOptionPane.showConfirmDialog(null, "Estas por eliminar un registro de la base de datos.","ELIMINAR",JOptionPane.YES_NO_OPTION);
            if(action == 0){
                Eliminar_pedido();
            }
        }else{
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningun pedido de la lista.");
        }
    }//GEN-LAST:event_trashbuttonActionPerformed

    private void cleanbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanbuttonActionPerformed
        table.setRowSorter(null);
        tinydatosProducto1.limpiar();
    }//GEN-LAST:event_cleanbuttonActionPerformed

    private void modbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modbuttonActionPerformed
        String tipo = "", idped="",idprod="",cant="",adit="";
        tipo = tinydatosProducto1.tipoField.getText();
        cant = tinydatosProducto1.cantidadField.getText();
        adit = tinydatosProducto1.aditivoField.getText();
        if(v.verAlfa(tipo,"Producto")&&(v.verNum(cant, "Cantidad"))){
        modificar();
            }    
    }//GEN-LAST:event_modbuttonActionPerformed

    private void factbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factbuttonActionPerformed
            facturar();
    }//GEN-LAST:event_factbuttonActionPerformed

    private void cumplebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cumplebuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cumplebuttonActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Conexion objCon = new Conexion();
            Connection conn = objCon.getConexion();

            int Fila = table.getSelectedRow();
            String id = table.getValueAt(Fila, 0).toString();
            
            String sql = "CALL Mostrar_detalle(" + id + ")";

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                ID_detalle = rs.getString("id_detpp");
                tinydatosProducto1.cantidadField.setText(rs.getString("cantidad"));
                tinydatosProducto1.aditivoField.setText(rs.getString("adit"));
                tinydatosProducto1.tipoField.setText(rs.getString("Productos.tipo"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_tableMouseClicked

    private void tableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductosMouseClicked
    actualizarProductos();
    }//GEN-LAST:event_tableProductosMouseClicked
    
    private void actualizarProductos(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Conexion objCon = new Conexion();
            Connection conn = objCon.getConexion();

            int Fila = tableProductos.getSelectedRow();
            String id = tableProductos.getValueAt(Fila, 0).toString();

            String sql = "CALL Mostrar_ProductoID(" + id + ")";

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                ID_prod = rs.getString("id");
                tinydatosProducto1.tipoField.setText(rs.getString("tipo"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    private void actualizar() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            table.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            String sql = "CALL Mostrar_detalles("+ID_pedido+")";
            /*else {
                sql = "CALL Mostrar_Pedido(" + campo + ")";
            }*/
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            modelo.addColumn("ID");
            modelo.addColumn("Tipo");
            modelo.addColumn("Sabor");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Aditivos");
            modelo.addColumn("Costo");
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
            tinydatosProducto1.limpiar();
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePedidos().setVisible(true);
            }
        });
    }
    
    public void iniciar(){
        pedidoIDlabel.setText("PEDIDO:#"+ID_pedido);
        nombreLabel.setText(nom);
        tablaProd();
        String sql = "CALL Mostrar_detalles("+ ID_pedido +")";
        table.sqlConexionDetalles(sql);
    }
    
    private void tablaProd(){
        tableProductos.sqlConexionProducto("CALL Mostrar_Productos()");
    }
    
    private int x;
    private int y;
    //Permite guardar las coordenadas del mouse en x, y para al presionar poder desplazar el frame completo por la pantalla.
    public void initMoving(JFrame fram) {
        panelMoving.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }

        });
        panelMoving.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }
    
    public void obtenerID(String i, String n, String nC){
    ID_pedido = i;
    nom = n;
    nomClient=nC;
    }
    
    private void modificar(){
        /*table.setRowSorter(null);
        PreparedStatement ps = null;
        String id = "",cantidad = "", aditivo = "",producto = "";
            try {
                Conexion objCon = new Conexion();
                Connection conn = objCon.getConexion();
                id = jTextField1.getText();
                cantidad = jTextField3.getText();
                aditivo = jTextField6.getText();
                producto = jTextField2.getText();
                if(Fproducto){
                String sql = "SELECT Mod_prod_detpp("+ id +"," + producto + ")";
                ps = conn.prepareStatement(sql);
                ps.execute();
                }
                if(Fcantidad){
                String sql = "SELECT Mod_cant_detpp("+ id +"," + cantidad + ")";
                ps = conn.prepareStatement(sql);
                ps.execute();
                }
                if(Faditivo){
                String sql = "SELECT Mod_adit_detpp("+ id +",'" + aditivo + "')";
                ps = conn.prepareStatement(sql);
                ps.execute();
                }
                if(!Fproducto&&!Fcantidad&&!Faditivo)
                    JOptionPane.showMessageDialog(this, "No se ha selecionado ningún campo a modificar.");
                else{
                    JOptionPane.showMessageDialog(this, "Producto se ha modificado con exito.");
                    limpiar();
                    actualizar();
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al modificar el producto.");
                System.out.println(ex);
            }*/
    }
    
    public void Eliminar_pedido(){
        //BAJA
        table.setRowSorter(null);
        PreparedStatement ps = null;
        try {
            Conexion objCon = new Conexion();
            Connection conn = objCon.getConexion();
            String id = ID_detalle;
            String sql = "SELECT Baja_Detalle('" + id + "')";
            System.out.println(sql);
            ps = conn.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(this, "El pedido fue eliminado correctamente.");
            tinydatosProducto1.limpiar();
            actualizar();
            tinydatosProducto1.limpiar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al Eliminar el pedido.");
            System.out.println(ex.toString());
        }
    }
    
    private void facturar(){  
    /*date = new SimpleDateFormat("dd MMMM yyyy").format(Calendar.getInstance().getTime());
    String nombre="", direccion="", telefono="", correo="", rzSocial = "";
    float pagoTotal=0, total=0;
    rzSocial = JOptionPane.showInputDialog("Escriba la Razón Social:");
    try{
    String ruta = System.getProperty("user.home");
    PdfWriter pdW = new PdfWriter(ruta + "/Downloads/Factura"+ID+".pdf");
    PdfDocument pdfDoc = new PdfDocument(pdW);
    pdfDoc.setDefaultPageSize(PageSize.A4);
    Document doc = new Document(pdfDoc);
    
    try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion objCon = new Conexion();
            Connection conn = objCon.getConexion();
            int id = Integer.parseInt(ID);
            String sql = "CALL Mostrar_Pedido(" + id + ")";

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                nombre = rs.getString("Cliente.nom_client");
                direccion = rs.getString("Cliente.dir_client");
                telefono = rs.getString("Cliente.tel_client");
                correo = rs.getString("Cliente.correo");
            }
            objCon.Cerrar_Conexion();
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Se ha generado un error en la consulta de datos.");
            System.out.println(ex);
        }
    float threecol = 190f;
    float twocol = 285f;
    float twocol150=twocol+150f;
    float twocolumnWidth[]={twocol150,twocol};
    float fullwidth[]={3*threecol};
    Table table = new Table(twocolumnWidth);
    
    Cell empresa = new Cell();
    empresa.add("Jeli Deserts");
    empresa.setBorder(Border.NO_BORDER);
    empresa.setFontSize(18);
    empresa.setBold();
    table.addCell(empresa);
    
    Table datos = new Table(new float[]{twocol/2,twocol/2});
    datos.addCell(new Cell().add("Nombre: ").setBold());
    datos.addCell(new Cell().add(nombre));
    datos.addCell(new Cell().add("Dirección: ").setBold());
    datos.addCell(new Cell().add(direccion));
    datos.addCell(new Cell().add("Teléfono: ").setBold());
    datos.addCell(new Cell().add(telefono));
    datos.addCell(new Cell().add("Correo electrónico: ").setBold());
    datos.addCell(new Cell().add(correo));
    
    Table datosEmp = new Table(1);
    datosEmp.addCell(new Cell().add("Emiliano Zapata Col. Obrera").setBold().setBorder(Border.NO_BORDER));
    datosEmp.addCell(new Cell().add("Tampico, Tamaulipas. C.P 89050").setBold().setBorder(Border.NO_BORDER));
    datosEmp.addCell(new Cell().add("Teléfono: 8334417038").setBold().setBorder(Border.NO_BORDER));
    
    Table pedido = new Table(new float[]{twocol/2,twocol/2});
    pedido.addCell(new Cell().add("Pedido No.").setBold());
    pedido.addCell(new Cell().add(ID));
    pedido.addCell(new Cell().add("Fecha de expedición").setBold());
    pedido.addCell(new Cell().add(date));
    pedido.addCell(new Cell().add("Razón Social: ").setBold().setBorder(Border.NO_BORDER));
    pedido.addCell(new Cell().add(rzSocial).setBorder(Border.NO_BORDER));
    
    Cell factura = new Cell();
    factura.add("FACTURA");
    factura.setBorder(Border.NO_BORDER);
    factura.setFontSize(28);
    factura.setTextAlignment(TextAlignment.RIGHT);
    factura.setBold();
    table.addCell(factura);
    table.addCell(new Cell().add(datosEmp).setBorder(Border.NO_BORDER));
    table.addCell(new Cell().add(pedido).setBorder(Border.NO_BORDER));
    
    Table datosC = new Table(1);
    datosC.addCell(new Cell().add("FACTURAR A:").setBold().setBorder(Border.NO_BORDER));
    datosC.addCell(new Cell().add(datos).setBorder(Border.NO_BORDER));
    
    doc.add(table);
    doc.add(datosC);
    
    Paragraph space = new Paragraph("\n");
    doc.add(space);
    
    Border border = new SolidBorder(Color.GRAY,2f);
    Table divider = new Table(fullwidth);
    divider.setBorder(border);
    doc.add(divider);
    
    doc.add(space);
    
    Table t = new Table(6);
    t.addCell(new Cell().add("Tipo").setBold().setTextAlignment(TextAlignment.CENTER).setBackgroundColor(Color.LIGHT_GRAY));
    t.addCell(new Cell().add("Sabor").setBold().setTextAlignment(TextAlignment.CENTER).setBackgroundColor(Color.LIGHT_GRAY));
    t.addCell(new Cell().add("Aditivos").setBold().setTextAlignment(TextAlignment.CENTER).setBackgroundColor(Color.LIGHT_GRAY));
    t.addCell(new Cell().add("Precio c/u").setBold().setTextAlignment(TextAlignment.CENTER).setBackgroundColor(Color.LIGHT_GRAY));
    t.addCell(new Cell().add("Cantidad").setBold().setTextAlignment(TextAlignment.CENTER).setBackgroundColor(Color.LIGHT_GRAY));
    t.addCell(new Cell().add("Monto").setBold().setTextAlignment(TextAlignment.CENTER).setBackgroundColor(Color.LIGHT_GRAY));
    
    try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            java.sql.Connection con = conn.getConexion();
            int id = Integer.parseInt(ID);
            String sql = "CALL Mostrar_detalles("+ id +")";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                t.addCell(new Cell().add(rs.getString("tipo")).setTextAlignment(TextAlignment.CENTER));
                t.addCell(new Cell().add(rs.getString("sabor")).setTextAlignment(TextAlignment.CENTER));
                t.addCell(new Cell().add(rs.getString("adit")).setTextAlignment(TextAlignment.CENTER));
                t.addCell(new Cell().add("$ "+rs.getString("costo")).setTextAlignment(TextAlignment.CENTER));
                t.addCell(new Cell().add(rs.getString("cantidad")).setTextAlignment(TextAlignment.CENTER));
                total = parseFloat(rs.getString("costo"))*parseFloat(rs.getString("cantidad")); //GENERAR EL MONTO TOTAL EN CASO DE SER VARIOS PRODUCTOS DEL MISMO
                pagoTotal += total;
                t.addCell(new Cell().add("$ "+String.valueOf(total)).setTextAlignment(TextAlignment.CENTER));
            }
            doc.add(t);
            conn.Cerrar_Conexion();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Se ha generado un error en la consulta de datos.");
            System.out.println(ex);
        }
    Table gasto = new Table(new float[]{twocol/3.27f,twocol/3.27f});
    gasto.addCell(new Cell().add("Total a pagar:").setBold());
    gasto.addCell(new Cell().add("$ "+String.valueOf(pagoTotal)).setTextAlignment(TextAlignment.CENTER));
    gasto.setHorizontalAlignment(HorizontalAlignment.RIGHT);
    
    doc.add(gasto);
    doc.add(space);
    doc.add(space);
    doc.add(space);
    doc.add(space);
    doc.add(space);
    doc.add(space);
    doc.add(space);
    
    Paragraph extra = new Paragraph("Total a pagar 15 días. Las cantidades vencidas tendrán un cargo de servicio de un 1% por mes.");
    extra.setFontSize(12);
    doc.add(new Cell().add(extra).setBorder(Border.NO_BORDER));
    
    doc.close();
    JOptionPane.showMessageDialog(this, "Se ha generado la factura.");
    }catch (Exception e){
        JOptionPane.showMessageDialog(this,"Se ha generado un error al crear la factura.");
            System.out.println(e);
        }*/
    }
    
    Validar v = new Validar();
    ImageIcon logo = new ImageIcon(".\\src\\icons\\jeliHD.png");
    String ID_pedido,nom, date, nomClient, ID_prod, ID_detalle;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton addbutton;
    private swing.MyButton cleanbutton;
    private javax.swing.JLabel closeButton;
    private swing.MyButton cumplebutton;
    private swing.MyButton factbutton;
    private javax.swing.JLabel minButton;
    private swing.MyButton modbutton;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel nombreLabel1;
    private swing.PanelBorder panelBorder1;
    private swing.PanelBorder panelBorder2;
    private swing.PanelBorderModify panelBorderModify1;
    private swing.PanelBorderModify panelMoving;
    private javax.swing.JLabel pedidoIDlabel;
    private javax.swing.JScrollPane spTable;
    private javax.swing.JScrollPane spTable1;
    public swing.Table table;
    public swing.Table tableProductos;
    private general.tinydatosProducto tinydatosProducto1;
    private swing.MyButton trashbutton;
    // End of variables declaration//GEN-END:variables
}
