package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class InvestigadorTest {

    @Test
    void testCreacionYGetters() {
        // Arrange
        Investigador investigador = new Investigador("Marie Curie", "Física y Química");

        // Assert
        assertEquals("Marie Curie", investigador.getNombre());
        assertEquals("Física y Química", investigador.getEspecialidad());
    }
    
    @Test
    void testToCSVStringExacto() {
        // Arrange
        Investigador investigador = new Investigador("Neil deGrasse Tyson", "Astrofísica");
        String expectedCSV = "Neil deGrasse Tyson,Astrofísica";

        // Act
        String actualCSV = investigador.toCSVString();

        // Assert
        assertEquals(expectedCSV, actualCSV);
    }
}