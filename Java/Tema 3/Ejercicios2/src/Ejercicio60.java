import java.util.Scanner;
public class Ejercicio60 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int altura;
        System.out.print("Introduzca la altura de los calcetines: ");
        altura = s.nextInt();
        while (true){ //Si el programa llega hasta un break entonces el while termina
            if (altura>=4){ //Si el numero es impar y la altura es mayor o igual a 3 entonces se cierra
                break;
            }
            else{ //Si no, vuelve a preguntar
                System.out.println("El numero introducido no es válido");
                System.out.print("Introduzca la altura de la pirámide maya: ");
                altura = s.nextInt();
                s.nextLine();
            }
        }
        int espacios1 = 2;
        int espacios2 = 5;
        String caracter = "*";
        for (int i = 0; i<altura; i++ ){ //Bucle que controla las filas
            if (i < altura-2){    
                for (int j =1; j<=3; j++){ //Bucle que controla los espacios exteriores
                    System.out.print(caracter);
                }
                for (int j =1; j<=espacios2; j++){ //Bucle que controla los espacios interiores
                    System.out.print(" ");
                }
                for (int j =1; j<=3; j++){ //Bucle que controla los espacios exteriores
                    System.out.print(caracter);
                }
            }
            else{ //Condición para la última fila
                for (int j=1; j<=6; j++){ //Bucle que controla los caracteres
                    System.out.print(caracter);
                }
                for (int j =1; j<=espacios1; j++){ //Bucle que controla los espacios interiores
                    System.out.print(" ");
                }
                for (int j=1; j<=6; j++){ //Bucle que controla los caracteres
                    System.out.print(caracter);
                }
            }
            System.out.println(); //Salto de línea al terminar la fila
        }
        s.close();
    }
}
