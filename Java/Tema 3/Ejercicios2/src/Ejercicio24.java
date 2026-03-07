import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Dime la altura que quieres que tenga la piramide: ");
        int n = s.nextInt();
        int fila =1;
        int espaciosext = n-1;
        int espaciosint1 = 1;
        int espaciosint2 = 0;
        int aux = 0;
        int a = 1;
        for (int i = 0; i<n; i++ ){ //Bucle que controla las filas
            for (int k = 1; k <= espaciosext; k++){ //Bucle que controla los espacios exteriores
                System.out.print(" ");
            }
            System.out.print(a); //Imprime el primer caracter de cada fila
            if (i == 1) {
                System.out.print(a+1);
                System.out.print(a);
            }
            if (i > 1) { //Condición para las filas intermedias
                for (int j = 1; j < espaciosint1; j++){
                    System.out.print(j+1);
                    aux = j;
                }
                for (int k = 1; k < espaciosint2; k++){
                    System.out.print(aux);
                    aux--;
                }
                System.out.print(a);
            }
            espaciosint1++; //Incrementa los espacios interiores en 2 por cada fila
            espaciosint2++;
            System.out.println(); //Salto de línea al terminar la fila
            fila = fila+2; //Incrementa el número de fila en 2
            espaciosext--; //Decrementa los espacios exteriores en 1 por cada fila
        }
        s.close();
    }

}
