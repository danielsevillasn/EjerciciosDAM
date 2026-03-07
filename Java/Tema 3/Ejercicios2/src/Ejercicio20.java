import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Dime el caracter que quieres que salga en la piramide hueca: ");
        String caracter = s.next();
        System.out.print("Dime la altura que quieres que tenga la piramide hueca: ");
        int altura = s.nextInt();
        int fila =1;
        int espaciosext = altura-1;
        int espaciosint = 1;
        int ultimafila = (altura*2)-1;
        for (int i = 0; i<altura; i++ ){ //Bucle que controla las filas
            for (int k = 1; k <= espaciosext; k++){ //Bucle que controla los espacios exteriores
                System.out.print(" ");
            }
            System.out.print(caracter); //Imprime el primer caracter de cada fila
            if (i == 1) {
                espaciosint = 1;
            }
            if (i > 0 && i < altura-1) { //Condición para las filas intermedias
                for (int j = 1; j <= espaciosint; j++){
                    System.out.print(" ");
                }
                System.out.print(caracter);
            }
            if (i == altura-1) { //Condición para la última fila
                for (int j = 1; j < ultimafila ; j++){
                    System.out.print(caracter);
                }
            }
            espaciosint += 2; //Incrementa los espacios interiores en 2 por cada fila
            System.out.println(); //Salto de línea al terminar la fila
            fila = fila+2; //Incrementa el número de fila en 2
            espaciosext--; //Decrementa los espacios exteriores en 1 por cada fila
        }
        s.close();
    }

}
