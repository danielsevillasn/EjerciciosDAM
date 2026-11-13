/**
 * Hilo consumidor que simula los Trenes de Evacuación Ferroviaria.
 * Retira contenedores del silo intermedio y actualiza las estadísticas protegidas.
 */
public class HiloConsumidor implements Runnable {

    private final AlmacenDeTransitoIntermedio almacen;
    private final String nombreTren;

    public HiloConsumidor(AlmacenDeTransitoIntermedio almacen, String nombreTren) {
        this.almacen = almacen;
        this.nombreTren = nombreTren;
    }

    @Override
    public void run() {
        try {
            while (true) {
                // Retirada regulada por semáforos
                String contenedor = almacen.retirar(nombreTren);

                // Comprobación de condición de fin (Poison Pill)
                if ("FIN".equals(contenedor)) {
                    break;
                }

                int tipo = AlmacenDeTransitoIntermedio.extraerTipoDesdeEtiqueta(contenedor);
                almacen.registrarEvacuacion(tipo);

                // Simulación del tiempo de enganche y carga en el convoy ferroviario
                Thread.sleep((int) (Math.random() * 80) + 70);
            }
        } catch (InterruptedException e) {
            System.err.println(nombreTren + " interrumpido: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}
