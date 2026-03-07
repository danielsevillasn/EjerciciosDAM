import java.util.Scanner;

public class PruebaTermometro {
    public static void main(String[] args) throws TemperaturaFueraRangoException, Exception{
        int temperatura;
        Scanner s = new Scanner(System.in);
        Termometro t = new Termometro();
        boolean datoValido = false;
        do{
            try{
                System.out.print("Dame la temperatura que tiene el termometro:");
                temperatura = Integer.parseInt(s.nextLine());
                t.setTemperatura(temperatura);
                datoValido = true;
            }catch(TemperaturaFueraRangoException e1){
                System.out.println(e1.getMessage());
            }catch(NumberFormatException e2){
                System.out.println(e2.getMessage());
            }
        }while(!datoValido);
        System.out.println("La temperatura del termometro es: "+t.getTemperatura()+"º grados");
        s.close();
    }
}
