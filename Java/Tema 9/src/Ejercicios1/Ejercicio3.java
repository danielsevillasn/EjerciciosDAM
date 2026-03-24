package Ejercicios1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        for(int i = 0; i< 10; i++){
            System.out.print("Dame un numero: ");
            numeros.add(Integer.parseInt(s.nextLine()));
        }

        Collections.sort(numeros);

        System.out.println(numeros);
        s.close();
    }
}
