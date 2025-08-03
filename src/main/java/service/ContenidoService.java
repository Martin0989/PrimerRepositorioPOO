package service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import uni1a.*;

public class ContenidoService implements IContenidoService {

    @Override
    public List<ContenidoAudiovisual> cargarContenidosDesdeCSV(String rutaArchivo) {
        List<ContenidoAudiovisual> contenidos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            br.readLine(); // Omitir la línea de la cabecera
            while ((linea = br.readLine()) != null) {
                // Usamos split con límite -1 para asegurar que se capturen campos vacíos al final
                String[] datos = linea.split(",", -1);
                if (datos.length == 0) continue; // Ignorar líneas vacías
                
                String tipo = datos[0].toUpperCase();
                ContenidoAudiovisual contenido = null;

                switch (tipo) {
                    case "PELICULA":
                        contenido = parsePelicula(datos);
                        break;
                    case "DOCUMENTAL":
                        contenido = parseDocumental(datos);
                        break;
                    case "SERIE":
                        contenido = parseSerie(datos);
                        break;
                    case "ANIME":
                        contenido = parseAnime(datos);
                        break;
                    case "REALITY":
                        contenido = parseRealityShow(datos);
                        break;
                    default:
                        System.err.println("Tipo de contenido desconocido: " + tipo);
                }

                if (contenido != null) {
                    contenidos.add(contenido);
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error fatal al leer el archivo CSV: " + e.getMessage());
        }
        return contenidos;
    }

    private Pelicula parsePelicula(String[] datos) {
        // CSV: PELICULA,ID,TITULO,DURACION,GENERO,ESTUDIO,NOMBRE_ACTOR,EDAD_ACTOR,NACIONALIDAD_ACTOR
        Pelicula pelicula = new Pelicula(datos[2], Integer.parseInt(datos[3]), datos[4], datos[5]);
        pelicula.setId(Integer.parseInt(datos[1]));
        if (!datos[6].equals("N/A")) {
            pelicula.setActorPrincipal(new Actor(datos[6], Integer.parseInt(datos[7]), datos[8]));
        }
        return pelicula;
    }

    private Documental parseDocumental(String[] datos) {
        // CSV: DOCUMENTAL,ID,TITULO,DURACION,GENERO,TEMA,NOMBRE_INVESTIGADOR,ESPECIALIDAD
        Documental doc = new Documental(datos[2], Integer.parseInt(datos[3]), datos[4], datos[5]);
        doc.setId(Integer.parseInt(datos[1]));
        if (!datos[6].equals("N/A")) {
            doc.setInvestigador(new Investigador(datos[6], datos[7]));
        }
        return doc;
    }

    private SerieDeTV parseSerie(String[] datos) {
        // CSV: SERIE,ID,TITULO,DURACION_EP,GENERO,NUM_TEMPORADAS,LISTA_TEMPORADAS
        SerieDeTV serie = new SerieDeTV(datos[2], Integer.parseInt(datos[3]), datos[4], Integer.parseInt(datos[5]));
        serie.setId(Integer.parseInt(datos[1]));
        if (!datos[6].equals("N/A")) {
            String[] temporadasData = datos[6].split(";");
            Temporada[] listaTemporadas = new Temporada[temporadasData.length];
            for (int i = 0; i < temporadasData.length; i++) {
                String[] tData = temporadasData[i].split(":");
                listaTemporadas[i] = new Temporada(Integer.parseInt(tData[0]), Integer.parseInt(tData[1]));
            }
            serie.setTemporadasLista(listaTemporadas);
        }
        return serie;
    }

    private Anime parseAnime(String[] datos) {
        // CSV: ANIME,ID,TITULO,DURACION,GENERO,PAIS_ORIGEN,ESTILO_ANIMACION
        Anime anime = new Anime(datos[2], Integer.parseInt(datos[3]), datos[4], datos[5], datos[6]);
        anime.setId(Integer.parseInt(datos[1]));
        return anime;
    }

    private RealityShow parseRealityShow(String[] datos) {
        // CSV: REALITY,ID,TITULO,DURACION,GENERO,PRESENTADOR,NUM_PARTICIPANTES
        RealityShow reality = new RealityShow(datos[2], Integer.parseInt(datos[3]), datos[4], datos[5], Integer.parseInt(datos[6]));
        reality.setId(Integer.parseInt(datos[1]));
        return reality;
    }

    @Override
    public void guardarContenidosA_CSV(String rutaArchivo, List<ContenidoAudiovisual> contenidos) {
        // La cabecera es genérica; cada toCSVString() se encarga de su propia estructura
        final String CABECERA = "TIPO,ID,TITULO,DURACION,GENERO,EXTRA_1,EXTRA_2,EXTRA_3,EXTRA_4\n";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            bw.write(CABECERA);
            for (ContenidoAudiovisual contenido : contenidos) {
                bw.write(contenido.toCSVString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo CSV: " + e.getMessage());
        }
    }
}