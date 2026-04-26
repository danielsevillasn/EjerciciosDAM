package Ejercicio5;

public class Tarea {
    private String descripcion;
    private int prioridad;
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    public Tarea(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }
    @Override
    public String toString() {
        return "Tarea [descripcion=" + descripcion + ", prioridad=" + prioridad + "]\n";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
        result = prime * result + prioridad;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarea other = (Tarea) obj;
        if (descripcion == null) {
            if (other.descripcion != null)
                return false;
        } else if (!descripcion.equals(other.descripcion))
            return false;
        return true;
    }

    
}
