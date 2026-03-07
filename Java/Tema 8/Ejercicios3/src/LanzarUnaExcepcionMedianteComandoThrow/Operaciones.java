package LanzarUnaExcepcionMedianteComandoThrow;

public class Operaciones {
    private int n1;
    private int n2;

    public Operaciones(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int suma(){
        return n1+n2;
    }

    public int resta(){
        return n1-n2;
    }
    public int multiplicacion(){
        return n1*n2;
    }

    public int division(){
        if(n2 == 0){
            throw new ArithmeticException();
        }
        return n1/n2;
    }

    @Override
    public String toString(){
        return "Suma= "+suma()+"\nResta= "+resta()+"\nMultiplicación= "+multiplicacion()+"\nDivision= "+division();
    }
}
