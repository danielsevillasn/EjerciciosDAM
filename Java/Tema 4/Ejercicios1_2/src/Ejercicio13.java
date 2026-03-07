public class Ejercicio13 {
    public static void main(String[] args) {
        String [] pais = {"España", "Rusia", "Japón", "Australia"};
        int [] [] num = new int[4][10];
        int numx = num.length;
        int numy = num[0].length;
        for(int i = 0; i<numx;i++){
            for(int j = 0; j<numy;j++){
                num[i][j] = (int) (Math.random()*(211-140)+140);
            }
        }
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int suma = 0;
        int [] max = new int[4];
        int [] min = new int[4];
        int [] media = new int [4];
        for(int i = 0; i<numx; i++){
            maximo = Integer.MIN_VALUE;
            minimo = Integer.MAX_VALUE;
            suma = 0;
            for(int j = 0; j<numy;j++){
                suma += num[i][j]; 
                if(num[i][j]>maximo){
                    maximo = num[i][j];
                }
                if(num[i][j]<minimo){
                    minimo = num[i][j];
                }
            }
            max [i] = maximo;
            min [i] = minimo;
            media [i] = suma/numy;
        }
        for(int i = -1; i<numx;i++){
            if ( i == -1 ){
                System.out.print("\t\t\t\t\t\t     MED MIN MAX");
            }else{
                System.out.printf("%9s: ", pais[i]);
            for(int j = 0; j<numy;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.print("| "+media[i]+" "+min[i]+" "+max[i]);
            }
            System.out.println();
        }
    }

}
