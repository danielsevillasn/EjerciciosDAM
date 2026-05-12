import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio1_Aleatorio {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("pokemon.bin", "r")) {
            int tamanoRegistro = 15; // 2 + 1 + (6 * 2)
            int indicePokemon = 5;   // El 6º Pokémon (índice 5)
            
            // Posicionamos: (Salto de 5 Pokémon completos) + (Salto de 13 bytes para llegar a Velocidad)
            long posicionVelocidad = (indicePokemon * tamanoRegistro) + 13;
            
            raf.seek(posicionVelocidad);
            short velocidad = raf.readShort();
            
            System.out.println("La velocidad del 6º Pokémon es: " + velocidad);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}