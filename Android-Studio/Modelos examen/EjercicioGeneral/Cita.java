package com.example.sistemadecitas;
import java.io.Serializable;
public class Cita implements Serializable {
    private String nombreMascota;
    private String especie;
    private String fecha;
    private String hora;
    private boolean esUrgencia;
    private String telefono;
    private int iconoResId;
    public Cita(String nombreMascota, String especie, String fecha, String hora,
                boolean esUrgencia, String telefono, int iconoResId) {
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.fecha = fecha;
        this.hora = hora;
        this.esUrgencia = esUrgencia;
        this.telefono = telefono;
        this.iconoResId = iconoResId;
    }
    public String getNombreMascota() { return nombreMascota; }
    public String getEspecie() { return especie; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public boolean isEsUrgencia() { return esUrgencia; }
    public String getTelefono() { return telefono; }
    public int getIconoResId() { return iconoResId; }
}