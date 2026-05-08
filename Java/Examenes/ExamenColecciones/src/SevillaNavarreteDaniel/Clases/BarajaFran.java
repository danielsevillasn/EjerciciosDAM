package SevillaNavarreteDaniel.Clases;

import java.util.ArrayList;

import SevillaNavarreteDaniel.Enum.PalosBarFran;

/**
 * Objeto baraja francesa
 * 
 * @author Dani S
 */
public class BarajaFran extends Baraja {
    // Metodos////////////////////////

    // Constructor por defecto
    public BarajaFran() {
        super();

        setNumCartas(52);
        setCartasPorPalo(13);

        cartasBaraja = new ArrayList<>();

        crearBaraja();
    }

    // Otros metodos
    /**
     * Inicializa la baraja de cartas francesa
     */
    public void crearBaraja() {
        for (int j = 0; j < 4; j++) {
            for (int k = 1; k <= 12; k++) {
                cartasBaraja.add(new Carta<PalosBarFran>(k, PalosBarFran.values()[j]));
            }
        }
    }
}