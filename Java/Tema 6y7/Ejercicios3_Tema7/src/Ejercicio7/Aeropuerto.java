public abstract class Aeropuerto {
    private int id;
    private static int idIncrementado;
    private String nombre;
    private int añoInauguracion;
    private int capacidad;

    public Aeropuerto() {
        id = idIncrementado++;
        añoInauguracion = 0;
        nombre = "";
        capacidad = 0;
    }

    public Aeropuerto(String nombre, int añoInauguracion, int capacidad) {
        id = idIncrementado++;
        this.nombre = nombre;
        this.añoInauguracion = añoInauguracion;
        this.capacidad = capacidad;
    }
    
    public abstract void  gananciasTotales(int cantidad);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdIncrementado() {
        return idIncrementado;
    }

    public static void setIdIncrementado(int idIncrementado) {
        Aeropuerto.idIncrementado = idIncrementado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoInauguracion() {
        return añoInauguracion;
    }

    public void setAñoInauguracion(int añoInauguracion) {
        this.añoInauguracion = añoInauguracion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Aeropuerto [id=" + id + ", nombre=" + nombre + ", añoInauguracion=" + añoInauguracion + ", capacidad="
                + capacidad + "]";
    }

    
}
