package Ejercicio1AL19_Alumno;

import Ejercicio1AL19_Alumno.metodos.Funciones;

public class Ejer16 {
    public static void main(String[] args) {
        for(int i = 1;i<99999;i++){
            if(Funciones.EsCapicua(i)){
                System.out.println(i);
            }
        }
    }

}
