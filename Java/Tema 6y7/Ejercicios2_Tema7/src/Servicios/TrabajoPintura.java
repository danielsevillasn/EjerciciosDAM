package Servicios;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio{
    private double superficie;
    private double precioPintura;
    public TrabajoPintura(String trabajador, LocalDate fechaInicio, String cliente, double superficie,double precioPintura) {
        super(trabajador, fechaInicio, cliente);
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }
    public double getSuperficie() {
        return superficie;
    }
    public double getPrecioPintura() {
        return precioPintura;
    }
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }
    @Override
    public double costeMaterial(){
        return (superficie/7.8)*precioPintura;
    }
    @Override
    public double costeManoObra(){
        return (superficie/10)*9.5;
    }
    @Override
    public double costeTotal(){
        double costeTotal = costeMaterial()+costeManoObra();
        double costeAdicional = costeTotal*0.15;
        if(superficie >= 50){
            return costeTotal;
        }else{
            return costeTotal+costeAdicional;
        }
    }
    @Override
    public String detalleServicio(){
        double adicional = 0;
        if (superficie < 50) {
            adicional = (costeMaterial() + costeManoObra()) * 0.15;
        }
        return "TRABAJO DE PINTURA\n" +
                "Cliente: " + getCliente() + "\n" +
                "Fecha de inicio: " + getFechaInicio() + "\n" +
                "Pintor: " + getTrabajador() + "\n" +
                "Coste Material..... " + costeMaterial() + "\n" +
                "Coste Mano Obra.... " + costeManoObra() + "\n" +
                "Coste Adicional.... " + adicional + "\n" +
                "TOTAL: ............ " + costeTotal() + "\n" +
                "--------------------------------";
    }
}
