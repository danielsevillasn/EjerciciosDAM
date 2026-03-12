package MetodosSecundarios;

import Excepciones.ExcepcionAlumnoNoAsiste;
import Objeto.Aula;

/**
 * Metodo ejecutar que imprime el flujo del programa
 * 
 * @author Dani S
 */
public class Ejecutable {
    /**
     * Ejecuta el programa
     */
    public static void Ejecutar() throws ExcepcionAlumnoNoAsiste {
        boolean salir = false;
        while (!salir) {
            int opcion = Salida.menu("menu", "Crear una clase");
            switch (opcion) {
                case 1:
                    Aula aula = new Aula();
                    if (aula.darClase()) {
                        aula.notas();
                    }
                    break;
                case 0:
                    salir = true;
                    break;
            }
            Salida.pausar();
            Salida.limpiarPantalla();
        }
    }
}
