public class Ejercicio21_3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int aux1 = (int)(Math.random() * 8 + 1); // Genera un número aleatorio entre 1 y 8
            int aux2 = (int)(Math.random() * 2 + 1); // Genera un número aleatorio entre 1 y 2
            switch (aux1) {
                case 1:
                    System.out.print("1 céntimo");
                    switch (aux2) {
                        case 1:
                            System.out.print(" - cara");
                            break;
                        case 2:
                            System.out.print(" - cruz");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("2 céntimos");
                    switch (aux2) {
                        case 1:
                            System.out.print(" - cara");
                            break;
                        case 2:
                            System.out.print(" - cruz");
                            break;
                    }
                    break;
                case 3:
                    System.out.print("5 céntimos");
                    switch (aux2) {
                        case 1:
                            System.out.print(" - cara");
                            break;
                        case 2:
                            System.out.print(" - cruz");
                            break;
                    }
                    break;
                case 4:
                    System.out.print("10 céntimos");
                    switch (aux2) {
                        case 1:
                            System.out.print(" - cara");
                            break;
                        case 2:
                            System.out.print(" - cruz");
                            break;
                    }
                    break;
                case 5:
                    System.out.print("20 céntimos");
                    switch (aux2) {
                        case 1:
                            System.out.print(" - cara");
                            break;
                        case 2:
                            System.out.print(" - cruz");
                            break;
                    }
                    break;
                case 6:
                    System.out.print("50 céntimos");
                    switch (aux2) {
                        case 1:
                            System.out.print(" - cara");
                            break;
                        case 2:
                            System.out.print(" - cruz");
                            break;
                    }
                    break;
                case 7:
                    System.out.print("1 euro");
                    switch (aux2) {
                        case 1:
                            System.out.print(" - cara");
                            break;
                        case 2:
                            System.out.print(" - cruz");
                            break;
                    }
                    break;
                case 8:
                    System.out.print("2 euros");
                    switch (aux2) {
                        case 1:
                            System.out.print(" - cara");
                            break;
                        case 2:
                            System.out.print(" - cruz");
                            break;
                    }
                    break;
            }
            System.out.println();
        }
    }

}
