package view;

import java.util.List;
import java.util.Scanner;
import uni1a.ContenidoAudiovisual;

public class ContenidoView {
    private Scanner scanner;

    public ContenidoView() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. Cargar contenidos desde archivo CSV");
        System.out.println("2. Mostrar todos los contenidos");
        System.out.println("3. Guardar contenidos en archivo CSV");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public String solicitarRutaArchivo(String accion) {
        System.out.printf("Ingrese la ruta del archivo para %s: ", accion);
        return scanner.next();
    }

    public void mostrarContenidos(List<ContenidoAudiovisual> contenidos) {
        if (contenidos.isEmpty()) {
            System.out.println("No hay contenidos para mostrar.");
            return;
        }
        System.out.println("\n--- LISTA DE CONTENIDOS AUDIOVISUALES ---");
        for (ContenidoAudiovisual contenido : contenidos) {
            System.out.println(contenido.toString());
            System.out.println("----------------------------------------");
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}