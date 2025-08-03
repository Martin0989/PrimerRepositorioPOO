package uni1a;

public class Investigador {
    private String nombre;
    private String especialidad;

    public Investigador(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }

    /**
     * Devuelve los datos del investigador en formato CSV.
     * @return una cadena con formato "nombre,especialidad"
     */
    public String toCSVString() {
        return String.format("%s,%s", nombre, especialidad);
    }

    @Override
    public String toString() {
        return String.format("Investigador: %s (Especialidad: %s)", nombre, especialidad);
    }
}