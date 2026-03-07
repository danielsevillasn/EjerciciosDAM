import java.util.Scanner;

public class Ejecutable {
    public static void ejecutar(){
        Scanner s = new Scanner(System.in);
        String opcion = "";
        boolean salir = false;
        Vehiculo[] vehiculos = new Vehiculo[2];
        vehiculos[0] = new Coche(20);
        vehiculos[1] = new Bicicleta(5);
        while(!salir){
            System.out.println("VEHÍCULOS");
            System.out.println("=========");
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.print("Elige una opción (1-8): ");
            opcion = s.nextLine();
            switch (opcion) {
                case "1":
                    vehiculos[1].andar();
                    break;
                case "2":
                    vehiculos[1].truco();
                    break;
                case "3":
                    vehiculos[0].andar();
                    break;
                case "4":
                    vehiculos[0].truco();
                    break;
                case "5":
                    System.out.println(vehiculos[1]);
                    break;
                case "6":
                    System.out.println(vehiculos[0]);
                    break;
                case "7":
                    System.out.println("El kilometraje total es: "+vehiculos[0].getKilometrosTotales());
                    break;
                case "8":
                    salir = true;
                    break;
                default:
                    System.out.println("El mensaje introducido no es valido, pon un numero del 1-8");
                    break;
            }
        }
        s.close();
    }
}
