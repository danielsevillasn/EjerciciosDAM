import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double temp[] = new double[11];
        for (int i = 0; i<temp.length;i++){
            System.out.print("Dime la temperatura del "+ (i+1)+"mes: ");
            temp[i] = s.nextDouble();
        }
        for(int i = 0; i<3;i++){
            if (i==0){
                for(int j = 0;j<(7*temp.length)+1;j++){
                    System.out.print("_");
                }
            }
            else if (i==1){
                for(int j = 0; j<temp.length; j++){
                    System.out.print("| ");
                    System.out.print(temp[j]);
                    if(j==10){
                        System.out.print(" |");
                    }else{
                        System.out.print(" ");
                    }
                }
            }else{
                for(int j = 0;j<(7*temp.length)+1;j++){
                    System.out.print("_");
                }
            }
            System.out.println();
        }
        s.close();
    }
}
