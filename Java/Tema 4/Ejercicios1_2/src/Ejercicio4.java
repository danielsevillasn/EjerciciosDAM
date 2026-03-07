import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) throws InterruptedException{
        Scanner s = new Scanner(System.in);
        int[][] num = new int[4][5];
        int[]sumF = new int [5];
        sumF [4] = 0;
        int[] sumC = new int [5];
        int filas = num.length;
        int columnas = num[0].length;
        int sumaFila = 0;
        int sumaColumna = 0;
        int aux = 0;
        int sumatotal = 0;
        for(int i = 0; i<filas;i++){
            for(int j = 0;j<columnas;j++){
                num [i] [j] = (int)(Math.random()*(1000-100)+100);
            }
        }
        for(int i = 0;i<columnas;i++){
            if(i>=0 && i<4){
                sumaFila = 0;
                for(int j = 0; j<columnas;j++){
                    System.out.print(num[i][j]+ "\t\t   ");
                    sumaFila +=num[i][j];
                }
                Thread.sleep(1000);
                System.out.print(sumaFila);
                sumF[i] = sumaFila;
            }
            if (i == 4){
                for(int j = 0; j<columnas;j++){
                    sumaColumna = 0;
                    for(int k = 0;k<filas;k++){
                        sumaColumna +=num[k][j];
                    }
                    Thread.sleep(1000);
                    System.out.print(sumaColumna+ "\t\t   ");
                    sumC[j] = sumaColumna;
                }
                for(int j = 0;j<columnas;j++){
                    aux = sumC[j]+sumF[j];
                    sumatotal +=aux;
                }
                Thread.sleep(1000);
                System.out.print(sumatotal);
            }
            System.out.println();
            System.out.println();
        }
        s.close();
    }

}
