public class Cubo {
    private int capacidad;
    private int contenidoActual;

    public Cubo(int capacidad, int contenidoActual) {
        this.capacidad = capacidad;
        this.contenidoActual = contenidoActual;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public int getContenidoActual() {
        return contenidoActual;
    }

    /**
     * Se verte el cubo a otro mirando antes si cabe o no cabe para ver si se puede llegar a derramar algo
     * 
     * @param c
     */
    public void verter(Cubo c){
        int espacioLibreDestino = c.capacidad - c.contenidoActual;

        if(contenidoActual>espacioLibreDestino){
            contenidoActual = contenidoActual-espacioLibreDestino;
            c.contenidoActual = c.capacidad;
        }else{
            c.contenidoActual = contenidoActual+c.contenidoActual;
            contenidoActual = 0;
        }
    }
}
