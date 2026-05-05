package EjerciciosTema;

import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio23 {
    public static void main(String[] args) {
        HashMap<String, Integer> puntosFichas = new HashMap<>();
        
        puntosFichas.put("dama",9);
        puntosFichas.put("torre",5);
        puntosFichas.put("alfil",3);
        puntosFichas.put("caballo",2);
        puntosFichas.put("peon",1);

        ArrayList<String> fichas = new ArrayList<>();
        fichas.add("dama");
        fichas.add("torre");
        fichas.add("alfil");
        fichas.add("caballo");
        fichas.add("peon");



        ArrayList<String> fichasCapturadas = new ArrayList<>();
        int limite  = (int) (Math.random()*16);
        int puntosTotales = 0;
        String fichaSacada;
        int nDamas = 0;
        int nTorres = 0;
        int nAlfiles = 0;
        int nCaballos = 0;
        int nPeones = 0;
        int aleatorio;

        while (limite > 0) {
            aleatorio = (int) (Math.random()*fichas.size());
            fichaSacada = fichas.get(aleatorio);
            if(limite-puntosFichas.get(fichaSacada) >= 0){
                switch (fichaSacada) {
                    case "dama":
                        if(!(nDamas>=1)){
                            fichasCapturadas.add(fichaSacada+" ("+puntosFichas.get(fichaSacada)+" peones)");
                            puntosTotales += puntosFichas.get(fichaSacada);
                            nDamas++;
                        }
                        break;
                    case "torre":
                        if(!(nTorres>=2)){
                            fichasCapturadas.add(fichaSacada+" ("+puntosFichas.get(fichaSacada)+" peones)");
                            puntosTotales += puntosFichas.get(fichaSacada);
                            nTorres++;
                        }
                        break;
                    case "alfil":
                        if(!(nAlfiles>=2)){
                            fichasCapturadas.add(fichaSacada+" ("+puntosFichas.get(fichaSacada)+" peones)");
                            puntosTotales += puntosFichas.get(fichaSacada);
                            nAlfiles++;
                        }
                        break;
                    case "caballo":
                        if(!(nCaballos>=2)){
                            fichasCapturadas.add(fichaSacada+" ("+puntosFichas.get(fichaSacada)+" peones)");
                            puntosTotales += puntosFichas.get(fichaSacada);
                            nCaballos++;
                        }
                        break;
                    case "peon":
                        if(!(nPeones>=8)){
                            fichasCapturadas.add(fichaSacada+" ("+puntosFichas.get(fichaSacada)+" peones)");
                            puntosTotales += puntosFichas.get(fichaSacada);
                            nPeones++;
                        }
                        break;
                }
                limite = limite-puntosFichas.get(fichaSacada);
            }
        }

        System.out.println("Fichas capturadas por el jugador: ");
        for (String f : fichasCapturadas) {
            System.out.println(f);
        }
        System.out.println("Puntos totales: "+puntosTotales+" peones");
    }
}
