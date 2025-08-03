package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DocumentalTest {

    @Test
    void testToCSVStringConInvestigador() {
        // Arrange
        Documental doc = new Documental("Cosmos", 60, "Ciencia", "Astronomía");
        doc.setInvestigador(new Investigador("Carl Sagan", "Astrofísica"));
        doc.setId(30);

        String expectedCSV = "DOCUMENTAL,30,Cosmos,60,Ciencia,Astronomía,Carl Sagan,Astrofísica";

        // Act
        String actualCSV = doc.toCSVString();

        // Assert
        assertEquals(expectedCSV, actualCSV);
    }
}