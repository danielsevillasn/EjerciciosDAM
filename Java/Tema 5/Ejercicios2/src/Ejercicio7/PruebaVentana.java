package Ejercicio7;

public class PruebaVentana {
    public static void main(String[] args) {
        ventana ventana1 = new ventana(5);
        ventana ventana2 = new ventana(10);
        ventana1.pintar();
        ventana2.pintar();
        ventana1.setAlmacenamiento(20);
        ventana2.setAlmacenamiento(40);
        ventana1.setTipo("carpetas");
        ventana2.setTipo("Videojuego");
        System.out.println(ventana1);
        System.out.println(ventana2);
    }
}
