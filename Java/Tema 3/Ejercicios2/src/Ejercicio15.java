import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la base: ");
        int numero = s.nextInt();
        System.out.print("Introduzca el exponente: ");
        int exponente = s.nextInt();
        double multiplicacion = numero;
        if(exponente == 0){
            System.out.println("1");
        }
        else if(exponente ==1){
            System.out.println("1");
            System.out.println(numero);
        }
        else{
            System.out.println(multiplicacion);
            do{
                multiplicacion= numero*multiplicacion;
                exponente--;
                System.out.println(multiplicacion);
            }while(exponente>1);
        }
        s.close();
}
}