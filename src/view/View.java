package view;

import Controller.ControllerFactory;
import interfaces.CrudInterface;
import javax.swing.JOptionPane;
import view.formularios.Formulario;
import view.formularios.FormularioFactory;
import view.menus.Menu;
import view.utilidades.UtilidadesFormulario;
import view.utilidades.UtilidadesMenu;

public class View {

    public void manejarMenuPrincipal() {
        Menu menu = new Menu("Menu principal", UtilidadesMenu.obtenerOpcionesMPrincipal());
        menu.mostrarMenu();
        String opcionMenuPrincipal = menu.obtenerOpcionElegida();

        if (opcionMenuPrincipal.equals("Salir")) {
            return;
        }

        manejarSubmenu(opcionMenuPrincipal);
    }

    private void manejarSubmenu(String moduloEscogido) {
        while (true) {
            Menu subMenu = new Menu(moduloEscogido, UtilidadesMenu.obtenerOpcionesCrud());
            subMenu.mostrarMenu();
            String opcionCrud = subMenu.obtenerOpcionElegida();

            if (opcionCrud.equals("Volver")) {
                manejarMenuPrincipal();
                return;
            }

            Formulario formulario = generarFormulario(moduloEscogido);
            CrudInterface controlador = obtenerControlador(moduloEscogido);

            if (opcionCrud.equalsIgnoreCase("Agregar")) {
                formulario.mostrarFormulario();
                crear(formulario, controlador);
                continue;
            }

            if (opcionCrud != "Editar") {
                formulario.setModoSoloLectura();
            }

            String idSolicitado = JOptionPane.showInputDialog(null, "Ingrese el id del " + moduloEscogido);
            if (!registroExiste(idSolicitado, moduloEscogido)) {
                JOptionPane.showMessageDialog(null, "no existe este id");
                continue;
            }

            formulario.mostrarFormulario();

        }
    }

    private Formulario generarFormulario(String modulo) {
        FormularioFactory formularioFactory = new FormularioFactory();
        Formulario formulario = formularioFactory.obtenerFormulario(modulo);
        return formulario;
    }

    private CrudInterface obtenerControlador(String controlador) {
        ControllerFactory controller = new ControllerFactory(controlador);
        return controller.getControlador();
    }

    private boolean registroExiste(String idSolicitado, String moduloEscogido) {
        CrudInterface controlador = obtenerControlador(moduloEscogido);
        return controlador.registroExiste(idSolicitado);
    }
    
    private void crear(Formulario formulario, CrudInterface controlador){
        String[] datos = formulario.obtenerDatosFormulario();
        controlador.Agregar(datos);
    }
}
