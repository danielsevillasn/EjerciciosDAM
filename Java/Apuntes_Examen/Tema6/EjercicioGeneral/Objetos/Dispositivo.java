package Tema6.EjercicioGeneral.Objetos;
import Tema6.EjercicioGeneral.Enum.*;
import Tema6.EjercicioGeneral.Interfaces.*;

public abstract class Dispositivo implements Smart {
    protected static int totalDispositivos = 0; // (h) Miembro estático
    protected final int id; // (f) Final: no cambia tras asignarse
    protected String marca;
    protected double precioBase;
    protected Estado estadoActual; // Uso del ENUM

    public Dispositivo(String marca, double precioBase, Estado estado) {
        this.id = ++totalDispositivos;
        this.marca = marca;
        this.precioBase = precioBase;
        this.estadoActual = estado;
    }

    public static int getTotalDispositivos() {
        return totalDispositivos;
    }

    // (6-1 PDF) CONSTRUCTOR DE COPIA: Alternativa a clone()
    public Dispositivo(Dispositivo otro) {
        this.id = ++totalDispositivos; // Nuevo ID para el clon
        this.marca = otro.marca;
        this.precioBase = otro.precioBase;
        this.estadoActual = otro.estadoActual;
    }

    // Método abstracto: Obliga a las hijas a implementarlo
    public abstract double calcularPrecioFinal();

    @Override
    public String toString() {
        return "ID " + id + ": " + marca + " (" + estadoActual + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Dispositivo)) return false;
        Dispositivo d = (Dispositivo) obj;
        return this.marca.equals(d.marca) && this.estadoActual == d.estadoActual;
    }
}