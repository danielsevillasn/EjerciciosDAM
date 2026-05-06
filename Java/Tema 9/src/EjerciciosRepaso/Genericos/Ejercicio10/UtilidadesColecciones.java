package EjerciciosRepaso.Genericos.Ejercicio10;

import java.util.ArrayList;

public class UtilidadesColecciones {
    public static <E> E obtenerUltimoElemento(ArrayList<E> lista){
        if(lista.isEmpty()){
            return null;
        }
        return lista.get(lista.size()-1);
    }
}
