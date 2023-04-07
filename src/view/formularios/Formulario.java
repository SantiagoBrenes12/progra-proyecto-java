package view.formularios;

import interfaces.CrudInterface;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public abstract class Formulario {

    private Object[] campos;
    private String tituloFormulario;
    private int opcionElegida;

    public Formulario(Object[] campos, String tituloFormulario) {
        this.campos = campos;
        this.tituloFormulario = tituloFormulario;
    }

    public void mostrarFormulario(Object[] opcionesForm) {
        this.opcionElegida = JOptionPane.showOptionDialog(null,
                this.campos,
                this.tituloFormulario,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcionesForm,
                opcionesForm[0]
        );
    }

    public abstract String[] obtenerDatosFormulario();

    public abstract void llenarCampos(String[] campos);

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
    
    public int getOpcionElegida() {
        return opcionElegida;
    }
    
    

}
