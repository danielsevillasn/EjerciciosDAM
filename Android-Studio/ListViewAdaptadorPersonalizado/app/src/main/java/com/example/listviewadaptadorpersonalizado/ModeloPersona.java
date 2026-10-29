package com.example.listviewadaptadorpersonalizado;

import java.io.Serializable;

/**
 * Objeto persona que almacena la informacion de cada persona
 */
public class ModeloPersona implements Serializable { //IMPORTANTE, si quiero emplear el objeto entero cuando empleo el bundle es importante hacer que el objeto sea serializable
    private String nombre;
    private String descripcion;
    private int codigo;
    private int foto;

    public ModeloPersona(String descripcion, String nombre, int codigo, int foto) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.codigo = codigo;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getFoto() {
        return foto;
    }
}
