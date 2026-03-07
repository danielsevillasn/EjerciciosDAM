package Electrodomesticos;

public class Lavadora extends Electrodomestico{
    private int Precio;
    private boolean aguaCaliente;

    public Lavadora(String marca, double potencia) {
        super("Lavadora", marca, potencia);
        this.aguaCaliente = false;
    }
    
    public Lavadora(String marca, double potencia, int precio, boolean aguaCaliente) {
        super("Lavadora", marca, potencia);
        Precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }
    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }
    public int getPrecio() {
        return Precio;
    }
    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    @Override
    public double getConsumo(int horas){
        if(!aguaCaliente){
            return super.getConsumo(horas);
        }else{
            return horas*(getPotencia()+getPotencia()*0.20);
        }
    }
    @Override
    public String toString() {
        return "Lavadora [Precio=" + Precio + ", aguaCaliente=" + aguaCaliente + ", toString()=" + super.toString()
                + "]";
    }
}
