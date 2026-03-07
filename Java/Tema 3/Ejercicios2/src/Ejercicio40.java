import java.util.Scanner;
public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int altura;
        System.out.print("Por favor, introduzca la altura del rombo, debe de ser impar y mayor o igual a 3: ");
        altura = s.nextInt();

        while (true){ //Si el programa llega hasta un break entonces el while termina
            if ((altura%2!=0) && (altura>=3)){ //Si el numero es impar y la altura es mayor o igual a 3 entonces se cierra
                break;
            }
            else{ //Si no, vuelve a preguntar
                System.out.println("El numero introducido no es válido");
                System.out.print("Por favor, introduzca la altura del rombo, debe de ser impar y mayor o igual a 3: ");
                altura = s.nextInt();
                s.nextLine();
            }
        }
        int espaciosext1 = altura-1;
        int espaciosext2 = 1;
        int espaciosint1 = 1;
        int espaciosint2 = 1;

        for (int i = 0; i<altura; i++ ){ //Bucle que controla las filas
            if ((i >= 0) && (i < ((altura/2)+1))) { //Condición para las filas intermedias
                for (int k = 1; k <= espaciosext1; k++){ //Bucle que controla los espacios exteriores
                    System.out.print(" ");
                }
                if (i == 1) {
                    espaciosint1 = 1;
                }
                System.out.print("*"); //Imprime el primer caracter de cada fila
                for (int j = 1; j <= espaciosint1; j++){
                    System.out.print(" ");
                }
                if (i>0){
                    System.out.print("*");
                }
                espaciosint1 += 2; //Incrementa los espacios interiores en 2 por cada fila
                espaciosext1--; //Decrementa los espacios exteriores en 1 por cada fila
            }
            if (i >= (altura/2+1)) { //Condición para la última fila
                if (i == altura-2){
                    espaciosint2 = 1;
                }
                if (i == (altura/2+1)){
                    espaciosext2 = espaciosext1+2;
                    espaciosint2 = espaciosint1-4;
                }
                for (int k = 1; k <= espaciosext2; k++){ //Bucle que controla los espacios exteriores
                System.out.print(" ");
                }
                if (i == altura-1) {
                    espaciosint2 = 1;
                }
                System.out.print("*"); //Imprime el primer caracter de cada fila
                for (int j = 1; j <= espaciosint2; j++){
                    System.out.print(" ");
                }
                if (i < altura-1){
                    System.out.print("*");
                }
                espaciosext2 += 1; //Incrementa los espacios interiores en 2 por cada fila
                espaciosint2 -= 2; //Decrementa los espacios exteriores en 1 por cada fila
            }
            System.out.println(); //Salto de línea al terminar la fila
        }
        s.close();
    }
}

