package Ejercicio4;

public class PruebaFraccion {
    public static void main(String[] args) {
        String menu = "";
        boolean salir = false;
        Fraccion fraccion1 = new Fraccion(4,8);
        Fraccion fraccion2 = new Fraccion(7,9);
        while(!salir){
            menu = Datos.menu();
            switch (menu) {
                case "2":
                    fraccion1.simplifica();
                    fraccion2.simplifica();
                    System.out.println(fraccion1);
                    System.out.println(fraccion2);
                    break;
                case "1":
                    fraccion1.invierte();
                    fraccion2.invierte();
                    System.out.println(fraccion1);
                    System.out.println(fraccion2);
                    break;
                case "3":
                    fraccion1.multiplica(fraccion2);
                    fraccion2.multiplica(fraccion1);
                    System.out.println(fraccion1);
                    System.out.println(fraccion2);
                    break;
                case "4":
                    fraccion1.divide(fraccion2);
                    fraccion2.divide(fraccion1);
                    System.out.println(fraccion1);
                    System.out.println(fraccion2);
                    break;
                case "5":
                    salir = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("El mensaje introducido no es valido");
                    break;
            }
        }
    }
}
