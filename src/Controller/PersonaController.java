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

// Editar -------------------------------------------------------------------------------------------------
    @Override
    public void Editar(String[] datos) {
        Persona persona = new Persona();
        String id = datos[0];
        String nombre = datos[1];
        String numeroTel = datos[2];
        String correo = datos[3];
        
        for (int i = 0; i < lista.size(); i++) {
            persona = (Persona) lista.get(i);
            if (persona.getId().equals(id)) {
                persona.setNombre(nombre);
                persona.setNumeroTelefono(numeroTel);
                persona.setCorreo(correo);
                break;
            }
        }
    }

//Eliminar ----------------------------------------------------------------------------------------------------
    @Override
    public void Eliminar(String id) {
        Persona persona = new Persona();
        for (int i = 0; i < lista.size(); i++) {
            persona = (Persona) lista.get(i);
            if (persona.getId().equals(id)) {
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
