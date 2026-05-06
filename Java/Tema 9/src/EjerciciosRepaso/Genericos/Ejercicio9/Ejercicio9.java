package EjerciciosRepaso.Genericos.Ejercicio9;

import java.util.ArrayList;

import EjerciciosRepaso.ArrayList.Ejercicio3.Gato;

public class Ejercicio9 {
    public static void main(String[] args) {
        ArrayList<Registro<String>> registros = new ArrayList<>();
        ArrayList<Registro<Gato>> gatos = new ArrayList<>();

        registros.add(new Registro<String>(1,"Registro1"));
        registros.add(new Registro<String>(2,"Registro2"));

        gatos.add(new Registro<Gato>(1,new Gato("Pepe","naranja","Normal")));
        gatos.add(new Registro<Gato>(2,new Gato("Juan","blanco","rara")));

        System.out.println(registros);

        System.out.println(gatos);
    }
}
