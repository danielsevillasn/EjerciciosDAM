import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    final String VACIO = "  ";
    final String MINA = "$ ";
    final String TESORO = "* ";
    final String INTENTO = "X ";
    boolean salir = false;

    String[][] cuadrante = new String[5][4];
    // inicializa el array
    for (int x = 0; x < cuadrante.length; x++) {
      for (int y = 0; y < cuadrante[0].length; y++) {
        cuadrante[x][y] = VACIO;
      }
    }
    // pinta el cuadrante inicial
    for (int y = cuadrante[0].length - 1; y >= 0; y--) {
      System.out.print(y + "|");
      for (int x = 0; x < cuadrante.length; x++) {
        System.out.print(cuadrante[x][y]);
      }
      System.out.println();
    }
    System.out.println("  -------------\n  0 1 2 3 4\n");

    // coloca la mina
    int minaX = (int) (Math.random() * cuadrante.length - 1);
    int minaY = (int) (Math.random() * cuadrante[0].length - 1);
    cuadrante[minaX][minaY] = MINA;

    // coloca el tesoro
    int tesoroX;
    int tesoroY;
    do {
      tesoroX = (int) (Math.random() * cuadrante.length - 1);
      tesoroY = (int) (Math.random() * cuadrante[0].length - 1);
    } while ((minaX == tesoroX) && (minaY == tesoroY));
    cuadrante[tesoroX][tesoroY] = TESORO;

    // juego
    System.out.println("\n¡BUSCA EL TESORO!\n");
    do {
      // pide las coordenadas
      int columna;
      int fila;
      do {
        System.out.print("Coordenada x: ");
        columna = sc.nextInt();
        if (columna < cuadrante.length) {
          break;
        }
      } while (true);// valido coordenada x
      do {
        System.out.print("Coordenada y: ");
        fila = sc.nextInt();
        if (fila < cuadrante[0].length) {
          break;
        }
      } while (true);// valido coordenada y

      // mira lo que hay en las coordenadas indicadas por el usuario
      switch (cuadrante[columna][fila]) {
        case VACIO:
          cuadrante[columna][fila] = INTENTO;
          if ((Math.abs(columna - minaX) < 2) && (Math.abs(fila - minaY) < 2)) {
            System.out.println("Cuidado, hay una mina cerca.");
          }
          break;
        case INTENTO:
          System.out.println("Lo siento la coordenada ya marcada");
          break;
        case MINA:
          System.out.println("Lo siento, has perdido.");
          salir = true;
          break;
        case TESORO:
          System.out.println("Enhorabuena, has encontrado el tesoro.");
          salir = true;
          break;
        default:

      }
      // Mira lo que hay en las coordenadas indicadas por el usuario
      
      // pinta el cuadrante
      for (int y = cuadrante[0].length - 1; y >= 0; y--) {
        System.out.print(y + "|");
        for (int x = 0; x < cuadrante.length; x++) {
          if ((cuadrante[x][y]).equals(TESORO) || (cuadrante[x][y]).equals(MINA)) {
            System.out.print(VACIO);
          } else {
            System.out.print(cuadrante[x][y]);
          }
        }
        System.out.println();
      }
      System.out.println("  -------------\n  0 1 2 3 4\n");

    } while (!salir);

    // pinta el cuadrante final
    for (int y = cuadrante[0].length - 1; y >= 0; y--) {
      System.out.print(y + "|");
      for (int x = 0; x < cuadrante.length; x++) {
        System.out.print(cuadrante[x][y]);
      }
      System.out.println();
    }
    System.out.println("  -------------\n  0 1 2 3 4\n");
    sc.close();
  }
}
