import java.util.Scanner;
public class Ejecutar {
    public static void Menu(){
        Scanner s = new Scanner(System.in);
        int Operando1 = 0;
        int Operando2 = 0;
        String opcion = "";
        boolean salir = false;
        System.out.println("Operando1: "+Operando1);
        System.out.println("Operando2: "+Operando2);
        while(!salir){
            System.out.println("\nMENU");
            System.out.println(" 1- Introducir operadores");
            System.out.println(" 2- Suma");
            System.out.println(" 3- Resta");
            System.out.println(" 4- Multiplicación");
            System.out.println(" 5- División");
            System.out.println(" 6- Salir");
            System.out.print(" Elija opcion(1-6): ");
            opcion = s.nextLine();
            switch (opcion) {
                case "1":
                    Operando1 = Metodos.introducirOperadores("Introduce el valor del Operando1: ");
                    Operando2 = Metodos.introducirOperadores("Introduce el valor del Operando2: ");
                    break;
                case "2":
                    Metodos.suma(Operando1, Operando2);
                    Metodos.suma(Operando2, Operando1);
                    break;
                case "3":
                    try{
                        Metodos.resta(Operando1, Operando2);
                        Metodos.resta(Operando2, Operando1);
                    }catch(ExcepcionResta e){
                        System.out.println(e.getMessage());
                    }
                    
                    try{
                        Metodos.resta(Operando2, Operando1);
                    }catch(ExcepcionResta e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "4":
                    try{
                        Metodos.multiplicación(Operando1, Operando2);
                        Metodos.multiplicación(Operando2, Operando1);
                    }catch(ExcepcionMultiplicacion e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "5":
                    Metodos.división(Operando1, Operando2);
                    Metodos.división(Operando2, Operando1);
                    break;
                case "6":
                    salir = true;
                    break;
                default:
                    System.out.println("El mensaje introducido no es del 1-6");
                    break;
            }
        }
        s.close();
    }
}
