package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TemporadaTest {

    @Test
    void testCreacionYGetters() {
        // Arrange
        Temporada temporada = new Temporada(3, 24);

        // Assert
        assertEquals(3, temporada.getNumeroTemporada());
        assertEquals(24, temporada.getEpisodios());
    }

    @Test
    void testToCSVStringExacto() {
        // Arrange
        Temporada temporada = new Temporada(5, 16);
        String expectedCSV = "5:16";

        // Act
        String actualCSV = temporada.toCSVString();

        // Assert
        assertEquals(expectedCSV, actualCSV);
    }
    
    @Test
    void testToString() {
        // Arrange
        Temporada temporada = new Temporada(1, 10);
        
        // Act
        String temporadaString = temporada.toString();
        
        // Assert
        assertTrue(temporadaString.contains("Temporada 1"));
        assertTrue(temporadaString.contains("10 episodios"));
    }
}