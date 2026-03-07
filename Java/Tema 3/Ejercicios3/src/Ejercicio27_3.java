import java.util.Scanner;
public class Ejercicio27_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
        String jugador = s.next();
        while(true){
            if((jugador.equals("piedra")) || (jugador.equals("papel")) ||  (jugador.equals("tijera"))){
                break;
            }
            else{
                System.out.println("Error");
                System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
                jugador = s.next();
                s.nextLine();
            }
        }
        int opcion1;
        if (jugador.equals("piedra")){
            opcion1 = 1;
        }else if (jugador.equals("papel")){
            opcion1 = 2;
        } else{
            opcion1 = 3;
        }
        int opcion2 = (int)(Math.random()*3+1); //Numero entre 1 y 3
        switch (opcion2) {
            case 1:
            System.out.println("Turno del ordenador: piedra");
            break;
            case 2:
            System.out.println("Turno del ordenador: papel");
            break;
            case 3:
            System.out.println("Turno del ordenador: tijera");
            break;
        }
        if (opcion1 == opcion2){
            System.out.println("Empate");
        }
        else if ((opcion1 == 1) && (opcion2 == 2) || (opcion1 == 2) && (opcion2 == 3) || (opcion1 == 3) && (opcion2 == 1)){
            System.out.println("Gana el ordenador");
        }
        else{
            System.out.println("Gana el jugador");
        }
        s.close();
    }

}
