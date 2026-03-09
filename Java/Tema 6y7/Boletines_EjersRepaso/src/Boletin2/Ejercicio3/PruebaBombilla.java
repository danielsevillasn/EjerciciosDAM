package Boletin2.Ejercicio3;

public class PruebaBombilla {
    public static void main(String[] args) {
        // 1. Creamos el objeto bombilla
        Bombilla miBombilla = new Bombilla();
        
        // 2. Mostramos estado inicial
        System.out.println("Al inicio: " + miBombilla);

        // 3. Encendemos la bombilla
        System.out.println("\n--- Pulsando interruptor (ON) ---");
        miBombilla.on();
        System.out.println(miBombilla);

        // 4. Verificamos con un condicional (usando el método getter)
        if (miBombilla.estaEncendida()) {
            System.out.println("\n¡Cuidado, no la toques que quema!");
        }

        // 5. Apagamos la bombilla
        System.out.println("\n--- Pulsando interruptor (OFF) ---");
        miBombilla.off();
        System.out.println("Estado final: " + miBombilla);
    }
}
