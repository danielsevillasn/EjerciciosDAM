public class ActividadDirigida extends Actividades implements Precios {
    private int asistentes;

    public ActividadDirigida(String nombre, int cuotaBase, int asistentes) {
        super(nombre, cuotaBase);
        this.asistentes = asistentes;
    }

    @Override
    public String toString() {
        return super.toString() + " ActividadDirigida [asistentes=" + asistentes + "]";
    }

    public int calcularPrecioTotal() {
        int precioTotal = cuotaBase;
        if (asistentes > 20) {
            precioTotal += 30;
        }
        return precioTotal;
    }

    public void imprimirPrecioTotal() {
        System.out.println("El precio total de la actividad dirigida \"" + super.nombre + "\" es: " + calcularPrecioTotal());
    }

}
