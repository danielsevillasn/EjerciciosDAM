import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double [] num = new double[10];
        for(int i = 0; i<num.length;i++){
            System.out.print("Dime un numero: ");
            num[i] = s.nextDouble();
        }
        for(int i = 0; i<2;i++){
            if ( i == 0){
                System.out.print("Índice: ");
                for (int j = 0; j<num.length;j++){
                    System.out.print(j+ "\t");
                }
            }
            if ( i == 1){
                System.out.print("Valor:  ");
                for (double j : num){ //Foreach que sirve para mostrar por pantalla el array
                    System.out.print(j+ "\t");
                }
            }
            System.out.println();
        }

        double [] numPrimos = new double[num.length];
        double [] numNOPrimos = new double[num.length];
        int primos = 0;
        int NOprimos = 0;
        int contador1 = 0;
        int contador2 = 0;

        for(int i = 0; i<num.length;i++){
            primos = 0;
            for(int j = 1;j<num[i]+1;j++){
                if (num[i] % j == 0){
                    primos++;
                }
            }
            if (num[i] <= 1) {
                numNOPrimos[contador2++]=num[i];
            }
            else if(primos == 2){
                numPrimos[contador1++]=num[i];
            }
            else{
                numNOPrimos[contador2++]=num[i];
            }
        }

        NOprimos = contador2;
        for(int i = 0; i <contador1;i++){
            num[i] = numPrimos[i];
        }
        for(int i = 0; i <NOprimos;i++){
            num[contador1++] = numNOPrimos[i];
        }

        for(int i = 0; i<2;i++){
            if ( i == 0){
                System.out.print("Índice: ");
                for (int j = 0; j<10;j++){
                    System.out.print(j+ "\t");
                }
            }
            if ( i == 1){
                System.out.print("Valor:  ");
                for (double j : num){ //Foreach que sirve para mostrar por pantalla el array
                    System.out.print(j+ "\t");
                }
            }
            System.out.println();
        }
        s.close();
    }
}
