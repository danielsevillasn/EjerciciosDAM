package Boletin2.Ejercicio2;

public class Tiempo {
    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        normalizar();
    }

    /**
     * Ajusta los segundos y minutos para que no superen 59.
     */
    private void normalizar() {
        // Ajustar segundos
        this.minutos += this.segundos / 60;
        this.segundos = this.segundos % 60;

        // Ajustar minutos
        this.horas += this.minutos / 60;
        this.minutos = this.minutos % 60;
        
        // Manejo de resta (si los segundos quedan negativos)
        if (this.segundos < 0) {
            this.segundos += 60;
            this.minutos--;
        }
        if (this.minutos < 0) {
            this.minutos += 60;
            this.horas--;
        }
    }

    public void suma(Tiempo t) {
        this.horas += t.horas;
        this.minutos += t.minutos;
        this.segundos += t.segundos;
        normalizar();
    }

    public void resta(Tiempo t) {
        this.horas -= t.horas;
        this.minutos -= t.minutos;
        this.segundos -= t.segundos;
        normalizar();
    }

    @Override
    public String toString() {
        return horas + "h " + minutos + "m " + segundos + "s";
    }
}