package Ejercicio1AL19_Alumno;

import Ejercicio1AL19_Alumno.metodos.*;

public class Ejer19 {
    public static void main(String[] args) {
        boolean salir = true;
        while (salir) {
            String menu = Datos.menu19();
            switch (menu) {
                case "0":
                    salir = false;
                    break;
                case "1":
                    Funciones.BinarioDecimal(Datos.pedirEntero("un numero binario: "));
                    break;
                case "2":
                    Funciones.DecimalBinario(Datos.pedirEntero("un numero decimal: "));
                    break;
                case "3":
                    Funciones.BinarioOctal(Datos.pedirEntero("un numero binario: "));
                    break;
                case "4":
                    Funciones.OctalBinario(Datos.pedirEntero("un numero octal: "));
                    break;
                case "5":
                    Funciones.HexadecimalBinario(Datos.pedirCadena("un numero hexadecimal: "));
                    break;
                case "6":
                    Funciones.BinarioHexadecimal(Datos.pedirEntero("un numero binario: "));
                    break;
                default:
                    System.out.println("El mensaje introducido no es valido");
                    break;
            }
        }
    }
}
