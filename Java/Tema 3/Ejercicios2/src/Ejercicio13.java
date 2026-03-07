import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int contador = 0;
        int negativo = 0;
        int positivo = 0;
        int numero;
        do {
            System.out.print("Dame un numero positivo o negativo: ");
            numero = s.nextInt();
            if(numero>=0){
                positivo++;
            }
            else{
                negativo++;
            }
            contador++;
        }while (contador<=10);
        System.out.println("Hay "+negativo+" negativos");
        System.out.println("Hay "+positivo+" positivos");
        s.close();
    }

}
