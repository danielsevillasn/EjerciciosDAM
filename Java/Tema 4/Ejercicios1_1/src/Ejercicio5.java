import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num[] = new int[10]; //Inicializa la variable entera en un array de 10 valores
        int max = Integer.MIN_VALUE; //La clase integer con el maxvalue sirve para conseguir el valor maximo de un entero
        int min = Integer.MAX_VALUE; //La clase integer con el minvalue sirve para conseguir el valor minimo de un entero
        for (int i = 0; i<num.length;i++){ //Bucle para atribuir valores al array y para ver el maximo y el mínimo
            System.out.print("Dame un numero"+(i+1)+": " );
            num[i]= s.nextInt(); //El array equivalente a la fase del bucle se le atribuye el valor por teclado
            if (num[i]>max){ //Mira si el numero es mayor al anterior o a 0
                max = num[i];
            }
            if (num[i]<min){ //Mira si el numero es menor al anterior
                min = num[i];
            }
        }
        for (int i=0;i<10;i++){ //Imprime los valores incluyendo cual es el maximo y el minimo
            if(num[i] == max){
                System.out.print(num[i]+"máximo ");
            }else if(num[i] == min){
                System.out.print(num[i]+"mínimo ");
            }else{
                System.out.print(num[i]+" ");
            }
        }
        s.close();
    }
}