package BlackJack.src.Clases;
public class Rico extends Jugador{

    //Atributo
    private static final int DINERO = 10000;

    //Constructor
    public Rico(String nombre) {
        super(nombre, DINERO);
    }

    /**
     * Apuesta dinero
     */
    @Override
    public void apostar() {
        while (true) {
            System.out.print("¿Cuánto dinero quieres apostar? (Mínimo 500 euros): ");
            int cantidad = Integer.parseInt(System.console().readLine());

            if (cantidad >= 500 && this.getDinero() >= cantidad) {
                this.setDinero(this.getDinero()-cantidad);
                break;
            }

            System.out.println("No seas rata, metele mas");
        }

        System.out.println("Apuesta realizada con exito. Nuevo saldo: " + this.getDinero());
    }
}
