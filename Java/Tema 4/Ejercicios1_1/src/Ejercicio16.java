import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] num = new int[20];
        for(int i = 0; i<num.length;i++){
            num [i] = (int) (Math.random()*400);
        }
        for(int elemento : num){
            System.out.print(elemento+" ");
        }
        System.out.println("\n");
        System.out.print("¿Qué numeros quieres resaltar? (1 - los múltiplos de 5, 2 - los multiplos de 7): ");
        int opcion = s.nextInt();
        while (true){
            if(opcion == 1){
                for(int i = 0; i<num.length;i++){
                    if(num[i] % 5 == 0){
                        System.out.print("["+num[i]+"] ");
                    }else{
                        System.out.print(num[i]+" ");
                    }
                }
                break;
            }else if(opcion == 2){
                for(int i = 0; i<num.length;i++){
                    if(num[i] % 7 == 0){
                        System.out.print("["+num[i]+"]");
                    }else{
                        System.out.print(num[i]+" ");
                    }
                }
                break;
            }
            else{
                System.out.print("¿Qué numeros quieres resaltar? (1 - los múltiplos de 5, 2 - los multiplos de 7): ");
                opcion = s.nextInt();
                s.nextLine();
            }
        }
        s.close();
    }
}
