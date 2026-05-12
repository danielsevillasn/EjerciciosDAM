
import java.io.IOException;
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

public class Ejercicio1y2 {
    public static void main(String[] args) throws Exception {

        Path directorio = Paths.get(".");
        if (Files.isDirectory(directorio)) {
            // método recursivo
            System.out.println("A través de método recursivo.");
            recorrerDirectorio(directorio, "");
            System.out.println();
            System.out.println("Utilizando estructura de cola.");
            recorrerDirectorioCola(directorio);
            System.out.println();
            System.out.println("Utilizando estructura de pila.");
            recorrerDirectorioPila(directorio);
            System.out.println("Utilizando estructura de arbol.");
            listarArbol(directorio, "");

        } else {
            System.out.println((Files.isRegularFile(directorio) ? "-f: " : "otra cosa") + directorio.getFileName());
        }
    }

    public static void recorrerDirectorio(Path directorio, String indentacion) {
        try {
            // Mostramos el nombre del directorio actual
            System.out.println(indentacion + "-d: " + directorio.getFileName());

            // Usamos Files.list para obtener el contenido
            Files.list(directorio).forEach(elemento -> {
                try {
                    if (Files.isDirectory(elemento)) {
                        // Si es carpeta, recursividad con un espacio más de sangría
                        recorrerDirectorio(elemento, indentacion + " ");
                    } else if (Files.isRegularFile(elemento)) {
                        // Si es archivo, mostramos nombre y tamaño (Files.size)
                        System.out.println(indentacion + " -f: " + elemento.getFileName() +
                                " (" + Files.size(elemento) + " bytes)");
                    }
                } catch (IOException e) {
                    System.err.println("Error al leer elemento: " + e.getMessage());
                }
            });
        } catch (IOException e) {
            System.err.println("Error al acceder al directorio: " + e.getMessage());
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
                    // Usamos getFileName() para mostrar solo el nombre, no la ruta completa
                    System.out.println(indentacion + "-d: " + actual.getFileName());

                    // Cambiamos DirectoryStream por Files.list como sugiere el enunciado
                    Files.list(actual).forEach(elemento -> {
                        cola.offer(elemento);
                        colaNiveles.offer(nivel + 1);
                    });
                } else if (Files.isRegularFile(actual)) {
                    // Mostramos el nombre y el tamaño en bytes
                    System.out.println(indentacion + " -f: " + actual.getFileName() +
                            " (" + Files.size(actual) + " bytes)");
                }
            } catch (IOException e) {
                System.err.println("Error accediendo a " + actual + ": " + e.getMessage());
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
                    System.out.println(indentacion + "-d: " + actual.getFileName());

                    // Usamos Files.list y lo convertimos a una lista para poder invertir el orden
                    // y que la pila se comporte de forma natural
                    Files.list(actual).sorted((p1, p2) -> p2.compareTo(p1)).forEach(elemento -> {
                        pila.push(elemento);
                        pilaNiveles.push(nivel + 1);
                    });
                } else if (Files.isRegularFile(actual)) {
                    System.out.println(indentacion + " -f: " + actual.getFileName() +
                            " (" + Files.size(actual) + " bytes)");
                }
            } catch (IOException e) {
                System.err.println("Error accediendo a " + actual + ": " + e.getMessage());
            }
        }
    }

    public static void listarArbol(Path ruta, String prefijo) {
    try {
        // Obtenemos el flujo de elementos del directorio
        Files.list(ruta).forEach(elemento -> {
            if (Files.isDirectory(elemento)) {
                // Si es directorio, imprimimos y bajamos un nivel (recursión)
                System.out.println(prefijo + "└── [D] " + elemento.getFileName());
                listarArbol(elemento, prefijo + "    ");
            } else {
                // Si es archivo, imprimimos su nombre
                System.out.println(prefijo + "├── [F] " + elemento.getFileName());
            }
        });
    } catch (IOException e) {
        System.err.println("Sin acceso a: " + ruta.getFileName());
    }
}
}
