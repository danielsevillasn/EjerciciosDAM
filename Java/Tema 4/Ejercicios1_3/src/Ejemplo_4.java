public class Ejemplo_4 {
    public static void main(String[] args) {
        String parrafo = "En un lugar de La Mancha, de cuyo nombre no quiero acordarme,\nno ha mucho tiempo que vivía un hidalgo de los de lanza en astillero,\nadarga antigua, rocín flaco y galgo corredor.";
        System.out.println(parrafo);
        char[] caracteres = parrafo.toCharArray();
        parrafo = parrafo.trim();
        for (int i = 0; i < caracteres.length; i++) {
            if(caracteres[i] == 'd'&& caracteres[i+1] == 'e'){
                System.out.println("Encontrado 'de' en la posición: " + i);
            }
        }
    }
}
