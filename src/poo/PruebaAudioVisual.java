package poo;

import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de contenido audiovisual
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];
        contenidos[0] = new Pelicula("Avatar", 125, "Acción", "20th Century Studios");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasía", 8);
        contenidos[2] = new Documental("Cosmos", 45, "Ciencia", "Astronomía");

        // Asignar Actor a Pelicula
        Actor actor1 = new Actor("Leonardo DiCaprio", 48, "Estados Unidos");
        ((Pelicula) contenidos[0]).setActorPrincipal(actor1);

        // Asignar Temporadas a SerieDeTV
        Temporada[] temporadasGOT = {
            new Temporada(1, 10),
            new Temporada(2, 10)
        };
        ((SerieDeTV) contenidos[1]).setTemporadasLista(temporadasGOT);

        // Asignar Investigador a Documental
        Investigador investigador1 = new Investigador("Carl Sagan", "Astronomía");
        ((Documental) contenidos[2]).setInvestigador(investigador1);

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}
