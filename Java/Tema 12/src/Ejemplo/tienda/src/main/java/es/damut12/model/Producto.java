package es.damut12.model;

public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private int codFabricante;

    public Producto(int codigo, String nombre, double precio, int codFabricante)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codFabricante = codFabricante;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCodFabricante() {
        return codFabricante;
    }

    

}
