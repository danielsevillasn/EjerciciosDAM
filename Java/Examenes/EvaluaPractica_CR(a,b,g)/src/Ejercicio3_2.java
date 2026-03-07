public class Ejercicio3_2 {

    public static void main(String[] args) {

        String frase = "Hola   qué   tal estás amigo.";
        frase = frase.substring(0, frase.length() - 1); //Coge desde la posicion 0 hasta la posicion final menos el punto y se queda con eso
        frase = frase.trim(); //Sirve para eliminar esos espacios que se dan al inicio y al final para operar con mayor exactitud
        
        String fraseLimpia = "";
        boolean anteriorEspacio = false;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i); //Le da a la variable el valor del caracter situado en la posicion i
            if (c == ' ') { //Sirve para ir validando si el caracter anterior es un espacio 
                if (!anteriorEspacio) { //Si la variable esta en falso agrega un espacio al string bueno
                    fraseLimpia += c;
                }
                anteriorEspacio = true;
            } else {
                fraseLimpia += c;
                anteriorEspacio = false;
            }
        }

        String[] palabras = fraseLimpia.split(" "); //El regex sirve para describir un patron de texto y lo busca de la manera que tu quieras
        //En este caso busca los espacios entre las palabras y divide cada una de ellas en diferentes string del array palabras

        System.out.println("Número de palabras: " + palabras.length);
    }
}