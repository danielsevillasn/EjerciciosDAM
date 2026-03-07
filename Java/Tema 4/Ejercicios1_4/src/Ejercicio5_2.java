import java.util.Scanner;
public class Ejercicio5_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Dime una palabra: ");
        String palabra = s.next();
        final String palabrainicio = palabra;
        System.out.print("Dime otra palabra: ");
        palabra =s.next();
        while (true){
            if(palabra.equalsIgnoreCase(palabrainicio)){
                break;
            }else{
                System.out.println("No es la misma palabra");
                System.out.print("Dime otra palabra: ");
                palabra =s.next();
                s.nextLine();
            }
        }
        s.close();
    }
}