package Ejercicio7;

public class AeropuertoPublico extends Aeropuerto{
    private int financiacion;
    private int nTrabajadoresDiscapacitados;

    public AeropuertoPublico() {
        super();
        this.financiacion = 0;
        this.nTrabajadoresDiscapacitados = 0;
    }
    public AeropuertoPublico(String nombre, int añoInauguracion, int capacidad, int financiacion,
            int nTrabajadoresDiscapacitados) {
        super(nombre, añoInauguracion, capacidad);
        this.financiacion = financiacion;
        this.nTrabajadoresDiscapacitados = nTrabajadoresDiscapacitados;
    }

    

    public int getFinanciacion() {
        return financiacion;
    }
    public void setFinanciacion(int financiacion) {
        this.financiacion = financiacion;
    }
    public int getnTrabajadoresDiscapacitados() {
        return nTrabajadoresDiscapacitados;
    }
    public void setnTrabajadoresDiscapacitados(int nTrabajadoresDiscapacitados) {
        this.nTrabajadoresDiscapacitados = nTrabajadoresDiscapacitados;
    }


    /**
     * Imprime por pantalla las ganancias totales 
     * 
     * @param cantidad numero entero 
     */
    public void gananciasTotales(int cantidad){
        int gananciasTotales = cantidad+financiacion+1000*nTrabajadoresDiscapacitados;
        System.out.println("Las ganancias totales son: "+gananciasTotales);
    }

    @Override
    public String toString() {
        return super.toString()+"AeropuertoPublico [financiacion=" + financiacion + ", nTrabajadoresDiscapacitados="
                + nTrabajadoresDiscapacitados + "]";
    }

    
}
