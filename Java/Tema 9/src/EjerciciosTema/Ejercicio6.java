package EjerciciosTema;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        HashMap<Integer, String> usuarios = new HashMap<Integer, String>();
        Scanner s = new Scanner(System.in);
        int contraseña = 0;
        String nombre = "";

        usuarios.put(1234, "Pepe");

        for (int i = 0; i < 3; i++) {
            System.out.print("Dime tu nombre de usuario: ");
            nombre = s.nextLine();
            System.out.print("Ahora dame tu contraseña: ");
            contraseña = Integer.parseInt(s.nextLine());

            if (usuarios.containsValue(nombre) && usuarios.containsKey(contraseña)) {
                System.out.println("Ha accedido al área restringida");
                break;
            }else{
                if(i == 2){
                    System.out.println("Lo siento, no tiene acceso al área restringida");
                }else{
                    System.out.println("Nombre o usuario incorrecto");
                }
            }
        }
        s.close();
    }
}
