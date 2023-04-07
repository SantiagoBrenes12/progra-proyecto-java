package view.dialogs;

import javax.swing.JOptionPane;

public class Dialogs {

    public static void dontExist() {
        JOptionPane.showMessageDialog(null, "Este registro no existe en nuestra base de datos. Porfavor intente de nuevo");
    }

    public static void successDialog() {
        JOptionPane.showMessageDialog(null, "Operación realizada con éxito!");
    }
}
