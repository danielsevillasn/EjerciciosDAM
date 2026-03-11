public class PruebaVotacion {
    public static void main(String[] args) {
        Votacion p1 = new Votacion("Pepe");
        Votacion p2 = new Votacion("Juan");
        Votacion p3 = new Votacion("Mario");
        
        p1.votar();
        p2.votar();
        p2.votar();
        p2.votar();
        p3.votar();
        p3.votar();

        System.out.println("\n--- RESULTADOS INDIVIDUALES ---");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Lógica para encontrar al más votado
        Votacion ganador = p1; // Asumimos que p1 empieza ganando

        if (p2.getnVotos() > ganador.getnVotos()) {
            ganador = p2;
        }
        if (p3.getnVotos() > ganador.getnVotos()) {
            ganador = p3;
        }

        System.out.println("\n--- RESUMEN FINAL ---");
        Votacion.getnVotosTotales();
        System.out.println("El ganador es: " + ganador.getNombre() + " con " + ganador.getnVotos() + " votos.");
    }
}
