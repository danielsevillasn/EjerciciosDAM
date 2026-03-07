public class Ejercicio11 {
    public static void main(String[] args) {
        int [] [] num = new int[10][10];
        int numx = num.length;
        int numy = num[0].length;
        for (int i = 0; i<numx;i++){
            for(int j = 0; j<numy;j++){
                num [i] [j] = (int) (Math.random()*(301-200)+200);
            }
        }
        for (int i = -1; i<numx;i++){
            if ( i == -1){
                for (int j = 0; j<numx; j++){
                    System.out.print("\t "+(j+1));
                }
            }else{
                System.out.print((i+1)+ "\t");
                for(int j = 0; j<numy;j++){
                    System.out.print(num[i][j]+"\t");
                }
            }
            System.out.println();
        }
        System.out.println();
        int [] diagonal = new int[10];
        for (int i = 0; i<numx;i++){
            diagonal[i] = num [i] [i];
        }
        for (int elemento : diagonal){
            System.out.print(elemento+" ");
        }
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int suma = 0;
        for (int i = 0; i < numx; i++){
            suma += diagonal[i]; 
            if(diagonal[i]>maximo){
                maximo = diagonal[i];
            }
            if(diagonal[i]<minimo){
                minimo = diagonal[i];
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("El maximo de toda la diagonal es: "+ maximo);
        System.out.println("El minimo de toda la diagonal es: "+ minimo);
        System.out.println("La media de toda la diagonal es: "+ (suma/numx));
    }
}
