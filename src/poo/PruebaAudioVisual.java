package poo;

import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
    System.out.println("Hello from Eclipse!");

        // Crear instancias de contenido audiovisual
    ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
    contenidos[0] = new Pelicula("Avatar", 125, "Acción", "20th Century Studios");
    contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasía", 8);
    contenidos[2] = new Documental("Cosmos", 45, "Ciencia", "Astronomía");
    contenidos[3] = new RealityShow("Supervivencia Extrema", 90, "Aventura", "Juan Pérez", 15);
    contenidos[4] = new Anime("Naruto", 25, "Acción", "Japón", "2D");

    for (ContenidoAudiovisual contenido : contenidos) {
        contenido.mostrarDetalles();
    }

}
}