package uni1a;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private Investigador investigador;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
    }

    // Getters y Setters
    public String getTema() { return tema; }
    public void setTema(String tema) { this.tema = tema; }
    public Investigador getInvestigador() { return investigador; }
    public void setInvestigador(Investigador investigador) { this.investigador = investigador; }

    @Override
    public String toCSVString() {
        // Formato: TIPO,ID,TITULO,DURACION,GENERO,TEMA,NOMBRE_INVESTIGADOR,ESPECIALIDAD_INVESTIGADOR
        String investigadorInfo = (investigador != null) ? investigador.toCSVString() : "N/A,N/A";
        return String.format("DOCUMENTAL,%d,%s,%d,%s,%s,%s",
            getId(), getTitulo(), getDuracionEnMinutos(), getGenero(), tema, investigadorInfo);
    }

    @Override
    public String toString() {
        String infoBase = "DOCUMENTAL -> " + super.toString() + String.format(", Tema: %s", tema);
        if (investigador != null) {
            return infoBase + "\n\t" + investigador.toString();
        }
        return infoBase;
    }
}