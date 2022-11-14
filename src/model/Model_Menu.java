package model;
//              LIBRERÍAS
import javax.swing.Icon;
import javax.swing.ImageIcon;
// Clase objeto que sirve para crear los items que irán en una lista para desplegar el menú.
public class Model_Menu {

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    public Model_Menu(String icon, String name, MenuType type) {
        this.icon = icon;
        this.name = name;
        this.type = type;
    }

    public Model_Menu() {
    }

    private String icon;
    private String name;
    private MenuType type;

    public Icon toIcon() {
        return new ImageIcon(getClass().getResource("/icons/" + icon + ".png")); //asigna el icono de la paqueteria 'icons'
    }

    public static enum MenuType { //Estos estados hacen referencia al apartado al que pertenece el item que estamos creando. Donde existe el titulo y el menu. 
        TITLE, MENU, EMPTY
    }
}