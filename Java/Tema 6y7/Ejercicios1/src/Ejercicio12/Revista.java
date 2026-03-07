package Ejercicio12;

public class Revista extends Publicacion{
    private int numero;

    public Revista() {
        this.numero = 0;
    }

    public Revista(String iSBN, String titulo, int añoPublicacion, int numero) {
        super(iSBN, titulo, añoPublicacion);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return super.toString()+" numero: "+numero;
    }

    
}
