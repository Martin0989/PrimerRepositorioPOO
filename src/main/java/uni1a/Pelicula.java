/**
 * Class Pelicula
 */
package uni1a;

public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private Actor actorPrincipal;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
    }

    // Getters y Setters
    public String getEstudio() { return estudio; }
    public void setEstudio(String estudio) { this.estudio = estudio; }
    public Actor getActorPrincipal() { return actorPrincipal; }
    public void setActorPrincipal(Actor actor) { this.actorPrincipal = actor; }

    @Override
    public String toCSVString() {
        // Formato: TIPO,ID,TITULO,DURACION,GENERO,ESTUDIO,NOMBRE_ACTOR,EDAD_ACTOR,NACIONALIDAD_ACTOR
        String actorInfo = (actorPrincipal != null) ? actorPrincipal.toCSVString() : "N/A,0,N/A";
        return String.format("PELICULA,%d,%s,%d,%s,%s,%s", 
            getId(), getTitulo(), getDuracionEnMinutos(), getGenero(), estudio, actorInfo);
    }

    @Override
    public String toString() {
        String infoBase = "PELÍCULA -> " + super.toString() + String.format(", Estudio: %s", estudio);
        if (actorPrincipal != null) {
            return infoBase + "\n\t" + actorPrincipal.toString();
        }
        return infoBase;
    }
}