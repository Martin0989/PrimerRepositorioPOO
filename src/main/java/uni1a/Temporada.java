package uni1a; 

public class Temporada {
    private int numeroTemporada;
    private int episodios;

    public Temporada(int numeroTemporada, int episodios) {
        this.numeroTemporada = numeroTemporada;
        this.episodios = episodios;
    }

    // --- Getters ---
    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public int getEpisodios() {
        return episodios;
    }

    /**
     * Devuelve los datos de la temporada en un formato compacto para guardarlo
     * dentro de una celda de un archivo CSV.
     * Ejemplo de resultado: "1:10" (Temporada 1 con 10 episodios).
     * @return Una cadena formateada lista para ser guardada.
     */
    public String toCSVString() {
        return String.format("%d:%d", numeroTemporada, episodios);
    }

    /**
     * Devuelve una representación en texto de la temporada, pensada para
     * ser mostrada al usuario en la consola.
     * @return Una cadena formateada para la vista.
     */
    @Override
    public String toString() {
        return String.format("  - Temporada %d: %d episodios", numeroTemporada, episodios);
    }
}