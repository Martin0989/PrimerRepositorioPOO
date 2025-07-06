package uni1a;

public class Temporada {
    private int numeroTemporada;
    private int episodios;

    public Temporada(int numeroTemporada, int episodios) {
        this.numeroTemporada = numeroTemporada;
        this.episodios = episodios;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void mostrarInfo() {
        System.out.println("Temporada " + numeroTemporada + " con " + episodios + " episodios.");
    }
}
