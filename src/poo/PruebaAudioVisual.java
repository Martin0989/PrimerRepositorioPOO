package poo;
import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear actores e investigadores
        Actor actor1 = new Actor("Leonardo DiCaprio", 48, "Estados Unidos");
        Investigador investigador1 = new Investigador("Carl Sagan", "Astronomía");

        // Crear películas y asignar actor
        Pelicula pelicula1 = new Pelicula("Avatar", 125, "Acción", "20th Century Studios");
        pelicula1.setActorPrincipal(actor1);

        // Crear temporadas para la serie
        Temporada temp1 = new Temporada(1, 10);
        Temporada temp2 = new Temporada(2, 10);
        Temporada[] listaTemporadas = {temp1, temp2};

        // Crear serie y asignar temporadas
        SerieDeTV serie1 = new SerieDeTV("Game of Thrones", 60, "Fantasía", 2);
        serie1.setTemporadasLista(listaTemporadas);

        // Crear documental y asignar investigador
        Documental doc1 = new Documental("Cosmos", 45, "Ciencia", "Astronomía");
        doc1.setInvestigador(investigador1);

        // Crear RealityShow y Anime
        RealityShow reality1 = new RealityShow("Supervivencia Extrema", 90, "Aventura", "Juan Pérez", 15);
        Anime anime1 = new Anime("Naruto", 25, "Acción", "Japón", "2D");

        // Crear arreglo con todos los contenidos
        ContenidoAudiovisual[] contenidos = {
            pelicula1,
            serie1,
            doc1,
            reality1,
            anime1
        };

        // Mostrar detalles completos de todos los contenidos
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }

        // Ejemplo: modificar datos y mostrar cambios
        System.out.println("Modificando duración de Avatar...");
        pelicula1.setDuracionEnMinutos(130);
        pelicula1.mostrarDetalles();
    }
}
