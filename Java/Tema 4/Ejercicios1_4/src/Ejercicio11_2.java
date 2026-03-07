public class Ejercicio11_2 {
    public static void main(String[] args) {
        String texto = "Esta es una palabraextraordinaria para analizar en este ejercicio.";

        texto = texto.trim();
        texto = texto.substring(0, texto.length() - 1);

        String[] palabras = texto.split("\\s+");

        // a) palabra más larga
        String masLarga = "";
        int posicion = 0;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > masLarga.length()) {
                masLarga = palabras[i];
                posicion = i + 1;
            }
        }

        System.out.println("Palabra más larga: " + masLarga);
        System.out.println("Posición: " + posicion);
        System.out.println("Longitud: " + masLarga.length());

        // b) palabras 8–16 letras con más de 3 'a'
        int contador = 0;

        for (String pOriginal : palabras) {
            String p = pOriginal.toLowerCase();
            if (p.length() >= 8 && p.length() <= 16) {
                int cantA = 0;

                for (int j = 0; j < p.length(); j++) {
                    if (p.charAt(j) == 'a') cantA++;
                }

                if (cantA > 3) contador++;
            }
        }

        System.out.println("Palabras entre 8 y 16 letras con más de 3 'a': " + contador);
    }
}