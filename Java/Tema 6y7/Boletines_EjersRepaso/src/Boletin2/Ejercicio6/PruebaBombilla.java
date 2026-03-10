package Boletin2.Ejercicio6;

public class PruebaBombilla {
    public static void main(String[] args) {
        Bombilla.interruptorGeneral = true; // Hay luz en la casa
        
        Bombilla b1 = new Bombilla(true); // Encendida
        System.out.println("Estado inicial: " + b1); // Muestra true
        
        // Saltan los fusibles
        Bombilla.interruptorGeneral = false;
        System.out.println("Apagón general: " + b1); // Muestra false
        
        // Se arreglan los fusibles
        Bombilla.interruptorGeneral = true;
        System.out.println("Luz restaurada: " + b1); // ¡Vuelve a mostrar true!
    }
}