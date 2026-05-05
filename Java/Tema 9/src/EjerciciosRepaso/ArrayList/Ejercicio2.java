package EjerciciosRepaso.ArrayList;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();

        palabras.add("Pepe");
        palabras.add("Juan");
        palabras.add("Maria");
        palabras.add("Tonto");
        palabras.add("Listo");
        palabras.add("Luis");
        palabras.add("Pablo");
        palabras.add("Ramon");

        System.out.println(palabras);

        palabras.removeIf(filto -> filto.contains("a"));

        System.out.println(palabras);

    }
}
