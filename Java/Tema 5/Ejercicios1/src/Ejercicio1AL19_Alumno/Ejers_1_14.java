package Ejercicio1AL19_Alumno;
import Ejercicio1AL19_Alumno.metodos.Datos;
import Ejercicio1AL19_Alumno.metodos.Funciones;

public class Ejers_1_14 {
    public static void main(String[] args) {
        String menu = "";

        while (true){
            menu = Datos.menu();
            menu.trim();
            switch (menu){
                case "0": //SALIR
                    System.out.println("\nSaliendo...");
                    return;
                case "1": //Capicua
                    int n1 = Datos.pedirEntero("un numero entero: ");
                    Datos.compararBoolean("capicua", Funciones.EsCapicua(n1));
                    break;
                case "2": //Primo
                    int n2 = Datos.pedirEntero("un numero entero: ");
                    Datos.compararBoolean("primo", Funciones.esPrimo(n2));
                    break;
                case "3": //Siguiente Primo
                    int n3 = Datos.pedirEntero("un numero entero: ");
                    int resultado3 = Funciones.siguientePrimo(n3);
                    System.out.println("\nEl siguiente primo es: "+resultado3);
                    break;
                case "4": //potencia
                    int n4 = Datos.pedirEntero("la base: ");
                    int n5 = Datos.pedirEntero("el exponente: ");
                    int resultado4 = Funciones.potencia(n4, n5);
                    System.out.println("\nEl resultado es: "+resultado4);
                    break;
                case "5": //digitos
                    int n6 = Datos.pedirEntero("un numero entero: ");
                    int resultado5 = Funciones.digitos(n6);
                    System.out.println("\nEl numero tiene: "+resultado5+" digitos");
                    break;
                case "6": //voltea
                    int n7 = Datos.pedirEntero("un numero entero: ");
                    int resultado6 = Funciones.voltea(n7);
                    System.out.println("\nEl numero volteado es: "+resultado6);
                    break;
                case "7": //digitoN
                    int n8 = Datos.pedirEntero("un numero entero: ");
                    int n9 = Datos.pedirEntero("la posicion del digito: ");
                    int resultado7 = Funciones.digitoN(n8, n9);
                    System.out.println("\nEl digito en la posicion "+n9+" es: "+resultado7);
                    break;
                case "8": //posicionDeDigito
                    int n10 = Datos.pedirEntero("un numero entero: ");
                    int n11 = Datos.pedirEntero("el digito a buscar: ");
                    int resultado8 = Funciones.posicionDeDigito(n10, n11);
                    if (resultado8 == -1){
                        System.out.println("\nEl digito no se encuentra en el numero");
                    } else {
                        System.out.println("\nEl digito se encuentra en la posicion: "+resultado8);
                    }
                    break;
                case "9": //quitaPorDetras
                    int n12 = Datos.pedirEntero("un numero entero: ");
                    int n13 = Datos.pedirEntero("la cantidad de digitos a quitar por detras: ");
                    int resultado9 = Funciones.quitaPorDetras(n12, n13);
                    System.out.println("\nEl numero resultante es: "+resultado9);
                    break;
                case "10": //quitaPorDelante
                    int n14 = Datos.pedirEntero("un numero entero: ");
                    int n15 = Datos.pedirEntero("la cantidad de digitos a quitar por delante: ");
                    int resultado10 = Funciones.quitaPorDelante(n14, n15);
                    System.out.println("\nEl numero resultante es: "+resultado10);
                    break;
                case "11": //pegaPorDetras
                    int n16 = Datos.pedirEntero("un numero entero: ");
                    int n17 = Datos.pedirEntero("el digito a pegar por detras: ");
                    int resultado11 = Funciones.pegaPorDetras(n16, n17);
                    System.out.println("\nEl numero resultante es: "+resultado11);
                    break;
                case "12": //pegaPorDelante
                    int n18 = Datos.pedirEntero("un numero entero: ");
                    int n19 = Datos.pedirEntero("el digito a pegar por delante: ");
                    int resultado12 = Funciones.pegaPorDelante(n18, n19);
                    System.out.println("\nEl numero resultante es: "+resultado12);
                    break;
                case "13": //trozoDeNumero
                    int n20 = Datos.pedirEntero("un numero entero: ");
                    int n21 = Datos.pedirEntero("la posicion inicial: ");
                    int n22 = Datos.pedirEntero("la posicion final: ");
                    int resultado13 = Funciones.trozoDeNumero(n20, n21, n22);
                    System.out.println("\nEl trozo de numero es: "+resultado13);
                    break;
                case "14": //juntaNumeros
                    String n23 = Datos.pedirCadena("el primer numero entero: ");
                    String n24 = Datos.pedirCadena("el segundo numero entero: ");
                    int resultado14 = Funciones.juntaNumeros(n23, n24);
                    System.out.println("\nEl numero resultante es: "+resultado14);
                    break;
                default: ///ERROR
                    System.out.println("\nEl mensaje introducido no es valido");
            }
        }
    }
}