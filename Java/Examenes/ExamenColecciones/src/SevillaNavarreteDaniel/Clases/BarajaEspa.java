package SevillaNavarreteDaniel.Clases;

import java.util.ArrayList;

import SevillaNavarreteDaniel.Enum.PalosBarEspa;

/**
 * Objeto baraja española
 * 
 * @author Dani S
 */
public class BarajaEspa extends Baraja {
    // Atributos/////////////////////
    private boolean incluye_8_9;

    // Metodos////////////////////////

    // Constructor para instanciar objeto con un parametro
    public BarajaEspa(boolean incluye_8_9) {
        super();
        
        this.incluye_8_9 = incluye_8_9;
        if (incluye_8_9) {
            setNumCartas(48);
            setCartasPorPalo(12);
        } else {
            setNumCartas(40);
            setCartasPorPalo(10);
        }

        cartasBaraja = new ArrayList<>();

        crearBaraja();
    }

    // Getter
    public boolean isIncluye_8_9() {
        return incluye_8_9;
    }

    // Setter
    public void setIncluye_8_9(boolean incluye_8_9) {
        this.incluye_8_9 = incluye_8_9;
    }

    // Otros metodos
    /**
     * Inicializa la baraja de cartas española
     */
    public void crearBaraja() {
        if(incluye_8_9){
            for (int j = 0; j < 4; j++) {
                for (int k = 1; k <= 12; k++) {
                    cartasBaraja.add(new Carta<PalosBarEspa>(k, PalosBarEspa.values()[j]));
                }
            }
        }else{
            for (int j = 0; j < 4; j++) {
                for (int k = 1; k <= 10; k++) {
                    if(!(k == 8 || k == 9 || k == 10)){
                        cartasBaraja.add(new Carta<PalosBarEspa>(k, PalosBarEspa.values()[j]));
                    }
                    else if (k == 8){
                        cartasBaraja.add(new Carta<PalosBarEspa>(10, PalosBarEspa.values()[j]));
                    } else if (k == 9){
                        cartasBaraja.add(new Carta<PalosBarEspa>(11, PalosBarEspa.values()[j]));
                    } else{
                        cartasBaraja.add(new Carta<PalosBarEspa>(12, PalosBarEspa.values()[j]));
                    }
                }
            }
        }
    }
}
