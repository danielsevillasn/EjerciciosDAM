import java.util.Scanner;
public class LetraX {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la altura que ha tener la X (minimo 3 y debe ser impar): ");
        int altura = s.nextInt();
        while(true){
            if(altura>=3 && altura%2!=0){
                break;
            }
            else{
                System.out.println("La altura introducida no es mayor o igual que 6");
                System.out.println("Introduzca la altura que ha tener la D (minimo 6): ");
                altura = s.nextInt();
                s.nextLine();
            }
        }
        int espaciosint1 = altura-2;
        int espaciosint2 = 1;
        int espaciosext = 0;
        String caracter = "*";
        for (int i= 0;i<altura;i++){
            if(i>=0 && i<altura/2){
                for (int j = 0; j<espaciosext;j++){
                    System.out.print(" ");
                }
                System.out.print(caracter);
                for (int j = 0;j<espaciosint1;j++){
                    System.out.print(" ");
                }
                System.out.print(caracter);
                espaciosint1 -=2;
                espaciosext++;
            }else if(i == altura/2){
                for (int j = 0; j<espaciosext;j++){
                    System.out.print(" ");
                }
                System.out.print(caracter);
            }else{
                espaciosext--;
                for( int j = 0; j<espaciosext;j++){
                    System.out.print(" ");
                }
                System.out.print(caracter);
                for (int j = 0;j<espaciosint2;j++){
                    System.out.print(" ");
                }
                System.out.print(caracter);
                espaciosint2 +=2;
            }
            System.out.println();
        }
        s.close();
    }

}