import java.util.Scanner;
public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int anchura;
        System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
        anchura = s.nextInt();
        while (true){ //Si el programa llega hasta un break entonces el while termina
            if (anchura>=2){ //Si el numero es impar y la altura es mayor o igual a 3 entonces se cierra
                break;
            }
            else{ //Si no, vuelve a preguntar
                System.out.println("El numero introducido no es válido");
                System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
                anchura = s.nextInt();
                s.nextLine();
            }
        }
        int altura;
        System.out.print("Ahora introduzca la altura (como mínimo 2): ");
        altura = s.nextInt();
        while (true){ //Si el programa llega hasta un break entonces el while termina
            if (altura>=2){ //Si el numero es impar y la altura es mayor o igual a 3 entonces se cierra
                break;
            }
            else{ //Si no, vuelve a preguntar
                System.out.println("El numero introducido no es válido");
                System.out.print("Introduzca la altura (como mínimo 2): ");
                altura = s.nextInt();
                s.nextLine();
            }
        }
        int espaciosint = anchura-1;

        for (int i = 0; i<altura; i++ ){ //Bucle que controla las filas
            if(i==0 || i==altura-1){
                for(int j=1;j<=anchura;j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int k=1;k<espaciosint;k++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println(); //Salto de línea al terminar la fila
        }
        s.close();
    }
}

