package JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import EjemploSerialización.Persona;

public class LeerJSONDesdeUnFichero {
    public static void main(String args[]) throws FileNotFoundException {
        Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
        InputStream is = new FileInputStream("Fichero/persona.json");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
        Persona p = gson.fromJson(bufferedReader, Persona.class);
        System.out.println("La persona se llama: " + p.getName());
    }
}