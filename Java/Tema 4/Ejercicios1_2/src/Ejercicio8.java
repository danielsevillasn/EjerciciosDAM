import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] cuadrante = new int[8][8];
        int limiteX = cuadrante.length;
        int limiteY = cuadrante[0].length;
        System.out.print("Introduce la posicion del alfil (a-h y 1-8): ");
        String pos = s.nextLine().toLowerCase();
        char col = pos.charAt(0);
        int fila = pos.charAt(1);
        if (fila!=0){
            fila = fila - 1;
        } 
        switch (col) {
            case 'a' -> col = 0;
            case 'b' -> col = 1;
            case 'c' -> col = 2;
            case 'd' -> col = 3;
            case 'e' -> col = 4;
            case 'f' -> col = 5;
            case 'g' -> col = 6;
            case 'h' -> col = 7;
        }
        //Arriba izquierda
        if (fila != 7 && col != 0){
            for (int c = col - 1, f = fila + 1; c >= 0 && f <= 7; c--, f++) {
                cuadrante[f][c] = 1;
            }
        }
        //Arriba derecha
        if(fila != 7 && col != 7){
            for (int c = col + 1, f = fila + 1; c <= 7 && f <= 7; c++, f++) {
                cuadrante[f][c] = 1;
            }
        }
        //Abajo izquierda
        if(fila != 0 && col != 0){
            for (int c = col - 1, f = fila - 1; c >= 0 && f >= 0; c--, f--) {
                cuadrante[f][c] = 1;
            }
        }
        //Abajo derecha
        if(fila != 0 && col != 7){
            for (int c = col + 1, f = fila - 1; c <= 7 && f >= 0; c++, f--) {
                cuadrante[f][c] = 1;
            }
        }
        System.out.println("El alfil puede moverse a las siguientes posiciones: ");
        for (int i = 0; i < limiteX; i++) {
            for (int j = 0; j < limiteY; j++) {
                if (cuadrante[i][j] == 1) {
                    char columnaLetra = (char) ('a' + j); 
                    int filaNumero = i + 1;
                    System.out.print(columnaLetra + "" + filaNumero + " ");
                }
            }
        }
        s.close();
    }

}
