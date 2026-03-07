import java.util.Scanner;

public class EjemploExcepciones05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean datoValido = false;
        do {
            try{
                System.out.print("Introduzca la altura de la pirámide (un número entre 1 y 10): ");
                int h = Integer.parseInt(s.nextLine());
                pintaPiramide(h);
                datoValido = true;
            } catch (ExcepcionAlturaFueraDeRango eafr) {
                System.out.println(eafr.getMessage());
                System.out.println(eafr.getClass());
            } catch (NumberFormatException e){
                System.out.println(e.getMessage());
                System.out.println(e.getClass());
            }
        } while (!datoValido);
        s.close();
    }

    public static void pintaPiramide(int h) throws ExcepcionAlturaFueraDeRango {

        if ((h < 1) || (h > 10)) {
            throw new ExcepcionAlturaFueraDeRango();
        }

        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = h - 1;

        while (planta <= h) {

            // inserta espacios
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            // pinta la línea
            for (int i = 1; i <= longitudDeLinea; i++) {
                System.out.print("*");
            }

            System.out.println();

            planta++;
            espacios--;
            longitudDeLinea += 2;
        }
    }
}