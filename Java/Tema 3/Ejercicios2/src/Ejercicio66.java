import java.util.Scanner;
public class Ejercicio66 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);    
        int altura;
        System.out.print("Por favor, introduzca la altura de la figura: ");
        altura = s.nextInt();
        while (true){ //Si el programa llega hasta un break entonces el while termina
            if ((altura%2!=0) && (altura>=3)){ //Si el numero es impar y la altura es mayor o igual a 3 entonces se cierra
                break;
            }
            else{ //Si no, vuelve a preguntar
                System.out.println("La altura no es correcta, debe ser un número impar mayor o igual que 3");
                System.out.print("Por favor, introduzca la altura de la figura: ");
                altura = s.nextInt();
                s.nextLine();
            }
        }
        int espacios = 4;
        int espaciosext = 0;
        String caracter = "*";
        for (int i = 1; i<=altura; i++ ){ //Bucle que controla las filas
            if(i<altura/2+1){
                for(int j=1;j<=espaciosext;j++){
                    System.out.print(" ");
                }
                System.out.print(caracter);
                for(int j=0;j<espacios;j++){
                    System.out.print(" ");
                }
                System.out.print(caracter);
                espaciosext++;
            }
            else{
                for(int j=1;j<=espaciosext;j++){
                    System.out.print(" ");
                }
                System.out.print(caracter);
                for(int j=0;j<espacios;j++){
                    System.out.print(" ");
                }
                System.out.print(caracter);
                espaciosext--;
            }
            System.out.println(); //Salto de línea al terminar la fila
        }
        s.close();
    }
}

