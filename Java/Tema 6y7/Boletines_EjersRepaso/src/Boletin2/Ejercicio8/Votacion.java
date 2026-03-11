public class Votacion {
    private String nombre;
    private static int nVotosTotales = 0;
    private int nVotos;

    public Votacion(String nombre) {
        this.nombre = nombre;
        nVotos = 0;
    }

    
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public static void getnVotosTotales() {
        System.out.println("Ha habido una cantidad de: "+nVotosTotales+" votos totales en toda la votacion");
    }


    public static void setnVotosTotales(int nVotosTotales) {
        Votacion.nVotosTotales = nVotosTotales;
    }


    public int getnVotos() {
        return nVotos;
    }


    public void setnVotos(int nVotos) {
        this.nVotos = nVotos;
    }


    /**
     * Metodo que realiza una votacion y la guarda
     */
    public void votar(){
        System.out.println("Has votado a: "+nombre);
        this.nVotos++;
        nVotosTotales++;
    }

    @Override
    public String toString() {
        return "Votacion [nombre=" + nombre + ", nVotos=" + nVotos + "]";
    }
}
