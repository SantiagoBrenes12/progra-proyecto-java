
package Controller;

import javax.swing.JOptionPane;
import interfaces.CrudInterface;
import Modulos.Persona;
import java.util.ArrayList;
import java.util.List;


public class PersonaController implements CrudInterface {

private static ArrayList <Persona> lista= new ArrayList();

//crear ----------------------------------------------------------------------------------------------
@Override
public void AgregarPersona(){
    Boolean Comprado=false;    //parametro que indica si la persona ya ha adquirido un Auto
    String nombre;
    String numeroTelefono;
    String correo;

    nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona: ");
    numeroTelefono = JOptionPane.showInputDialog("Ingrese el numero de telefono de la persona: ");
    correo = JOptionPane.showInputDialog("Ingrese el correo electronico de la persona: ");

    Persona personas = new Persona(nombre, numeroTelefono, correo);
    lista.add(personas);
}

//consultar  persona (opcion 1)-----------------------------------------------------------------------------------
    @Override
    public void ConsultarPersona(){
           
        Persona persona = new Persona();
        int IdConsulta=Integer.parseInt(JOptionPane.showInternalInputDialog(null, "Ingrese el ID de la persona que desea consultar: "));
        for (int i = 0; i < lista.size(); i++) {
            persona = (Persona) lista.get(i);
            persona = (Persona) lista.get(i);
            if (persona.getId()==IdConsulta){
                IdConsulta=persona.getId();
                JOptionPane.showMessageDialog(null, "Resultado de busqueda: "+lista.get(i));
                break;
            }
        }
    }

//consular lista (opcion 2)--------------------------------------------------------------------------------
     @Override  
     public void verificarLista() {
          String info = "";
        for (Persona persona : lista) {
            JOptionPane.showMessageDialog(null, lista);
  
        }
     }  
   
       
// Editar -------------------------------------------------------------------------------------------------
    @Override
    public void EditarPersona() {
        Persona persona = new Persona();
        int personaID=Integer.parseInt(JOptionPane.showInternalInputDialog(null, "Ingrese el ID de la persona que desea modificar: "));
        for (int i = 0; i < lista.size(); i++) {
            persona = (Persona) lista.get(i);
            if (persona.getId()==personaID){
                lista.get(personaID).setNombre(JOptionPane.showInputDialog("Ingrese el nuevo nombre"));
                lista.get(personaID).setNumeroTelefono(JOptionPane.showInputDialog("Ingrese el nuevo numero de telefono"));
                lista.get(personaID).setCorreo(JOptionPane.showInputDialog("Ingrese el nuevo Correo"));
                break;
            }
        }
    }
    
//Eliminar ----------------------------------------------------------------------------------------------------
    
    //while(Comprado==fasle){
       @Override
       public void EliminarPersona(){
        Persona persona = new Persona();
        int personaID=Integer.parseInt(JOptionPane.showInternalInputDialog(null, "Ingrese el ID de la persona que desea eliminar: "));
        for (int i = 0; i < lista.size(); i++) {
            persona = (Persona)lista.get(i);
            if (persona.getId()==personaID){
                JOptionPane.showMessageDialog(null, "La persona ha sido eliminada.");
                lista.remove(i);
                break;
            }
        }
    }
}
    
    
    
    
    
 
