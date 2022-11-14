package main;

import javax.swing.JOptionPane;

public class Validar {
    public boolean verAlfa(String s, String mensaje){
    boolean flag;
    if(s.matches("")||s.matches("[ ]+")){
        JOptionPane.showMessageDialog(null, "No se ha registrado información en el campo: "+mensaje+".");
        flag = false;
        return(flag);
        }
    if(s.matches("[a-zA-Z ÁÉÍÓÚáéíóúñÑ]+")){
        flag = true;
        return (flag);
        }
    else{
        JOptionPane.showMessageDialog(null, "Ingrese únicamente cáracteres del alfabeto en el campo: "+mensaje+"");
        flag = false;
        return (flag);
        }
    }
    
    public boolean verNum(String s, String mensaje){
    boolean flag;
    if(s.matches("")||s.matches("[ ]+")){
        JOptionPane.showMessageDialog(null, "No se ha registrado información en el campo: "+mensaje+".");
        flag = false;
        return(flag);
        }
    if(s.matches("[0-9]+")){
        flag = true;
        return (flag);
        }
    else{
        JOptionPane.showMessageDialog(null, "Ingrese únicamente cáracteres númericos en el campo: "+mensaje+" \n Ejemplo: 8333279870");
        flag = false;
        return (flag);
        }
    }
    
    public boolean verTel(String s, String mensaje){
    boolean flag;
    if(s.matches("")||s.matches("[ ]+")){
        JOptionPane.showMessageDialog(null, "No se ha registrado información en el campo: "+mensaje+".");
        flag = false;
        return(flag);
        }
    if(s.matches("^\\d{10}$")){
        flag = true;
        return (flag);
        }
    else{
        JOptionPane.showMessageDialog(null, "Ingrese únicamente cáracteres númericos en el campo: "+mensaje+" \n Ejemplo: 8333279870");
        flag = false;
        return (flag);
        }
    }
    
    public boolean verFecha(String s, String mensaje){
    boolean flag;
    if(s.matches("")||s.matches("[ ]+")){
        JOptionPane.showMessageDialog(null, "No se ha registrado información en el campo: "+mensaje+".");
        flag = false;
        return(flag);
        }
    if(s.matches("^\\d{4}-\\d{2}-\\d{2}$")){
        flag = true;
        return (flag);
        }
    else{
        JOptionPane.showMessageDialog(null, "Ingrese el formato correcto en el campo: "+mensaje+". \n Formato: AAAA-MM-DD \n Ejemplo: 31 de Enero del 2000: '2000-01-31'");
        flag = false;
        return (flag);
        }
    }
    
    public boolean verDec(String s, String mensaje){
    boolean flag;
    if(s.matches("")||s.matches("[.]+")||s.matches("[ ]+")){
        JOptionPane.showMessageDialog(null, "No se ha registrado información en el campo: "+mensaje+".");
        flag = false;
        return(flag);
        }
    if(s.matches("[0-9]+")||s.matches("[0-9]+"+"."+"[0-9]+")){
        flag = true;
        return (flag);
        }
    else{
        JOptionPane.showMessageDialog(null, "Ingrese únicamente cáracteres númericos en el campo: "+mensaje+"");
        flag = false;
        return (flag);
        }
    }
    
    public String formatoFecha(String fecha){
        String resultado="";
        char[] charArray = fecha.toCharArray();
        char[] auxiliar = new char[5];
        for (int i = 0; i < auxiliar.length; i++) {
            auxiliar[i]=charArray[i+5];
        }
        resultado = String.valueOf(auxiliar);
        return(resultado);
    }
    
    public boolean verCorreo(String s, String mensaje){
    boolean flag;
    if(s.matches("")||s.matches("[.]+")||s.matches("[ ]+")){
        JOptionPane.showMessageDialog(null, "No se ha registrado información en el campo: "+mensaje+".");
        flag = false;
        return(flag);
        }
    if(s.matches("[a-zA-Z_0-9]+[@][a-zA-Z]+[.][a-zA-Z]+")||s.matches("[a-zA-Z_0-9]+[@][a-zA-Z]+[.][a-zA-Z]+[.][a-zA-Z]+")){
        flag = true;
        return (flag);
        }
    else{
        JOptionPane.showMessageDialog(null, "Ingrese únicamente un correo válido en el campo: "+mensaje+" \n Ejemplo de correo: hola@gmail.com");
        flag = false;
        return (flag);
        }
    }
}


