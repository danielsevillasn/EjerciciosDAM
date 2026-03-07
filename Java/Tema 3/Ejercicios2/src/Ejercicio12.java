import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Dime los n primeros terminos de la serie Fibonacci: ");
        int n = s.nextInt();
        int Fibonacci1 = 0;
        int Fibonacci2 = 1;
        int suma;
        switch (n){
            case 1:
            System.out.print(Fibonacci1+",");
            break;
            case 2:
            System.out.print(Fibonacci1+",");
            System.out.print(Fibonacci2+",");
            break;
            default:
            System.out.print(Fibonacci1+",");
            System.out.print(Fibonacci2+",");
            n =n-2;
            do {
                
                suma= Fibonacci1+Fibonacci2;
                System.out.print(suma+",");
                Fibonacci1=Fibonacci2;
                Fibonacci2=suma;
                n--;
            }while (n>0);
        }
        s.close();
    }

}
