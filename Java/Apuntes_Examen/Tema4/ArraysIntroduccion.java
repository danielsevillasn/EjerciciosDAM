import java.util.Scanner;
public class ArraysIntroduccion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] n; //El [] irve para definir una variable como un array y lo establece como valor nulo de forma predeterminada, es decir, que no contiene nada
        n = new int[3]; //El new sirve para transformarlo en un objeto y lo establece como valor vacio, es decir, que contiene algo es como un espacio " "

        //Esto se puede incluir en una misma linea de código poniendo int[] n = new int[3];

        n[0] = 1; //Almacena el 1 numero del array y ha de ser siempre 0
        n[1] = 50;  //Almacena el 2 numero del array
        n[2] = -50;  //Almacena el 3 numero del array
        System.out.print(n[0]+ "+");
        System.out.print(n[1]+ "+");
        System.out.print(n[2]+ "=");
        System.out.println(n[0]+n[1]+n[2]);
        System.out.print("Introduzca un numero del 0 al 2 para ver uno de los valores del array: ");
        int lista = s.nextInt();
        System.out.println(n[lista]); //Si dentro de [] incluyes un numero de la lista de arrays mostrara este en esa variable
        int[] x = {8,33,12,-5};
        System.out.print("Introduzca un numero del 0 al 3 para ver los valores del array: ");
        int contador = s.nextInt();
        for (int i = 0;i<=contador;i++){
            System.out.println(x[i]);
        }
        s.close();
    }

}
