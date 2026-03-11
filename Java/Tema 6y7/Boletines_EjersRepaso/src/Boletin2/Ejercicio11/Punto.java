public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void distanciaPuntos(Punto p){
        double distanciaPuntos = Math.sqrt(Math.pow(this.x-p.x, 2)+Math.pow(this.y-p.y, 2));
        System.out.println("La distancia entre puntos es de: "+distanciaPuntos);
    }

    @Override
    public String toString() {
        return "Punto [x=" + x + ", y=" + y + "]";
    }
}
