import java.util.Scanner;
public class Ejercicio30_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int altura;
        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        altura = s.nextInt();
        while (true){ //Si el programa llega hasta un break entonces el while termina
            if (altura>=4){ //Si el numero es impar y la altura es mayor o igual a 3 entonces se cierra
                break;
            }
            else{ //Si no, vuelve a preguntar
                System.out.println("El numero introducido no es válido");
                System.out.print("Introduzca la altura (como mínimo 2): ");
                altura = s.nextInt();
                s.nextLine();
            }
        }
        int anchura;
        System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
        anchura = s.nextInt();
        while (true){ //Si el programa llega hasta un break entonces el while termina
            if (anchura>=4){ //Si el numero es impar y la altura es mayor o igual a 3 entonces se cierra
                break;
            }
            else{ //Si no, vuelve a preguntar
                System.out.println("El numero introducido no es válido");
                System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
                anchura = s.nextInt();
                s.nextLine();
            }
        }
        int pezX, pezY, caballoX, caballoY, caracolaX, caracolaY;
        do{
            pezX = (int)(Math.random()*(anchura-3)+2);
            pezY = (int)(Math.random()*(altura-2)+1);
            caballoX = (int)(Math.random()*(anchura-3)+2);
            caballoY = (int)(Math.random()*(altura-2)+1);
            caracolaX = (int)(Math.random()*(anchura-3)+2);
            caracolaY = (int)(Math.random()*(altura-2)+1);
        }while((pezX == caballoX && pezY == caballoY) || (pezX == caracolaX && pezY == caracolaY) || (caballoX == caracolaX && caballoY == caracolaY));
        for (int i = 0; i<altura; i++ ){ //Bucle que controla las filas
            if(i==0 || i==altura-1){
                for(int j=1;j<=anchura;j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for (int j = 1; j <anchura-1; j++) {
                    if (j == pezX && i == pezY) {
                        System.out.print("&");
                    } else if (j == caballoX && i == caballoY) {
                        System.out.print("$");
                    } else if (j == caracolaX && i == caracolaY) {
                        System.out.print("@");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("*");
            }
            System.out.println(); //Salto de línea al terminar la fila
        }
        s.close();
    }
}

