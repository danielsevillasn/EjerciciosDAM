public class Ejercicio7_2 {
    public static void main(String[] args) {
        String frase = "El perro corre por el parque";
        String palabra = "corre";

        if (frase.toLowerCase().contains(palabra.toLowerCase())) {
            System.out.println("La palabra está en la frase.");
        } else {
            System.out.println("No está.");
        }
    }
}