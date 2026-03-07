/**
 * Clase vehiculo con sus respectivas subclases
 * 
 * @author daniS
 */

public abstract class Vehiculo {
    // Atributos/////////////////////
    private static int vehiculosCreados;
    private static int kilometrosTotales;
    private int kilometrosRecorridos;

    // Metodos////////////////////////

    // Constructor por defecto
    public Vehiculo() {
        vehiculosCreados++;
    }

    // Getter
    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public int getKilometrosTotales() {
        return kilometrosTotales;
    }

    // Setter
    public static void setVehiculosCreados(int vehiculosCreados) {
        Vehiculo.vehiculosCreados = vehiculosCreados;
    }

    public static void setKilometrosTotales(int kilometrosTotales) {
        Vehiculo.kilometrosTotales = kilometrosTotales;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    // Otros metodos
    abstract void andar();
    abstract void truco();

    // toString
    @Override
    public String toString() {
        return "Vehiculo kilometrosRecorridos=" + kilometrosRecorridos;
    }

}
