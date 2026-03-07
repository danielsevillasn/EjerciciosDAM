public class Ejercicio3_2 {

    public static void main(String[] args) {

        String frase = "Hola   qué   tal estás amigo.";

        // 1. Eliminar el punto final
        frase = frase.substring(0, frase.length() - 1);

        // 2. Eliminar espacios al inicio y al final
        frase = frase.trim();

        // 3. Reemplazar múltiples espacios por uno solo 
        String fraseLimpia = "";
        boolean anteriorEspacio = false;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == ' ') {
                if (!anteriorEspacio) {
                    fraseLimpia += c;
                }
                anteriorEspacio = true;
            } else {
                fraseLimpia += c;
                anteriorEspacio = false;
            }
        }

        // 4. Separar por espacios
        String[] palabras = fraseLimpia.split(" ");

        System.out.println("Número de palabras: " + palabras.length);
    }
}