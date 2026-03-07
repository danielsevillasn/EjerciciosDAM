package SevillaNavarreteDaniel.Objeto;
import SevillaNavarreteDaniel.Secundaria.Auxiliar;
/**
 * Clase persona que almacena nombre, edad y asistencia
 * 
 * @author Dani
 */
public abstract class Persona {
    
    private String nombre;
    private int edad;
    protected boolean asistencia;

    public Persona(){
        String[] nombres = {"Pepe","Juan","Maria","Roberto","Jose",
                            "Pepe","Juan","Maria","Roberto","Jose",
                            "Pepe","Juan","Maria","Roberto","Jose",
                            "Pepe","Juan","Maria","Roberto","Jose",};
        nombre = nombres[Auxiliar.aleatorio(0, nombres.length)];
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    abstract void disponibilidad();
}
