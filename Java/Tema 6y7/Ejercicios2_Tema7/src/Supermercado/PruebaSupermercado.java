package Supermercado;

import java.time.LocalDate;

public class PruebaSupermercado {
    public static void main(String[] args) {
        EsAlimento[] alimentos = new EsAlimento[4];

        Cereales cer1 = new Cereales("ei", 20, "espelta");
        Cereales cer2 = new Cereales("oi", 10, "trigo");

        Detergente der1 = new Detergente("eiei", 10);
        Detergente der2 = new Detergente("oioi", 15);

        Vino vin1 = new Vino("Pepe", 7, "ei", 3);
        Vino vin2 = new Vino("Pepa", 12, "oi", 4);

        alimentos[0] = cer1;
        alimentos[1] = cer2;
        alimentos[2] = vin1;
        alimentos[3] = vin2;

        System.out.println(cer1);
        System.out.println(cer2);
        System.out.println(der1);
        System.out.println(der2);
        System.out.println(vin1);
        System.out.println(vin2);


        for(int i = 0;i<alimentos.length;i++){
            alimentos[i].setCaducidad(LocalDate.now());
            System.out.println("El alimento "+i+"tiene una caducidad de: "+alimentos[i].getCaducidad());
            System.out.println("El alimento "+i+"tiene unas calorías de: "+alimentos[i].getCalorias());
        }
    }
}
