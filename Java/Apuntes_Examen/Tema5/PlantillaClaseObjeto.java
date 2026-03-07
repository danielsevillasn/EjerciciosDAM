/**
 * (Enunciado)
 * 
 * @author daniS
 */

public class PlantillaClaseObjeto {
    //Atributos/////////////////////
    private int n;
    public String nombre;
    static int contador;
    final int id = 01;
    
    //Metodos////////////////////////

    //Constructor por defecto
    public PlantillaClaseObjeto(){
        n = 0;
        nombre = "";
        contador = 0;
    }

    //Constructor para instanciar objeto con dos parametros
    public PlantillaClaseObjeto(int n, String nombre){
        this.n = n;
        this.nombre = nombre;
        n++;
    }

    //Constructor para instanciar objeto con un parametro
    public PlantillaClaseObjeto(int n){
        this.n = n;
        nombre = "A";
        n++;
    }

    //Constructor para instanciar objeto con un parametro
    public PlantillaClaseObjeto(String nombre){
        this.nombre = nombre;
        n = 1;
        n++;
    }

    //Getter
    public int getN(){
        return n;
    }

    public String getNombre(){
        return nombre;
    }

    public static int getContador(){
        return contador;
    }

    //Setter
    public void setN(int n){
        this.n = n;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //Otros metodos
    /**
     * aaa
     * 
     * @param
     * @return
     */


    //toString
    @Override
    public String toString(){
        return "bla bla "+n+"bla bla"+nombre+"bla bla"+contador;
    }
}
