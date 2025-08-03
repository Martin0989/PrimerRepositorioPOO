package uni1a;

public class Actor {
    private String nombre;
    private int edad;
    private String nacionalidad;

    public Actor(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getNacionalidad() { return nacionalidad; }

    public String toCSVString() {
        return String.format("%s,%d,%s", nombre, edad, nacionalidad);
    }
    
    @Override
    public String toString() {
        return String.format("Actor: %s, Edad: %d, Nacionalidad: %s", nombre, edad, nacionalidad);
    }
}