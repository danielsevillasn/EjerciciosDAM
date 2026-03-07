package ModularPrueba.Clases;

public class Arrays {


    //Todos los parametros introducidos en estos metodos son parametros por referencia ya que el array se cambia en el metodo y tambien en la funcion principal
    /**
     * Rellena el array con numeros aleatorios pedidos previamente de la clase principal
     * 
     * 
     * @param numero entero encargado de establecer el maximo del array
     * @param numero entero encargado de establecer el numero minimo del array
     * @return nada
     */
    public static void rellenarArray(int numero1, int numero2, int[] array){
        for(int i = 0;i<array.length;i++){
            array[i] = (int)(Math.random()*((numero1+1)-numero2)+numero2);
        }
    }

    /**
     * Muestra el array unidimensional 
     * 
     * 
     * @param coge el array indicado en la clase principal
     * @return nada
     */
    public static void mostrarArray1(int []array){
        for(int elemento:array){
            System.out.println(elemento);
        }
    }

}
