package Boletin2.Ejercicio18;

public class Articulo {
    private int codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;
    private static int nProductos;

    public Articulo(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
        nProductos++;
    }
    

    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        return "Articulo [codigo=" + codigo + ", descripcion=" + descripcion + ", precioCompra=" + precioCompra
                + ", precioVenta=" + precioVenta + ", stock=" + stock + "]";
    }


    public static int getnProductos() {
        return nProductos;
    }


    public static void setnProductos(int nProductos) {
        Articulo.nProductos = nProductos;
    }
}
