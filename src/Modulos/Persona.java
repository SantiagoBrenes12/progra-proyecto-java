package Modulos;


public class Persona {
    //Atributos
    private int id;
    private String nombre;
    private String numeroTelefono;
    private String correo;
    
    //Constructores

    public Persona() {
    }
    
    public Persona(String nombre, String numeroTelefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.correo = correo;
    }
 //get set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre(int Id) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", numeroTelefono=").append(numeroTelefono);
        sb.append(", correo=").append(correo);
        sb.append('}');
        return sb.toString();
    }
public static void main(String[] args){
}

}

