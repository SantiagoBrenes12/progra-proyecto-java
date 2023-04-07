package Controller;

import javax.swing.JOptionPane;
import interfaces.CrudInterface;
import Modelos.Autos;
import java.util.ArrayList;

public class AutosController implements CrudInterface {

    private static final ArrayList<Autos> lista = new ArrayList();

//crear ----------------------------------------------------------------------------------------------
    @Override
    public void Agregar(String[] datos) {
        String chasis = datos[0];
        String marca = datos[1];
        String estilo = datos[2];
        String modelo = datos[3];
        String color = datos[4];
        String precio = datos[5];

        Autos auto = new Autos(chasis, marca, estilo, modelo, color, precio);
        lista.add(auto);
    }

//consultar  persona (opcion 1)-----------------------------------------------------------------------------------
    @Override
    public void Consultar() {

        Autos auto = new Autos();
        String IdConsulta = (JOptionPane.showInternalInputDialog(null, "Ingrese el número de chasis que desea consultar: "));

        for (int i = 0; i < lista.size(); i++) {
            auto = (Autos) lista.get(i);
            auto = (Autos) lista.get(i);
            if (auto.getChasis() == IdConsulta) {
                IdConsulta = auto.getChasis();
                JOptionPane.showMessageDialog(null, "Resultado de busqueda: " + lista.get(i));
                break;
            }
        }
    }

// Editar -------------------------------------------------------------------------------------------------
    @Override
    public void Editar(String[] datos) {
        Autos auto = new Autos();
        String chasis = datos[0];
        String marca = datos[1];
        String estilo = datos[2];
        String modelo = datos[3];
        String color = datos[4];
        String precio = datos[5];

        for (int i = 0; i < lista.size(); i++) {
            auto = (Autos) lista.get(i);
            if (auto.getChasis().equalsIgnoreCase(chasis)) {
                auto.setMarca(marca);
                auto.setEstilo(estilo);
                auto.setModelo(modelo);
                auto.setColor(color);
                auto.setPrecio(precio);
                break;
            }
        }
    }

//Eliminar ----------------------------------------------------------------------------------------------------
    //while(Comprado==fasle){
    @Override
    public void Eliminar(String id) {
        Autos auto = new Autos();
        for (int i = 0; i < lista.size(); i++) {
            auto = (Autos) lista.get(i);
            if (auto.getChasis().equalsIgnoreCase(id)) {
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
        for (Autos auto : lista) {
            if (auto.getChasis().equals(idSolicitado)) {
                existe = true;
            }
        }
        return existe;
    }

    @Override
    public String[] obtenerRegistro(String idSolicitado) {
        String[] registro = {};
        for (Autos auto : lista) {
            if (auto.getChasis().equals(idSolicitado)) {
                registro = new String[]{
                    auto.getChasis(),
                    auto.getMarca(),
                    auto.getEstilo(),
                    auto.getModelo(),
                    auto.getModelo(),
                    auto.getPrecio()
                };
            }
        }

        return registro;
    }
}
