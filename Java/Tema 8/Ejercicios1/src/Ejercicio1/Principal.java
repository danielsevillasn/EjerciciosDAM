package Ejercicio1;

import java.util.InputMismatchException;

public class Principal {
    public static void main(String[] args) {
        int[] numeros = new int[6];
        int max = Integer.MIN_VALUE;
        boolean datoValido ;
        for(int i = 0; i<numeros.length;i++){
            datoValido = false;
            do{
                try{
                    numeros[i] = Metodo.pideEntero("Dame un numero entero: ");
                    datoValido = true;
                }catch(InputMismatchException e){
                    System.out.println("Lo introducido no es un entero");
                }
            }while(!datoValido);
            if(numeros[i]>max){
                max = numeros[i];
            }
        }
        System.out.println("El número máximo es: "+max);
    }
}
