package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SerieDeTVTest {

    @Test
    void testToCSVStringConTemporadas() {
        // Arrange
        SerieDeTV serie = new SerieDeTV("Breaking Bad", 49, "Drama", 5);
        serie.setId(20);
        Temporada[] temporadas = {
            new Temporada(1, 7),
            new Temporada(2, 13)
        };
        serie.setTemporadasLista(temporadas);

        String expectedCSV = "SERIE,20,Breaking Bad,49,Drama,5,1:7;2:13";

        // Act
        String actualCSV = serie.toCSVString();

        // Assert
        assertEquals(expectedCSV, actualCSV);
    }

    @Test
    void testToCSVStringSinTemporadas() {
        // Arrange
        SerieDeTV serie = new SerieDeTV("Friends", 22, "Comedia", 10);
        serie.setId(21);
        serie.setTemporadasLista(null); // Sin lista de temporadas

        String expectedCSV = "SERIE,21,Friends,22,Comedia,10,N/A";

        // Act
        String actualCSV = serie.toCSVString();

        // Assert
        assertEquals(expectedCSV, actualCSV);
    }
}