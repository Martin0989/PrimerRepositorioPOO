package poo;

import controller.ContenidoController;
import service.ContenidoService;
import service.IContenidoService;
import view.ContenidoView;

public class Main {
    public static void main(String[] args) {
        // 1. Crear las instancias (inyección de dependencias manual)
        ContenidoView view = new ContenidoView();
        IContenidoService service = new ContenidoService();
        ContenidoController controller = new ContenidoController(view, service);

        // 2. Iniciar la aplicación
        controller.iniciar();
    }
}