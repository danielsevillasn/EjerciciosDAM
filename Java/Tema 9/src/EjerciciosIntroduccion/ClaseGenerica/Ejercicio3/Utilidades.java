package EjerciciosIntroduccion.ClaseGenerica.Ejercicio3;

public class Utilidades {
    public static <E> void imprimirArray(E[] elementos){
        for(E e : elementos){
            System.out.println(e);
        }
    }
}
