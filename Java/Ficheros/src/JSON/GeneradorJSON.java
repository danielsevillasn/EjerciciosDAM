package JSON;

import com.google.gson.Gson;
import EjemploSerialización.Persona;

public class GeneradorJSON {
    public static void main(String args[]) {
        Persona p1 = new Persona("Miguel", 46);
        Gson gson = new Gson();
        String representacionJSON = gson.toJson(p1);
        System.out.println(representacionJSON);
    }
}