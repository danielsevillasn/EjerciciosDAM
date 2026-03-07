import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejercicio7_A_UT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos la fecha de nacimiento
        System.out.print("Introduce tu año de nacimiento: ");
        int anioNac = sc.nextInt();

        System.out.print("Introduce tu mes de nacimiento (1-12): ");
        int mesNac = sc.nextInt() - 1; // En GregorianCalendar los meses van de 0 a 11

        System.out.print("Introduce tu día de nacimiento: ");
        int diaNac = sc.nextInt();

        // Fecha actual
        GregorianCalendar hoy = new GregorianCalendar();
        int anioHoy = hoy.get(Calendar.YEAR);
        int mesHoy = hoy.get(Calendar.MONTH);
        int diaHoy = hoy.get(Calendar.DAY_OF_MONTH);

        // Cálculos básicos
        int edadAnios = anioHoy - anioNac;
        int edadMeses = mesHoy - mesNac;
        int edadDias = diaHoy - diaNac;

        // Convertimos condiciones en valores (true=1, false=0)
        int diaNegativo = (edadDias < 0) ? 1 : 0;
        int mesNegativo = (edadMeses - diaNegativo < 0) ? 1 : 0;

        // Ajustes automáticos sin if
        edadMeses = edadMeses - diaNegativo * 1 + 12 * mesNegativo;
        edadAnios = edadAnios - mesNegativo;
        edadDias = edadDias + diaNegativo * hoy.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Mostramos el resultado
        System.out.printf("%nTienes %d años, %d meses y %d días.%n", edadAnios, edadMeses, edadDias);

        sc.close();
    }
}

