package JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import EjemploSerialización.Persona;

public class GeneradorJSONFormateado {
    public static void main(String args[]) {
        Persona p1 = new Persona("Miguel", 46);
        final Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String representacionJSON = gson.toJson(p1);
        System.out.println(representacionJSON);
    }
}