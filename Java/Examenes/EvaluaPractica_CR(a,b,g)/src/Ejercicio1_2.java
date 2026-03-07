public class Ejercicio1_2 {
    public static void main(String[] args) {
        String texto = "Hola Mundo";

        for (int i = 0; i < texto.length(); i++) { //Recorre la frase caracter por caracter gracias a que la i expresa la posicion del charAt
            System.out.println(texto.charAt(i));
        }
    }
}