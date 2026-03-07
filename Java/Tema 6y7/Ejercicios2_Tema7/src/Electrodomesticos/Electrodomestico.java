package Electrodomesticos;
public class Electrodomestico {
    private String tipo;
    private String Marca;
    private double Potencia;
    
    public Electrodomestico(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        Marca = marca;
        Potencia = potencia;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public void setPotencia(double potencia) {
        Potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public double getPotencia() {
        return Potencia;
    }

    public double getConsumo(int horas){
        return horas*Potencia;
    }

    public double getCosteConsumo(int horas, double costeHora){
        return getConsumo(horas)*costeHora;
    }
    @Override
    public String toString() {
        return "Electrodomestico [tipo=" + tipo + ", Marca=" + Marca + ", Potencia=" + Potencia + "]";
    }

    
}
