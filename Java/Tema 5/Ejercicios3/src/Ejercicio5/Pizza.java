package Ejercicio5;

public class Pizza {
    //Atributos///////////////////////////
    private String tamaño;
    private String tipo;
    private String estado;
    private static int numeroTotalPedidas;
    private static int numeroTotalServidas;

    //Constructores///////////////////////

    //Constructor por defecto

    public Pizza(){
        tamaño = "";
        tipo = "";
        estado = "";
        numeroTotalPedidas = 0;
        numeroTotalServidas = 0;
    }

    //Constructor que instancia el objeto cuando da dos variables tipo String
    public Pizza(String tamaño, String tipo){
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.estado = "pedida";
        numeroTotalPedidas++;
    }

    //Metodos////////////////////////////////

    //Getter
    public static int getTotalPedidas(){
        return numeroTotalPedidas;
    }
    public static int getTotalServidas(){
        return numeroTotalServidas;
    }

    //Otros
    public void sirve(){
        if(estado.equals("pedida")){
            this.estado = "servida";
            numeroTotalServidas++;
        }else{
            System.out.println("Esta pizza ya se ha servido");
        }
    }

    //toString
    @Override
    public String toString(){
        return "pizza "+tipo+" "+tamaño+", "+estado;
    }
}
