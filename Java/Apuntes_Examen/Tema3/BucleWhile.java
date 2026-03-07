import java.util.Scanner;
public class BucleWhile {
    public static void main(String[] args){
        int a = 1;
        while (a<=10){ //Igual que el for solo que solo se debe poner la condicion que se ha de dejar de cumplir para que se pare y lo demas no hay que ponerlo
            System.out.println(a);
            a = a+1;
        }
        int numeroIntroducido;
        int cuentaNumeros =0;
        int suma=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca numeros positivos o negativos: ");
        numeroIntroducido = s.nextInt();

        while ( numeroIntroducido>=0){
            cuentaNumeros++; //Contador e incrementa en uno la variable
            suma+=numeroIntroducido;  //acumulador //Equivale a suma = suma+numeroIntroducido
            numeroIntroducido=s.nextInt(); 
        }
        System.out.println("Has introducido "+ (cuentaNumeros-1)+ " números positivos");
        System.out.println("La suma total de ellos es:"+ (suma-numeroIntroducido));
        
        //La diferencia entre el do-while y el while es basicamente que el while solo ejecuta la sentencia cuando se cumple la expresion
        //Y el do-while lo ejecuta una vez aunque no cumpla la expresion y por ello podemos modificar la variable dentro de ella
        
        s.close();
    }
}
