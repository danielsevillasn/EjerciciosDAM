package Supermercado;

import java.time.LocalDate;

public class Cereales implements EsAlimento{
    private String marca;
    private double precio;
    private String tipoCereal;
    private LocalDate caducidad;
    
    public Cereales(String marca, double precio, String tipoCereal) {
        this.marca = marca;
        this.precio = precio;
        this.tipoCereal = tipoCereal;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipoCereal() {
        return tipoCereal;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public int getCalorias() {
        if(tipoCereal.equalsIgnoreCase("espelta")){
            return 5;
        }else if(tipoCereal.equalsIgnoreCase("maíz")){
            return 8;
        }else if(tipoCereal.equalsIgnoreCase("trigo")){
            return 12;
        }else{
            return 15;
        }
    }

    @Override
    public String toString() {
        return "Cereales [marca=" + marca + ", precio=" + precio + ", tipoCereal=" + tipoCereal + ", caducidad="
                + caducidad + ", calorias=" + getCalorias() + "]";
    }

    
}
