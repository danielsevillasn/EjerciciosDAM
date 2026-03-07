public class Revista extends Publicacion {
    private int numeroEdicion;

    public Revista(String titulo, int añoPublicacion, int numeroEdicion) {
        super(titulo, añoPublicacion);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public String getDetalles() {
        return super.getDetalles() + "- " + numeroEdicion;
    }

    @Override
    public double calcularPrecioAlquiler() {
        return 3;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }


}
