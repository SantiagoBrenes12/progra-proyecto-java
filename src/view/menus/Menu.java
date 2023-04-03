package view.menus;

import javax.swing.JOptionPane;

public class Menu {

    String nombre;
    String[] opciones;
    int opcionElegida;

    public Menu(String nombre, String[] opciones) {
        this.opciones = opciones;
        this.nombre = nombre;
    }

    public void mostrarMenu() {
        this.opcionElegida = JOptionPane.showOptionDialog(
                null,
                "Ingrese la opcion deseada",
                nombre,
                0,
                3,
                null,
                opciones,
                opciones[0]
        );
    }

    public String obtenerOpcionElegida() {
        String opcionElegida = this.opciones[this.opcionElegida];
        return opcionElegida;
    }

}
