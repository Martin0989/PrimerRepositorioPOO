package uni1a;

public class RealityShow extends ContenidoAudiovisual {
    private String presentador;
    private int numeroParticipantes;

    public RealityShow(String titulo, int duracionEnMinutos, String genero, String presentador, int numeroParticipantes) {
        super(titulo, duracionEnMinutos, genero);
        this.presentador = presentador;
        this.numeroParticipantes = numeroParticipantes;
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public int getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(int numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }

    public boolean esMultitudinario() {
        return numeroParticipantes > 10;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Reality Show:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        System.out.println("Presentador: " + presentador);
        System.out.println("Número de participantes: " + numeroParticipantes);
        System.out.println("¿Multitudinario?: " + (esMultitudinario() ? "Sí" : "No"));
        System.out.println();
    }
}
