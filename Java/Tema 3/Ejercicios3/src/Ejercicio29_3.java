import java.util.Scanner;
public class Ejercicio29_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1. - Primavera");
        System.out.println("2. - Primavera");
        System.out.println("3. - Primavera");
        System.out.println("4. - Primavera");
        System.out.print("Seleccione la estación del año (1-4): ");
        int estacion = s.nextInt();
        while (true){
            if(estacion >= 1 && estacion <=4){
                break;
            }
            else{
                System.out.println("La estacion introducida no es correcta");
                System.out.println("1. - Primavera");
                System.out.println("2. - Primavera");
                System.out.println("3. - Primavera");
                System.out.println("4. - Primavera");
                System.out.print("Seleccione la estación del año (1-4): ");
                estacion = s.nextInt();
                s.nextLine();
            }
        }
        int tempMin = 0;
        int tempMax = 0;
        int climaAux;
        String clima = "";
        switch (estacion) {
            case 1:
            do{
                tempMin = (int)(Math.random()*(31-15)+15);
                tempMax = (int)(Math.random()*(31-15)+15);
            }while(tempMin>tempMax);
            climaAux = (int)(Math.random()*10+1);
            if (climaAux<=6){
                clima = "Soleado";
            }
            else{
                clima = "Nublado";
            }
            break;
            case 2:
            do{
                tempMin = (int)(Math.random()*(45-25)+25);
                tempMax = (int)(Math.random()*(45-25)+25);
            }while(tempMin>tempMax);
            climaAux = (int)(Math.random()*10+1);
            if (climaAux<=8){
                clima = "Soleado";
            }
            else{
                clima = "Nublado";
            }
            break;
            case 3:
            do{
                tempMin = (int)(Math.random()*(31-20)+20);
                tempMax = (int)(Math.random()*(31-20)+20);
            }while(tempMin>tempMax);
            climaAux = (int)(Math.random()*10+1);
            if (climaAux<=4){
                clima = "Soleado";
            }
            else{
                clima = "Nublado";
            }
            break;
            case 4:
            do{
                tempMin = (int)(Math.random()*25);
                tempMax = (int)(Math.random()*25);
            }while(tempMin>tempMax);
            climaAux = (int)(Math.random()*10+1);
            if (climaAux<=2){
                clima = "Soleado";
            }
            else{
                clima = "Nublado";
            }
            break;
        }
        System.out.println("Temperatura mínima: " + tempMin + "ºC");
        System.out.println("Temperatura máxima: " + tempMax + "ºC");
        System.out.println(clima);
        s.close();
    }
}
