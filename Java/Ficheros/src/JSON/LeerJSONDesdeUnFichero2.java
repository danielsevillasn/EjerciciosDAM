package JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;
import EjemploSerialización.Persona;

public class LeerJSONDesdeUnFichero2 {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .setDateFormat("dd/MM/yyyy")
                .create();
        Type tipoListaPersonas = new TypeToken<List<Persona>>() {
        }.getType();
        try (
                InputStream is = new FileInputStream("Fichero/personas.json");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            List<Persona> personas = gson.fromJson(bufferedReader, tipoListaPersonas);
            if (personas == null || personas.isEmpty()) {
                System.out.println("El fichero no contiene personas.");
                return;
            }
            for (Persona persona : personas) {
                System.out.println("La persona se llama: " + persona.getEdad());
            }
        } catch (IOException e) {
            System.err.println("No se pudo leer el fichero: " + e.getMessage());
        }
    }
}