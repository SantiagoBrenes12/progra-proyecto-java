package Modelos;

public class Persona {

    //Atributos
    private String id;
    private String nombre;
    private String numeroTelefono;
    private String correo;
    private String[] vehiculos;

    //Constructores
    public Persona() {
    }

    public Persona(String id, String nombre, String numeroTelefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.correo = correo;
    }
    //get set

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String[] getVehiculos() {
        return vehiculos;
    }

    

    public static void main(String[] args) {
    }

}
