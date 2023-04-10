package view.formularios;

import javax.swing.JTextField;

public class FormularioVentas extends Formulario {

    static String nombre = "Formulario de ventas";
    private JTextField idComprador = new JTextField();
    private JTextField chasis = new JTextField();
    private JTextField precioVenta = new JTextField();
    private JTextField fechaVenta = new JTextField();
    private JTextField montoIva = new JTextField();
    private JTextField montoVenta = new JTextField();
    private Object[] campos;

    {
        this.idComprador = new JTextField();
        this.chasis = new JTextField();
        this.precioVenta = new JTextField();
        this.fechaVenta = new JTextField();
        this.montoIva = new JTextField();
        this.montoVenta = new JTextField();

        this.campos = new Object[]{
            "Cedula comrpador", this.idComprador,
            "Chasis", this.chasis,
            "Precio de venta", this.precioVenta,
            "Fecha de venta", this.fechaVenta,
            "Monto IVA (13)", this.montoIva,
            "Monto Venta", this.montoVenta
        };
    }

    public FormularioVentas() {
        super(null,nombre);
        setCampos(campos);
    }

    public String getIdComprador() {
        return this.idComprador.getText();
    }

    public void setIdComprador(String idComprador) {
        this.idComprador.setText(idComprador);
    }

    public String getChasis() {
        return chasis.getText();
    }

    public void setChasis(String chasis) {
        this.chasis.setText(chasis);
    }

    public String getPrecioVenta() {
        return precioVenta.getText();
    }

    public void setPrecioVenta(String precioVenta) {
        this.precioVenta.setText(precioVenta);
    }

    public String getFechaVenta() {
        return fechaVenta.getText();
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta.setText(fechaVenta);
    }

    public String getMontoIva() {
        return montoIva.getText();
    }

    public void setMontoIva(String montoIva) {
        this.montoIva.setText(montoIva);
    }

    public String getMontoVenta() {
        return montoVenta.getText();
    }

    public void setMontoVenta(String montoVenta) {
        this.montoVenta.setText(montoVenta);
    }
    
    @Override
    public String[] obtenerDatosFormulario() {
        String[] datos = {
            this.getIdComprador(),
            this.getChasis(),
            this.getPrecioVenta(),
            this.getFechaVenta(),
            this.getMontoIva(),
            this.getMontoVenta()
        };
        
        return datos;
    }

    @Override
    public void llenarCampos(String[] camposExistentes) {
        setIdComprador(camposExistentes[0]);
        setChasis(camposExistentes[1]);
        setPrecioVenta(camposExistentes[2]);
        setFechaVenta(camposExistentes[3]);
        setMontoIva(camposExistentes[4]);
        setMontoVenta(camposExistentes[5]);
    }
}
