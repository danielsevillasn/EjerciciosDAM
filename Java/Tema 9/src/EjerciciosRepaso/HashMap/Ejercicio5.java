package EjerciciosRepaso.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        HashMap<String,String> usuarios = new HashMap<>();
        Scanner s = new Scanner(System.in);

        usuarios.put("Pepe","pepe");
        usuarios.put("Juan","juan");
        usuarios.put("Mario","mario");

        int intentos = 1;
        while(true){
            System.out.print("Dame tu nombre: ");
            String nombre = s.nextLine();
    
            System.out.print("Ingresa tu contraseña: ");
            String contraseña = s.nextLine();

            if(usuarios.get(nombre) != null){
                if(usuarios.get(nombre).equalsIgnoreCase(contraseña)){
                    System.out.println("Ha accedido al área restringida");
                    break;
                }
            }
            if(intentos == 3){
                System.out.println("Lo siento, no tiene acceso al área restringida");
                break;
            }
            System.out.println("\nIntente de nuevo\n");
            intentos++;
        }

        s.close();
    }
}
