package Ejercicio7;

// Modelo POO para gestionar la venta de entradas de Expocoches Campanillas

// Clase Zona: representa cada zona con un número limitado de entradas
class Zona {
    private int entradasDisponibles;

    public Zona(int entradasDisponibles) {
        this.entradasDisponibles = entradasDisponibles;
    }

    public int getEntradasDisponibles() {
        return entradasDisponibles;
    }

    // Vender entradas comprobando disponibilidad
    public boolean vender(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser positiva.");
            return false;
        }
        if (cantidad <= entradasDisponibles) {
            entradasDisponibles -= cantidad;
            System.out.println("Venta realizada. Entradas restantes: " + entradasDisponibles);
            return true;
        } else {
            System.out.println("No hay suficientes entradas disponibles.");
            return false;
        }
    }
}

// Clase ExpocochesCampanillas: gestiona las distintas zonas
public class ExpocochesCampanillas {
    private Zona salaPrincipal;
    private Zona zonaCompraVenta;
    private Zona zonaVip;

    public ExpocochesCampanillas() {
        salaPrincipal = new Zona(1000);
        zonaCompraVenta = new Zona(200);
        zonaVip = new Zona(25);
    }

    public void mostrarEntradas() {
        System.out.println("Entradas disponibles:");
        System.out.println("Sala principal: " + salaPrincipal.getEntradasDisponibles());
        System.out.println("Zona compra-venta: " + zonaCompraVenta.getEntradasDisponibles());
        System.out.println("Zona VIP: " + zonaVip.getEntradasDisponibles());
    }

    public void venderSalaPrincipal(int cantidad) {
        salaPrincipal.vender(cantidad);
    }

    public void venderZonaCompraVenta(int cantidad) {
        zonaCompraVenta.vender(cantidad);
    }

    public void venderZonaVip(int cantidad) {
        zonaVip.vender(cantidad);
    }
}