package main;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.layout.property.TextAlignment;
import static java.lang.Float.parseFloat;
import java.sql.*;
import java.util.*;
import java.text.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;



public class Facturar {
    String date, ID;
    public void generarFactura(){
    date = new SimpleDateFormat("dd MMMM yyyy").format(Calendar.getInstance().getTime());
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
            JOptionPane.showMessageDialog(null,"Se ha generado un error en la consulta de datos.");
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
            JOptionPane.showMessageDialog(null,"Se ha generado un error en la consulta de datos.");
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
    JOptionPane.showMessageDialog(null, "Se ha generado la factura.");
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,"Se ha generado un error al crear la factura.");
            System.out.println(e);
        }
    }
    
    public void cargarDatos(String i){
        ID = i;
        System.out.println("Se ha cargado la ID: "+ ID);
    }
}
