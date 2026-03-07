import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] numero = new int[15];
        for(int i =0;i<numero.length;i++){
            System.out.print("Ingrese un numero en el array" + i +": ");
            if(i==14){
                numero[0] = s.nextInt();
            }else{
                numero[i+1] = s.nextInt();
            }
        }
        for(int i =0;i<numero.length;i++){
            System.out.print(numero[i]+ " ");
        }
        s.close();
    }

}
