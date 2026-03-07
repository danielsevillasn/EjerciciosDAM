package Ejercicio6;

public class Tiempo {

    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo(){
        horas = 0;
        minutos = 0;
        segundos = 0;
    }

    public Tiempo(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        while(minutos>60){
            this.minutos = this.minutos/60;
            this.horas++;
        }
        while(segundos>60){
            this.segundos = this.segundos/60;
            this.minutos++;
        }
    }

    public int getHoras(){
        return horas;
    }

        public int getMinutos(){
        return minutos;
    }

        public int getSegundos(){
        return segundos;
    }

    public void suma(Tiempo t){
        horas = horas+t.getHoras();
        minutos = minutos+t.getMinutos();
        segundos = segundos+t.getSegundos();

        while(minutos>=60){
            minutos = minutos-60;
            horas++;
        }
        while(segundos>=60){
            segundos = segundos-60;
            minutos++;
        }
    }

    public void suma(int horas, int minutos, int segundos){
        this.horas = horas+this.horas;
        this.minutos = minutos+this.minutos;
        this.segundos = segundos+this.segundos;

        while(this.minutos>=60){
            this.minutos = this.minutos-60;
            this.horas++;
        }
        while(this.segundos>=60){
            this.segundos = this.segundos-60;
            this.minutos++;
        }
    }

    @Override
    public String toString(){
        return "horas: "+horas+" minutos: "+minutos+" segundos: "+segundos;
    }
}
