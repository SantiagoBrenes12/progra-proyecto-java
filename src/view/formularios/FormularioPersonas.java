package view.formularios;

import javax.swing.JTextField;

public class FormularioPersonas extends Formulario {

    private static String nombreFormulario = "Formulario de personas";
    private JTextField id;
    private JTextField nombre;
    private JTextField numeroTelefono;
    private JTextField correo;
    private Object[] campos;

    {
        this.id = new JTextField();
        this.nombre = new JTextField();
        this.numeroTelefono = new JTextField();
        this.correo = new JTextField();

        this.campos = new Object[]{
            "Cedula", this.id,
            "Nombre", this.nombre,
            "Telefono", this.numeroTelefono,
            "Correo", this.correo
        };
    }

    public FormularioPersonas() {
        super(null, nombreFormulario);
        setCampos(campos);
    }

    public String getId() {
        return id.getText();
    }

    public void setId(String id) {
        this.id.setText(id);
    }

    public String getNombre() {
        return nombre.getText();
    }

    public void setNombre(String nombre) {
        this.nombre.setText(nombre);
    }

    public String getNumeroTelefono() {
        return numeroTelefono.getText();
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono.setText(numeroTelefono);
    }

    public String getCorreo() {
        return correo.getText();
    }

    public void setCorreo(String correo) {
        this.correo.setText(correo);
    }

    @Override
    public void llenarCampos(String[] camposExistentes) {
        setId(camposExistentes[0]);
        setNombre(camposExistentes[1]);
        setNumeroTelefono(camposExistentes[2]);
        setCorreo(camposExistentes[3]);
    }

    @Override
    public String[] obtenerDatosFormulario() {
        String[] datos = {
            this.getId(),
            this.getNombre(),
            this.getNumeroTelefono(),
            this.getCorreo()
        };

        return datos;
    }
}
