package Poligonos.Implementaciones;

public class CalculosPoligonos {

    public static String tipoDePolígono(int[] longitudLados) {
        // 1. Comprobación de valores nulos o insuficientes
        if (longitudLados == null || longitudLados.length < 3) {
            return "imposible"; //
        }

        int n = longitudLados.length;
        long sumaLados = 0;
        int maxLado = 0;
        boolean todosIguales = true;

        // 2. Análisis de cada lado (Validación de valores negativos y 0)
        for (int i = 0; i < n; i++) {

            if (longitudLados[i] <= 0) {
                return "imposible";
            }

            sumaLados += longitudLados[i];
            if (longitudLados[i] > maxLado) maxLado = longitudLados[i];
            if (longitudLados[i] != longitudLados[0]) todosIguales = false;
        }

        // 3. Validación de la propiedad de existencia del polígono
        // Un polígono es imposible si el lado más largo es mayor o igual a la suma de los demás.
        // Condición: maxLado < (sumaLados - maxLado)
        if (maxLado >= (sumaLados - maxLado)) {
            return "imposible"; //
        }

        // 4. Clasificación por prioridad

        // Caso especial: 4 lados (Cuadrado o Rectángulo)
        if (n == 4) {
            // Prioridad 1: Cuadrado
            if (todosIguales) {
                return "cuadrado"; // Ejemplo {2,2,2,2}
            }
            // Prioridad 2: Rectángulo
            if (longitudLados[0] == longitudLados[2] && longitudLados[1] == longitudLados[3]) {
                return "rectángulo"; // Ejemplo {2,1,2,1}
            }
        }

        // Prioridad 3: Regular (Todos los lados iguales, pero no es cuadrado)
        if (todosIguales) {
            return "regular";
        }

        // Prioridad 4: Irregular
        return "irregular";
    }
}
