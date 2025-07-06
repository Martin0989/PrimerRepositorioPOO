package uni1a;

public class Anime extends ContenidoAudiovisual {
    private String paisOrigen;
    private String estiloAnimacion;

    public Anime(String titulo, int duracionEnMinutos, String genero, String paisOrigen, String estiloAnimacion) {
        super(titulo, duracionEnMinutos, genero);
        this.paisOrigen = paisOrigen;
        this.estiloAnimacion = estiloAnimacion;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getEstiloAnimacion() {
        return estiloAnimacion;
    }

    public void setEstiloAnimacion(String estiloAnimacion) {
        this.estiloAnimacion = estiloAnimacion;
    }

    public boolean esEstiloTradicional() {
        return estiloAnimacion.equalsIgnoreCase("2D");
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Anime:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        System.out.println("País de origen: " + paisOrigen);
        System.out.println("Estilo de animación: " + estiloAnimacion);
        System.out.println("¿Estilo tradicional?: " + (esEstiloTradicional() ? "Sí" : "No"));
        System.out.println();
    }
}
