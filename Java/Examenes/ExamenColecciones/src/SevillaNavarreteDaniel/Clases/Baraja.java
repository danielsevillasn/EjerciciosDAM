package SevillaNavarreteDaniel.Clases;

import java.util.ArrayList;
import java.util.Collections;

import SevillaNavarreteDaniel.Secundaria.Entrada;

/**
 * Objeto abstracto baraja
 * 
 * @author Dani S
 */
public abstract class Baraja {
    // Atributos/////////////////////
    ArrayList<Carta<?>> cartasBaraja;
    ArrayList<Carta<?>> cartasMesa;
    ArrayList<Carta<?>> cartasDadas;
    private int numCartas;
    private int cartasPorPalo;

    // Metodos////////////////////////

    // Constructor por defecto
    public Baraja() {
        numCartas = 0;
        cartasPorPalo = 0;
        cartasMesa = new ArrayList<>();
        cartasDadas = new ArrayList<>();
    }

    // Getter
    public ArrayList<Carta<?>> getCartasBaraja() {
        return cartasBaraja;
    }

    public ArrayList<Carta<?>> getCartasMesa() {
        return cartasMesa;
    }

    public ArrayList<Carta<?>> getCartasDadas() {
        return cartasDadas;
    }

    public int getNumCartas() {
        return numCartas;
    }

    public int getCartasPorPalo() {
        return cartasPorPalo;
    }

    // Setter
    public void setCartasBaraja(ArrayList<Carta<?>> cartasBaraja) {
        this.cartasBaraja = cartasBaraja;
    }

    public void setCartasMesa(ArrayList<Carta<?>> cartasMesa) {
        this.cartasMesa = cartasMesa;
    }

    public void setCartasDadas(ArrayList<Carta<?>> cartasDadas) {
        this.cartasDadas = cartasDadas;
    }

    public void setNumCartas(int numCartas) {
        this.numCartas = numCartas;
    }

    public void setCartasPorPalo(int cartasPorPalo) {
        this.cartasPorPalo = cartasPorPalo;
    }

    // Otros metodos
    /**
     * Baraja las cartas con el metodo de shuffle de Collections
     * 
     */
    public void barajar() {
        Collections.shuffle(cartasBaraja);
    }

    /**
     * Lanzar un determinado numero de cartas a la mesa para
     * 
     */
    public void darCartaMesa() {
        int nCartasMesa = 0;
        cartasMesa.clear();
        barajar();
        nCartasMesa = Entrada.pedirEntero("¿Cuantas cartas quieres poner en mesa?: ");
        if (cartasBaraja.size() < nCartasMesa) {
            System.out.println("No hay tantas cartas en la baraja");
        } else {
            for(int i = 0;i<nCartasMesa;i++){
                cartasMesa.add(cartasBaraja.get(i));
                cartasDadas.add(cartasBaraja.get(i));
                cartasBaraja.remove(i);
            }
            numCartas = numCartas - nCartasMesa;

        }
    }

    /**
     * Mostrar cartas de cualquier baraja
     * 
     * @param Baraja tipo de baraja a mostrar
     * 
     */
    public void mostrarCartas(String Baraja) {
        if (Baraja.equals("cartasBaraja")) {
            Collections.sort(cartasBaraja);
            System.out.println("\n Cartas en la baraja "+numCartas+": ");
            for (Carta<?> c : cartasBaraja) {
                System.out.println(c);
            }
        } else if (Baraja.equals("cartasDadas")) {
            Collections.sort(cartasDadas);
            System.out.println("\nCartas lanzadas: ");
            for (Carta<?> c : cartasDadas) {
                System.out.println(c);
            }
        } else if (Baraja.equals("cartasMesa")) {
            Collections.sort(cartasMesa);
            System.out.println("\nCartas en la mesa: ");
            for (Carta<?> c : cartasMesa) {
                System.out.println(c);
            }
        } else {
            System.out.println("Esa baraja no existe");
        }
    }

    /**
     * Inicializa la baraja de cartas
     */
    abstract void crearBaraja();

}
