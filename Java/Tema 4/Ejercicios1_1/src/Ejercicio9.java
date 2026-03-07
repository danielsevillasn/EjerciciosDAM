import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num = new int[8];
        for (int i = 0;i<num.length;i++){
            System.out.print("Dime un numero entero: ");
            num[i] = s.nextInt();
        }
        for (int i = 0;i<num.length;i++){
            if (num[i] % 2 == 0){
                System.out.print(num[i]+ "par ");
            }
            else{
                System.out.print(num[i]+ "impar ");
            }
        }
        s.close();
    }
}
