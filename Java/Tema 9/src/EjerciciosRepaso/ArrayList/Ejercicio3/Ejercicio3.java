package EjerciciosRepaso.ArrayList.Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Gato> gatos = new ArrayList<>();

        gatos.add(new Gato("Alba","rojo","normal"));
        gatos.add(new Gato("Bera","amarillo","rara"));
        gatos.add(new Gato("Pepe","marron","normal"));
        gatos.add(new Gato("Pera","blanca","normal"));
        gatos.add(new Gato("Juana","naranja","rara"));

        System.out.println(gatos);

        Collections.sort(gatos);

        System.out.println(gatos);
    }
}
