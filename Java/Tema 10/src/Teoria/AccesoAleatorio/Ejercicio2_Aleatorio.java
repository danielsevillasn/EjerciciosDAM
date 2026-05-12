import java.io.*;
import java.util.Scanner;

public class Ejercicio2_Aleatorio {
    static final String FICHERO_MOVIMIENTOS = "partida.bin";
    static char[] tablero = new char[9];

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        // Inicializar archivo vacío al empezar
        new FileOutputStream(FICHERO_MOVIMIENTOS).close(); 

        while (true) {
            actualizarTablero();
            dibujarTablero();
            
            if (verificarGanador('X')) { System.out.println("¡Gana X!"); break; }
            if (verificarGanador('O')) { System.out.println("¡Gana O!"); break; }
            if (esTablas()) { System.out.println("Empate."); break; }

            System.out.print("Turno " + (contarMovimientos() % 2 == 0 ? "X" : "O") + " (1-9 o 'r'): ");
            String entrada = sc.next();

            if (entrada.equalsIgnoreCase("r")) {
                deshacerMovimiento();
            } else {
                try {
                    int pos = Integer.parseInt(entrada) - 1;
                    if (pos >= 0 && pos < 9 && tablero[pos] == ' ') registrarMovimiento(pos);
                } catch (NumberFormatException e) { System.out.println("Entrada no válida."); }
            }
        }
    }

    static void registrarMovimiento(int posicion) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(FICHERO_MOVIMIENTOS, "rw")) {
            raf.seek(raf.length()); // Ir al final
            raf.writeInt(posicion); // Guardar posición (4 bytes) [cite: 79]
        }
    }

    static void deshacerMovimiento() throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(FICHERO_MOVIMIENTOS, "rw")) {
            if (raf.length() >= 4) {
                raf.setLength(raf.length() - 4); // Elimina los últimos 4 bytes [cite: 92]
            }
        }
    }

    static void actualizarTablero() throws IOException {
        for (int i = 0; i < 9; i++) tablero[i] = ' ';
        try (RandomAccessFile raf = new RandomAccessFile(FICHERO_MOVIMIENTOS, "r")) {
            int i = 0;
            while (raf.getFilePointer() < raf.length()) {
                int pos = raf.readInt();
                tablero[pos] = (i % 2 == 0) ? 'X' : 'O';
                i++;
            }
        }
    }

    // Métodos auxiliares de lógica de juego omitidos por brevedad (dibujarTablero, verificarGanador...)
    static long contarMovimientos() throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(FICHERO_MOVIMIENTOS, "r")) {
            return raf.length() / 4;
        }
    }
    
    static void dibujarTablero() {
        for (int i = 0; i < 9; i++) {
            System.out.print("[" + tablero[i] + "]");
            if ((i + 1) % 3 == 0) System.out.println();
        }
    }

    static boolean verificarGanador(char p) {
        int[][] combos = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
        for(int[] c : combos) if(tablero[c[0]]==p && tablero[c[1]]==p && tablero[c[2]]==p) return true;
        return false;
    }

    static boolean esTablas() throws IOException { return contarMovimientos() == 9; }
}