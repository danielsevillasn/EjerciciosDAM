import java.util.Scanner;

public class Metodos{
    public static int introducirOperadores(String mensaje){
        Scanner s = new Scanner(System.in);
        boolean datoValido = false;
        int entero = 0;
        do{
            try{
                System.out.println(mensaje);
                entero = Integer.parseInt(s.nextLine());
                datoValido = true;
            }catch(NumberFormatException e){
                System.out.println("Lo introducido no es un numero entero");
            }
        }while(!datoValido);
        return entero;
    }

    public static void suma(int Operando1, int Operando2){
        System.out.println("La suma de ambos operandos es: "+(Operando1+Operando2));
    }

    public static void resta(int Operando1, int Operando2) throws ExcepcionResta{
        if(Operando2>Operando1){
            throw new ExcepcionResta();
        }
        System.out.println("La resta de ambos operandos es: "+(Operando1-Operando2));
    }

    public static void multiplicación(int Operando1, int Operando2) throws ExcepcionMultiplicacion{
        if(Operando1< 0 || Operando2 < 0){
            throw new ExcepcionMultiplicacion();
        }
        System.out.println("La multiplicación de ambos operandos es: "+(Operando1*Operando2));
    }

    public static void división(int Operando1, int Operando2){
        try{
            int resultado = Operando1/Operando2;
            System.out.println("La división de ambos operandos es: "+resultado);
        }catch(ArithmeticException e){
            System.out.println("El operando2 "+Operando2+" no puede ser 0");
        }
    }
}
