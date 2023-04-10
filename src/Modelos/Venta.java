package Modelos;

public class Venta{

    private String chasis;
    private String idComprador;
    private String precioVenta;
    private String fechaVenta;
    private String montoIva;
    private String montoVenta;

    public Venta(String chasis, String idComprador, String precioVenta, String fechaVenta, String montoIva, String montoVenta) {
        this.chasis = chasis;
        this.idComprador = idComprador;
        this.precioVenta = precioVenta;
        this.fechaVenta = fechaVenta;
        this.montoIva = montoIva;
        this.montoVenta = montoVenta;
    }

}
