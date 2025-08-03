package uni1a;

public class RealityShow extends ContenidoAudiovisual {
    private String presentador;
    private int numeroParticipantes;

    public RealityShow(String titulo, int duracionEnMinutos, String genero, String presentador, int numeroParticipantes) {
        super(titulo, duracionEnMinutos, genero);
        this.presentador = presentador;
        this.numeroParticipantes = numeroParticipantes;
    }

    // Getters y Setters
    public String getPresentador() { return presentador; }
    public void setPresentador(String presentador) { this.presentador = presentador; }
    public int getNumeroParticipantes() { return numeroParticipantes; }
    public void setNumeroParticipantes(int numeroParticipantes) { this.numeroParticipantes = numeroParticipantes; }

    @Override
    public String toCSVString() {
        // Formato: TIPO,ID,TITULO,DURACION,GENERO,PRESENTADOR,NUM_PARTICIPANTES
        return String.format("REALITY,%d,%s,%d,%s,%s,%d",
            getId(), getTitulo(), getDuracionEnMinutos(), getGenero(), presentador, numeroParticipantes);
    }

    @Override
    public String toString() {
        return "REALITY SHOW -> " + super.toString() + 
               String.format(", Presentador: %s, Participantes: %d", presentador, numeroParticipantes);
    }
}