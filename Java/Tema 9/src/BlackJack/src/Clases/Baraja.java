package BlackJack.src.Clases;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Baraja {

    //Atributos
    private ArrayList<Carta> baraja;

    //Constructor
    public Baraja() {
        this.baraja = new ArrayList<Carta>();
        for (Palo palo : Palo.values()) {
            for (int i = 0; i < 13; i++) {
                baraja.add(new Carta(palo, i));
            }
        }
    }

    /**
     * "Baraja" el array de baraja
     */
    public void barajar() {
        Collections.shuffle(baraja);
    }

    /**
     * Reparte una carta al jugador
     * 
     * @return elegida Carta elegida de la baraja
     */
    public Carta repateCarta() {
        Iterator<Carta> alc = baraja.iterator();
        Carta elegida = alc.next();
        alc.remove();

        return elegida;
    }
}
