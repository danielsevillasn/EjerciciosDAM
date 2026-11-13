/**
 * Hilo consumidor que simula los Trenes de Evacuación Ferroviaria.
 * Retira contenedores del silo intermedio y actualiza las estadísticas
 * protegidas.
 */
public class HiloConsumidor implements Runnable {

    private final Monitor almacen;
    private final int numeroConsumidor;

    public HiloConsumidor(Monitor almacen, int numeroConsumidor) {
        this.almacen = almacen;
        this.numeroConsumidor = numeroConsumidor;
    }

    @Override
    public void run() {
        try {
            while (true) {
                // Retirada regulada por semáforos
                int tipoContenedor = almacen.retirar(numeroConsumidor);

                // Comprobación de condición de fin (Poison Pill)
                if (tipoContenedor == 0) {
                    break;
                }

                almacen.registrarEvacuacion(tipoContenedor);

                System.out.println("[CONSUMIDOR " + numeroConsumidor
                        + "] Embalaje completado. Invocando yield() para alternar CPU...");
                Thread.yield();
            }
        } catch (InterruptedException e) {
            System.err.println(numeroConsumidor + " interrumpido: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}
