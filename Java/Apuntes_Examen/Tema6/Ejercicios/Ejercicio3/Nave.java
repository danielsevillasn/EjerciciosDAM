package Ejercicio3;

public abstract class Nave {
    protected String nombre;
    private int combustible;
    private static int contadorNaves;

    public Nave(){
        nombre = "";
        combustible = 0;
    }

    public int getCombustible() {
        return combustible;
    }

    public Nave(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
        contadorNaves++;
    }

    abstract void desplazarse();

    public static int getContadorNaves() {
        return contadorNaves;
    }

    @Override
    public String toString() {
        return "Nave [nombre=" + nombre + ", combustible=" + combustible + "]";
    }
}
