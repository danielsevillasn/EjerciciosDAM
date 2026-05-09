package BlackJack.src.Clases;
public class Pobre extends Jugador{
    
    //Atributo
    private static final int DINERO = 1000;

    //Constructor
    public Pobre(String nombre) {
        super(nombre, DINERO);
    }

    @Override
    public void apostar() {
        while (true) {
            System.out.print("¿Cuánto dinero quieres apostar? (Máximo 100 euros): ");
            int cantidad = Integer.parseInt(System.console().readLine());

            if (cantidad <= 100 && this.getDinero() >= cantidad) {
                this.setDinero(this.getDinero()-cantidad);
                break;
            }

            System.out.println("No te pases que te quedas pobre");
        }

        System.out.println("Apuesta realizada con exito. Nuevo saldo: " + this.getDinero());
    }
}
