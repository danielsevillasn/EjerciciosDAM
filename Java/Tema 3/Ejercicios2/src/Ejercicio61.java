import java.util.Scanner;
public class Ejercicio61 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int altura;
        System.out.print("Introduzca la altura de la V (un número mayor o igual a 3): ");
        altura = s.nextInt();
        while (true){ //Si el programa llega hasta un break entonces el while termina
            if (altura>=3){ //Si el numero es impar y la altura es mayor o igual a 3 entonces se cierra
                break;
            }
            else{ //Si no, vuelve a preguntar
                System.out.println("La altura debe ser mayor o igual a 3.");
                System.out.print("Introduzca la altura de la pirámide maya: ");
                altura = s.nextInt();
                s.nextLine();
            }
        }
        int espaciosext = 0;
        int ancho = 3;
        int espaciosint = altura*2 -2;
        String caracter = "*";
        for (int i = 0; i<altura; i++ ){ //Bucle que controla las filas
            for (int j = 1; j <= espaciosext; j++){ //Bucle que controla los espacios exteriores
                    System.out.print(" ");
                }
            if (i < altura-1){    
                for(int j = 1; j <= ancho; j++){ //Bucle que controla los caracteres
                    System.out.print(caracter);
                }
                for (int j = 1; j <= espaciosint; j++){ //Bucle que controla los espacios interiores
                    System.out.print(" ");
                }
                for(int j = 1; j <= ancho; j++){ //Bucle que controla los caracteres
                    System.out.print(caracter);
                }
            }
            if (i == altura-1){ //Condición para la última fila
                for (int j = 1; j <= ancho*2; j++){ //Bucle que controla los espacios exteriores
                    System.out.print(caracter);
                }
            }
            espaciosint = espaciosint-2; //Incrementa los espacios interiores en 2 por cada fila
            System.out.println(); //Salto de línea al terminar la fila
            espaciosext++; //Decrementa los espacios exteriores en 1 por cada fila
        }
        s.close();
    }
}
