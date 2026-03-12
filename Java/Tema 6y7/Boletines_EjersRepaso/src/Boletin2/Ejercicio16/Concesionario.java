package Boletin2.Ejercicio16;

public class Concesionario {
    private Coche[] coches;
    private int contadorCoches;

    public Concesionario(int nCoches){
        coches = new Coche[nCoches];
        contadorCoches = 0;
    }

    public void insertarCoche(String mat, String mod, String mot, double pre, String col) {
        if (contadorCoches < coches.length) {
            coches[contadorCoches] = new Coche(mat, mod, mot, pre, col);
            contadorCoches++;
            System.out.println("Coche añadido correctamente.");
        } else {
            System.out.println("Error: El concesionario está lleno.");
        }
    }

    public Coche obtenerCoche(int posicion) {
        if (posicion >= 0 && posicion < contadorCoches) {
            return coches[posicion];
        }
        return null;
    }
    
    public void listarCoches() {
        System.out.println("\n--- LISTADO DE VEHÍCULOS ---");
        for (int i = 0; i < contadorCoches; i++) {
            System.out.println(i + ". " + coches[i]);
        }
    }
}
