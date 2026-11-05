package EjerciciosPropuestosRepaso.Ejercicio7;

import java.io.Serializable;

public class Vehiculo implements Serializable{
    private String matrícula;
    private String marca;
    private Double depósito;
    private String modelo;

    public Vehiculo(String matrícula, String marca, Double depósito, String modelo) {
        this.matrícula = matrícula;
        this.marca = marca;
        this.depósito = depósito;
        this.modelo = modelo;
    }

    public String getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getDepósito() {
        return depósito;
    }

    public void setDepósito(Double depósito) {
        this.depósito = depósito;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
