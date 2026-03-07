import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int cargo = 0;
        int dias = 0;
        int estado = 0;
        double sueldo1 = 0;
        double sueldo2 = 0;
        double sueldo3 = 0;
        double IRPF = 0;
        double sueldototal = 0;
        int porcentaje = 0;
        System.out.println("1 - Programador junior");
        System.out.println("2 - Prog. senior");
        System.out.println("3 - Jefe de proyecto");
        System.out.print("Introduzca el cargo del empleado (1-3): ");
        cargo = s.nextInt();
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
        dias = s.nextInt();
        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        estado = s.nextInt();
        switch (cargo){
            case 1->
            sueldo1 = 950;
            case 2->
            sueldo1 = 1200;
            case 3->
            sueldo1 = 1600;
            default->
            System.out.println("El numero no es valido");
        }
        if (dias<0 || dias>31){
            System.out.println("El numero no es valido");
        }
        else{
            sueldo2 = 30*dias;
        }
        sueldo3 = sueldo1+sueldo2;
        switch (estado){
            case 1:
            IRPF = sueldo3*0.25;
            porcentaje = 25;
            break;
            case 2:
            IRPF = sueldo3*0.20;
            porcentaje = 20;
            break;
            default:
            System.out.println("El numero no es valido");
        }
        sueldototal = sueldo3-IRPF;
        System.out.println("-------------------");
        System.out.printf("| Sueldo base %5.2f |", sueldo1);
        System.out.printf("| Dietas ( %f viajes ) %5.2f |",dias,sueldo1);
        System.out.println("-------------------");
        System.out.printf("| Sueldo bruto %5.2f |", sueldo3);
        System.out.printf("| Retención ( %f %% ) %5.2f |",porcentaje,sueldo1);
        System.out.println("-------------------");
        System.out.printf("| Sueldo neto %5.2f |", sueldototal);
        System.out.println("-------------------");
        s.close();
    }
}
