package SevillaNavarreteDaniel.Principal;

import SevillaNavarreteDaniel.Clases.BarajaEspa;
import SevillaNavarreteDaniel.Clases.BarajaFran;
import SevillaNavarreteDaniel.Secundaria.Salida;

/**
 * Clase ejecutable con todo el flujo del juego
 * 
 * @author Dani S
 */
public class EjecutarJuego {
    /**
     * Método que contiene todo el flujo del juego
     */
    public static void inicio() {
        int opcion = -1;
        while (opcion != 0) {

            opcion = Salida.menu("MENU", "Baraja española", "Baraja Francesa");
            int opcionEspañola = -1;
            switch (opcion) {
                case 1:
                    opcionEspañola = Salida.menu("ELIGE", "jugar con 8 y 9", "jugar sin 8 y 9");
                    switch (opcionEspañola) {
                        case 1:
                            barajaEspañola(true);
                            break;
                        case 2:
                            barajaEspañola(false);
                            break;
                        case 0:
                            System.out.println("Volviendo al menu principal...");
                            break;

                        default:
                            System.out.println("Opcion invalida.");
                            break;
                    }
                    break;
                case 2:
                    getBarajaFrancesa();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * Flujo de baraja francesa
     * 
     */
    private static void getBarajaFrancesa() {
        BarajaFran barajaFrancesa = new BarajaFran();
        System.out.println("Hay " + barajaFrancesa.getNumCartas() + " mostrando las cartas de la baraja");
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                barajaFrancesa.mostrarCartas("cartasBaraja");
                System.out.println("Barajando...");
                barajaFrancesa.darCartaMesa();
                barajaFrancesa.mostrarCartas("cartasMesa");
                System.out.println(
                        "\n Hay " + barajaFrancesa.getNumCartas() + " cartas disponibles en la baraja");
            } else {
                barajaFrancesa.darCartaMesa();
                barajaFrancesa.mostrarCartas("cartasMesa");
                barajaFrancesa.mostrarCartas("cartasDadas");
                barajaFrancesa.mostrarCartas("cartasBaraja");
            }
        }
    }

    /**
     * Flujo de baraja española
     * 
     * @param incluye_8_9 si tiene o no 8 y 9
     */
    private static void barajaEspañola(boolean incluye_8_9) {
        BarajaEspa barajaEspañola = new BarajaEspa(incluye_8_9);
        System.out.println("Hay " + barajaEspañola.getNumCartas() + " mostrando las cartas de la baraja");
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                barajaEspañola.mostrarCartas("cartasBaraja");
                System.out.println("Barajando...");
                barajaEspañola.darCartaMesa();
                barajaEspañola.mostrarCartas("cartasMesa");
                System.out.println("\n Hay " + barajaEspañola.getNumCartas() + " cartas disponibles en la baraja");
            } else {
                barajaEspañola.darCartaMesa();
                barajaEspañola.mostrarCartas("cartasMesa");
                barajaEspañola.mostrarCartas("cartasDadas");
                barajaEspañola.mostrarCartas("cartasBaraja");
            }
        }
    }
}
