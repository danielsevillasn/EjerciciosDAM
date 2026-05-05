package Ejercicio3;

public final class CazaEstelar extends Nave implements ICombate{
    private String modelo;

    public CazaEstelar(String nombre, int combustible, String modelo) {
        super(nombre, combustible);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void desplazarse(){
        System.out.println("El caza realiza maniobras evasivas a gran velocidad");
    }
    @Override
    public void atacar(){
        System.out.println("El caza estelar"+getModelo()+" ataca!");
    }
    @Override
    public void activarEscudos(){
        System.out.println("El caza estelar"+getModelo()+" activa escudos!");
    }
    @Override
    public String toString() {
        return "CazaEstelar [modelo=" + modelo + ", toString()=" + super.toString() + "]";
    }
    
}
