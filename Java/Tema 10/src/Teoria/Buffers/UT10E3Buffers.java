


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class UT10E3Buffers {

    public static void main(String[] args) {
        
        // Escritura de líneas en fichero sin BufferedWriter
        System.out.println("----- Escribiendo sin Buffer -----");
        long tInicial, tFinal;
        int numeroLineas = 5000;
        tInicial = System.currentTimeMillis();
        Path outputFile = Paths.get("escribirFileWriter.txt");
        try{           
            for (int i = 0; i < numeroLineas; i++) {
                String linea = Integer.toString(i) + "\n";
                //Files.write solo escribe bytes o String -parámetro charset-
                Files.write(outputFile, linea.getBytes(), StandardOpenOption.WRITE,
                                StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            }            
        } catch (IOException e){
            System.out.println("Error al escribir el fichero " + e.getMessage());
        }

        tFinal = System.currentTimeMillis();
        System.out.println("Tiempo en milisegundos (Files.write) "+ numeroLineas +" líneas: " + (tFinal - tInicial) + " ms.");
        
        
        // Escritura de líneas en fichero con BufferedWriter
        System.out.println("----- Escribiendo con Buffer -----");
        tInicial = System.currentTimeMillis();
        Path outputFile2 = Paths.get("escribirBufferedWriter.txt");
        try{
            BufferedWriter bw = Files.newBufferedWriter(outputFile2, Charset.defaultCharset(),StandardOpenOption.WRITE,
                                                        StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            for (int i = 0; i < numeroLineas; i++) {
                bw.write(Integer.toString(i), 0, Integer.toString(i).length());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e){
            System.out.println("Error al escribir el fichero " + e.getMessage());
        }

        tFinal = System.currentTimeMillis();
        tFinal = System.currentTimeMillis();
        tFinal = System.currentTimeMillis();
        System.out.println("Tiempo en milisegundos (BufferedWriter) "+ numeroLineas +" líneas: " + (tFinal - tInicial) + " ms.");


        // Contando la líneas de un archivo sin buffer
        System.out.println("----- Leyendo sin Buffer -----");
        long contadorCaracteres = 0;
        tInicial = System.currentTimeMillis();
        Path inputFile = Paths.get("escribirFileWriter.txt");
        try{
            List<String> contenido = Files.readAllLines(inputFile);  
            tFinal = System.currentTimeMillis();
            System.out.println("Tiempo en milisegundos (Files.readAllLines) "+ contenido.size() +" caracteres: " + (tFinal - tInicial) + " ms.");                     
        } catch (IOException e){
            System.out.println("Error al leer el fichero " + e.getMessage());
        }
      
        
        // Contando la líneas de un archivo con buffer
        System.out.println("----- Leyendo con Buffer -----");
        contadorCaracteres = 0;
        tInicial = System.currentTimeMillis();
        
        try{
            BufferedReader br = Files.newBufferedReader(inputFile, Charset.defaultCharset());            
            
            while ( br.readLine() != null) {
                contadorCaracteres++;                
            }
            tFinal = System.currentTimeMillis();
            br.close();
            
            System.out.println("Tiempo en milisegundos (BufferedReader) "+ contadorCaracteres +" caracteres: " + (tFinal - tInicial) + " ms.");
        } catch (IOException e){
            System.out.println("Error al leer el fichero " + e.getMessage());
        }
        
    }

}