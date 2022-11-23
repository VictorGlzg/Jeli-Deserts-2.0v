package swing;

import java.awt.Color;
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import main.Conexion;

public class Table extends JTable {
    
    public Table() {
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                header.setHorizontalAlignment(JLabel.CENTER);
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1) {
                Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
                com.setBackground(Color.WHITE);
                setBorder(noFocusBorder);
                setHorizontalAlignment(JLabel.CENTER);
                if (selected) {
                    com.setForeground(new Color(15, 89, 140));
                } else {
                    com.setForeground(new Color(102, 102, 102));
                }
                
                return com;
            }
        });
        
    }
    
    public void sqlConexionCliente(String sql) {
        //DefaultTableModel model = (DefaultTableModel) getModel();
        DefaultTableModel model = new DefaultTableModel();
        try {
            this.setModel(model);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            java.sql.Connection con = conn.getConexion();
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            model.addColumn("ID");
            model.addColumn("Nombre");
            model.addColumn("Correo");
            model.addColumn("Dirección");
            model.addColumn("Telefono");
            model.addColumn("Cumpleaños");
            
            this.getColumnModel().getColumn(0).setMaxWidth(50);
            
            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) { 
                    filas[i] = rs.getObject(i+1);
                }
                model.addRow(filas);
                
            }
            conn.Cerrar_Conexion();
            con.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    
    public void sqlConexionProducto(String sql) {
        DefaultTableModel model = new DefaultTableModel();
        try {
            this.setModel(model);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            java.sql.Connection con = conn.getConexion();
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            model.addColumn("ID");
            model.addColumn("Tipo");
            model.addColumn("Sabor");
            model.addColumn("Costo");
            model.addColumn("Stock");
            
            this.getColumnModel().getColumn(0).setMaxWidth(50);
            
            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) { 
                    filas[i] = rs.getObject(i+1);
                }
                model.addRow(filas);
                
            }
            conn.Cerrar_Conexion();
            con.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    
    public void sqlConexionPedido(String sql) {
        DefaultTableModel model = new DefaultTableModel();
        try {
            this.setModel(model);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            java.sql.Connection con = conn.getConexion();
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            model.addColumn("ID");
            model.addColumn("Cliente");
            model.addColumn("Cumpleaños");
            model.addColumn("Telefono");
            model.addColumn("Fecha");
            
            this.getColumnModel().getColumn(0).setMaxWidth(50);
            
            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) { 
                    filas[i] = rs.getObject(i+1);
                }
                model.addRow(filas);
                
            }
            conn.Cerrar_Conexion();
            con.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    
    public void sqlConexionDetalles(String sql) {
        DefaultTableModel model = new DefaultTableModel();
        try {
            this.setModel(model);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            java.sql.Connection con = conn.getConexion();
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            model.addColumn("ID");
            model.addColumn("Tipo");
            model.addColumn("Sabor");
            model.addColumn("Cantidad");
            model.addColumn("Aditivos");
            model.addColumn("Costo");
            
            this.getColumnModel().getColumn(0).setMaxWidth(50);
            
            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) { 
                    filas[i] = rs.getObject(i+1);
                }
                model.addRow(filas);
                
            }
            conn.Cerrar_Conexion();
            con.close();
            
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
}
