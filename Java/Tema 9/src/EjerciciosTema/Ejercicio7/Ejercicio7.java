package EjerciciosTema.Ejercicio7;

import java.util.ArrayList;

public class Ejercicio7 {
    public static void main(String[] args) {
        ArrayList<Moneda> monedas = new ArrayList<Moneda>();

        for(int i = 0; i < 6;i++){
            if(i == 0){
                monedas.add(new Moneda());
            }else{
                Moneda monedaAux;
                do{
                    monedaAux = new Moneda();
                }while(!monedaAux.equals(monedas.get(monedas.size()-1)));
                monedas.add(monedaAux);
            }
        }

        for(Moneda m : monedas){
            System.out.println(m);
        }
    }
}
