package Boletin2.Ejercicio15;

import java.util.Scanner;

public class PruebaPlaneta2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Planeta [] planetas = new Planeta[5];

        double masa = 0.0;
        double diametro = 0.0;
        int periodoRotacion = 0;

        boolean datoValido = false;

        for(int i = 0;i<planetas.length;i++){
            System.out.println("\n--- Datos del Planeta " + (i + 1) + " ---");
            
            System.out.print("Nombre: ");
            String nombre = s.nextLine();
            
            datoValido = false;

            do {
                try {
                    System.out.print("Masa: ");
                    masa = Double.parseDouble(s.nextLine());
                    System.out.print("Diámetro: ");
                    diametro = Double.parseDouble(s.nextLine());
                    System.out.print("Periodo Rotación (h): ");
                    periodoRotacion = Integer.parseInt(s.nextLine());
                    datoValido = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Introduce un valor numérico válido.");
                }
            } while (!datoValido);
            double orbitaAleatoria = Math.random() * 500000000 + 50000000;
            int traslacionAleatoria = (int) (Math.random() * 10000 + 88);

            planetas[i] = new Planeta(nombre, masa, diametro, periodoRotacion, orbitaAleatoria, traslacionAleatoria);
        }

        System.out.println("PLANETAS: ");
        for(Planeta p : planetas){
            System.out.println(p);
        }
        s.close();
    }
}
