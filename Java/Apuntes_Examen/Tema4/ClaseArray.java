import java.util.Arrays;
public class ClaseArray {
    public static void main(String[] args) {
        int [] array1 = new int[5];
        int [] array2 = new int[5];
        int [] [] arrayBidimensional = new int [3][4];
        Arrays.fill(array1, 7);
        Arrays.fill(array2,0,3, -1);
        for (int i = 0; i < arrayBidimensional.length; i++) {
            Arrays.fill(arrayBidimensional[i], i);
        }
        for (int elemento : array1) {
            System.out.print(elemento + " ");
        }
        System.out.println();
        for (int elemento : array2) {
            System.out.print(elemento + " ");
        }
        int indice = Arrays.binarySearch(array2,2,5, 0);
        int indiceInsertion = -(indice + 1);
        System.out.println("\nEl indice del elemento 0 es: " + indice);
        System.out.println("El indice de insercion del elemento 0 es: " + indiceInsertion);
        System.out.println(Arrays.toString(array1));
        for (int i = 0; i < arrayBidimensional.length; i++) {
            System.out.println(Arrays.toString(arrayBidimensional[i]));
        }
        int [] array3 = {20,5,7,9,11};
        Arrays.sort(array3);
        System.out.println("Array ordenado: " + Arrays.toString(array3));
        int [] copia = new int [10];
        System.arraycopy(array3, 0, copia, 0, array3.length);
        System.out.println("Copia del array3: " + Arrays.toString(copia));
    }
}