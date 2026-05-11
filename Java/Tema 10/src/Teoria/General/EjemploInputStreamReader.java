package Teoria.General;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Ruben Gonzalez
 */
public class EjemploInputStreamReader{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escriba una palabra: ");
        String s1 = bf.readLine();
        System.out.println("La palabra que ha escrito es: "+s1);
        
        System.out.print("Escriba un n�mero: ");
        int s2 = bf.read();
        
        System.out.println("El numero que ha escrito es: "+s2);
        
        double numero1 = Integer.parseInt(s1, 16);
        double numero2 = s2;
        
        numero2+=numero1;

        System.out.println("La suma de los numeros escritos es: "+numero2);
    }
    
}
