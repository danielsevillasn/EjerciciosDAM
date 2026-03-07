import java.util.Scanner;

public class Ejercicio1y2_A_UT2 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

        // Pedimos las calificaciones
        System.out.print("Introduce la nota1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Introduce la nota2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Introduce la nota3: ");
        double nota3 = sc.nextDouble();

        System.out.print("Introduce la nota4: ");
        double nota4 = sc.nextDouble();
        sc.close();
        boolean nota1Mayor  = (nota1 >= nota2) && (nota1 >= nota3) && (nota1 >= nota4); // && es el operador logico "y" y el || es el operador logico "o"
        boolean nota2Mayor = (nota2 >= nota1) && (nota2 >= nota3) && (nota2 >= nota4); //El <= y el >= sirven para establecer si un numero es mayor o igual que otro
        boolean nota3Mayor = (nota3 >= nota1) && (nota3 >= nota2) && (nota3 >= nota4);
        boolean nota1Menor  = (nota1 <= nota2) && (nota1 <= nota3) && (nota1 <= nota4);
        boolean nota2Menor = (nota2 <= nota1) && (nota2 <= nota3) && (nota2 <= nota4);
        boolean nota3Menor = (nota3 <= nota1) && (nota3 <= nota2) && (nota3 <= nota4);
        System.out.println("\nLa asignatura con la mayor nota es: " + (nota1Mayor  ? "nota1" :(nota2Mayor ? "nota2" :(nota3Mayor ? "nota3" : "nota4")))); // la ? sirve para hacer un if en una sola linea y el : sirve para hacer un else en una sola linea
        System.out.println("\nLa asignatura con la mayor nota es: " + (nota1Menor  ? "nota1" :(nota2Menor ? "nota2" :(nota3Menor ? "nota3" : "nota4"))));
    }

}
