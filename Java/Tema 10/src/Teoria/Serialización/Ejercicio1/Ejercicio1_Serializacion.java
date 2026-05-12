package Teoria.Serialización.Ejercicio1;

import java.io.*;
import java.util.Scanner;

public class Ejercicio1_Serializacion {
    static final String FICHERO_MOV = "movimientos.bin";
    static final String FICHERO_SAVE = "partida.save";
    static char[] tablero = new char[9];
    static int turno = 0;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        cargarPartida(); // Carga automática al iniciar [cite: 112]

        while (true) {
            dibujarTablero();
            if (comprobarFinal()) break;

            System.out.print("Turno " + (turno % 2 == 0 ? "X" : "O") + " (1-9, 'r' deshacer, 's' guardar): ");
            String entrada = sc.next();

            if (entrada.equalsIgnoreCase("s")) {
                guardarPartida(); // [cite: 111]
            } else if (entrada.equalsIgnoreCase("r")) {
                deshacer(); // [cite: 92]
            } else {
                realizarMovimiento(entrada);
            }
        }
    }

    private static void realizarMovimiento(String entrada) throws IOException {
        try {
            int pos = Integer.parseInt(entrada) - 1;
            if (pos >= 0 && pos < 9 && tablero[pos] == ' ') {
                tablero[pos] = (turno % 2 == 0) ? 'X' : 'O';
                // Registrar en acceso aleatorio [cite: 85]
                try (RandomAccessFile raf = new RandomAccessFile(FICHERO_MOV, "rw")) {
                    raf.seek(raf.length());
                    raf.writeInt(pos);
                }
                turno++;
            }
        } catch (NumberFormatException e) { System.out.println("Opción inválida."); }
    }

    private static void deshacer() throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(FICHERO_MOV, "rw")) {
            if (raf.length() >= 4) {
                raf.setLength(raf.length() - 4); // Truncar último movimiento [cite: 92]
                recargarTableroDesdeCero();
            } else { System.out.println("No hay movimientos que deshacer."); }
        }
    }

    private static void recargarTableroDesdeCero() throws IOException {
        for (int i = 0; i < 9; i++) tablero[i] = ' ';
        turno = 0;
        try (RandomAccessFile raf = new RandomAccessFile(FICHERO_MOV, "r")) {
            while (raf.getFilePointer() < raf.length()) {
                int pos = raf.readInt();
                tablero[pos] = (turno % 2 == 0) ? 'X' : 'O';
                turno++;
            }
        }
    }

    private static void guardarPartida() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHERO_SAVE))) {
            oos.writeObject(new Partida(tablero, turno)); // [cite: 103]
            System.out.println("Estado guardado correctamente.");
        } catch (IOException e) { System.out.println("Error al guardar."); }
    }

    private static void cargarPartida() throws IOException, ClassNotFoundException {
        File f = new File(FICHERO_SAVE);
        if (f.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
                Partida p = (Partida) ois.readObject(); // [cite: 105]
                tablero = p.tablero;
                turno = p.turno;
                System.out.println("Partida cargada.");
            }
        } else {
            for (int i = 0; i < 9; i++) tablero[i] = ' ';
            new File(FICHERO_MOV).delete();
        }
    }

    private static boolean comprobarFinal() {
        char g = ' ';
        int[][] win = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
        for (int[] c : win) {
            if (tablero[c[0]] != ' ' && tablero[c[0]] == tablero[c[1]] && tablero[c[0]] == tablero[c[2]]) g = tablero[c[0]];
        }
        if (g != ' ' || turno == 9) {
            System.out.println(g != ' ' ? "¡Ganador: " + g + "!" : "Tablas.");
            new File(FICHERO_SAVE).delete(); // [cite: 113]
            new File(FICHERO_MOV).delete();
            return true;
        }
        return false;
    }

    private static void dibujarTablero() {
        for (int i = 0; i < 9; i++) {
            System.out.print("[" + tablero[i] + "]");
            if ((i + 1) % 3 == 0) System.out.println();
        }
    }
}