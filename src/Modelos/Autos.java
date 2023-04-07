package Modelos;


public class Autos {
    //Atributos
    private String chasis;
    private String marca;
    private String estilo;
    private String modelo;
    private String color;
    private String precio;
    
    //Constructores

    public Autos() {
    }
    
    public Autos(String chasis, String marca, String estilo, String modelo, String color, String precio) {
        this.chasis = chasis;
        this.marca = marca;
        this.estilo = estilo;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }
 //get set

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) { 
        this.modelo = modelo;
    }
        public String getColor() {
        return color;
    }

    public void setColor(String color) { 
        this.color = color;
    }
        public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) { 
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Información del auto{");
        sb.append(" número de chasis=").append(chasis);
        sb.append(" marca=").append(marca);
        sb.append(", estilo=").append(estilo);
        sb.append(", modelo=").append(modelo);
        sb.append(", color=").append(color);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
public static void main(String[] args){
}

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}