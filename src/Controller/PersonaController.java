package Controller;

import javax.swing.JOptionPane;
import interfaces.CrudInterface;
import Modelos.Persona;
import java.util.ArrayList;
import java.util.List;

public class PersonaController implements CrudInterface {

    private static ArrayList<Persona> lista = new ArrayList();

//crear ----------------------------------------------------------------------------------------------
    @Override
    public void Agregar(String[] datos) {
        String id = datos[0];
        String nombre = datos[1];
        String numeroTelefono = datos[2];
        String correo = datos[3];

        Persona personas = new Persona(id, nombre, numeroTelefono, correo);
        lista.add(personas);

        for (Persona persona : lista) {
            System.out.println(persona.getId());
            System.out.println(persona.getNombre());
            System.out.println(persona.getNumeroTelefono());
            System.out.println(persona.getCorreo());
        }
    }

//consultar  persona (opcion 1)-----------------------------------------------------------------------------------
    @Override
    public void Consultar() {

        Persona persona = new Persona();
        for (int i = 0; i < lista.size(); i++) {
            persona = (Persona) lista.get(i);
            if (persona.getId().equals("a")) {
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
    public void Editar() {
        Persona persona = new Persona();
        String personaID = JOptionPane.showInternalInputDialog(null, "Ingrese el ID de la persona que desea modificar: ");
        for (int i = 0; i < lista.size(); i++) {
            persona = (Persona) lista.get(i);
            if (persona.getId().equals(personaID)) {
                persona.setNombre(JOptionPane.showInputDialog("Ingrese el nuevo nombre"));
                persona.setNumeroTelefono(JOptionPane.showInputDialog("Ingrese el nuevo numero de telefono"));
                persona.setCorreo(JOptionPane.showInputDialog("Ingrese el nuevo Correo"));
                break;
            }
        }
    }

//Eliminar ----------------------------------------------------------------------------------------------------
    //while(Comprado==fasle){
    @Override
    public void Eliminar() {
        Persona persona = new Persona();
        String personaID = JOptionPane.showInternalInputDialog(null, "Ingrese el ID de la persona que desea eliminar: ");
        for (int i = 0; i < lista.size(); i++) {
            persona = (Persona) lista.get(i);
            if (persona.getId().equals(personaID)) {
                JOptionPane.showMessageDialog(null, "La persona ha sido eliminada.");
                lista.remove(i);
                break;
            }
        }
    }

    @Override
    public ArrayList obtenerLista() {
        return lista;
    }

    @Override
    public boolean registroExiste(String idSolicitado) {
        boolean existe = false;
        for (Persona persona : lista) {
            if (persona.getId().equals(idSolicitado)) {
                existe = true;
            }
        }
        return existe;
    }

    @Override
    public String[] obtenerRegistro(String idSolicitado) {
        String[] registro = {};
        for (Persona persona : lista) {
            if (persona.getId().equals(idSolicitado)) {
                registro = new String[]{
                    persona.getId(),
                    persona.getNombre(),
                    persona.getNumeroTelefono(),
                    persona.getCorreo()
                };
            }
        }

        return registro;
    }
}
