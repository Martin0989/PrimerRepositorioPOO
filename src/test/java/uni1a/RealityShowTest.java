package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RealityShowTest {

    @Test
    void testCreacionYGetters() {
        // Arrange
        RealityShow reality = new RealityShow("Survivor", 42, "Aventura", "Jeff Probst", 18);

        // Assert
        assertEquals("Survivor", reality.getTitulo());
        assertEquals("Jeff Probst", reality.getPresentador());
        assertEquals(18, reality.getNumeroParticipantes());
    }

    @Test
    void testToCSVStringExacto() {
        // Arrange
        RealityShow reality = new RealityShow("MasterChef", 60, "Cocina", "Gordon Ramsay", 20);
        reality.setId(50);
        String expectedCSV = "REALITY,50,MasterChef,60,Cocina,Gordon Ramsay,20";

        // Act
        String actualCSV = reality.toCSVString();

        // Assert
        assertEquals(expectedCSV, actualCSV);
    }
}