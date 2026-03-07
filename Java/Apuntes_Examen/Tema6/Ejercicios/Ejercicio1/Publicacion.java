public abstract class Publicacion {
    private String titulo;
    private int añoPublicacion;
    public Publicacion(String titulo, int añoPublicacion){
        this.titulo=titulo;
        this.añoPublicacion = añoPublicacion;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDetalles(){
        return "Titulo: "+titulo+" ; Año: "+añoPublicacion;
    }

    public abstract double calcularPrecioAlquiler();

    public String toString(){
        return "El titulo es: "+titulo+" , se publico en el año: "+añoPublicacion;
    }
}
