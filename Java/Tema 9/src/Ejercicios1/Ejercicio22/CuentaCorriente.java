package Ejercicios1.Ejercicio22;

import java.util.ArrayList;

public class CuentaCorriente {
    private long nCuenta;
    private int saldo;
    private ArrayList<String> historialMovimientos;
    private int nMovimientos;

    public CuentaCorriente(){
        nCuentaAleatorio();
        historialMovimientos = new ArrayList<>();
        saldo = 0;
    }

    public CuentaCorriente(int saldo) {
        nCuentaAleatorio();
        historialMovimientos = new ArrayList<>();
        this.saldo = saldo;
    }

    public void nCuentaAleatorio(){
        long maximo = 10000000000L;
        long minimo = 1000000000;
        long aleatorio = (long) (Math.random()*(maximo-minimo)+minimo);

        nCuenta = aleatorio;
    }

    public void ingreso(int cantidad){
        saldo += cantidad;
        añadirHistoriales(cantidad, 1);
    }

    public void cargo(int cantidad){
        saldo = saldo-cantidad;
        añadirHistoriales(cantidad, 2);
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void transferencia(CuentaCorriente c,int cantidad){
        saldo = saldo-cantidad;
        c.setSaldo(c.getSaldo()+cantidad);
        añadirHistoriales(cantidad,2,c);
        c.añadirHistoriales(cantidad,1,c);
    }

    public void añadirHistoriales(int cantidad, int tipoMovimiento){
        switch (tipoMovimiento) {
            case 1:
                historialMovimientos.add("Ingreso de "+cantidad+" €  Saldo: "+saldo+" €");
                break;
            case 2:
                historialMovimientos.add("Cargo de "+cantidad+" €  Saldo: "+saldo+" €");
                break;
        }
        nMovimientos++;
    }

    public long getnCuenta() {
        return nCuenta;
    }

    public void añadirHistoriales(int cantidad, int tipoMovimiento, CuentaCorriente c){
        switch (tipoMovimiento) {
            case 1:
                historialMovimientos.add("Tranf. recibida de "+cantidad+" € de la cuenta "+c.getnCuenta()+"  Saldo: "+saldo+" €");
                break;
            case 2:
                historialMovimientos.add("Tranf. emitida de "+cantidad+" € de la cuenta "+c.getnCuenta()+"  Saldo: "+saldo+" €");
                break;
        }
        nMovimientos++;
    }

    public void movimientos(){
        System.out.println("Movimientos de la cuenta "+nCuenta);
        System.out.println("----------------------------------");
        for(int i = 0;i<nMovimientos;i++){
            System.out.println(historialMovimientos.get(i));
        }
    }
}
