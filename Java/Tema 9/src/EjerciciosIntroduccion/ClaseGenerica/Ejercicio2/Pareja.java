package EjerciciosIntroduccion.ClaseGenerica.Ejercicio2;

public class Pareja<K,V> {
    private K clave;
    private V valor;

    public Pareja(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public void mostrarPareja(){
        System.out.println("Clave: "+clave);
        System.out.println("Valor: "+valor);
    }
}
