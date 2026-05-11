package Teoria.Streams.UT10E2ReadWrite_Ejemplos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UT10E2ReadWrite_Ejemplo2 {
    
    public static void main(String[] args) throws IOException {
        
        // Ejemplo de uso de Files para escribir (binario)
        System.out.println("----- Usando Arrays -----");
        Path outputFile = Paths.get("BytesSalida.txt");
        try {
            byte[] contenido = "Datos de salida".getBytes(StandardCharsets.UTF_8);
            //al escribir bytes no tengo que especificar el juego de caracteres
            Files.write(outputFile, contenido, StandardOpenOption.WRITE, 
                        StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Archivo BytesSalida.txt escrito usando Files.write().");
        } catch (IOException e) {
            System.out.println("Error con Files.write(): " + e);
        }
        
        // Ejemplo para crear y escribir en un fichero líneas
        System.out.println("----- Creando un archivo no binario -----");
        Path outputFile2 = Paths.get("numeros.txt");
        try {
            List<String> lines = new ArrayList<>();
            lines.add("Mis números:");
            
            for (int i = 0; i < 20; i++) {
                lines.add(Integer.toString(i));
            }
            //al escribir texto debo especificar el juego de caracteres
            Files.write(outputFile2, lines, Charset.defaultCharset(), 
                       StandardOpenOption.WRITE, StandardOpenOption.CREATE, 
                       StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Archivo fichero.txt escrito usando Files.write().");
        } catch (IOException e) {
            System.out.println("Error al escribir el fichero " + e.getMessage());
        }
        
        // Ejemplo para leer datos de un fichero binario
        System.out.println("----- Leyendo un archivo binario con arrays -----");
        Path inputFile = Paths.get("BytesSalida.txt");
        try {
            byte[] contenidos = Files.readAllBytes(inputFile); 
            System.out.println("Contenido del archivo:");
            System.out.println(Arrays.toString(contenidos)); // Muestra bytes en formato [x, y, z]
        } catch(IOException e) {
            System.out.println("Error al leer el fichero " + e.getMessage());
        }
        
        // Ejemplo de uso de la clase Scanner para leer archivos
        System.out.println("----- Leyendo numeros.txt con Scanner -----");
        Path inputFile2 = Paths.get("numeros.txt");
        try{
            Scanner sc = new Scanner(inputFile2);
            while(sc.hasNext()){
                System.out.println("Número: " + sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e){
            System.out.println("No se encontró el archivo numeros.txt");
        } catch (IOException e) {
            System.out.println("Problema con la lectura de numeros.txt");
        }
    }
}