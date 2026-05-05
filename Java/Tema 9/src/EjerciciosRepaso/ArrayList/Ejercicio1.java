package EjerciciosRepaso.ArrayList;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> numerosAleatorios = new ArrayList<>();

        int limiteAleatorio = (int) (Math.random()*(21-10)+10); //Limite aleatorio entre 20 y 10

        int numeroAleatorio;

        for(int i = 0; i < limiteAleatorio;i++){
            numeroAleatorio = (int) (Math.random()*101); //Aleatorio entre 100 y 0
            numerosAleatorios.add(numeroAleatorio);
        }

        int sumaTotal = 0;
        int media;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for(int n : numerosAleatorios){
            sumaTotal += n;
            if(n<minimo){
                minimo = n;
            }
            if(n>maximo){
                maximo = n;
            }
        }

        media = sumaTotal/numerosAleatorios.size();

        System.out.println("Calculos de "+numerosAleatorios.size()+" numeros aleatorios: ");
        System.out.println("Suma total: "+sumaTotal);
        System.out.println("Media aritmetica: "+media);
        System.out.println("Máximo: "+maximo);
        System.out.println("Mínimo: "+minimo);
    }
}
