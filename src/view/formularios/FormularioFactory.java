package view.formularios;


public class FormularioFactory {
    public Formulario obtenerFormulario(String formulario){
        if (formulario.equalsIgnoreCase("modulo autos")){
            return new FormularioAutos();
        }
        
        if (formulario.equalsIgnoreCase("modulo personas")){
            return new FormularioPersonas();
        }
        
        if (formulario.equalsIgnoreCase("modulo ventas")){
            return new FormularioVentas();
        }
        
        return null;
    }
}
