package view;

import Controller.ControllerFactory;
import interfaces.CrudInterface;
import javax.swing.JOptionPane;
import view.dialogs.Dialogs;
import view.formularios.Formulario;
import view.formularios.FormularioFactory;
import view.menus.Menu;
import view.utilidades.UtilidadesFormulario;
import view.utilidades.UtilidadesMenu;

public class View {

    private static Dialogs dialog = new Dialogs();

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
            Object[] opcionesForm = UtilidadesFormulario.obtenerOpcionesForm(opcionCrud);

            if (opcionCrud.equals("Volver")) {
                manejarMenuPrincipal();
                return;
            }

            Formulario formulario = generarFormulario(moduloEscogido);
            CrudInterface controlador = obtenerControlador(moduloEscogido);

            if (opcionCrud.equalsIgnoreCase("Agregar")) {
                formulario.mostrarFormulario(opcionesForm);
                crear(formulario, controlador);
                dialog.successDialog();
                continue;
            }

            if (opcionCrud != "Editar") {
                formulario.setModoSoloLectura();
            }

            String idSolicitado = JOptionPane.showInputDialog(null, "Ingrese el id del " + moduloEscogido);
            if (!registroExiste(idSolicitado, controlador)) {
                dialog.dontExist();
                continue;
            }

            String[] camposExistentes = controlador.obtenerRegistro(idSolicitado);
            formulario.llenarCampos(camposExistentes);
            formulario.mostrarFormulario(opcionesForm);

            if (formulario.getOpcionElegida() == 1) {
                continue;
            }

            llamarControlador(opcionCrud, formulario, controlador);
            if (opcionCrud != "Consultar") {
                dialog.successDialog();
            }

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

    private boolean registroExiste(String idSolicitado, CrudInterface controlador) {
        return controlador.registroExiste(idSolicitado);
    }

    private void crear(Formulario formulario, CrudInterface controlador) {
        String[] datos = formulario.obtenerDatosFormulario();
        controlador.Agregar(datos);
    }

    private void editar(Formulario formulario, CrudInterface controlador) {
        String[] datos = formulario.obtenerDatosFormulario();
        controlador.Editar(datos);
    }

    private void eliminar(Formulario formulario, CrudInterface controlador) {
        String[] datos = formulario.obtenerDatosFormulario();
        controlador.Eliminar(datos[0]);
    }

    private void llamarControlador(String opcionCrud, Formulario formulario, CrudInterface controlador) {
        if (opcionCrud.equalsIgnoreCase("Editar")) {
            editar(formulario, controlador);
        }
        if (opcionCrud.equalsIgnoreCase("Eliminar")) {
            eliminar(formulario, controlador);
        }
    }
;
}
