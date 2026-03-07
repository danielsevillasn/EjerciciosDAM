public class Ejercicio1 {
    public static void main(String[] args) {
        int [] [] num = new int[3][6];
        num [0] [0] = 0;
        num [0] [1] = 30;
        num [0] [2] = 2;
        num [0] [5] = 5;
        num [1] [0] = 75;
        num [1] [4] = 0;
        num [2] [2] = -2;
        num [2] [3] = 9;
        num [2] [5] = 11;
        for (int i = -1; i<3;i++){
            if ( i == -1){
                System.out.print("Array num\tColumna0\tColumna1\tColumna2\tColumna3\tColumna4\tColumna5");
            }
            else{
                if (i == 0){
                    System.out.print("Fila 0\t\t   ");
                }
                if (i == 1){
                    System.out.print("Fila 1\t\t   ");
                }
                if (i == 2){
                    System.out.print("Fila 2\t\t   ");
                }
                for (int j = 0; j<6;j++){
                System.out.print(num[i][j]+ "\t\t   ");
                }
            }
            System.out.println();
        }
    }
}
