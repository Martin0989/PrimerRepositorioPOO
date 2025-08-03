package uni1a;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SerieDeTV extends ContenidoAudiovisual {
    private int numeroDeTemporadas;
    private Temporada[] temporadasLista;

    /**
     * Constructor para una Serie de TV.
     * @param titulo El título de la serie.
     * @param duracionPorEpisodio Duración promedio de un episodio en minutos.
     * @param genero El género de la serie.
     * @param numeroDeTemporadas El número total de temporadas.
     */
    public SerieDeTV(String titulo, int duracionPorEpisodio, String genero, int numeroDeTemporadas) {
        super(titulo, duracionPorEpisodio, genero);
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    // Getters y Setters
    public int getNumeroDeTemporadas() { 
        return numeroDeTemporadas; 
    }
    
    public void setNumeroDeTemporadas(int numeroDeTemporadas) { 
        this.numeroDeTemporadas = numeroDeTemporadas; 
    }

    public Temporada[] getTemporadasLista() { 
        return temporadasLista; 
    }

    public void setTemporadasLista(Temporada[] temporadasLista) { 
        this.temporadasLista = temporadasLista; 
    }

    @Override
    public String toCSVString() {
        // Formato: TIPO,ID,TITULO,DURACION_EP,GENERO,NUM_TEMPORADAS,LISTA_TEMPORADAS
        // Ejemplo de LISTA_TEMPORADAS: "1:10;2:10;3:8"
        String temporadasCSV = "N/A";
        if (temporadasLista != null && temporadasLista.length > 0) {
            // Usa un Stream para convertir cada objeto Temporada a su CSV y unirlos con ";"
            temporadasCSV = Arrays.stream(temporadasLista)
                                  .map(Temporada::toCSVString)
                                  .collect(Collectors.joining(";"));
        }
        return String.format("SERIE,%d,%s,%d,%s,%d,%s",
            getId(), getTitulo(), getDuracionEnMinutos(), getGenero(), numeroDeTemporadas, temporadasCSV);
    }

    @Override
    public String toString() {
        // Usamos StringBuilder para una construcción de cadenas más eficiente
        StringBuilder sb = new StringBuilder();
        sb.append("SERIE DE TV -> ").append(super.toString());
        sb.append(String.format(", Temporadas: %d", numeroDeTemporadas));
        
        if (temporadasLista != null && temporadasLista.length > 0) {
            sb.append("\n\tDetalle de Temporadas:");
            for (Temporada temporada : temporadasLista) {
                // El toString() de Temporada ya incluye el formato y el salto de línea implícito
                sb.append("\n\t").append(temporada.toString());
            }
        }
        return sb.toString();
    }
}