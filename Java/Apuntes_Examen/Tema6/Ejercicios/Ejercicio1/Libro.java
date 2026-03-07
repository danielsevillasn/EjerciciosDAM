public class Libro extends Publicacion {
    private int numPaginas;

    public Libro(String titulo, int añoPublicacion, int numPaginas) {
        super(titulo, añoPublicacion);
        this.numPaginas = numPaginas;
    }

    @Override
    public String getDetalles() {
        return super.getDetalles() + "- " + numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    @Override
    public double calcularPrecioAlquiler() {
        return numPaginas * 0.05;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Libro){
            Libro otro = (Libro) o;
            if(otro.getTitulo().equals(getTitulo()) && otro.getNumPaginas() == getNumPaginas()){
                return true;
            }
            return false;
        }else{
            return false;
        }
    }
}
