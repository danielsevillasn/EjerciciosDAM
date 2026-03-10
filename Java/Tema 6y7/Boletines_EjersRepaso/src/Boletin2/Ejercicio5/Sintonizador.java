package Boletin2.Ejercicio5;

public class Sintonizador implements Controlable{
    private double frecuencia;

    public Sintonizador(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    /**
     * Se sube la frecuencia 0,5 MHz pero si se sobrepasa de 108MHz entonces baja a 80MHz
     */
    public void subir(){
        frecuencia += 0.5;
        if(frecuencia>108){
            frecuencia = 80;
        }
    }

    /**
     * Se baja la frecuencia 0,5 MHz pero si se baja de 80MHz entonces sube a 108MHz
     */
    public void bajar(){
        frecuencia = frecuencia - 0.5;
        if(frecuencia<80){
            frecuencia = 108;
        }
    }

    /**
     * Muestra la frecuencia del sintonizador
     */
    public void mostrar(){
        System.out.println("La frecuencia es de: "+frecuencia+"MHz");
    }
}
