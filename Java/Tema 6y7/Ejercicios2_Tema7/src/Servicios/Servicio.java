package Servicios;

import java.time.LocalDate;

public abstract class Servicio {
    private String trabajador;
    protected LocalDate FechaInicio;
    private String cliente;
    
    public Servicio(String trabajador, LocalDate fechaInicio, String cliente) {
        this.trabajador = trabajador;
        FechaInicio = fechaInicio;
        this.cliente = cliente;
    }

    public String getTrabajador() {
        return trabajador;
    }

    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    abstract double costeMaterial();
    abstract double costeManoObra();
    abstract double costeTotal();
    abstract String detalleServicio();
}
