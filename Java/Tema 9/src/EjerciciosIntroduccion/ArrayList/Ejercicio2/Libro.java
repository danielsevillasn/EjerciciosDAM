package EjerciciosIntroduccion.ArrayList.Ejercicio2;

public class Libro {
    private String titulo;
    private int paginas;

    public Libro(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getPaginas() {
        return paginas;
    }
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", paginas=" + paginas + "]";
    }
}
