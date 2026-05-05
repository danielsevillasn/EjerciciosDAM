package EjerciciosTema;

import java.util.ArrayList;

import EjerciciosTema.Ejercicio12.Carta;

public class Ejercicio8 {
    public static void main(String[] args) {
        ArrayList<Carta> cartas = new ArrayList<Carta>();

        cartas.add(new Carta());

        while (cartas.size() < 10) {
            Carta cartaAux = new Carta();
            if (!cartas.contains(cartaAux)) {
                cartas.add(cartaAux);
            }
        }

        for (Carta c : cartas) {
            System.out.println(c);
        }
    }
}
