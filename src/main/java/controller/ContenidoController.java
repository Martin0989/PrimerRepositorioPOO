package controller;

import uni1a.ContenidoAudiovisual;
import service.IContenidoService;
import view.ContenidoView;
import java.util.ArrayList;
import java.util.List;

public class ContenidoController {
    private ContenidoView view;
    private IContenidoService service;
    private List<ContenidoAudiovisual> catalogo;

    public ContenidoController(ContenidoView view, IContenidoService service) {
        this.view = view;
        this.service = service;
        this.catalogo = new ArrayList<>();
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            int opcion = view.mostrarMenu();
            switch (opcion) {
                case 1:
                    cargarContenidos();
                    break;
                case 2:
                    view.mostrarContenidos(catalogo);
                    break;
                case 3:
                    guardarContenidos();
                    break;
                case 0:
                    salir = true;
                    view.mostrarMensaje("Saliendo del programa...");
                    break;
                default:
                    view.mostrarMensaje("Opción no válida.");
            }
        }
    }

    private void cargarContenidos() {
        String ruta = view.solicitarRutaArchivo("cargar");
        this.catalogo = service.cargarContenidosDesdeCSV(ruta);
        view.mostrarMensaje("Datos cargados exitosamente desde " + ruta);
    }

    private void guardarContenidos() {
        if (catalogo.isEmpty()) {
            view.mostrarMensaje("No hay datos para guardar.");
            return;
        }
        String ruta = view.solicitarRutaArchivo("guardar");
        service.guardarContenidosA_CSV(ruta, catalogo);
        view.mostrarMensaje("Datos guardados exitosamente en " + ruta);
    }
}