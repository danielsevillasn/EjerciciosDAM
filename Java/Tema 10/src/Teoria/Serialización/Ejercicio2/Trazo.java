package Teoria.Serialización.Ejercicio2;

import java.io.Serializable;

public class Trazo implements Serializable {
    private static final long serialVersionUID = 1L; // Recomendado para serialización
    int x, y;
    char simbolo;

    public Trazo(int x, int y, char simbolo) {
        this.x = x;
        this.y = y;
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return "Punto(" + x + "," + y + ") con '" + simbolo + "'";
    }
}