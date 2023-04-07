package view.utilidades;

import view.formularios.Formulario;


public class UtilidadesFormulario {
    public static String[] obtenerDatosFormularioDado(Formulario formulario){        
        return formulario.obtenerDatosFormulario();
    }
    
    public static Object[] obtenerOpcionesForm(String opcionCrud){
        if(opcionCrud.equalsIgnoreCase("Agregar")){
            return new Object[] {"Crear","Volver"};
        }
        
        if(opcionCrud.equalsIgnoreCase("Editar")){
            return new Object[] {"Confirmar edicion","Volver"};
        }
        
        if(opcionCrud.equalsIgnoreCase("Eliminar")){
            return new Object[] {"Eliminar","Volver"};
        }
        
        if(opcionCrud.equalsIgnoreCase("Consultar")){
            return new Object[] {"Volver"};
        }
        return null;
    }
}
