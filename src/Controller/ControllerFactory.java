
package Controller;

import interfaces.CrudInterface;


public class ControllerFactory {
    CrudInterface controlador;
    
    public ControllerFactory(String controlador){
        this.controlador = obtenerControlador(controlador);
    }
    
    public CrudInterface obtenerControlador(String nombreControlador){
        CrudInterface controller = null;
        if(nombreControlador.equalsIgnoreCase("modulo personas")){
            controller = new AutosController();
        }
      
        return null;
    }
    
    public void llamarAccionCrud(){
        
    }

    public CrudInterface getControlador() {
        return controlador;
    }


    
    
}
