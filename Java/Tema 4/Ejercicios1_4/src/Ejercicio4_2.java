public class Ejercicio4_2 {
    public static void main(String[] args) {
        String s = "hola mundo hola";

        String[] palabras = s.trim().split("\\s+");

        if (palabras[0].equalsIgnoreCase(palabras[palabras.length - 1])) {
            System.out.println("Empieza y termina con la misma palabra.");
        } else {
            System.out.println("No coinciden.");
        }
    }
}