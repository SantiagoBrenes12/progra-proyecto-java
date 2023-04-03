package view;

import view.menus.Menu;
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
          
            generarFormulario(opcionElegidaSubMenu);
        }
    }
    
    private void generarFormulario(String modulo){
        // todo: formulario
    }

}
