package Ejercicio1AL19_Alumno;
import Ejercicio1AL19_Alumno.metodos.Datos;
import Ejercicio1AL19_Alumno.metodos.Funciones;

public class Ejer18 {
    public static void main(String[] args) {
        int n = Datos.pedirEntero("un numero decimal que quieras pasar a binario: ");
        int total = 0;
        int potencia = 0;
        int contador = 0;
        boolean inicio = true;
        boolean positivo = true;
        if (n<0){
            n = -n;
            positivo = false;
        }
        while(n!=0){
            potencia = Funciones.potencia(2, contador);;
            if(inicio){
                while(potencia<n){
                    potencia = Funciones.potencia(2, contador+1);
                    contador++;
                }
                inicio = false;
            }
            if(n-potencia >= 0){
                total = Funciones.pegaPorDetras(total, 1);
                n = n-potencia;
            }else if (n-potencia < 0) {
                total = Funciones.pegaPorDetras(total, 0);
            }
            contador--;
        }
        for (int i = contador;i>=0;i--){
            total = Funciones.pegaPorDetras(total, 0);
        }
        if(positivo){
            System.out.println("El numero pasado a binario es: "+total);
        }else{
            System.out.println("El numero pasado a binario es: "+(-total));
        }
    }
}
