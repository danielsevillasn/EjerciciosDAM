package Ejercicio1AL16_Profe.metodos;

import Ejercicio1AL16_Profe.datos.Herramientas;

public class SolEjer15 {
    public static void Caso15(int numero, int otroNumero){
        numero = Herramientas.entero("Introduce un número: ");
        do {
            otroNumero = Herramientas.entero("Introduce otro número: ");
            if (otroNumero < numero) {
                System.out.println("Debes introducir un número mayor a " + numero);
            }
        } while (otroNumero < numero);

        System.out.println("Los número primos entre " + numero + " y " + otroNumero + " son ");
        Ejer.primosEntre(numero, otroNumero);
    }

}
