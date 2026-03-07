import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce el día de la semana (lunes a viernes): ");
        String dia = s.nextLine().toLowerCase();

        System.out.print("Introduce la hora (0-23): ");
        int hora = s.nextInt();
        System.out.print("Introduce los minutos (0-59): ");
        int minutos = s.nextInt();

        int diaNumero = switch (dia) { // Convertir el día a un número (lunes = 0, martes = 1, ..., viernes = 4)
            case "lunes" -> 0;
            case "martes" -> 1;
            case "miércoles", "miercoles" -> 2;
            case "jueves" -> 3;
            case "viernes" -> 4;
            default -> {
                System.out.println("Día no válido.");
                yield -1;
            }
        };
        if (diaNumero == -1) { // Si el día no es válido, salir del programa
            s.close();
            return;
        }
        // Calcular minutos totales desde el lunes a las 00:00 hasta el momento dado
        int minutosTotales = diaNumero * 24 * 60 + hora * 60 + minutos;

        // Minutos totales hasta el viernes a las 15:00
        int minutosFinSemana = 4 * 24 * 60 + 15 * 60;

        // Diferencia entre los dos
        int minutosRestantes = minutosFinSemana - minutosTotales;

        System.out.println("Faltan " + minutosRestantes + " minutos para el fin de semana.");
        s.close();
    }
}