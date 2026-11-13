package com.example.modeloexamenastronomia;

import java.util.Comparator;

public class Planeta{
    private String nombre;
    private long distancia;
    private double diametro;

    public Planeta(String nombre, long distancia, double diametro) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.diametro = diametro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDistancia() {
        return distancia;
    }

    public void setDistancia(long distancia) {
        this.distancia = distancia;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    // COMPARADORES ESTATICOS

    public static Comparator<Planeta> compararDistancia = new Comparator<Planeta>() {
        @Override
        public int compare(Planeta o1, Planeta o2) {
            return Long.compare(o1.getDistancia(), o2.getDistancia());
        }
    };

    public static Comparator<Planeta> compararDiametro = new Comparator<Planeta>() {
        @Override
        public int compare(Planeta o1, Planeta o2) {
            return Double.compare(o1.getDiametro(), o2.getDiametro());
        }
    };

    public static Comparator<Planeta> compararNombre = new Comparator<Planeta>() {
        @Override
        public int compare(Planeta o1, Planeta o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    };
}
