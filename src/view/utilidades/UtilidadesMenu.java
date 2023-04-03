package view.utilidades;

import javax.swing.JTextField;

public class UtilidadesMenu {
       
    
    public static String[] obtenerOpcionesCrud(){
        String[] opciones = {"Agregar", "Editar", "Consultar", "Eliminar", "Volver"};
        return opciones;
    }
    
    public static String[] obtenerOpcionesMPrincipal(){
        String[] opciones = {"Modulo Personas", "Modulo Autos", "Modulo Ventas", "Salir"};
        return opciones;
    }
}
