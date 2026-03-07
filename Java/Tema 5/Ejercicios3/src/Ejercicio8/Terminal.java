package Ejercicio8;
/**
 * Clase terminal que tiene asociada un numero y que puede llamar a otras terminales guardando la duracion de dichas llamadas
 */
public class Terminal {

    //Atributos/////////////////

    private  int duracion;
    private String numero;

    //Métodos///////////////////

    //Constructor por defecto
    public Terminal(){
        duracion = 0;
        numero = "";
    }

    //Constructor para dar inicio a la instancia
    public Terminal(String numero){
        this.numero = numero;
    }

    //Setter
    void setDuracion(int duracion){
        this.duracion =+ duracion;
    }

    //getter
    int getDuracion(){
        return this.duracion;
    }

    /**
     * LLama al otro terminal y guarda la duracion de la llamada
     *
     * @param nombre variable tipo terminal propia de un objeto
     * @param duracion variable entera que almacena la duracion
     */
    public void llama(Terminal nombre, int duracion){
        this.duracion +=duracion;
        nombre.setDuracion(nombre.getDuracion()+duracion);
    }

    @Override
    public String toString(){
        return "Nº "+ this.numero+" - "+ this.duracion+ "s de conversación";
    }
}