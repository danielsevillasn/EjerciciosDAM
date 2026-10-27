package JSON;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

import EjemploSerialización.Persona;

public class GeneradorJSONObjetos {
    public static void main(String args[]) {
        String persona1JSON = "{\"nombre\":\"Miguel\",\"id\":46}";
        String persona2JSON = "{\"nombre\":\"Luisa\",\"id\":55}";
        String personasJSON = "[" + persona1JSON + "," + persona2JSON + "]";
        Gson gson = new Gson();
        Type tipoListaPersona = new TypeToken<List<Persona>>() {
        }.getType();
        List<Persona> personas = gson.fromJson(personasJSON, tipoListaPersona);
        System.out.println("Hay " + personas.size() + " personas.");
    }
}
