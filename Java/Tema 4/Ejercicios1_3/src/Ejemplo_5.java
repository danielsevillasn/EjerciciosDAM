import java.util.Scanner;
public class Ejemplo_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String parrafo = "En un lugar de La Mancha, de cuyo nombre no quiero acordarme,\nno ha mucho tiempo que vivía un hidalgo de los de lanza en astillero,\nadarga antigua, rocín flaco y galgo corredor.";
        System.out.println(parrafo);
        char[] caracteres = parrafo.toCharArray();
        parrafo = parrafo.trim();
        for (int i = 0; i < caracteres.length; i++) {
            if(caracteres[i] == 'd'&& caracteres[i+1] == 'e'){
                caracteres[i] = ' ';
                caracteres[i+1] = ' ';
            }
        }
        System.out.println();
        for(int i = 0; i< caracteres.length;i++){
            System.out.print(caracteres[i]);
        }
        System.out.println();
        String palabra = "";
        char [] palabras = palabra.toCharArray();
        while(!palabra.equalsIgnoreCase("Salir")){
            System.out.println("Introduzca la palabra que quieras borrar o 'Salir' para terminar:");
            palabra = s.nextLine();
            palabras = palabra.toCharArray();
            for (int i = 0; i < caracteres.length; i++) {
                for(int j = 0; j<palabras.length;j++){
                    if(caracteres[i+j] == palabras [j]){
                        if(j == palabras.length -1){
                            for(int k = 0; k<palabras.length;k++){
                                caracteres[i+k] = ' ';
                            }
                        }
                    }else{
                        break;
                    }
                }
            }
        }
    }
}
