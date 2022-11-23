package main;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
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
        
        miniBarrabusq1.t = tableProductos;
        ID_prod = "";
        ID_detalle = "";
        selected = "";
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
        miniBarrabusq1 = new component.miniBarrabusq();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setForeground(new java.awt.Color(227, 227, 227));

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
                .addGap(18, 18, 18)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(miniBarrabusq1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(miniBarrabusq1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(tinydatosProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
       if(Integer.parseInt(cant)==0){
        JOptionPane.showMessageDialog(this, "No se puede agregar cero productos."); 
       }
       else{
       if(v.verAlfa(tipo,"Producto")&&(v.verNum(cant, "Cantidad"))){
       table.setRowSorter(null);
       PreparedStatement ps = null;
       ResultSet rs = null;
       idped = ID_pedido;
       idprod = ID_prod;
       int stock = Integer.parseInt(obtenerStock(ID_prod));
       if(stock<Integer.parseInt(cant)){
            JOptionPane.showMessageDialog(this, "No hay suficiente stock");
        }
        else{
            try {
                Conexion objCon = new Conexion();
                Connection conn = objCon.getConexion();
                
                String column = "Alta_Detalle("+ idped + "," + idprod + "," + cant + ",'"+ adit +"')";
                String sql = "SELECT "+column;
                System.out.println(sql);
                ps = conn.prepareStatement(sql);
                ps.execute();
                JOptionPane.showMessageDialog(this, "Producto registrado con exito.");
                actualizarProductos();
                tinydatosProducto1.limpiar();
                actualizar();
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(this, "Error al registrar un producto.");
                System.out.println(ex);
                }
            }
            tinydatosProducto1.limpiar();
            limpiar();
       }//END IF  
       }
    }//GEN-LAST:event_addbuttonActionPerformed

    private String obtenerStock(String idPROD){
        PreparedStatement ps = null;
        ResultSet rs = null;
        String stock = "";

        try {
            Conexion objCon = new Conexion();
            Connection conn = objCon.getConexion();

            String sql = "CALL Mostrar_ProductoID(" + idPROD + ")";

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                stock = rs.getString("stock");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return(stock);
    }
    
    private void trashbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trashbuttonActionPerformed
        System.out.println(ID_detalle);
        table.setRowSorter(null);
        if ("".equals(ID_detalle.trim())) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningun pedido de la lista.");
        }else{
            int action = JOptionPane.showConfirmDialog(null, "Estas por eliminar un registro de la base de datos.","ELIMINAR",JOptionPane.YES_NO_OPTION);
            if(action == 0){
                Eliminar_pedido();
                actualizarProductos();
            }
        }
        limpiar();
    }//GEN-LAST:event_trashbuttonActionPerformed

    private void cleanbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanbuttonActionPerformed
        table.setRowSorter(null);
        tinydatosProducto1.limpiar();
        limpiar();
    }//GEN-LAST:event_cleanbuttonActionPerformed

    private void modbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modbuttonActionPerformed
        String tipo = "", idped="",idprod="",cant="",adit="";
        tipo = tinydatosProducto1.tipoField.getText();
        cant = tinydatosProducto1.cantidadField.getText();
        adit = tinydatosProducto1.aditivoField.getText();
        if(v.verAlfa(tipo,"Producto")&&(v.verNum(cant, "Cantidad"))){
        modificar();
        limpiar();
            }    
    }//GEN-LAST:event_modbuttonActionPerformed

    private void factbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factbuttonActionPerformed
        f.cargarDatos(ID_pedido);  
        f.generarFactura();
    }//GEN-LAST:event_factbuttonActionPerformed

    private void cumplebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cumplebuttonActionPerformed
        validarCumple();
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
                ID_prod = rs.getString("Productos.id"); //CORREGIR MODIFICACIÓN EN PEDIDOS
                tinydatosProducto1.cantidadField.setText(rs.getString("cantidad"));
                tinydatosProducto1.aditivoField.setText(rs.getString("adit"));                
                tinydatosProducto1.tipoField.setText(rs.getString("Productos.tipo"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_tableMouseClicked

    private void tableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductosMouseClicked
    selectProductos();
    }//GEN-LAST:event_tableProductosMouseClicked
    
    private void validarCumple(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        date = new SimpleDateFormat("MM-dd").format(Calendar.getInstance().getTime());
        
        String cumpleaños="";
            try {
                Conexion objCon = new Conexion();
                Connection conn = objCon.getConexion();
                String sql = "CALL Mostrar_ClienteID("+ nomClient +")"; //cambiar ID
                
                ps = conn.prepareStatement(sql);
                rs = ps.executeQuery();
                if(rs.next()){
                cumpleaños = (rs.getString("cumpleA"));
                cumpleaños = v.formatoFecha(cumpleaños);
                }
                if(cumpleaños.equals(date)){
                    sql = "SELECT Alta_Detalle("+ ID_pedido + ", 0 , 1 ,'')";
                    ps = conn.prepareStatement(sql);
                    ps.execute();
                    JOptionPane.showMessageDialog(this, "El cupón se ha aplicado.");
                    actualizar();
                    tinydatosProducto1.limpiar();
                    }
                else{
                    JOptionPane.showMessageDialog(this, "Error cumpleaños no registrado el día de hoy.");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al modificar el producto.");
                System.out.println(ex);
            }
    }
    
    private void selectProductos(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Conexion objCon = new Conexion();
            Connection conn = objCon.getConexion();

            int Fila = tableProductos.getSelectedRow();
            selected = tableProductos.getValueAt(Fila, 0).toString();

            String sql = "CALL Mostrar_ProductoID(" + selected + ")";

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
    
    public void actualizarProductos(){
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tableProductos.setModel(modelo);
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
            
            tableProductos.getColumnModel().getColumn(0).setMaxWidth(50);

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
            actualizar();
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
    
    private void limpiar(){
    ID_prod = "";
    ID_detalle = "";
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
        table.setRowSorter(null);
        PreparedStatement ps = null;
        String id,cant, adit,tipo;
        int stock=0;
        id = ID_detalle;
        tipo = ID_prod;
        cant = tinydatosProducto1.cantidadField.getText();
        adit = tinydatosProducto1.aditivoField.getText();
        System.out.println(tipo);
        System.out.println(selected);
        if(!selected.equals(id)){
        stock = Integer.parseInt(obtenerStock(selected));
        }
        else if(stock<Integer.parseInt(cant)){
            JOptionPane.showMessageDialog(this, "No hay suficiente stock");
        }
        else{
            try {
                Conexion objCon = new Conexion();
                Connection conn = objCon.getConexion();
                
                //Mod_detalle(id_det int,cant int, newaditivo varchar(100),id_prod int)
                String sql = "SELECT Mod_detalle("+ id +"," + cant + ",'"+adit+"',"+tipo+")";
                ps = conn.prepareStatement(sql);
                ps.execute();
                    JOptionPane.showMessageDialog(this, "Producto se ha modificado con exito.");
                    tinydatosProducto1.limpiar();
                    actualizar();
                    actualizarProductos();
                } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al modificar el producto.");
                System.out.println(ex);
            }
        }
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
    
    public void search(String ss){
        
    }
    Facturar f = new Facturar();
    Validar v = new Validar();
    ImageIcon logo = new ImageIcon(".\\src\\icons\\jeliHD.png");
    String ID_pedido,nom, date, nomClient, ID_prod, ID_detalle, selected;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton addbutton;
    private swing.MyButton cleanbutton;
    private javax.swing.JLabel closeButton;
    private swing.MyButton cumplebutton;
    private swing.MyButton factbutton;
    private javax.swing.JLabel minButton;
    private component.miniBarrabusq miniBarrabusq1;
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
