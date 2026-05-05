public class PruebaNombreUsuario {
    /**
     * Método que pide el nombre de los jugadores, valida segun las condiciones
     * impuestas que esta correcto y lo mete en el array de los nombres del juego
     * 
     * @throws ReiniciarJuego para reinciar el juego cuando se quiera
     */
    private static void pedirNombreJugadores() throws ReiniciarJuego {
        boolean nombreValido;
        String nombre;
        for (int i = 0; i < cantidadActualJugadores; i++) {
            nombreValido = false;
            do {
                try {
                    nombre = Datos.pedirCadena("Nombre Jugador " + (i + 1) + ": ");

                    validacionNombre(nombre);

                    Juego.nombresCargados.add(nombre);
                    nombreValido = true;
                } catch (NombreUsuarioNoValido e) {
                    System.out.println(e.getMessage());
                    System.out.println("Para que tu usuario sea válido, debe cumplir:");

                    // Imprime las sugerencias del array list sugerencias
                    for (String sugerencia : e.getSugerencias()) {
                        System.out.println("- " + sugerencia);
                    }
                }
            } while (!nombreValido);
        }
        Datos.pulsaEnter();
    }

    /**
     * Método que valida el nombre de un usuario de tal forma que siga las
     * condiciones impuestas en la excepcion
     * 
     * @param nombreUsuario variable tipo String que representa el nombre del
     *                      usuario
     * @throws NombreUsuarioNoValido excepcion que recoge todas las condiciones para
     *                               luego mostrarlas en caso de que no se cumplan
     */
    public static void validacionNombre(String nombreUsuario) throws NombreUsuarioNoValido {
        // Inicalizamos la excepcion pasando por parametro el nombre
        NombreUsuarioNoValido nombreUsuarioNoValido = new NombreUsuarioNoValido(nombreUsuario);

        // Si la excepción detecta que se ha cumplido alguna condicion, por lo cual hay
        // sugerencias, lanzamos una excepcion
        if (!nombreUsuarioNoValido.getSugerencias().isEmpty()) {
            throw nombreUsuarioNoValido;
        }

        // Si la excepcion no ocurre entonces el usuario se registra
        System.out.println("Usuario " + nombreUsuario + " registrado con éxito.");
    }
}
