package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PeliculaTest {

    @Test
    void testCreacionPelicula() {
        Pelicula pelicula = new Pelicula("Inception", 148, "Ciencia Ficción", "Warner Bros.");
        assertEquals("Inception", pelicula.getTitulo());
        assertEquals(148, pelicula.getDuracionEnMinutos());
        assertEquals("Warner Bros.", pelicula.getEstudio());
    }

    @Test
    void testToCSVStringConActor() {
        Pelicula pelicula = new Pelicula("Inception", 148, "Ciencia Ficción", "Warner Bros.");
        pelicula.setActorPrincipal(new Actor("Leonardo DiCaprio", 48, "EEUU"));
        
        // Ignoramos el ID que es autoincremental para la prueba
        String csvExpected = String.format("PELICULA,%d,Inception,148,Ciencia Ficción,Warner Bros.,Leonardo DiCaprio,48,EEUU", pelicula.getId());
        
        assertEquals(csvExpected, pelicula.toCSVString());
    }
}