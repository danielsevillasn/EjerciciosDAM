package Ejercicios1.Ejercicio13;

public class Articulo {
    private int codigo;
    private String descripción;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    public Articulo(int codigo, String descripción, double precioCompra, double precioVenta, int stock) {
        this.codigo = codigo;
        this.descripción = descripción;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Articulo [codigo=" + codigo + ", descripción=" + descripción + ", precioCompra=" + precioCompra
                + ", precioVenta=" + precioVenta + ", stock=" + stock + "]";
    }
}
