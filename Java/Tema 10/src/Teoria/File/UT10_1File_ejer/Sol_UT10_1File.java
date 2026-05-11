
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Lista todos los archivos de un árbol de directorios. 
 * Tiene que entrar en tantas carpetas como tenga el árbol (similar a lo que hace el comando tree en linux).
 */

public class Sol_UT10_1File {
    public static void main(String[] args) throws Exception {

        Path directorio = Paths.get(".");
        if (Files.isDirectory(directorio))
        {
            //método recursivo
            System.out.println("A través de método recursivo.");
            recorrerDirectorio(directorio, "");
            System.out.println();
            System.out.println("Utilizando estructura de cola.");
            recorrerDirectorioCola(directorio);
            System.out.println();
            System.out.println("Utilizando estructura de pila.");
            recorrerDirectorioPila(directorio);
            
        }
        else
        {
            System.out.println((Files.isRegularFile(directorio) ? "-f: " : "otra cosa") + directorio.getFileName());
        }
    }

    public static void recorrerDirectorio(Path directorio, String indentacion)
    {

        try
        {
            System.out.println(indentacion + "-d " + directorio.getFileName());
            DirectoryStream<Path> contenido = Files.newDirectoryStream(directorio);
            for (Path elemento : contenido)
            {
                if (Files.isDirectory(elemento))
                {
                    recorrerDirectorio(elemento, indentacion + " ");
                }
                else
                {
                    System.out.println(indentacion + " -f: " + elemento.getFileName());
                }
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void recorrerDirectorioCola(Path directorioInicial) {
        Queue<Path> cola = new LinkedList<>();
        Queue<Integer> colaNiveles = new LinkedList<>();

        cola.offer(directorioInicial);
        colaNiveles.offer(0);
        
        while (!cola.isEmpty()) {
            Path actual = cola.poll();
            int nivel = colaNiveles.poll();
            String indentacion = " ".repeat(nivel);
            try {
                if (Files.isDirectory(actual)) {
                    System.out.println(indentacion + "-d: " + actual);
                    try (DirectoryStream<Path> contenido = Files.newDirectoryStream(actual)) {
                        for (Path elemento : contenido) {
                            cola.offer(elemento);
                            colaNiveles.offer(nivel + 1);
                        }
                    }
                } else {
                    System.out.println(indentacion + "-f: " + actual);
                }
            } catch (IOException e) {
                System.out.println("Error accediendo a " + actual + ": " + e.getMessage());
            }
        }
    }

    public static void recorrerDirectorioPila(Path directorioInicial) {
        Stack<Path> pila = new Stack<>();
        Stack<Integer> pilaNiveles = new Stack<>();

        pila.push(directorioInicial);
        pilaNiveles.push(0);

        while (!pila.isEmpty()) {
            Path actual = pila.pop();
            int nivel = pilaNiveles.pop();
            String indentacion = " ".repeat(nivel);

            try {
                if (Files.isDirectory(actual)) {
                    System.out.println(indentacion + "-d: " + actual);
                    try (DirectoryStream<Path> contenido = Files.newDirectoryStream(actual)) {
                        // Necesitamos invertir el orden para procesar como pila
                        Stack<Path> temp = new Stack<>();
                        Stack<Integer> tempNiveles = new Stack<>();
                        
                        for (Path elemento : contenido) {
                            temp.push(elemento);
                            tempNiveles.push(nivel + 1);
                        }
                        while (!temp.isEmpty()) {
                            pila.push(temp.pop());
                            pilaNiveles.push(tempNiveles.pop());
                        }
                    }
                } else {
                    System.out.println(indentacion + "-f: " + actual);
                }
            } catch (IOException e) {
                System.out.println("Error accediendo a " + actual + ": " + e.getMessage());
            }
        }
    }
}
