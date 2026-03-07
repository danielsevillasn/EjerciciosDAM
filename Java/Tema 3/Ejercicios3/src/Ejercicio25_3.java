public class Ejercicio25_3 {
    public static void main(String[] args) {
        int NumeroAleatorio;
        int NumeroPrimo;
        int ContadorPrimos = 0;
        for (int i = 0; i < 100; i++){
            NumeroAleatorio = (int)((Math.random()*(201-10)+10));
            NumeroPrimo = NumeroAleatorio;
            for (int j = 1; j<=NumeroAleatorio; j++){
                NumeroPrimo = NumeroAleatorio % j;
                if (NumeroPrimo == 0){
                    ContadorPrimos++;
                }
            }
            if (ContadorPrimos == 2){
                System.out.print("#"+NumeroAleatorio+"# ");
            }
            if ((NumeroAleatorio % 5) == 0){
                System.out.print("["+NumeroAleatorio+"] ");
            }
            ContadorPrimos = 0;
        }
    }

}
