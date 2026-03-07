public class Main {
    public static void main(String[] args) {
        Electrodomestico miTele = new Televisor(55, "Samsung",600.0); //Es de tipo Electrodomestico pero realmente es un televisor

        miTele.mostrarDetalles(); //La conversión hacia arriba (de hijo a padre) es automática.
        int p = ((Televisor)miTele).getPulgadas(); //La conversión hacia abajo (de padre a hijo) tiene que ser explícita (poniendo el tipo entre paréntesis).

        System.out.println("Las pulgadas son: "+ p);

        SmartTV teleSmart = new SmartTV(15, "LG", 300);
        teleSmart.finalize();
        teleSmart = null;
        System.gc();
    }
}
