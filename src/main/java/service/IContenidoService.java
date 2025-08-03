package service;

import uni1a.ContenidoAudiovisual;
import java.util.List;

public interface IContenidoService {
    List<ContenidoAudiovisual> cargarContenidosDesdeCSV(String rutaArchivo);
    void guardarContenidosA_CSV(String rutaArchivo, List<ContenidoAudiovisual> contenidos);
}