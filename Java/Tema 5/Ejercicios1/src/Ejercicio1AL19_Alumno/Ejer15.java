package Ejercicio1AL19_Alumno;

import Ejercicio1AL19_Alumno.metodos.Funciones;

public class Ejer15 {
    public static void main(String[] args) {
        for(int i=1;i<1000;i++){
            if(Funciones.esPrimo(i)){
                System.out.print(i+" ");
            }
        }
    }

}
