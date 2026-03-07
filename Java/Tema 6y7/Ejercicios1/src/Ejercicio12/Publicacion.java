package Ejercicio12;
public class Publicacion {
    private String ISBN;
    private String titulo;
    private int añoPublicacion;

    public Publicacion(){
        ISBN = "";
        titulo = "";
        añoPublicacion = 0;
    }

    public Publicacion(String iSBN, String titulo, int añoPublicacion) {
        ISBN = iSBN;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    @Override
    public String toString() {
        return "ISBN=" + ISBN + ", titulo=" + titulo + ", añoPublicacion=" + añoPublicacion;
    }
}

