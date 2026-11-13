import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Aplicación Terminal Portuaria (Servidor Coordinador y Logística).
 * Despliega los buques mercantes como procesos hijo, gestiona el almacén de
 * tránsito
 * con semáforos y coordina grúas y trenes según el patrón productor-consumidor.
 */
public class Principal {

    public static void main(String[] args) {
        int nFurgonetas = 5;


        // 1. Pedir numero de furgonetas
        nFurgonetas = pedirNFurgonetas(nFurgonetas);

        System.out.println("** Desplegando "+nFurgonetas+" procesos de furgonetas... **");

        List<String> idsFurgonetas = new ArrayList<>();
        List<Process> listaProcesos = new ArrayList<>();

        // 2. Despliegue de procesos hijo compatibles con Linux y Windows
        desplegarFurgonetas(nFurgonetas, idsFurgonetas, listaProcesos);

        // 3. Espera a que todos las furgonetas descarguen
        esperarFurgonetas(listaProcesos);
        System.out.println("** Todas las furgonetas han concluido su descarga. **");
        System.out.println("** Activando cinta transportadora y operarios de embalaje... **\n");

        // 4. Instanciación del monitor almacen paquetes
        Monitor almacenPaquetes = new Monitor(nFurgonetas);

        // 5. Creación y arranque de los hilos consumidores
        int nConsumidores = 2;
        List<Thread> hilosConsumidores = new ArrayList<>();
        for (int i = 1; i <= nConsumidores; i++) {
            Thread t = new Thread(new HiloConsumidor(almacenPaquetes, i));
            hilosConsumidores.add(t);
            t.start();
        }

        // 6. Creación y arranque de los hilos productores
        List<Thread> hilosProductores = new ArrayList<>();
        for (String idFurgoneta : idsFurgonetas) {
            Thread grua = new Thread(new HiloProductor(almacenPaquetes, idFurgoneta));
            hilosProductores.add(grua);
            grua.start();
        }

        // 7. Espera de finalización de todos los productores (Grúas)
        for (Thread productores : hilosProductores) {
            try {
                productores.join();
            } catch (InterruptedException e) {
                System.err.println("Interrupción esperando grúa: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }

        // 8. Notificación de fin de producción a los trenes (Poison Pills a través de
        // semáforos)
        try {
            almacenPaquetes.finalizarProduccion(nConsumidores);
        } catch (InterruptedException e) {
            System.err.println("Interrupción al enviar señal de fin de producción: " + e.getMessage());
            Thread.currentThread().interrupt();
        }

        // 9. Espera de finalización de los trenes consumidores
        for (Thread consumidores : hilosConsumidores) {
            try {
                consumidores.join();
            } catch (InterruptedException e) {
                System.err.println("Interrupción esperando tren: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("\n** Todos los paquetes han sido embalados y clasificados. **");

        // 10. Presentación del informe balanceado final
        almacenPaquetes.mostrarBalance();
    }

    private static int pedirNFurgonetas(int nFurgonetas) {
        System.out.print("Indica el número de furgonetas de reparto: ");
        try (Scanner s = new Scanner(System.in)) {
            if (s.hasNextLine()) {
                String linea = s.nextLine().trim();
                try {
                    nFurgonetas = Integer.parseInt(linea);
                } catch (NumberFormatException e) {
                    nFurgonetas = 5;
                }
            }
        }

        if (nFurgonetas <= 0) {
            nFurgonetas = 5;
        }
        return nFurgonetas;
    }

    private static void desplegarFurgonetas(int nFurgonetas, List<String> idsFurgonetas, List<Process> listaProcesos) {
        String javaBin = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";

        String classpath = System.getProperty("java.class.path");
        if (classpath == null || classpath.isEmpty()) {
            classpath = ".";
        }
        File binDir = new File("bin");
        if (binDir.exists() && binDir.isDirectory()) {
            classpath = classpath + File.pathSeparator + binDir.getAbsolutePath();
        }

        for (int i = 0; i < nFurgonetas; i++) {
            ProcessBuilder pb = new ProcessBuilder(javaBin, "-cp", classpath, "ProcesoHijo");
            pb.directory(new File("."));

            try {
                Process proceso = pb.start();
                listaProcesos.add(proceso);

                // Lectura inmediata del identificador único emitido por el buque por salida
                // estándar
                try (BufferedReader br = new BufferedReader(new InputStreamReader(proceso.getInputStream()))) {
                    String lineaId = br.readLine();
                    if (lineaId != null && !lineaId.trim().isEmpty()) {
                        String idLimpio = lineaId.trim();
                        idsFurgonetas.add(idLimpio);
                        System.out.println("-> Furgoneta aparcada y notificado: " + idLimpio);
                    }
                }
            } catch (IOException e) {
                System.err.println("Error al lanzar el buque mercante " + (i + 1) + ": " + e.getMessage());
            }
        }
    }

    private static void esperarFurgonetas(List<Process> listaProcesos) {
        for (Process furgoneta : listaProcesos) {
            try {
                furgoneta.waitFor();
            } catch (InterruptedException e) {
                System.err.println("Interrupción durante la espera del buque: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
    }
}
