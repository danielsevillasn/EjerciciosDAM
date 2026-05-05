package EjerciciosIntroduccion.HashMap.Ejercicio3;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        HashMap<String, Usuario> usuarios = new HashMap<String,Usuario>();

        usuarios.put("0000000A", new Usuario("Pepe", "Pepe@gmail.com",18));
        usuarios.put("0000000B", new Usuario("Juan", "Juan@gmail.com",25));
        usuarios.put("0000000C", new Usuario("Mario", "Mario@gmail.com",17));

        String dni;
        String nombre;
        String email;
        int edad;

        Scanner s = new Scanner(System.in);
        
        System.out.print("Dame un DNI que para buscar un usuario: ");
        dni = s.nextLine();

        if(usuarios.containsKey(dni)){
            System.out.println(usuarios.get(dni));
        }else{
            System.out.println("Usuario no registrado");
            System.out.println("--Registro de sesion de nuevo usuario--");
            System.out.print("Dame tu nombre: ");
            nombre = s.nextLine();
            System.out.print("Dame tu email: ");
            email = s.nextLine();
            System.out.print("Dame tu edad: ");
            edad = Integer.parseInt(s.nextLine());

            usuarios.put(dni,new Usuario(nombre, email, edad));
        }

        System.out.println("\n--Emails de los usuarios--");
        for(Usuario e : usuarios.values()){
            System.out.println(e.getEmail());
        }

        s.close();
    }
}
