import java.util.Scanner;
public class Ejercicio24_3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un numero entero positivo: ");
        int numero = s.nextInt();
        int decimales = 0;
        int aux = numero;
        do{
            aux=aux/10;
            decimales++;
        }while (aux > 0);
        int DigitoAleatorio = (int)(Math.random()*decimales+1);
        int Digito = numero;
        for (int i = 1; i<=DigitoAleatorio; i++){
            if (i == DigitoAleatorio){
                System.out.println(Digito%10);
            }
            Digito = Digito/10;
        }
        s.close();
    }
}