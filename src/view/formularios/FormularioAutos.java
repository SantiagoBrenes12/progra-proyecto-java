package view.formularios;

import javax.swing.JTextField;

public class FormularioAutos extends Formulario {

    static String nombreFormulario = "Formulario de autos";
    private JTextField chasis = new JTextField();
    private JTextField marca = new JTextField();
    private JTextField estilo = new JTextField();
    private JTextField modelo = new JTextField();
    private JTextField color = new JTextField();
    private JTextField precio = new JTextField();
    private Object[] campos;

    
    {
        this.chasis = new JTextField();
        this.marca = new JTextField();
        this.estilo = new JTextField();
        this.modelo = new JTextField();
        this.color = new JTextField();
        this.precio = new JTextField();
        
          this.campos = new Object[] {
            "Numero de placa",this.chasis,
            "Marca",this.marca,
            "Estilo",this.estilo,
            "Modelo",this.modelo,
            "Color",this.color,
            "Precio",this.precio,
        };
    }

    public FormularioAutos() {
        super(null,nombreFormulario);
        setCampos(campos);
    }

    @Override
    public String[] obtenerDatosFormulario() {
        String[] datos = {
            this.getChasis(),
            this.getMarca(),
            this.getEstilo(),
            this.getModelo(),
            this.getColor(),
            this.getPrecio()
        };
        
        return datos;
    }

    public String getChasis() {
        return chasis.getText();
    }

    public void setChasis(String chasis) {
        this.chasis.setText(chasis);
    }

    public String getMarca() {
        return marca.getText();
    }

    public void setMarca(String marca) {
        this.marca.setText(marca);
    }

    public String getEstilo() {
        return estilo.getText();
    }

    public void setEstilo(String estilo) {
        this.estilo.setText(estilo);
    }

    public String getModelo() {
        return modelo.getText();
    }

    public void setModelo(String modelo) {
        this.modelo.setText(modelo);
    }

        public String getColor() {
        return color.getText();
    }

    public void setColor(String color) {
        this.color.setText(color);
    }

    public String getPrecio() {
        return precio.getText();
    }

    public void setPrecio(String precio) {
        this.precio.setText(precio);
    }
}
