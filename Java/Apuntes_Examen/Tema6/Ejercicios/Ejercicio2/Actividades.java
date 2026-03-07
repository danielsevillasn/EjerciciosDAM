public abstract class Actividades {
    protected String nombre;
    protected int cuotaBase;
    
    public Actividades(String nombre, int cuotaBase) {
        this.nombre = nombre;
        this.cuotaBase = cuotaBase;
    }

    @Override
    public String toString() {
        return "Actividades [nombre=" + nombre + ", cuotaBase=" + cuotaBase + "]";
    }

    abstract int calcularPrecioTotal();
}
