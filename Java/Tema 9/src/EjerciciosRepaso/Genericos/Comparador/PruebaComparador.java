package EjerciciosRepaso.Genericos.Comparador;

public class PruebaComparador {
    public static void main(String[] args) {
        // Prueba con Integers
        Integer num1 = 25;
        Integer num2 = 42;
        Integer mayorNum = Comparador.obtenerMayor(num1, num2);
        System.out.println("Entre " + num1 + " y " + num2 + ", el mayor es: " + mayorNum);

        // Prueba con Strings (el orden es alfabético)
        String texto1 = "Manzana";
        String texto2 = "Zanahoria";
        String mayorTexto = Comparador.obtenerMayor(texto1, texto2);
        System.out.println("Entre '" + texto1 + "' y '" + texto2 + "', el mayor es: " + mayorTexto);
        
        // Prueba con Double
        Double d1 = 10.5;
        Double d2 = 10.4;
        System.out.println("Entre " + d1 + " y " + d2 + ", el mayor es: " + Comparador.obtenerMayor(d1, d2));
    }
}
