package Ejercicio12;

public class Libro extends Publicacion implements Prestable{
    private boolean prestado;

    public Libro(){
        super();
        prestado = false;
    }

    public Libro(String iSBN, String titulo, int añoPublicacion) {
        super(iSBN, titulo, añoPublicacion);
    }

    public void presta(){
        prestado = true;
    }
    public boolean estaPrestado(){
        if(!prestado){
            System.out.println("Este libro no esta prestado");
        }
        return prestado;
    }
    public void devuelve(){
        prestado = false;
    }
    @Override
    public String toString() {
        return super.toString()+" prestado: "+prestado;
    }
}
