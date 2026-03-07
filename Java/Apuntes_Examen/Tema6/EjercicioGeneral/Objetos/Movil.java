package Tema6.EjercicioGeneral.Objetos;
import Tema6.EjercicioGeneral.Enum.*;

public class Movil extends Dispositivo {
    private int ram;

    public Movil(String marca, double precio, Estado estado, int ram) {
        super(marca, precio, estado); // (g) Uso de super
        this.ram = ram;
    }

    // Constructor de copia de la hija
    public Movil(Movil otro) {
        super(otro);
        this.ram = otro.ram;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase + (precioBase * IVA);
    }

    @Override
    public void encender() { System.out.println("Móvil encendido."); }

    @Override
    public void conectarWifi() { System.out.println("Buscando red Wi-Fi..."); }
}