package JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import EjemploSerialización.Persona;


public class GenerarFicheroJSONBonito {
    public static void main(String args[]) throws IOException {
        Persona p = new Persona("Miguel", 46);
        Writer writer = new FileWriter("Fichero/persona.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        gson.toJson(p, writer);
        writer.close();
    }
}