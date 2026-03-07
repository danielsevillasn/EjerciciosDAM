package Ejercicio3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws Exception{
        Exception[] excepciones = new Exception[5];

        excepciones[0] = new NumberFormatException();
        excepciones[1] = new IOException();
        excepciones[2] = new FileNotFoundException();
        excepciones[3] = new IndexOutOfBoundsException();
        excepciones[4] = new ArithmeticException();

        int aleatorio = (int) (Math.random()*excepciones.length);

        for(int i = 0; i<excepciones.length;i++){
            if(i == aleatorio){
                throw excepciones[i];
            }
        }
    }
}
