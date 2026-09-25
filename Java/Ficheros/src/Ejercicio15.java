/**
 * Escribir un método que reciba por parámetro el número correspondiente a un
 * mes del año y la letra correspondiente al día de
 * la semana en que cae el día 1 de ese mes (‘L’ para Lunes, ‘M’ para Martes,
 * ‘X’ para Miércoles…). El método escribirá en un archivo
 * un calendario para ese mes que estará formado por todos los días del mes
 * seguidos de la letra correspondiente al día de la
 * semana en que caen. El método comprobará que los parámetros recibidos son
 * correctos y obtendrá el nombre concatenando a
 * la palabra “mes” el número de mes recibido más la extensión “.txt”.
 * 
 * Ejercicio15
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio15 {

    public static void main(String[] args) {
        generarCalendarioMes(5, "V");
    }

    /**
     * Escribe en un archivo el calendario de un mes determinado con el día de la semana.
     * 
     * @param numeroMes Número del mes (1 a 12)
     * @param diaInicio Letra del día de la semana del día 1 ('L', 'M', 'X', 'J', 'V', 'S', 'D')
     */                                                         
    public static void generarCalendarioMes(int numeroMes, String diaInicio) {
        if (numeroMes < 1 || numeroMes > 12) {
            System.out.println("El número de mes debe estar comprendido entre 1 y 12.");
        }else{
            String diaMayus = diaInicio.toUpperCase();
            String[] diasSemana = {"L", "M", "X", "J", "V", "S", "D"};
            int indiceInicio = -1;
    
            for (int i = 0; i < diasSemana.length; i++) {
                if (diasSemana[i] == diaMayus) {
                    indiceInicio = i;
                    break;
                }
            }
    
            if (indiceInicio == -1) {
                System.out.println("El día de inicio debe ser una letra válida ('L', 'M', 'X', 'J', 'V', 'S', 'D')");
                return;
            }
    
            int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int totalDias = diasPorMes[numeroMes - 1];
    
            String nombreArchivo = "mes" + numeroMes + ".txt";
    
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
                for (int dia = 1; dia <= totalDias; dia++) {
                    String letraDiaActual = diasSemana[(indiceInicio + (dia - 1)) % 7];
                    bw.write(dia + " " + letraDiaActual);
                    bw.newLine();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}