import java.util.Scanner;
public class Ejercicio69 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);    
        int altura;
        System.out.print("Introduzca la altura de la pirámide maya: ");
        altura = s.nextInt();
        while (true){ //Si el programa llega hasta un break entonces el while termina
            if (altura>=3){ //Si el numero es impar y la altura es mayor o igual a 3 entonces se cierra
                break;
            }
            else{ //Si no, vuelve a preguntar
                System.out.println("El numero introducido no es válido");
                System.out.print("Introduzca la altura de la pirámide maya: ");
                altura = s.nextInt();
                s.nextLine();
            }
        }
        int espaciosint = 4;
        int terraza = 6;
        int terraza2 = 2;
        int espaciosext = altura - 1;
        String caracter = "*";

        for (int i = 0; i<altura; i++ ){ //Bucle que controla las filas
            for(int j = 0; j<espaciosext; j++){ //Bucle que controla los espacios
                System.out.print(" ");
            }
            if(i%2==0){ //Si la fila es par
                for (int j = 0; j<terraza; j++){ //Bucle que controla los caracteres
                    System.out.print(caracter);
                }
                terraza += 4;
            } 
            else{ //Si la fila es impar
                for (int j = 0; j<terraza2; j++){ //Bucle que controla los caracteres
                    System.out.print(caracter);
                }
                for (int j = 0; j<espaciosint; j++){ //Bucle que controla los espacios interiores
                    System.out.print(" ");
                }
                for (int j = 0; j<terraza2; j++){ //Bucle que controla los caracteres
                    System.out.print(caracter);
                }
                terraza2 += 2;
            }
            espaciosext--;
            System.out.println(); //Salto de línea al terminar la fila
        }
        s.close();
    }
}

