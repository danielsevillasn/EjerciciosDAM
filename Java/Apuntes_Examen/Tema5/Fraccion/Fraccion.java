package Ejercicio4;

public class Fraccion {

    //Atributos
    private int numerador;
    private int denominador;

    //Contstructor por defecto
    public Fraccion(){
        this.numerador = 1;
        this.denominador = 1;
    }
    //Constructor para dar inicio a la instancia
    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public int getNumerador(){
        return this.numerador;
    }
    public int getDenominador(){
        return this.denominador;
    }
    /**
     * 
     * 
     */
    public void invierte(){
        int denominador = this.denominador;
        this.denominador=this.numerador;
        this.numerador= denominador;
    }

    /**
     * 
     * 
     */
    public void simplifica(){
        int divisor;
        if(this.denominador>this.numerador){
            divisor = this.denominador;
        }else{
            divisor = this.numerador;
        }
        for(int i = divisor;i>0;i--){
            if(this.denominador%i==0 && this.numerador%i==0){
                this.denominador = this.denominador/i;
                this.numerador = this.numerador/i;
            }
        }
    }
    /**
     * 
     * @param fraccion
     */
    public void multiplica(Fraccion fraccion){
        this.numerador = this.numerador*fraccion.getNumerador();
        this.denominador = this.denominador*fraccion.getDenominador();
    }
    /**
     * 
     */
    public void divide(Fraccion fraccion){
        this.numerador = this.numerador*fraccion.getDenominador();
        this.denominador = this.denominador*fraccion.getNumerador();
    }
    //Metodo toString
    @Override
    public String toString(){
        return(this.numerador+"/"+this.denominador);
    }
}
