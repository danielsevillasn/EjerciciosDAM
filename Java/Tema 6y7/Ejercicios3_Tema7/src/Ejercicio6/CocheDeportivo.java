package Ejercicio6;

public class CocheDeportivo extends Coche{
    boolean descapotable;

    public CocheDeportivo(String marca, String modelo, int numeroPuertas, boolean descapotable) {
        super(marca, modelo, numeroPuertas);
        this.descapotable = descapotable;
    }

    @Override
    public String toString() {
        return super.toString()+"CocheDeportivo [descapotable=" + descapotable + "]";
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }
}
