/**
 * Class Pelicula
 */
package uni1a;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    private Actor actorPrincipal;  // Asociación

    public void setActorPrincipal(Actor actor) {
        this.actorPrincipal = actor;
    }

    public Actor getActorPrincipal() {
        return actorPrincipal;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);

        if (actorPrincipal != null) {
            actorPrincipal.mostrarInfo();
        }
        System.out.println();
    }

}