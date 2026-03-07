import java.util.Scanner;
public class LetraA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la altura que ha tener la A (minimo 5): ");
        int altura = s.nextInt();
        while(true){
            if(altura>=5){
                break;
            }
            else{
                System.out.println("La altura introducida no es mayor o igual que 5");
                System.out.println("Introduzca la altura que ha tener la D (minimo 5): ");
                altura = s.nextInt();
                s.nextLine();
            }
        }
        int espaciosint = 1;
        int anchura = altura/2+1;
        int espaciosext = anchura-1;
        String caracter = "*";
        for (int i= 0;i<altura;i++){
            if(i >=0 && i <(altura/2)){
                for(int j = 0; j<espaciosext;j++){
                    System.out.print(" ");
                }
                System.out.print(caracter);
                if(i>0){
                    for(int j=0;j<espaciosint;j++){
                        System.out.print(" ");
                    }
                    System.out.print(caracter);
                }
                if (i>=1){
                    espaciosint +=2;
                }
                espaciosext--;
            }
            else if(i==(altura/2)){
                if(altura%2 == 0){
                    for(int j =0;j<altura+1;j++){
                        System.out.print(caracter);
                    }
                }else{
                    for(int j =0;j<altura;j++){
                        System.out.print(caracter);
                    }
                }
            }
            else{
                System.out.print(caracter);
                for (int j=0;j<espaciosint;j++){
                    System.out.print(" ");
                }
                System.out.print(caracter);
            }
            
            System.out.println();
        }
        s.close();
    }
}
