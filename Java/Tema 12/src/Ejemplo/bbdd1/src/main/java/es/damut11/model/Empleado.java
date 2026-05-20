package es.damut11.model;

public class Empleado {

    private int numEmple;
    private int numDpto;
    private String nombre;
    private String apellidos;
    private String direccion;

    public Empleado(int numEmple, int numDpto, String nombre, String apellidos, String direccion)
    {
        this.numEmple = numEmple;
        this.numDpto = numDpto;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }

    public int getNumEmple() {
        return numEmple;
    }

    public int getNumDpto() {
        return numDpto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    

}
