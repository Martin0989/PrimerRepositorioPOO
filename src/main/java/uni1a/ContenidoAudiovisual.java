package uni1a;

public abstract class ContenidoAudiovisual {
    private static int contadorGlobal = 0;
    private int id;
    private String titulo;
    private int duracionEnMinutos;
    private String genero;

    public ContenidoAudiovisual(String titulo, int duracionEnMinutos, String genero) {
        this.id = ++contadorGlobal;
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.genero = genero;
    }

    // Getters y Setters (limpios y concisos)
    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public int getDuracionEnMinutos() { return duracionEnMinutos; }
    public void setDuracionEnMinutos(int duracionEnMinutos) { this.duracionEnMinutos = duracionEnMinutos; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    
    // Asigna un ID específico, útil al cargar desde archivo
    public void setId(int id) { this.id = id; }

    // Método abstracto para forzar a las subclases a implementar su formato CSV
    public abstract String toCSVString();
    
    @Override
    public String toString() {
        return String.format("ID: %d, Título: %s, Duración: %d min, Género: %s", 
            id, titulo, duracionEnMinutos, genero);
    }
}