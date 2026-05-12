package Teoria.Serialización.Ejercicio1;

import java.io.*;
import java.util.Scanner;

// Clase que encapsula el estado de la partida para serializar
public class Partida implements Serializable {
    char[] tablero;
    int turno;

    public Partida(char[] tablero, int turno) {
        this.tablero = tablero.clone();
        this.turno = turno;
    }
}
