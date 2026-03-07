package ModularPrueba;
import ModularPrueba.Clases.Arrays;
import ModularPrueba.Clases.Datos;

public class Array {
    public static void main(String[] args) {
        int capacidad;
        capacidad = Datos.pedirEntero("la capacidad que quieres que tenga el array: ");
        int[] array = new int[capacidad];
        int n1;
        int n2;
        n1 = Datos.pedirEntero("el numero maximo que quieres que tenga el array: ");
        n2 = Datos.pedirEntero("el numero minimo que quieres que tenga el array: ");
        Arrays.rellenarArray(n1, n2, array);
        Arrays.mostrarArray1(array);
    }

}
