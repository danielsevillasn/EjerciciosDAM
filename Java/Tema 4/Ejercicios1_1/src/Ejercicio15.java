import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] ocupacion = new int[10];
        for (int i = 0; i < 10; i++) {
            ocupacion[i] = (int)(Math.random() * 4);
        }
        for(int i = 0; i<2;i++){
            if ( i == 0){
                System.out.print("mesa nº: ");
                for (int j = 0; j<ocupacion.length;j++){
                    System.out.print(j+ "\t");
                }
            }
            if ( i == 1){
                System.out.print("Valor:   ");
                for (int j : ocupacion){ //Foreach que sirve para mostrar por pantalla el array
                    System.out.print(j+ "\t");
                }
            }
            System.out.println();
        }
        System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
        int clientes = s.nextInt();
        while (true){ //Si el programa llega hasta un break entonces el while termina
            if (clientes == -1){ 
                break;
            }
            else if (clientes > 4){ //Si son más de 4 personas
                System.out.println("Lo siento, no admitimos grupos de "+ clientes + " personas, haga grupos de 4 personas como máximo e intente de nuevo.");
                do {
                    System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
                    clientes = s.nextInt();
                } while (clientes > 4 && clientes != -1);
            }
            else { 
                boolean mesaEncontrada = false;

                // 1. Primero buscar mesa vacía
                for (int i = 0; i < ocupacion.length; i++) {
                    if (ocupacion[i] == 0) {
                        System.out.println("Por favor, siéntense en la mesa número " + i + ".");
                        ocupacion[i] = clientes;
                        mesaEncontrada = true;
                        break;
                    }
                }

                // 2. Si no hay mesa vacía, buscar mesa para compartir
                if (!mesaEncontrada) {
                    for (int i = 0; i < ocupacion.length; i++) {
                        if (ocupacion[i] + clientes <= 4) {
                            System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + i + ".");
                            ocupacion[i] += clientes;
                            mesaEncontrada = true;
                            break;
                        }
                    }
                }

                // 3. Si no hay sitio
                if (!mesaEncontrada) {
                    System.out.println("Lo siento, en estos momentos no hay sitio.");
                }

                // Mostrar estado de las mesas
                for (int i = 0; i < 2; i++) {
                    if (i == 0) {
                        System.out.print("mesa nº: ");
                        for (int j = 0; j < ocupacion.length; j++) {
                            System.out.print(j + "\t");
                        }
                    }
                    if (i == 1) {
                        System.out.print("Valor:   ");
                        for (int j : ocupacion) {
                            System.out.print(j + "\t");
                        }
                    }
                    System.out.println();
                }

                System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
                clientes = s.nextInt();
            }
        }
        s.close();
    }

}
