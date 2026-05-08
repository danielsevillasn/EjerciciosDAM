package BlackJack.src.Clases;
public class Crupier extends Jugador{

    //Constructor
    public Crupier() {//Por defecto
        super("Crupier", 0);
    }

    /**
     * El crupier debe pedir o no
     * @return true/false si el crupier tiene que pedir o no
     */
    public boolean siguePidiendo() {
        if (puntuacion() < 17) {
            return true;
        }
        return false;
    }

    @Override
    public void apostar() {
        System.out.println("El crupier no puede apostar.");
    }

    /**
     * Muestra su mano
     */
    public void muestraCarta() {
        System.out.println("La primera carta del Crupier es: " + getMano().get(0));
        System.out.println("La segunda sin embargo todavía no la sabes.");
    }
}
