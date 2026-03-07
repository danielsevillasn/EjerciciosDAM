import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Dime el caracter que quieres que salga en la piramide: ");
        String caracter = s.next();
        System.out.print("Dime la altura que quieres que tenga la piramide: ");
        int altura = s.nextInt();
        int fila =1;
        int espacios = altura-1;
        for (int i = 0; i<altura; i++ ){ //Bucle que controla las filas
            for (int k = 1; k <= espacios; k++){ //Bucle que controla los espacios
                System.out.print(" ");
            }
            for (int j = 1; j<=fila; j++){ //Bucle que controla los caracteres por fila
                System.out.print(caracter);
            }
            System.out.println();
            fila = fila+2; //Incrementa el número de fila en 2
            espacios--; //Decrementa los espacios en 1 por cada fila
        }
        s.close();
    }

}
