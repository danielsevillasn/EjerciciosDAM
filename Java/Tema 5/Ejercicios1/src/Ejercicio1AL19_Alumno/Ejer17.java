package Ejercicio1AL19_Alumno;
import Ejercicio1AL19_Alumno.metodos.Datos;
import Ejercicio1AL19_Alumno.metodos.Funciones;
public class Ejer17 {
    public static void main(String[] args) {
        int n = Datos.pedirEntero("un numero binario que quieras pasar a decimal: ");
        int extensionN = Funciones.digitos(n);
        int total = 0;
        int contador = 0;
        for(int i = 1;i<=extensionN;i++){
            if(Funciones.digitoN(n, i) == 1){
                total += Funciones.potencia(2, contador);
            }
            contador++;
        }
        System.out.println("El numero pasado a decimal es: "+total);
    }
}
