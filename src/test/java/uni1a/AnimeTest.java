package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AnimeTest {

    @Test
    void testCreacionYGetters() {
        // Arrange
        Anime anime = new Anime("Attack on Titan", 24, "Acción", "Japón", "3D");

        // Assert
        assertEquals("Attack on Titan", anime.getTitulo()); // Getter de la clase base
        assertEquals("Japón", anime.getPaisOrigen());      // Getter de la clase específica
        assertEquals("3D", anime.getEstiloAnimacion());    // Getter de la clase específica
    }

    @Test
    void testToCSVStringExacto() {
        // Arrange
        Anime anime = new Anime("Spirited Away", 125, "Fantasía", "Japón", "2D");
        anime.setId(40);
        String expectedCSV = "ANIME,40,Spirited Away,125,Fantasía,Japón,2D";

        // Act
        String actualCSV = anime.toCSVString();

        // Assert
        assertEquals(expectedCSV, actualCSV);
    }
}