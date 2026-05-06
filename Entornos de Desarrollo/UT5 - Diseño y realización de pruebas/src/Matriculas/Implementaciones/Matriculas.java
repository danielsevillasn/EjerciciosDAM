package Matriculas.Implementaciones;

public class Matriculas {
    public static String comparaMatricula(String m1, String m2 ){
        // 1. Conjetura de errores: Valores nulos
        if (m1 == null || m2 == null) {
            return "error";
        }

        // 2. Limpieza de datos: Quitar espacios y pasar a mayúsculas
        String mat1 = m1.replace(" ", "").toUpperCase();
        String mat2 = m2.replace(" ", "").toUpperCase();

        // 3. Validación de formato: Debe ser 9999ZZZ (7 caracteres)
        // También validamos que no contengan vocales (según tu test 'vocales')[cite: 3]
        String regex = "^[0-9]{4}[BCDFGHJKLMNPSTVWXYZ]{3}$";
        if (!mat1.matches(regex) || !mat2.matches(regex)) {
            return "error";
        }

        // 4. Lógica de comparación[cite: 1]
        if (mat1.equals(mat2)) {
            return "iguales";
        }

        // Separamos letras y números para comparar por bloques[cite: 1]
        String num1 = mat1.substring(0, 4);
        String let1 = mat1.substring(4);
        String num2 = mat2.substring(0, 4);
        String let2 = mat2.substring(4);

        // Primero mandan las letras (Comparación alfabética)[cite: 1]
        int compLetras = let1.compareTo(let2);
        if (compLetras < 0) {
            return "menor"; // mat1 tiene letras anteriores[cite: 1]
        } else if (compLetras > 0) {
            return "mayor"; // mat1 tiene letras posteriores[cite: 1]
        } else {
            // Si las letras son iguales, mandan los números[cite: 1]
            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            if (n1 < n2) {
                return "menor"; // mismo bloque de letras, número anterior[cite: 1]
            } else {
                return "mayor"; // mismo bloque de letras, número posterior[cite: 1]
            }
        }
    }
}
