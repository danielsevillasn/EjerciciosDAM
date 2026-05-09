package BlackJack.src;
import java.util.ArrayList;

import Clases.Baraja;
import Clases.Crupier;
import Herramientas.PideDatos;
import Clases.Jugador;
import Clases.Rico;
import Clases.Pobre;
public class Juego {
    public static void main(String[] args) {
        String[] mensajes = {"\n1.Empezar a jugar Blackjack", "\n2.Salir\n"};
        boolean salir = false;
        do {
            String opcion = PideDatos.datosMenu(mensajes);
            switch (opcion) {
                case "1":
                    jugar();
                    break;
                case "2":
                    System.out.println("Adios.");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion desconocida.");
                    break;
            }
        } while (!salir);
    }

    public static void jugar() {
        boolean repetir = true;
        ArrayList<Jugador> participantes = new ArrayList<>();
        Crupier crupier = new Crupier();
        participantes.add(crupier);

        String opcion = PideDatos.datosEscritos("Quieres registrar nuevos jugadores?(s/n) ");
        if (opcion.equals("s")) {
            int cantidad = PideDatos.datosNumericos("Número de jugadores a registrar: ");
            for (int i = 1; i <= cantidad; i++) {
                String status = PideDatos.datosEscritos("El jugador es rico?(s/n) ");
                if (status.equals("s")) {
                    participantes.add(new Rico(PideDatos.datosEscritos("Introduce el nombre del jugador " + i)));
                } else {
                    participantes.add(new Pobre(PideDatos.datosEscritos("Introduce el nombre del jugador " + i)));
                }
            }
        }

        do {
            Baraja baraja = new Baraja();
            baraja.barajar();
            opcion = PideDatos.datosEscritos("Quereis hacer apuestas? s/n: ");
            if (opcion.equals("s")) {
                for (Jugador jugador : participantes) {
                    jugador.apostar();
                }
            }
    
            System.out.println("Se van a repartir las cartas.");
            for (int i = 0; i < 2; i++) {//2 cartas por jugador
                for (Jugador jugador : participantes) {
                    jugador.getMano().add(baraja.repateCarta());
                }
            }
    
            for (Jugador jugador : participantes) {
                if (!(jugador instanceof Crupier)) {
                    System.out.println("Es el turno de: " + jugador.getNombre() + ", tiene: " + jugador.puntuacion() + " puntos.");
                    opcion = PideDatos.datosEscritos("Quieres coger carta?(s/n) ");
                    while (opcion.equals("s") && jugador.puntuacion() < 21) {
                        jugador.getMano().add(baraja.repateCarta());
                        System.out.println("Ahora tienes: " + jugador.puntuacion() + " puntos.");
                        opcion = PideDatos.datosEscritos("Quieres otra? (s/n): ");
                    }
                }
            }
    
            System.out.println("Turno del crupier.");
            System.out.println("El crupier descubre sus cartas: " + crupier.getMano());
    
            while (crupier.siguePidiendo()) {
                System.out.println("El crupier se chupa otra");
                crupier.getMano().add(baraja.repateCarta());
                System.out.println("Puntos del crupier: " + crupier.puntuacion());
            }
    
            System.out.println("\n======= RESULTADO =======");
            int puntosCrupier = crupier.puntuacion();
    
            for (Jugador jugador : participantes) {
                if (!(jugador instanceof Crupier)) {
                    int puntosJ = jugador.puntuacion();
                    System.out.println(jugador.getNombre() + " (" + puntosJ + " puntos) vs Crupier (" + puntosCrupier + " puntos): ");
    
                    if (puntosJ > 21) {
                        System.out.println("Has perdido, te pasaste de 21.");
                    } else if (puntosCrupier > 21 || puntosJ > puntosCrupier) {
                        System.out.println("El jugador gana.");
                    } else if (puntosJ == puntosCrupier) {
                        System.out.println("Empate");
                    } else {
                        System.out.println("Has perdido. El crupier te ha ganado");
                    }
                }
            }
    
            opcion = PideDatos.datosEscritos("Quereis otra ronda?(s/n): ");
            if (!opcion.equals("s")) {
                repetir = false;
            }
            
            for (Jugador jugador : participantes) {
                jugador.getMano().clear();
            }
        } while (repetir);
    }
}
