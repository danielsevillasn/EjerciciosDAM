package Clases;
import java.util.ArrayList;

public abstract class Jugador {

    //Atributos
    private String nombre;
    private int dinero;
    private ArrayList<Carta> mano;

    //Constructor
    public Jugador() {//Por defecto
        this.nombre = "";
        this.dinero = 0;
        this.mano = new ArrayList<Carta>();
    }

    public Jugador(String nombre, int dinero) {//Con parametros
        this.nombre = nombre;
        this.dinero = dinero;
        this.mano = new ArrayList<Carta>();
    }

    //Métodos modificadores/observadores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }

    /**
     * Apuesta dinero
     */
    public abstract void apostar();

    /**
     * Calcula la puntuación del jugador
     * 
     * @return total puntuación total del jugador
     */
    public int puntuacion() {
        int total = 0;
        int cantidadAs = 0;
        for (Carta carta : mano) {
            total += carta.getValor();
            if (carta.getFigura().equals("as")) {
                cantidadAs++;
            }
        }

        while (total > 21 && cantidadAs > 0) {
            total -= 10;
            cantidadAs--;
        }

        return total;
    }
}
