package Puntos.Implementaciones;

import java.util.ArrayList;
import java.util.Objects;

public class Punto {
    public int x;
    public int y;

    public Punto(int y, int x) {
        this.y = y;
        this.x = x;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Punto punto = (Punto) o;
        return x == punto.x && y == punto.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static Punto[][] masCercanos(Punto[] puntos){
        if(puntos == null){
            return null;
        }
        int nPuntos = puntos.length;
        if(nPuntos < 2){
            return null;
        }
        ArrayList<Punto[]> parejas = new ArrayList<>();
        double minRelativo = Double.MAX_VALUE;

        for (int i = 0; i < puntos.length; i++) {
            for (int j = i + 1; j < puntos.length; j++) {
                // Saltamos si hay nulos (tu test valoresNulos)
                if (puntos[i] == null || puntos[j] == null) continue;

                double dist = calculoDistanciaEuclidea(puntos[i], puntos[j]);

                if (dist < minRelativo) {
                    minRelativo = dist;
                    parejas.clear(); // Nuevo mínimo, borramos empates anteriores
                    parejas.add(new Punto[]{puntos[i], puntos[j]});
                } else if (dist == minRelativo) {
                    // Empate detectado (tu test mismaDistancia)
                    parejas.add(new Punto[]{puntos[i], puntos[j]});
                }
            }
        }

        // Convertir la lista a Punto[][] para el retorno
        return parejas.toArray(new Punto[0][0]);
    }


    private static double  calculoDistanciaEuclidea(Punto p1, Punto p2){
        return Math.sqrt((Math.pow(p2.getX()- p1.getX(),2)+(Math.pow(p2.getY()- p1.getY(),2))));
    }
}
