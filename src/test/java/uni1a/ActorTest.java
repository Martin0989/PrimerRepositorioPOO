package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ActorTest {

    @Test
    void testCreacionYGetters() {
        // Arrange
        Actor actor = new Actor("Tom Hanks", 66, "EEUU");

        // Assert
        assertEquals("Tom Hanks", actor.getNombre());
        assertEquals(66, actor.getEdad());
        assertEquals("EEUU", actor.getNacionalidad());
    }

    @Test
    void testToCSVStringExacto() {
        // Arrange
        Actor actor = new Actor("Scarlett Johansson", 38, "EEUU");
        String expectedCSV = "Scarlett Johansson,38,EEUU";

        // Act
        String actualCSV = actor.toCSVString();

        // Assert
        assertEquals(expectedCSV, actualCSV);
    }
}