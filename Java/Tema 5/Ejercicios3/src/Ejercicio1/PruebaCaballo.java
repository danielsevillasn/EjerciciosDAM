package Ejercicio1;

public class PruebaCaballo {
    public static void main(String[] args) {
        Caballo pegaso = new Caballo("pegaso");

        pegaso.relinchar();
        pegaso.setAltura(2);
        pegaso.setEdad(10);
        System.out.println(pegaso);
    }
}
