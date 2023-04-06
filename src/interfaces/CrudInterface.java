/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public interface CrudInterface {
    
    public void Agregar(String[] datos);
        
    public void Consultar();
    
    public void verificarLista();
    
    public void Editar();
    
    public void Eliminar();
    
    public ArrayList obtenerLista();
    
    public boolean registroExiste(String idSolicitado);
    
    public String[] obtenerRegistro(String idSolicitado);
}
