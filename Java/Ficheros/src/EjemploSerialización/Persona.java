package EjemploSerialización;

import java.io.Serializable;

public class Persona implements Serializable {
    private String name;
    private int edad;

    public Persona(String n, int e) {
        name = n;
        edad = e;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setEdad(int e) {
        edad = e;
    }

    public int getEdad() {
        return edad;
    }
}