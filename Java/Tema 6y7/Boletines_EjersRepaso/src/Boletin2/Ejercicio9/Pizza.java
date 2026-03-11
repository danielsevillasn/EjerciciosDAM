public class Pizza {
    private Tamano tamaño;
    private Tipo tipo;
    private String estado;
    private static int nTotalPedidas;
    private static int nTotalServidas;

    public Pizza(Tamano tamaño, Tipo tipo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.estado = "pedida";
        nTotalPedidas++;
    }

    
    public static int getnTotalPedidas() {
        return nTotalPedidas;
    }


    public static int getnTotalServidas() {
        return nTotalServidas;
    }


    /**
     * Metodo que sirve la pizza
     */
    public void sirve(){
        this.estado = "servida";
        nTotalServidas++;
    }

    @Override
    public String toString() {
        return "Pizza [tamaño=" + tamaño + ", tipo=" + tipo + ", estado=" + estado + "]";
    }

    
}
