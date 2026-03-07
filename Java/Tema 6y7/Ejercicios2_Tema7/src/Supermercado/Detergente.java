package Supermercado;

public class Detergente implements ConDescuento, EsLiquido{
    private String marca;
    private double precio;
    private double descuento;
    private String tipoEnvase;
    private double volumen;

    public Detergente(String marca, double precio) {
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

    public void setDescuento(double des) {
        descuento = des;
    }

    public void setTipoEnvase(String env) {
        tipoEnvase = env;
    }

    public void setVolumen(double v) {
        volumen = v;
    }

    public double getDescuento() {
        return descuento;
    }

    public String getTipoEnvase() {
        return tipoEnvase;
    }

    public double getVolumen() {
        return volumen;
    }
    
    public double getPrecioDescuento(){
        return precio-precio*(descuento/100);
    }

    @Override
    public String toString() {
        return "Detergente [marca=" + marca + ", precio=" + precio + ", descuento=" + descuento + ", tipoEnvase="
                + tipoEnvase + ", volumen=" + volumen + "]";
    }
}
