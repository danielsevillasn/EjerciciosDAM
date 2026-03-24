package Ejercicios1;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>();
        int aleatorio = ((int) (Math.random() * (20 + 1 - 10) + 10));
        for(int i = 0;i < aleatorio;i++){
            numerosAleatorios.add((int)(Math.random()*101));
        }

        int suma = 0;
        int media = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for(int i = 0; i < numerosAleatorios.size();i++){
            suma += numerosAleatorios.get(i);
            if(numerosAleatorios.get(i) > maximo){
                maximo = numerosAleatorios.get(i);
            }

            if(numerosAleatorios.get(i) < minimo){
                minimo = numerosAleatorios.get(i);
            }
        }

        media = suma/numerosAleatorios.size();

        System.out.println(numerosAleatorios);
        System.out.println("Suma: "+suma +"\nMedia: "+media+"\nMaximo: "+maximo+"\nMinimo: "+minimo);
    }
}
