public class Termometro {
    private int temperatura;

    public Termometro(){
        temperatura = 0;
    }

    public int getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(int temperatura) throws TemperaturaFueraRangoException{
        if(temperatura<-192 || temperatura >100){
            throw new TemperaturaFueraRangoException("La temperatura esta fuera de rango");
        }
        this.temperatura = temperatura;
    }
}
