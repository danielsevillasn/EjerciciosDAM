import java.util.Scanner;
public class Ejercicio53 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);    
        int altura;
        System.out.print("Por favor, introduzca la altura (número entero): ");
        altura = s.nextInt();
        while (true){ //Si el programa llega hasta un break entonces el while termina
            if (altura>=0){ //Si el numero es impar y la altura es mayor o igual a 3 entonces se cierra
                break;
            }
            else{ //Si no, vuelve a preguntar
                System.out.println("La altura introducida no es correcta");
                System.out.print("Por favor, introduzca la altura (número entero): ");
                altura = s.nextInt();
                s.nextLine();
            }
        }
        int anchura = altura;
        String caracter = "*";

        for (int i = 0; i<altura; i++ ){ //Bucle que controla las filas
            for(int j = anchura; j >= 1; j--){
                System.out.print(caracter);
            }
            anchura--;
            System.out.println(); //Salto de línea al terminar la fila
        }
        s.close();
    }
}

