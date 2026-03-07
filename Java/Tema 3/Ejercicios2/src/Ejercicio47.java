import java.util.Scanner;
public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);    
        int altura;
        System.out.print("Introduzca la altura (5 como mínimo): ");
        altura = s.nextInt();
        while (true){ //Si el programa llega hasta un break entonces el while termina
            if (altura>=5){ //Si el numero es impar y la altura es mayor o igual a 3 entonces se cierra
                break;
            }
            else{ //Si no, vuelve a preguntar
                System.out.println("El numero introducido no es válido");
                System.out.print("Introduzca la altura (5 como mínimo): ");
                altura = s.nextInt();
                s.nextLine();
            }
        }
        int espacios;
        System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
        espacios = s.nextInt();
        while (true){ //Si el programa llega hasta un break entonces el while termina
            if (espacios>=1){ //Si el numero es impar y la altura es mayor o igual a 3 entonces se cierra
                break;
            }
            else{ //Si no, vuelve a preguntar
                System.out.println("El numero introducido no es válido");
                System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
                espacios = s.nextInt();
                s.nextLine();
            }
        }
        int anchura5 = 4;
        String caracter = "*";

        for (int i = 0; i<altura; i++ ){ //Bucle que controla las filas
            System.out.print(caracter);
            for(int j=1;j<=espacios;j++){
                System.out.print(" ");
            }
            if((i==0) || (i == 2) || (i==altura-1)){
                for(int j=1;j<=anchura5;j++){
                    System.out.print(caracter);
                }
                for(int j=1;j<=espacios;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=anchura5;j++){
                    System.out.print(caracter);
                }
            }
            else if(i==1){
                System.out.print(caracter);
                for(int j=1;j<=espacios+3;j++){
                    System.out.print(" ");
                }
                System.out.print(caracter);
            }
            else{
                for (int j=1;j<=3;j++){
                    System.out.print(" ");
                }
                System.out.print(caracter);
                for(int j=1;j<=espacios+3;j++){
                    System.out.print(" ");
                }
                System.out.print(caracter);
            }
            System.out.println(); //Salto de línea al terminar la fila
        }
        s.close();
    }
}

