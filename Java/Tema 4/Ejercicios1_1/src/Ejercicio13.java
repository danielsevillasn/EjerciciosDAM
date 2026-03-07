import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] num = new int[100];
        for(int i = 0; i<num.length;i++){
            num [i] = (int) (Math.random()*500);
        }
        for(int elemento : num){
            System.out.print(elemento+" ");
        }
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        for(int i = 0; i<num.length;i++){
            if(num[i]>maximo){
                maximo = num[i];
            }
            if(num[i]<minimo){
                minimo = num[i];
            }
        }
        System.out.println("\n");
        System.out.print("¿Qué quieres destacar? (1 - mínimo, 2 - máximo): ");
        int opcion = s.nextInt();
        int contador = 0;
        while (true){
            if(opcion == 1){
                for(int i = 0; i<num.length;i++){
                    if(num[i] == minimo && contador == 0){
                        System.out.print("**"+minimo+"**");
                        contador++;
                    }else{
                        System.out.print(num[i]+" ");
                    }
                }
                break;
            }else if(opcion == 2){
                for(int i = 0; i<num.length;i++){
                    if(num[i] == minimo && contador == 0){
                        System.out.print("**"+maximo+"**");
                        contador++;
                    }else{
                        System.out.print(num[i]+" ");
                    }
                }
                break;
            }
            else{
                System.out.print("¿Qué quieres destacar? (1 - mínimo, 2 - máximo): ");
                opcion = s.nextInt();
                s.nextLine();
            }
        }
        s.close();
    }
}
