package Controller;

import javax.swing.JOptionPane;
import interfaces.CrudInterface;
import Modulos.Autos;
import java.util.ArrayList;


public class AutosController implements CrudInterface {

private static final ArrayList <Autos> lista= new ArrayList();

//crear ----------------------------------------------------------------------------------------------
@Override
public void Agregar(){
    String chasis;
    String marca;
    String estilo;
    String modelo;
    String color;
    String precio;

    chasis = JOptionPane.showInputDialog("Ingrese el número de chasis: ");
    marca = JOptionPane.showInputDialog("Ingrese la marca del auto: ");
    estilo = JOptionPane.showInputDialog("Ingrese el estilo del auto: ");
    modelo = JOptionPane.showInputDialog("Ingrese el modelo: ");
    color = JOptionPane.showInputDialog("Ingrese el color: ");
    precio = JOptionPane.showInputDialog("Ingrese el precio: ");

    Autos auto = new Autos(chasis, marca, estilo, modelo, color, precio);
    lista.add(auto);
}

//consultar  persona (opcion 1)-----------------------------------------------------------------------------------
    @Override
    public void Consultar(){
           
        Autos auto = new Autos();
        String IdConsulta = (JOptionPane.showInternalInputDialog(null, "Ingrese el número de chasis que desea consultar: "));
                
        for (int i = 0; i < lista.size(); i++) {
            auto = (Autos) lista.get(i);
            auto = (Autos) lista.get(i);
            if (auto.getChasis() == IdConsulta){
                IdConsulta=auto.getChasis();
                JOptionPane.showMessageDialog(null, "Resultado de busqueda: "+lista.get(i));
                break;
            }
        }
    }

//consular lista (opcion 2)--------------------------------------------------------------------------------
     @Override  
     public void verificarLista() {
          String info = "";
        for (Autos auto : lista) {
            JOptionPane.showMessageDialog(null, lista);
  
        }
     }  
   
       
// Editar -------------------------------------------------------------------------------------------------
    @Override
    public void Editar() {
        Autos auto = new Autos();
        int autoChasis=Integer.parseInt(JOptionPane.showInternalInputDialog(null, "Ingrese el número de chasis que desea modificar: "));
        for (int i = 0; i < lista.size(); i++) {
            auto = (Autos) lista.get(i);
            if (auto.getId()==autoChasis){
                lista.get(autoChasis).setChasis(JOptionPane.showInputDialog("Ingrese el número de chasis"));
                lista.get(autoChasis).setMarca(JOptionPane.showInputDialog("Ingrese la marca del auto"));
                lista.get(autoChasis).setEstilo(JOptionPane.showInputDialog("Ingrese el estilo del auto"));
                lista.get(autoChasis).setModelo(JOptionPane.showInputDialog("Ingrese el modelo del auto"));
                lista.get(autoChasis).setColor(JOptionPane.showInputDialog("Ingrese el color del auto"));
                lista.get(autoChasis).setPrecio(JOptionPane.showInputDialog("Ingrese el precio del auto"));
                break;
            }
        }
    }
    
//Eliminar ----------------------------------------------------------------------------------------------------
    
    //while(Comprado==fasle){
       @Override
       public void Eliminar(){
        Autos auto = new Autos();
        int autoChasis=Integer.parseInt(JOptionPane.showInternalInputDialog(null, "Ingrese el número de chasis del auto que desea eliminar: "));
        for (int i = 0; i < lista.size(); i++) {
            auto = (Autos) lista.get(i);
            if (auto.getId()==autoChasis){
                JOptionPane.showMessageDialog(null, "El registro ha sido eliminado.");
                lista.remove(i);
                break;
            }
        }
    }
}
