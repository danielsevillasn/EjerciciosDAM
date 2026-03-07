//Escribe un programa que calcule el sueldo semanal de un trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas) se pagan a 12 euros la hora. A partir de la 41, se pagan a 16 euros la hora.
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Porfavor, introzuca el número de horas trabajadas durante la semana: ");
        final int horas = s.nextInt();
        final int limite = 40;
        if (horas<=40){ //El operador <= significa menor o igual que
            System.out.println("El sueldo semanal que le corresponde es de: " +(horas*12)+ " euros"); //Si trabaja 40 horas o menos, se le paga a 12 euros la hora
        }
        else if (horas>40){
            System.out.println("El sueldo semanal que le corresponde es de: " +(((horas-(horas-limite))*12)+((horas-limite)*16))+ " euros"); //Si trabaja más de 40 horas, se le paga a 12 euros la hora las primeras 40 horas y a 16 euros la hora las horas extra
        }
        else {
            System.out.println("El numero introducido no es correcto"); //En caso de que el número introducido sea negativo
        }
        s.close();
}
}
