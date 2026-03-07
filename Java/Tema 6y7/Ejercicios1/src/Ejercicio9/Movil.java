public class Movil extends Terminal{
    private String tarifa;
    

    public Movil(){
        super();
        tarifa = "rata";
    }

    public Movil(String numero, String tarifa){
        super(numero);
        this.tarifa = tarifa;
    }

    public Double costeTarifa(){
        double costeTarifa;
        if(tarifa.equals("rata")){
            costeTarifa = Math.round(((double)duracionLlamada/60*0.06) * 100.0) / 100.0;
        }else if(tarifa.equals("mono")){
            costeTarifa = Math.round(((double)duracionLlamada/60*0.12) * 100.0) / 100.0;
        }else if(tarifa.equals("bisonte")){
            costeTarifa = Math.round(((double)duracionLlamada/60*0.30) * 100.0) / 100.0;
        }else{
            return 0.00;
        }
        return costeTarifa;
    }

    @Override
    public String toString() {
        return super.toString()+" - tarificados "+costeTarifa()+" euros ";
    }

    
}
