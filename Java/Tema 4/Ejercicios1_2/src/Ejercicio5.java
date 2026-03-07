public class Ejercicio5 {
    public static void main(String[] args) {
        int [] [] num = new int[6][10];
        int filas = num.length;
        int columnas = num[0].length;
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;
        String posicionMinimo = "";
        String posicionMaximo = "";
        for(int i = 0; i<filas;i++){
            for(int j = 0; j<columnas;j++){
                num [i] [j] = (int) (Math.random()*1001);
            }
        }
        for(int i = 0; i<filas;i++){
            for(int j = 0; j<columnas;j++){
                if (num [i] [j]>maximo){
                    maximo = num[i] [j];
                    posicionMaximo = ("["+(i+1)+"],["+(j+1)+"]");
                }
                if (num [i] [j]<minimo){
                    minimo = num[i] [j];
                    posicionMinimo = ("["+(i+1)+"],["+(j+1)+"]");
                }
            }
        }
        for(int i = 0; i<filas;i++){
            System.out.print("Fila"+ (i+1) +": ");
            for(int j = 0; j<columnas;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("El maximo esta en la posicion: "+ posicionMaximo);
        System.out.println("El minimo esta en la posicion: "+ posicionMinimo);
    }

}
