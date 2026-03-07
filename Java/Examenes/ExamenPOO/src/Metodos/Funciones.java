package Metodos;

import java.util.Scanner;
import Clases.Password;

/**
 * Clase funciones que sirve para simplificar el metodo main y que incluye metodos como pedir enteros
 * 
 * @author Dani
 */
public class Funciones {
    static Scanner s = new Scanner(System.in);
    /**
     * Pide un numero tipo entero y lo devuelve
     * 
     * @param nada
     * @return Dato introducido por teclado tipo string
     */
    public static int pedirPassword(){
        System.out.print("Introduce la longitud del password: ");
        int dato = s.nextInt();
        return(dato);
    }
    /**
     * Imprime la lista de todas las contraseñas
     * 
     * @param contraseñas extrae los objetos del array creado previamente
     * @param contador para ver la cantidad de contraseñas
     */
    public static void listaContraseñas(Password[] contraseñas, int contador){
        System.out.println("LISTA DE CONTRASEÑAS");
        for(int i = 0;i<contador;i++){
            System.out.println(contraseñas[i]);
        }
    }
    /**
     * Sirve para agregar la longitud y crear las contraseñas
     * 
     * @param contraseñas extrae los objetos del array creado previamente
     * @return contador para ver cuantas contraseñas se han creado
     */
    public static int creacionLongitud(Password[] contraseñas){
        int longitud = 1;
        int contador = 0;
        String fin = "";
        boolean salir = false;
        while(!salir && contador<contraseñas.length){
            System.out.println("Pulse intro para continuar, 0 para dejar de crear más contraseñas");
            fin = s.nextLine();
            if(fin.equals("0")){
                salir = true;
            }else{
                longitud = Funciones.pedirPassword();
                s.nextLine();
                if(longitud == 0){
                    salir = true;
                }else{
                    contraseñas[contador++] = new Password(longitud);
                }
            }
        }
        return contador;
    }
}
