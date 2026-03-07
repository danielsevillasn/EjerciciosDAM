public class Ejercicio6_2 {
    public static void main(String[] args) {
        String texto = "Esta es la primera frase. Esta es la segunda frase.";

        String[] frases = texto.split("\\.");

        for (int i = 0; i < frases.length; i++) {
            String f = frases[i].trim();
            if (!f.isEmpty()) {
                String[] palabras = f.split("\\s+");
                System.out.println("Frase " + (i + 1) + ": " + palabras.length + " palabras");
            }
        }
    }
}