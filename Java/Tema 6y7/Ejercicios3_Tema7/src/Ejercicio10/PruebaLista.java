public class PruebaLista {
    public static void main(String[] args) {

        Lista<Integer> listaNumeros = new Lista<>(5);

        listaNumeros.aniadir(1);
        listaNumeros.aniadir(2);
        listaNumeros.aniadir(3);
        listaNumeros.aniadir(4);
        listaNumeros.aniadir(5);

        listaNumeros.listar();
        System.out.println("");

        listaNumeros.eliminar(4);

        listaNumeros.listar();
        System.out.println("");

        listaNumeros.eliminar(5);

        listaNumeros.listar();
        System.out.println("");

        System.out.println("¿Posicion del elemento 3? " + listaNumeros.posicion(3));
        System.out.println("Tamaño: " + listaNumeros.tamanio());
        
        listaNumeros.vaciar();
        
        listaNumeros.listar();

    }
}
