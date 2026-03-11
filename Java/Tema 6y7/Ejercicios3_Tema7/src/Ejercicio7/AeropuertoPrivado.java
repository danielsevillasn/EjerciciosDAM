public class AeropuertoPrivado extends Aeropuerto{
    private int nSocios;

    public AeropuertoPrivado() {
        this.nSocios = 0;
    }

    public AeropuertoPrivado(String nombre, int añoInauguracion, int capacidad, int nSocios) {
        super(nombre, añoInauguracion, capacidad);
        this.nSocios = nSocios;
    }

    public int getnSocios() {
        return nSocios;
    }

    public void setnSocios(int nSocios) {
        this.nSocios = nSocios;
    }

    /**
     * Imprime por pantalla las ganancias totales por socio
     * 
     * @param cantidad numero entero
     */
    public void gananciasTotales(int cantidad){
        int gananciasTotales = cantidad/nSocios;
        System.out.println("Las ganancias por socio son de: "+gananciasTotales);
    }

    @Override
    public String toString() {
        return super.toString()+"AeropuertoPrivado [nSocios=" + nSocios + "]";
    }
}
