package com.example.modeloexamensixnations;

public class Jugador implements Comparable<Jugador>{
    private String nombre;
    private String valoracion;
    private String nacionalidad;
    private int foto;

    public Jugador() {}

    public Jugador(String nombre, String valoracion, String nacionalidad, int foto) {
        this.nombre = nombre;
        this.valoracion = valoracion;
        this.nacionalidad = nacionalidad;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    @Override
    public int compareTo(Jugador o) {
        int valoracion1 = Integer.parseInt(this.getValoracion().toString());
        int valoracion2 = Integer.parseInt(o.getValoracion().toString());
        return Integer.compare(valoracion1, valoracion2);
    }
}
