public class PruebaBombilla1 {
    public static void main(String[] args) {
        Bombilla1.interruptorGeneral = true; // Hay luz en la casa
        
        Bombilla1 b1 = new Bombilla1(true); // Encendida
        System.out.println("Estado inicial: " + b1); // Muestra true
        
        // Saltan los fusibles
        Bombilla1.interruptorGeneral = false;
        System.out.println("Apagón general: " + b1); // Muestra false
        
        // Se arreglan los fusibles
        Bombilla1.interruptorGeneral = true;
        System.out.println("Luz restaurada: " + b1); // ¡Vuelve a mostrar true!
    }
}