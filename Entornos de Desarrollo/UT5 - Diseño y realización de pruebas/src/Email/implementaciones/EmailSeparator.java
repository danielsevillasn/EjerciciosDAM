package Email.implementaciones;

public class EmailSeparator {
    public static String[] separaEmail(String email) {

        // Detectar la posición del símbolo '@'
        int atIndex = -1;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                atIndex = i;
            }
        }

        // Si no se encontró '@' o está al principio o al final
        if (atIndex <= 0 || atIndex >= email.length() - 1) {
            return null;
        }

        // Separar el nombre de usuario y el dominio
        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1);

        // Verificar que el dominio no esté vacío
        if (domain.isEmpty()) {
            return null;
        }

        if (!domain.contains(".") || domain.startsWith(".") || domain.endsWith(".")) {
            return null;
        }

        // Devolver el resultado en un array
        return new String[]{username, domain};
    }
}