package EjerciciosRepaso.Genericos.Ejercicio10;

import java.util.ArrayList;

public class Ejercicio10 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> palabras = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        palabras.add("a");
        palabras.add("b");
        palabras.add("c");

        System.out.println(UtilidadesColecciones.obtenerUltimoElemento(numeros));
        System.out.println(UtilidadesColecciones.obtenerUltimoElemento(palabras));
    }
}
