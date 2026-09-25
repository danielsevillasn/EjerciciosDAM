import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        while(true){
            try{
                System.out.print("Dame un valor entero: ");
                n = Integer.parseInt(s.nextLine());
                System.out.println("true: "+n);
                break;
            }catch(NumberFormatException e){
                System.out.println("Debes de ingresar un numero cuyo valor entero sea correcto");
            }
            
        }
        s.close();
    }
}
