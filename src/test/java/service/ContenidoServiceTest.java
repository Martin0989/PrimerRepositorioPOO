package service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import uni1a.*;
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

class ContenidoServiceTest {

    private IContenidoService contenidoService;
    private List<ContenidoAudiovisual> listaDePrueba;

    @TempDir
    Path tempDir; // JUnit crea un directorio temporal para la prueba

    @BeforeEach
    void setUp() {
        contenidoService = new ContenidoService();
        listaDePrueba = new ArrayList<>();

        // Crear datos de prueba
        Pelicula p1 = new Pelicula("Inception", 148, "Ciencia Ficción", "Warner Bros.");
        p1.setActorPrincipal(new Actor("Leonardo DiCaprio", 48, "EEUU"));
        p1.setId(1); // Forzamos ID para consistencia en la prueba

        // Añadir más contenidos (Documental, Serie, etc.) para una prueba completa
        listaDePrueba.add(p1);
    }

    @Test
    void testGuardarYCargarContenidos() {
        // 1. Definir la ruta del archivo de prueba
        File archivoPrueba = tempDir.resolve("test_contenidos.csv").toFile();
        String ruta = archivoPrueba.getAbsolutePath();

        // 2. Guardar la lista de prueba en el archivo
        contenidoService.guardarContenidosA_CSV(ruta, listaDePrueba);

        // 3. Verificar que el archivo fue creado
        assertTrue(archivoPrueba.exists());

        // 4. Cargar los contenidos desde el archivo que acabamos de crear
        List<ContenidoAudiovisual> listaCargada = contenidoService.cargarContenidosDesdeCSV(ruta);

        // 5. Realizar aserciones para verificar que los datos son correctos
        assertNotNull(listaCargada);
        assertEquals(1, listaCargada.size());

        ContenidoAudiovisual contenidoCargado = listaCargada.get(0);
        assertTrue(contenidoCargado instanceof Pelicula);

        Pelicula peliculaCargada = (Pelicula) contenidoCargado;
        assertEquals("Inception", peliculaCargada.getTitulo());
        assertEquals("Warner Bros.", peliculaCargada.getEstudio());
        assertNotNull(peliculaCargada.getActorPrincipal());
        assertEquals("Leonardo DiCaprio", peliculaCargada.getActorPrincipal().getNombre());
    }
}