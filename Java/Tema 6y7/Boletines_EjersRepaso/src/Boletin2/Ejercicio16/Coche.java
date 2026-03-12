package Boletin2.Ejercicio16;

public class Coche {
    private String matricula;
    private String modelo;
    private String motor;
    private double precio;
    private String color;

    private static double precioTotal;

    public Coche(String matricula, String modelo, String motor, double precio, String color) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.motor = motor;
        this.precio = precio;
        this.color = color;
        precioTotal += precio;
    }

    
    public static double getPrecioTotal() {
        return precioTotal;
    }


    @Override
    public String toString() {
        return "Coche [matricula=" + matricula + ", modelo=" + modelo + ", motor=" + motor + ", precio=" + precio
                + ", color=" + color + "]";
    }
}
