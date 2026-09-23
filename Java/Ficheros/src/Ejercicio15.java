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
        // Ejemplo de uso: Mes 5 (Mayo), empezando en Viernes ('V')
        generarCalendarioMes(5, 'V');
    }

    /**
     * Escribe en un archivo el calendario de un mes determinado con el día de la semana.
     * 
     * @param numeroMes Número del mes (1 a 12)
     * @param diaInicio Letra del día de la semana del día 1 ('L', 'M', 'X', 'J', 'V', 'S', 'D')
     */
    public static void generarCalendarioMes(int numeroMes, char diaInicio) {
        // 1. Validar el número de mes
        if (numeroMes < 1 || numeroMes > 12) {
            System.out.println("Error: El número de mes debe estar comprendido entre 1 y 12.");
        }else{
            // 2. Normalizar y validar la letra del día de inicio
            char diaMayus = Character.toUpperCase(diaInicio);
            char[] diasSemana = {'L', 'M', 'X', 'J', 'V', 'S', 'D'};
            int indiceInicio = -1;
    
            for (int i = 0; i < diasSemana.length; i++) {
                if (diasSemana[i] == diaMayus) {
                    indiceInicio = i;
                    break;
                }
            }
    
            if (indiceInicio == -1) {
                System.err.println("Error: El día de inicio debe ser una letra válida ('L', 'M', 'X', 'J', 'V', 'S', 'D').");
                return;
            }
    
            // 3. Obtener el número de días del mes (año estándar, febrero con 28 días)
            int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int totalDias = diasPorMes[numeroMes - 1];
    
            // 4. Generar el nombre del archivo: "mes" + numeroMes + ".txt"
            String nombreArchivo = "mes" + numeroMes + ".txt";
    
            // 5. Escritura en el archivo mediante Try-With-Resources
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
                for (int dia = 1; dia <= totalDias; dia++) {
                    // Cálculo cíclico del día de la semana correspondiente
                    char letraDiaActual = diasSemana[(indiceInicio + (dia - 1)) % 7];
                    bw.write(dia + " " + letraDiaActual);
                    bw.newLine();
                }
                System.out.println("Calendario generado con éxito en el archivo: " + nombreArchivo);
            } catch (IOException e) {
                System.err.println("Ocurrió un error al escribir el archivo: " + e.getMessage());
            }
        }
    }
}