package Ejercicio20AL35_Alumno;

public class funcionesArrays {

    /**
     * Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimi y máximo) se indica como parámetro
     * 
     * @param n numero limite del array
     * @param minimo numero minimo del intervalo de numeros aleratorios
     * @param maximo numero maximo del intervalo de numeros aleratorios
     * @return array con numeros aleatorios
     */
    public static int [] generaArrayInt(int n, int minimo, int maximo){
        int [] array = new int[n];
        for(int i = 0;i<array.length;i++){
            array[i] = (int)(Math.random()*(maximo-minimo)*minimo);
        }
        return array;
    }

    /**
     * Devuelve el mínimo del array que se pasa como parametro
     * 
     * @param x array
     * @return minimo
     */
    public static int minimoArrayInt(int [] x){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<x.length;i++){
            if(x[i]<min){
                min = x[i];
            }
        }
        return min;
    }
}
