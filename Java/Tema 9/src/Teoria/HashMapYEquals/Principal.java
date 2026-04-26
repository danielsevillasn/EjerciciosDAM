package Teoria.HashMapYEquals;

import java.util.HashSet;

public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("david");
        Persona p2 = new Persona();
        p2.setNombre("miguel");
        HashSet<Persona> conjunto = new HashSet<Persona>();
        conjunto.add(p1);
        conjunto.add(p2);
        System.out.println(conjunto.contains(p1));
    }
}
