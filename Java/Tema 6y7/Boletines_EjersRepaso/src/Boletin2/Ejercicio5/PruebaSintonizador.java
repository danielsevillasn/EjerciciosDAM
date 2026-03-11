public class PruebaSintonizador {
    public static void main(String[] args) {
        Sintonizador s = new Sintonizador(80);

        s.bajar();
        s.mostrar();
        s.subir();
        s.mostrar();
    }
}
