package Boletin2.Ejercicio15;

public class Planeta {
    private String nombre;
    private double masa;
    private double diametro;
    private int periodoRotacion;
    private double orbita;
    private int traslacion;

    public Planeta(String nombre, double masa, double diametro, int periodoRotacion, double orbita, int traslacion) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
        this.periodoRotacion = periodoRotacion;
        this.orbita = orbita;
        this.traslacion = traslacion;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s | Masa: %.2f | Diámetro: %.2f | Rotación: %d h | Órbita: %.2f km | Traslación: %d días",
                nombre, masa, diametro, periodoRotacion, orbita, traslacion);
    }
}
