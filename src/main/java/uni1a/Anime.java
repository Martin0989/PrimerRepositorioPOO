package uni1a;

public class Anime extends ContenidoAudiovisual {
    private String paisOrigen;
    private String estiloAnimacion; // Ej: "2D", "3D", "Stop-motion"

    public Anime(String titulo, int duracionEnMinutos, String genero, String paisOrigen, String estiloAnimacion) {
        super(titulo, duracionEnMinutos, genero);
        this.paisOrigen = paisOrigen;
        this.estiloAnimacion = estiloAnimacion;
    }

    // Getters y Setters
    public String getPaisOrigen() { return paisOrigen; }
    public void setPaisOrigen(String paisOrigen) { this.paisOrigen = paisOrigen; }
    public String getEstiloAnimacion() { return estiloAnimacion; }
    public void setEstiloAnimacion(String estiloAnimacion) { this.estiloAnimacion = estiloAnimacion; }

    @Override
    public String toCSVString() {
        // Formato: TIPO,ID,TITULO,DURACION,GENERO,PAIS_ORIGEN,ESTILO_ANIMACION
        return String.format("ANIME,%d,%s,%d,%s,%s,%s",
            getId(), getTitulo(), getDuracionEnMinutos(), getGenero(), paisOrigen, estiloAnimacion);
    }

    @Override
    public String toString() {
        return "ANIME -> " + super.toString() + 
               String.format(", País: %s, Estilo: %s", paisOrigen, estiloAnimacion);
    }
}