package EjerciciosTema.Ejercicio17y18;

public class Elemento {
    private String nombreProducto;
    private Double precioProducto;
    private int cantidadProducto;
    public Elemento(String nombreProducto, Double precioProducto, int cantidadProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidadProducto = cantidadProducto;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public Double getPrecioProducto() {
        return precioProducto;
    }
    @Override
    public String toString() {
        return nombreProducto + ": "+ precioProducto+" Unidades: "+ cantidadProducto+" Subtotal: "+(precioProducto*cantidadProducto)+"\n";
    }
    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }
    public int getCantidadProducto() {
        return cantidadProducto;
    }
    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
}
