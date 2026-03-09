package Boletin2.Ejercicio1;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    
    public int getNumerador() {
        return numerador;
    }


    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }


    public int getDenominador() {
        return denominador;
    }


    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }


    /**
     * Simplemente invierte el valor de las variables
     */
    public void invierte(){
        int temp = numerador;
        numerador = denominador;
        denominador = temp;
    }

    /**
     * Simplifica el denominador y el numerador 
     */
    public void simplifica(){
        int numeroMin;
        if(numerador>denominador){
            numeroMin = denominador;
        }else{
            numeroMin = numerador;
        }

        for(int i = numeroMin; i>0;i--){
            int numeradorDivisible = numerador%i;
            int denominadorDivisible = denominador%i;
            if(numeradorDivisible == 0 && denominadorDivisible == 0){
                numerador = numerador/i;
                denominador = denominador/i;
            }
        }
    }

    /**
     * Método que actualiza el valor de lafraccion según lo multiplicado
     * 
     * @param fraccion
     */
    public void multiplica(Fraccion fraccion){
        numerador =  numerador*fraccion.getNumerador();
        denominador = denominador*fraccion.getDenominador();
    }

        /**
     * Método que actualiza el valor de lafraccion según lo dividido
     * 
     * @param fraccion
     */
    public void dividir(Fraccion fraccion){
        numerador =  numerador*fraccion.getDenominador();
        denominador = denominador*fraccion.getNumerador();
    }

    @Override
    public String toString(){
        return "La fracción es "+numerador+"/"+denominador;
    }
}
