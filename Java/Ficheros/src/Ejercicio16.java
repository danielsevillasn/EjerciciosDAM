import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Escribir un método que reciba por parámetro un array de cadenas de caracteres
 * y el nombre
 * de un archivo. El método volcará el contenido del array de cadenas en el
 * archivo especificado.
 * Realizar otro método que reciba por parámetro el nombre del archivo de texto
 * anterior y
 * muestre su contenido por pantalla.
 * 
 * Ejercicio16
 */
public class Ejercicio16 {
    public static void main(String[] args) throws IOException {
        String[] cadena = {"Pepe","Juan","Mario"};
        ingresoArrayEnArchivo(cadena, "salida.txt");
        leerArchivo("salida.txt");
    }

    /**
     * Método que sirve para volcarel contenido del array de cadenas en el
     * archivo especificado
     * 
     * @param cadenas cadena de caracteres 
     * @param nombreArchivo string que define el nombre del archivo
     * @throws IOException excepcion que salta al recibir un fichero no valido
     */
    private static void ingresoArrayEnArchivo(String[] cadenas, String nombreArchivo) throws IOException {
        BufferedWriter bw = new BufferedWriter( new FileWriter(nombreArchivo));
        for(int i = 0; i < cadenas.length;i++){
            bw.write(cadenas[i]);
        }
        bw.flush();
        bw.close();
    }

    /**
     * Lee el archivo pasado por parametro 
     * 
     * @param nombreArchivo string que define el nombre del archivo
     * @throws IOException excepcion que salta al recibir un fichero no valido
     */
    private static void leerArchivo(String nombreArchivo) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
        String linea = "";

        while(linea != null){
            System.out.print(linea);
            linea = br.readLine();
        }
        System.out.println();

        br.close();
    }
}
