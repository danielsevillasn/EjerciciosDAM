package SevillaNavarreteDaniel.Objeto;

/**
 * (Enunciado)
 * 
 * @author daniS
 */
public abstract class Persona {
    // Atributos/////////////////////
    private String nombre;
    private int edad;
    private boolean asistencia;

    // Metodos////////////////////////

    // Constructor por defecto
    public Persona() {
        String[] nombres = { "Pepe", "Juan", "Maria", "Alberto", "Pedro",
                "PepeJuan", "Daniel", "Mario", "Alberto", "Pedro",
                "Pepe", "Juan", "Maria", "Alberto", "Pedro",
                "Pepe", "Juan", "Maria", "Alberto", "Pedro"};
        nombre = nombres[(int) (Math.random() * nombres.length)];
    }

    // Constructor para instanciar objeto con dos parametros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor para instanciar objeto con un parametro
    public Persona(int edad) {
        this.edad = edad;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    // Setter
    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Otros metodos
    public abstract boolean disponibilidad();
}
