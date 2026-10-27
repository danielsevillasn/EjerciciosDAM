package JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;
import EjemploSerialización.Persona;

/*
Si se escriben dos objetos JSON seguidos en el mismo archivo se produce algo como {"nombre":"Miguel","edad":46}{"nombre":"Rosa","edad":56},
que no es un único documento JSON válido.
Guarda ambos objetos en una lista y serializa la lista: Gson la representa como un array JSON.
*/
public class GenerarFicheroJSONBonito2 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Miguel", 46);
        Persona p2 = new Persona("Rosa", 56);
        List<Persona> personas = Arrays.asList(p1, p2);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (Writer writer = new FileWriter("Fichero/personas.json")) {
            gson.toJson(personas, writer);
        } catch (IOException e) {
            System.err.println("No se pudo escribir el fichero: " + e.getMessage());
        }
    }
}