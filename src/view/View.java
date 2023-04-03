package view;

import view.formularios.Formulario;
import view.formularios.FormularioFactory;
import view.menus.Menu;
import view.utilidades.UtilidadesFormulario;
import view.utilidades.UtilidadesMenu;

public class View {

    private static String[] opcionesMenuPrincipal = UtilidadesMenu.obtenerOpcionesMPrincipal();
    private static String[] opcionesCrud = UtilidadesMenu.obtenerOpcionesCrud();

    public void manejarMenuPrincipal() {
        Menu menu = new Menu("Menu principal", opcionesMenuPrincipal);
        menu.mostrarMenu();
        String opcionMenuPrincipal = menu.obtenerOpcionElegida();

        if (opcionMenuPrincipal.equals("Salir")) {
            return;
        }

        manejarSubmenu(opcionMenuPrincipal);
    }

    private void manejarSubmenu(String opcionElegidaMenuPrincipal) {
        while (true) {
            Menu subMenu = new Menu(opcionElegidaMenuPrincipal, opcionesCrud);
            subMenu.mostrarMenu();
            String opcionElegidaSubMenu = subMenu.obtenerOpcionElegida();

            if (opcionElegidaSubMenu.equals("Volver")) {
                manejarMenuPrincipal();
                return;
            }

            generarFormulario(opcionElegidaMenuPrincipal, opcionElegidaSubMenu);
        }
    }

    private void generarFormulario(String modulo, String accion) {
        FormularioFactory formularioFactory = new FormularioFactory();
        Formulario formulario = formularioFactory.obtenerFormulario(modulo);
        formulario.mostrarFormulario();
        String[] datos = UtilidadesFormulario.obtenerDatosFormularioDado(formulario);

        // todo : implementar conexion a controladores

    }

}
