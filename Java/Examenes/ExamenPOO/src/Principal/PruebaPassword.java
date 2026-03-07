package Principal;
import Metodos.Funciones;
import Clases.Password;

/**
 * Metodo principal en el que se prueban las clases password y funciones
 * 
 * @author Dani
 */
public class PruebaPassword {
    public static void main(String[] args) {
        Password[] contraseñas = new Password[5];
        int contador = Funciones.creacionLongitud(contraseñas);
        Funciones.listaContraseñas(contraseñas, contador);
    }
}
