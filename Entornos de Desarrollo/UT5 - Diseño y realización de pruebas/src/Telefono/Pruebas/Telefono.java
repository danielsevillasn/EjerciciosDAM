package Telefono.Pruebas;

public class Telefono {
    public static boolean esTelefonoNacional(String tel) {
        if (tel == null) return false;

        // Limpiamos espacios
        String telLimpio = tel.replace(" ", "");

        // Expresión regular: Empieza por [6,7,8,9] y le siguen 8 dígitos numéricos
        return telLimpio.matches("^[6-9][0-9]{8}$");
    }
}
