package Ejercicio4;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private Double notaMedia;
    public Alumno(String nombre, Double notaMedia) {
        this.nombre = nombre;
        this.notaMedia = notaMedia;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getNotaMedia() {
        return notaMedia;
    }
    public void setNotaMedia(Double notaMedia) {
        this.notaMedia = notaMedia;
    }
    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", notaMedia=" + notaMedia + "]\n";
    }

    @Override
    public int compareTo(Alumno o) {
        return Double.compare(this.notaMedia, o.getNotaMedia());
    }
}
