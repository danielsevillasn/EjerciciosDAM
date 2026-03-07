public class Ejercicio9 {
    public static void main(String[] args) {
        int[][] num = new int[12][12];
        int filas = num.length;
        int columnas = num[0].length;
        int aux;
        for (int i = 0; i<filas;i++){
            for(int j = 0;j<columnas;j++){
                num[i][j] = (int) (Math.random()*101);
            }
        }
        for (int i = -1; i<filas;i++){
            if ( i == -1){
                System.out.print("Columnas:  ");
                for(int j = 0;j<columnas;j++){
                    System.out.print(" Columna"+ j);
                }
            }
            else{
                System.out.print("Fila "+i+":        ");
                for (int j = 0; j<columnas;j++){
                System.out.print(num[i][j]+"\t   ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i<filas;i++){
            for(int j = 0;j<columnas;j++){
                if(i < (filas-1) && j < (columnas-1)){
                    aux = num[i][j];
                    num[i][j] = num[i+1][j];
                    num [i+1] [j] = aux;
                }
                if (i == filas-1 && j != columnas-1){
                    aux = num[i][j];
                    num[i][j] = num[0][j+1];
                    num [0] [j+1] = aux;
                }
                if (j == columnas-1 && i == filas-1){
                    aux = num[i][j];
                    num[i][j] = num[0][0];
                    num [0] [0] = aux;
                }
            }
        }
        System.out.println();
        System.out.println("Tabla rotada: ");
        for (int fil[] : num){
            for (int col : fil){
                System.out.print(col+" ");
            }
        }
    }

}
