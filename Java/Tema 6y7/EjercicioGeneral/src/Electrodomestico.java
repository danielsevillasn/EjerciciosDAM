public abstract class Electrodomestico {
    private String marca;
    private double precio;

    public Electrodomestico(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.print("Electrodomestico - marca: " + marca + ", Precio: " + precio);
    }

    public abstract double calcularPrecioFinal();

    @Override
    public String toString() {
        return "Marca: " + marca + ", Precio Base: " + precio;
    }
}
