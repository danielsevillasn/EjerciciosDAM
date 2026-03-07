package Supermercado;

import java.time.LocalDate;

public class Vino implements ConDescuento, EsLiquido, EsAlimento{
    private String marca;
    private double precio;
    private String tipoVino;
    private int gradoAlcohol;
    private LocalDate caducidad;
    private double descuento;
    private String tipoEnvase;
    private double volumen;
    
    public Vino(String marca, double precio, String tipoVino, int gradoAlcohol) {
        this.marca = marca;
        this.precio = precio;
        this.tipoVino = tipoVino;
        this.gradoAlcohol = gradoAlcohol;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoVino() {
        return tipoVino;
    }

    public void setTipoVino(String tipoVino) {
        this.tipoVino = tipoVino;
    }

    public int getGradoAlcohol() {
        return gradoAlcohol;
    }

    public void setGradoAlcohol(int gradoAlcohol) {
        this.gradoAlcohol = gradoAlcohol;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getTipoEnvase() {
        return tipoEnvase;
    }

    public void setTipoEnvase(String tipoEnvase) {
        this.tipoEnvase = tipoEnvase;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getCalorias(){
        return gradoAlcohol*10;
    }

    public double getPrecioDescuento(){
        return precio-precio*(descuento/100);
    }

    @Override
    public String toString() {
        return "Vino [marca=" + marca + ", precio=" + precio + ", tipoVino=" + tipoVino + ", gradoAlcohol="
                + gradoAlcohol + ", caducidad=" + caducidad + ", descuento=" + descuento + ", tipoEnvase=" + tipoEnvase
                + ", volumen=" + volumen + ", getCalorias()=" + getCalorias() + ", getPrecioDescuento()="
                + getPrecioDescuento() + "]";
    }
    
}
