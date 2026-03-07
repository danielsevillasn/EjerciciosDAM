public class Ejercicio4 {
    public static void main(String[] args){
        System.out.printf("\033[33m%-8s\033[39;49m%5.2f%6d","Pablo",23.456,123);
        //El 033[33m sirve para cambiar el color del texto a amarillo y el 033[39;49m sirve para volver al color por defecto
    }
}
