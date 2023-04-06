package view.formularios;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public abstract class Formulario {

    private Object[] campos;
    private String tituloFormulario;
    int confirmacion;

    public Formulario(Object[] campos, String tituloFormulario) {
        this.campos = campos;
        this.tituloFormulario = tituloFormulario;
    }

    public void mostrarFormulario(boolean menuObtenerId) {
        if(menuObtenerId){
            System.out.println("view.formularios.Formulario.mostrarFormulario()");
        }
        
        JOptionPane.showOptionDialog(null,
                this.campos,
                this.tituloFormulario,
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                null
        );
    }

    public abstract String[] obtenerDatosFormulario();

    public void setCampos(Object[] campos) {
        this.campos = campos;
    }

    public void setModoSoloLectura() {
        for (Object campo : this.campos) {
            if (campo instanceof JTextField) {
                JTextField jField = (JTextField) campo;
                jField.setEditable(false);
            }
        }
    }

}
