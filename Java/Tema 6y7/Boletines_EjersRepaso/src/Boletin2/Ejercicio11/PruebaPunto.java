public class PruebaPunto {
    public static void main(String[] args) {
        // Crear los dos puntos según el enunciado
        Punto p1 = new Punto(100.0, 200.0);
        Punto p2 = new Punto(400.0, 800.0);

        // Imprimir resultados
        System.out.println("Punto 1: " + p1);
        System.out.println("Punto 2: " + p2);
        p1.distanciaPuntos(p2);
    }
}
