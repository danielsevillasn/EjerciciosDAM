public class Nevera extends Electrodomestico {
    private int capacidad;

    public Nevera(String marca, double precio, int capacidad) {
        super(marca, precio);
        this.capacidad = capacidad;
    }

    public double calcularPrecioFinal() {
        double precioPlus = getPrecio();
        if (capacidad > 300) {
            precioPlus += 50;
        }
        return precioPlus;
    }
}
