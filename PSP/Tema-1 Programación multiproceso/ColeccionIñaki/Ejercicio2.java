import java.util.Properties;

public class Ejercicio2 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int nucleos = runtime.availableProcessors();
        
        long memoriaLibreMb = runtime.freeMemory() / (1024 * 1024);
        long memoriaMaximaMb = runtime.maxMemory() / (1024 * 1024);
        long memoriaTotalMb = runtime.totalMemory() / (1024 * 1024);
        
        System.out.println("Número de núcleos disponibles: " + nucleos);
        System.out.println("Memoria máxima asignada a la JVM: " + memoriaMaximaMb + " MB");
        System.out.println("Memoria total asignada actualmente: " + memoriaTotalMb + " MB");
        System.out.println("Memoria libre dentro de la JVM: " + memoriaLibreMb + " MB");
        
        Properties propiedades = System.getProperties();
        
        // Recorrer de forma ordenada e imprimir clave y valor
        propiedades.forEach((clave, valor) -> {
            System.out.println(clave + ": " + valor);
        });
    }
}
