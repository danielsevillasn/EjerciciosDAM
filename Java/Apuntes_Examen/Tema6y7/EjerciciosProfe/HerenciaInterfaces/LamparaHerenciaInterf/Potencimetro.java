package InterfacesPolim.HerenciaInterfaces.LamparaHerenciaInterf;

public interface Potencimetro extends Interruptor{
    static final int MAXPOT=10;

    void aumentarPotencia();
    void disminuirPotencia();

}
