package Ejercicios1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> cadenas = new ArrayList<String>();
        Scanner s = new Scanner(System.in);

        for(int i = 0; i< 10; i++){
            System.out.print("Dame una cadena: ");
            cadenas.add(s.nextLine());
        }

        Collections.sort(cadenas);

        System.out.println(cadenas);
        s.close();
    }
}
