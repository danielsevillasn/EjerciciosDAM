package Ejercicio1;

public class Caballo {
    private int edad;
    private String nombre = "";
    private int altura;

    public Caballo(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public int getEdad(int edad){
        return this.edad;
    }

    public int getAltura(int altura){
        return this.altura;
    }

    public void relinchar(){
        System.out.println("brrrrrrr");
    }
    @Override
    public String toString(){
        return "El caballo "+this.nombre+" de altura "+altura+" y de edad "+edad;
    }
}
