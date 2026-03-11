public class PruebaPizza {
    public static void main(String[] args) {
        Pizza p1 = new Pizza(Tamano.Mediana, Tipo.Margarita );
        Pizza p2 = new Pizza(Tamano.Familiar, Tipo.Funghi);
        p2.sirve();
        Pizza p3 = new Pizza(Tamano.Mediana, Tipo.CuatroQuesos);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("pedidas: " + Pizza.getnTotalPedidas());
        System.out.println("servidas: " + Pizza.getnTotalServidas());
    }
}
