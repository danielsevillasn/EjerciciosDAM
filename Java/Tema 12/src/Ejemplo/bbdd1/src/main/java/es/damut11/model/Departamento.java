package es.damut11.model;

public class Departamento {

    private int numDpto;
    private String nombre;
    private String ubicacion;

    public Departamento(int numDpto, String nombre, String ubicacion)
    {
        this.numDpto = numDpto;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public int getNumDpto() {
        return numDpto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    

}
