import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num [] = new int[20];
        for (int i = 0;i<num.length;i++){
            num[i]= (int) (Math.random()*100);
        }
        int[] numImpar = new int[num.length];
        int[] numPar = new int[num.length];
        int pares = 0;
        int impares = 0;

        for (int i = 0;i<num.length;i++){
            if (num[i] % 2 == 0){
                numPar[pares++] = num[i];
            }
            else{
                numImpar[impares++] = num[i];
            }
        }
        for(int i = 0;i<pares;i++){
            num[i] = numPar[i];
        }
        for(int i = 0;i<impares;i++){
            num[pares++] = numImpar[i];
        }
        for(int i =0;i<20;i++){
            System.out.print(num[i]+ " ");
        }
        s.close();
    }
}

