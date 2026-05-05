package EjerciciosIntroduccion.ArrayList.Ejercicio1;
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> invitados = new ArrayList<String>();

        invitados.add("Pepe");
        invitados.add("Marta");
        invitados.add("Luis");
        invitados.add("Ana");

        System.out.println("El tamaño de invitados es de: "+invitados.size());

        invitados.remove("Marta");

        invitados.add(0, "Rey");

        System.out.println(invitados);
    }
}
