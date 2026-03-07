package Ejercicio20AL35_Alumno;

public class Ejers_20_28 {
    public static void main(String[] args) {
        int [] numeros = funcionesArrays.generaArrayInt(10,1,10);
        int minimo = funcionesArrays.minimoArrayInt(numeros);
        System.out.println("El minimo del array es: "+minimo);
    }
}
