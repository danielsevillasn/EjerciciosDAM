package funciones;
import ModularPrueba.Clases.Datos;
public class NumeroPrimoConFuncion {
    public static void main(String[] args) {
        int n = Datos.pedirEntero("un numero entero positivo: ");
        if(ClasePrimos.EsPrimo(n)){
            System.out.println("El numero "+n+" es primo");
        }else{
            System.out.println("El numero "+n+" no es primo");
        }
    }
}
