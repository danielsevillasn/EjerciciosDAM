package Herramientas;
/**
 * Clase Menú para instanciar diferentes menus
 */
public class Menu {
    private String[]opciones;

    //Constructores
    public Menu(String[]opciones){
        this.opciones = opciones;
    }

    //Getters and setters
    public String[] getOpciones(){
        return opciones;
    }

    public void setOpciones(String[] opciones){
        this.opciones=opciones;
    }

    public void mostraMenu(){
        System.out.println("\n -----------------");
        for(int i =0;i <opciones.length;i++){
            System.out.print(opciones[i]);
        }
    }
}
