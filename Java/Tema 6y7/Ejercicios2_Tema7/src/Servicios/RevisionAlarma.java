package Servicios;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio{
    private int numeroAlarmas;

    public RevisionAlarma(LocalDate fechaInicio, String cliente, int numeroAlarmas) {
        super("Revisor Especialista Contraincendios", fechaInicio, cliente);
        this.numeroAlarmas = numeroAlarmas;
    }

    public void setNumeroAlarmas(int numeroAlarmas) {
        this.numeroAlarmas = numeroAlarmas;
    }

    public int getNumeroAlarmas() {
        return numeroAlarmas;
    }

    @Override
    public double costeMaterial(){
        return 0;
    }
    @Override
    public double costeManoObra(){
        return (numeroAlarmas/3.0)*40;
    }
    @Override
    public double costeTotal(){
        return costeManoObra();
    }
    @Override
    public String detalleServicio(){
        return "REVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS\n" +
                "Cliente: " + getCliente() + "\n" +
                "Fecha revision: " + getFechaInicio() + "\n" +
                "--------------------------------"+
                "TOTAL: ............ " + costeTotal()+ "\n"+
                "--------------------------------";
    }
}
