package Ejercicios1;

import java.util.ArrayList;
import java.util.Collections;

import Ejercicios1.Ejercicio12.Carta;

public class Ejercicio9 {
    public static void main(String[] args) {
        ArrayList<Carta> cartas = new ArrayList<Carta>();

        cartas.add(new Carta());

        while (cartas.size() < 10) {
            Carta cartaAux = new Carta();
            if (!cartas.contains(cartaAux)) {
                cartas.add(cartaAux);
            }
        }

        Collections.sort(cartas);

        for (Carta c : cartas) {
            System.out.println(c);
        }
    }
}
