package EjerciciosClase.Ejercicio37;

public class CuentaBanco {
    // Miembros dato
    private String nombreTitular;
    private String numCuenta;
    private double saldo;

    // Constructores
    public CuentaBanco(String nombreTitular, String numCuenta, double saldo) {
        this.nombreTitular = nombreTitular;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public CuentaBanco() {
    }

    // Métodos set
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos get
    public String getNombreTitular() {
        return nombreTitular;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
}