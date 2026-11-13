import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Aplicación Terminal Portuaria (Servidor Coordinador y Logística).
 * Despliega los buques mercantes como procesos hijo, gestiona el almacén de tránsito
 * con semáforos y coordina grúas y trenes según el patrón productor-consumidor.
 */
public class AplicacionTerminalPortuaria {

    public static void main(String[] args) {
        int nBuques = 5;

        // 1. Recuperación y validación del número de buques (args o Scanner con fallback de 5)
        if (args.length > 0) {
            try {
                nBuques = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Argumento no válido. Se asigna valor por defecto: 5");
                nBuques = 5;
            }
        } else {
            System.out.print("Indica el número de buques mercantes esperados: ");
            try (Scanner s = new Scanner(System.in)) {
                if (s.hasNextLine()) {
                    String linea = s.nextLine().trim();
                    try {
                        nBuques = Integer.parseInt(linea);
                    } catch (NumberFormatException e) {
                        nBuques = 5;
                    }
                }
            }
        }

        if (nBuques <= 0) {
            nBuques = 5;
        }

        System.out.println("** Desplegando procesos de buques mercantes en muelle... **");

        List<String> idsBuques = new ArrayList<>();
        List<Process> listaProcesos = new ArrayList<>();

        // 2. Despliegue de procesos hijo compatibles con Linux y Windows
        desplegarBuques(nBuques, idsBuques, listaProcesos);

        // 3. Espera a que todos los buques completen sus maniobras
        esperarProcesos(listaProcesos);
        System.out.println("** Todos los buques han finalizado maniobras de atraque. **");
        System.out.println("** Activando almacén intermedio con Semáforos (Capacidad: 4 contenedores)... **\n");

        // 4. Instanciación del monitor Almacén de Tránsito Intermedio
        AlmacenDeTransitoIntermedio almacen = new AlmacenDeTransitoIntermedio(nBuques);

        // 5. Creación y arranque de los hilos consumidores (Trenes de Evacuación Ferroviaria)
        int numTrenes = 2;
        List<Thread> hilosTrenes = new ArrayList<>();
        for (int i = 1; i <= numTrenes; i++) {
            Thread t = new Thread(new HiloConsumidor(almacen, "TREN CARGA " + i));
            hilosTrenes.add(t);
            t.start();
        }

        // 6. Creación y arranque de los hilos productores (Grúas Pórtico de Descarga)
        List<Thread> hilosGruas = new ArrayList<>();
        for (String idBuque : idsBuques) {
            Thread grua = new Thread(new HiloProductor(almacen, idBuque));
            hilosGruas.add(grua);
            grua.start();
        }

        // 7. Espera de finalización de todos los productores (Grúas)
        for (Thread grua : hilosGruas) {
            try {
                grua.join();
            } catch (InterruptedException e) {
                System.err.println("Interrupción esperando grúa: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }

        // 8. Notificación de fin de producción a los trenes (Poison Pills a través de semáforos)
        try {
            almacen.finalizarProduccion(numTrenes);
        } catch (InterruptedException e) {
            System.err.println("Interrupción al enviar señal de fin de producción: " + e.getMessage());
            Thread.currentThread().interrupt();
        }

        // 9. Espera de finalización de los trenes consumidores
        for (Thread tren : hilosTrenes) {
            try {
                tren.join();
            } catch (InterruptedException e) {
                System.err.println("Interrupción esperando tren: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("\n** Todos los contenedores han sido evacuados por ferrocarril. **");

        // 10. Presentación del informe balanceado final
        almacen.mostrarBalance();
    }

    private static void desplegarBuques(int nBuques, List<String> idsBuques, List<Process> listaProcesos) {
        String javaBin = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";

        String classpath = System.getProperty("java.class.path");
        if (classpath == null || classpath.isEmpty()) {
            classpath = ".";
        }
        File binDir = new File("bin");
        if (binDir.exists() && binDir.isDirectory()) {
            classpath = classpath + File.pathSeparator + binDir.getAbsolutePath();
        }

        for (int i = 0; i < nBuques; i++) {
            ProcessBuilder pb = new ProcessBuilder(javaBin, "-cp", classpath, "AplicacionBuqueMercante");
            pb.directory(new File("."));

            try {
                Process proceso = pb.start();
                listaProcesos.add(proceso);

                // Lectura inmediata del identificador único emitido por el buque por salida estándar
                try (BufferedReader br = new BufferedReader(new InputStreamReader(proceso.getInputStream()))) {
                    String lineaId = br.readLine();
                    if (lineaId != null && !lineaId.trim().isEmpty()) {
                        String idLimpio = lineaId.trim();
                        idsBuques.add(idLimpio);
                        System.out.println("-> Buque atracado y notificado: " + idLimpio);
                    }
                }
            } catch (IOException e) {
                System.err.println("Error al lanzar el buque mercante " + (i + 1) + ": " + e.getMessage());
            }
        }
    }

    private static void esperarProcesos(List<Process> listaProcesos) {
        for (Process p : listaProcesos) {
            try {
                p.waitFor();
            } catch (InterruptedException e) {
                System.err.println("Interrupción durante la espera del buque: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
    }
}
