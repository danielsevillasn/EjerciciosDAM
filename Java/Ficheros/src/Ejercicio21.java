import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

/**
 * Contar números y palabras de un fichero de texto
 * 
 * Ejercicio21
 */
public class Ejercicio21 {
    public static void main(String[] args) throws IOException {
        File fichero = new File("ArchivoNombres.txt");
        BufferedReader reader = new BufferedReader(new FileReader(fichero));
        StreamTokenizer st = new StreamTokenizer(reader);
        int token;
        int nNúmeros = 0;
        int nPalabras = 0;
        while(true){
            token = st.nextToken();
            if(token == StreamTokenizer.TT_EOF){
                break;
            }else if (token == StreamTokenizer.TT_NUMBER){
                nNúmeros++;
            }else if (token == StreamTokenizer.TT_WORD){
                nPalabras++;
            }
        }
        System.out.println("Hay "+nNúmeros+" números en el fichero \""+fichero.getName()+"\"");
        System.out.println("Hay "+nPalabras+" palabras en el fichero \""+fichero.getName()+"\"");
        reader.close();
    }
}
