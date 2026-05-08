package SevillaNavarreteDaniel.Clases;

import java.util.HashMap;

import SevillaNavarreteDaniel.Enum.PalosBarEspa;
import SevillaNavarreteDaniel.Enum.PalosBarFran;

/**
 * Objeto genérico carta
 * 
 * @author Dani S
 */
public class Carta<T> implements Comparable<Carta<T>> {
    // Atributos/////////////////////
    private int nCarta;
    private T palo;
    private HashMap<Integer, String> figuraEspa;
    private HashMap<Integer, String> figuraFran;

    // Metodos////////////////////////

    // Constructor por defecto

    // Constructor para instanciar objeto con dos parametros
    public Carta(int nCarta, T palo) {
        this.nCarta = nCarta;
        this.palo = palo;

        crearFigurasEspañola();

        crearFigurasFrancesa();

    }

    // Getter
    public int getnCarta() {
        return nCarta;
    }

    public T getPalo() {
        return palo;
    }

    // Setter
    public void setnCarta(int nCarta) {
        this.nCarta = nCarta;
    }

    public void setPalo(T palo) {
        this.palo = palo;
    }

    // Otros metodos

    /**
     * Inicializa el hash map figuraEspa
     */
    public void crearFigurasEspañola() {
        figuraEspa = new HashMap<>();
        figuraEspa.put(1, "As");
        figuraEspa.put(2, "2");
        figuraEspa.put(3, "3");
        figuraEspa.put(4, "4");
        figuraEspa.put(5, "5");
        figuraEspa.put(6, "6");
        figuraEspa.put(7, "7");
        figuraEspa.put(8, "8");
        figuraEspa.put(9, "9");
        figuraEspa.put(10, "Sota");
        figuraEspa.put(11, "Caballo");
        figuraEspa.put(12, "Rey");
    }

    /**
     * Inicializa el hash map figuraFran
     */
    public void crearFigurasFrancesa() {
        figuraFran = new HashMap<>();
        figuraFran.put(1, "As");
        figuraFran.put(2, "2");
        figuraFran.put(3, "3");
        figuraFran.put(4, "4");
        figuraFran.put(5, "5");
        figuraFran.put(6, "6");
        figuraFran.put(7, "7");
        figuraFran.put(8, "8");
        figuraFran.put(9, "9");
        figuraFran.put(10, "J");
        figuraFran.put(11, "Q");
        figuraFran.put(12, "K");
    }

    // toString
    @Override
    public String toString() {
        if (palo instanceof PalosBarEspa) {
            return figuraEspa.get(nCarta) + "\t de " + palo;
        } else if (palo instanceof PalosBarFran) {

            PalosBarFran paloFran = (PalosBarFran) palo;
            String RESET = "\u001B[0m";
            String ROJO = "\u001B[31m";

            if (paloFran == PalosBarFran.CORAZONES || paloFran == PalosBarFran.DIAMANTES) {
                return ROJO + figuraFran.get(nCarta) + "\t de " + palo + RESET;
            } else {
                return figuraFran.get(nCarta) + "\t de " + palo;
            }
        } else {
            return "No existe este tipo de carta";
        }
    }

    // HashCode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + nCarta;
        result = prime * result + ((palo == null) ? 0 : palo.hashCode());
        result = prime * result + ((figuraEspa == null) ? 0 : figuraEspa.hashCode());
        result = prime * result + ((figuraFran == null) ? 0 : figuraFran.hashCode());
        return result;
    }

    // Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Carta other = (Carta) obj;
        if (nCarta != other.nCarta)
            return false;
        if (palo == null) {
            if (other.palo != null)
                return false;
        } else if (!palo.equals(other.palo))
            return false;
        if (figuraEspa == null) {
            if (other.figuraEspa != null)
                return false;
        } else if (!figuraEspa.equals(other.figuraEspa))
            return false;
        if (figuraFran == null) {
            if (other.figuraFran != null)
                return false;
        } else if (!figuraFran.equals(other.figuraFran))
            return false;
        return true;
    }

    // Compare to
    @Override
    public int compareTo(Carta<T> o) {
        int comparaPalo = palo.toString().compareTo(o.palo.toString());
        if (comparaPalo == 0) {
            return nCarta - o.nCarta;
        } else {
            return comparaPalo;
        }
    }
}
