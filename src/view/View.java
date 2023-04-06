package view;

import Controller.ControllerFactory;
import interfaces.CrudInterface;
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

            if (opcionCrud.equalsIgnoreCase("Agregar")) {
                formulario.mostrarFormulario(false);
                continue;
            }

            if (opcionCrud != "Editar") {
                formulario.setModoSoloLectura();
            }

            formulario.mostrarFormulario(true);

            //CrudInterface controlador = obtenerControlador(moduloEscogido);
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
}
