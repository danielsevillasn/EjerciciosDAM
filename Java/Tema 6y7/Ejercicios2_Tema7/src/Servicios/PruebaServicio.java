package Servicios;

import java.time.LocalDate;

public class PruebaServicio {
    public static void main(String[] args) {
        RevisionAlarma rev1 = new RevisionAlarma(LocalDate.of(2025, 12, 25), "Pepe Alvarez", 5);
        RevisionAlarma rev2 = new RevisionAlarma(LocalDate.of(2024, 12, 25), "Juan Alvarez", 2);
        TrabajoPintura pint1 = new TrabajoPintura("Mario Putero", LocalDate.of(2024, 1, 25), "Pedro Sanchez", 20.0,5.0);
        TrabajoPintura pint2 = new TrabajoPintura("Mario Putero", LocalDate.of(2024, 1, 25), "Juan Bordalás", 30.0,3.5);

        Servicio[] servicios = new Servicio[4];
        servicios[0] = rev1;
        servicios[1] = rev2;
        servicios[2] = pint1;
        servicios[3] = pint2;
        double costeTotal = 0.0;
        double costeTotalSaldos = 0.0;
        for(int i = 0; i<servicios.length;i++){
            costeTotal += servicios[i].costeTotal();
            System.out.println("Coste total del servicio"+i+": "+servicios[i].costeTotal()+" €");
        }
        System.out.println("Coste total de los servicios: "+costeTotal);
        for(int i = 0; i<servicios.length;i++){
            costeTotalSaldos += servicios[i].costeManoObra();
            System.out.println("Coste total del servicio"+i+": "+servicios[i].costeManoObra()+" €");
        }
        System.out.println("Coste total de los servicios: "+costeTotalSaldos);
        for(int i = 0; i<servicios.length;i++){
            System.out.println(servicios[i].detalleServicio());
        }
    }
}
