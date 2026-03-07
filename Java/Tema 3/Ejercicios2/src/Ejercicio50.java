import java.util.Scanner;
public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);    
        int altura;
        System.out.print("Por favor, introduzca la altura (número impar, mayor o igual a 5 y entero): ");
        altura = s.nextInt();
        while (true){ //Si el programa llega hasta un break entonces el while termina
            if ((altura%2!=0) && (altura>=5) && (altura>=0)){ //Si el numero es impar y la altura es mayor o igual a 3 entonces se cierra
                break;
            }
            else{ //Si no, vuelve a preguntar
                System.out.println("La altura introducida no es correcta");
                System.out.print("Por favor, introduzca la altura (número impar y mayor o igual a 5): ");
                altura = s.nextInt();
                s.nextLine();
            }
        }
        int anchura = 6;
        int espaciosint = anchura-1;
        String caracter = "M";

        for (int i = 0; i<altura; i++ ){ //Bucle que controla las filas
            if((i==0) || (i == altura/2) || (i==altura-1)){
                for(int j=1;j<=anchura;j++){
                    System.out.print(caracter);
                }
            }
            else{
                System.out.print(caracter);
                for(int k=1;k<espaciosint;k++){
                    System.out.print(" ");
                }
                System.out.print(caracter);
            }
            System.out.println(); //Salto de línea al terminar la fila
        }
        s.close();
    }
}

