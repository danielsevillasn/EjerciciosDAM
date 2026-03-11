public class CuentaCorriente {
    private double saldo = 0;
    private String nombre;

    public CuentaCorriente(String nombre) {
        this.nombre = nombre;
    }

    public double saldo(){
        return saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void imposicion(double cantidad){
        System.out.println("Se ingreso "+cantidad+"euros a la cuenta "+nombre);
        saldo += cantidad;
    }

    public void reintegro(double cantidad){
        System.out.println("Se quito "+cantidad+"euros a la cuenta "+nombre);
        saldo = saldo-cantidad;
    }

    public void traspaso(double cantidad, CuentaCorriente c){
        System.out.println("Se traspaso "+cantidad+"euros de la cuenta "+nombre+" a la cuenta "+c.nombre);
        saldo = saldo-cantidad;
        c.saldo += cantidad;
    }
}
