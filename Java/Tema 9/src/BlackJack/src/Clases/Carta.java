package Clases;
import java.util.HashMap;

import Enumerador.Palo;

public class Carta {

    // Atributos
    private Palo palo;
    private static String[] num = { "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "as",
            "J", "Q", "K" };
    private static final HashMap<String, Integer> VALOR = new HashMap<String, Integer>();
    private Integer numero;

    // Constructor
    public Carta(Palo palo, int n) {// Por defecto
        generaValor();
        this.palo = palo;
        this.numero = n;
    }

    // Métodos modificadores/observadores
    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public String getFigura() {
        return num[numero];
    }

    public int getValor() {
        return VALOR.get(getFigura());
    }

    public static String[] getNum() {
        return num;
    }

    public static void setNum(String[] num) {
        Carta.num = num;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * Elige el palo para la carta
     */
    public void eligePalo() {
        int opcion = (int) (Math.random() * (4 - 1 + 1) + 1);

        switch (opcion) {
            case 1:
                palo = Palo.PICAS;
                break;
            case 2:
                palo = Palo.TREBOLES;
                break;
            case 3:
                palo = Palo.CORAZONES;
                break;
            case 4:
                palo = Palo.DIAMANTES;
                break;
        }
    }

    /**
     * Genera el valor de cada carta
     */
    public static void generaValor() {
        VALOR.put("as", 11);
        VALOR.put("dos", 2);
        VALOR.put("tres", 3);
        VALOR.put("cuatro", 4);
        VALOR.put("cinco", 5);
        VALOR.put("seis", 6);
        VALOR.put("siete", 7);
        VALOR.put("ocho", 8);
        VALOR.put("nueve", 9);
        VALOR.put("diez", 10);
        VALOR.put("J", 10);
        VALOR.put("Q", 10);
        VALOR.put("K", 10);
    }

    @Override
    public String toString() {
        return getFigura() + " de " + getPalo();
    }
}
