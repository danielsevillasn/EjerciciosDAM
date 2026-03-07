package funciones;

public class ClasePrimos {
    /**
     * Mira si el numero introducido en el parametro es primo o no
     * 
     * @param pide un numero entero 
     * @return devuelve si el numero es primo o no
     */
    public static boolean EsPrimo(int n){
        for(int i = 2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
