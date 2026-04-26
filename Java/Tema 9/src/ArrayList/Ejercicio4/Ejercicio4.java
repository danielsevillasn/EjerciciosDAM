package Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

        alumnos.add(new Alumno("Pepe", 5.0));
        alumnos.add(new Alumno("Juan", 9.0));
        alumnos.add(new Alumno("Mario", 4.0));
        alumnos.add(new Alumno("Dani", 2.0));
        alumnos.add(new Alumno("Jorge", 10.0));

        ArrayList<Alumno> cuadroDeHonor = new ArrayList<Alumno>();

        for (Alumno a : alumnos) {
            if (a.getNotaMedia() >= 9) {
                cuadroDeHonor.add(a);
            }
        }

        System.out.println(alumnos);

        System.out.println(cuadroDeHonor);

        System.out.println("\nListas ordenadas:");

        Collections.sort(alumnos);
        Collections.sort(cuadroDeHonor);

        System.out.println(cuadroDeHonor);

        System.out.println(alumnos);
    }
}
