import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num [] = new int[100];
        for (int i = 0;i<num.length;i++){
            num[i]= (int) (Math.random()*20);
            System.out.print(num[i]+ " ");
        }
        System.out.println();
        System.out.print("Dime el numero que quieres sustituir en el array: ");
        int sust1 = s.nextInt();
        System.out.print("Dime el numero por el que quieres sustituir en el array: ");
        int sust2 = s.nextInt();
        for (int i = 0;i<num.length;i++){
            if(num[i] == sust1){
                num[i] = sust2;
                System.out.print("\""+num[i]+"\" ");
            }
            else{
                System.out.print(num[i]+ " ");
            }
        }
        s.close();
    }

}
