package Clases;
/**
 * Clase objeto que crea contraseñas y que mira si son fuertes
 * @author Dani
 */
public class Password {

    //Atributos///////////////

    private int longitud;
    private String contraseña;

    //Constructores///////////

    //Contstructor por defecto
    public Password(){
        this.longitud = 8;
        this.contraseña = "";
    }
    //Constructor para dar inicio a la instancia
    public Password(int longitud){
        this.contraseña = generarPassword(longitud);
    }

    //Metodos//////////////////

    //Getter
    public String getContraseña(){
        return this.contraseña;
    }
    public int getLongitud(){
        return this.longitud;
    }

    //Setter
    public void setLongitud(int longitud){
        this.longitud = longitud;
    }

    //Otros metodos

    /**
     * Devuelve un booleano si es fuerte o no. Para que sea fuerte debe tener más de 1 mayúsculas, más de una minúscula 
     * y al menos 3 números
     * 
     * @return valor booleano que te dice si es fuerte o no
     */
    public Boolean esFuerte(){
        String contraseña = this.contraseña;
        int comprueba = 0;
        int contador = 0;
        char letra;
        boolean opcion1 = false;
        boolean opcion2 = false;
        boolean opcion3 = false;
        for(int i = 0;i<contraseña.length();i++){
            letra = contraseña.charAt(i);
            if(!opcion1 && (int)letra>=48 && (int)letra<=57){
                contador++;
                if(contador == 3){
                    opcion1 = true;
                    comprueba++;
                }
            }else if(!opcion2 && (int)letra>=65 && (int)letra<=90){
                comprueba++;
                opcion2 = true;
            }else if(!opcion3 && (int)letra>=97 && (int)letra<=122){
                comprueba++;
                opcion3 = true;
            }
        }
        if(comprueba == 3){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Genera aleatoriamente la contraseña del objeto con la longitud que tenga. Debe generar aleatoriamente números (48 al 57),
     * letras mayúsculas (65 al 90) y minúsculas (97 al 122)
     * 
     * @param longitud numero entero que expresa la longitud
     * @return contraseña 
     */
    public String generarPassword(int longitud){
        String contraseña = "";
        int aleatorio1;
        int aleatorio2 = 0;
        char letra;
        for(int i = 0;i<longitud;i++){
            aleatorio1 = (int) (Math.random()*(4-1)+1);
            switch (aleatorio1) {
                case 1:
                    aleatorio2 = (int)(Math.random()*(58-48)+48);
                    break;
                case 2:
                    aleatorio2 = (int)(Math.random()*(91-65)+65);
                    break;
                case 3:
                    aleatorio2 = (int)(Math.random()*(123-97)+97);
                    break;
                default:
                    break;
            }
            letra = (char) aleatorio2;
            contraseña += letra;
        }
        return contraseña;
    }
    
    //Metodo toString
    @Override
    public String toString(){
        if(esFuerte()){
            return("contraseña = "+this.contraseña+ "\t es fuerte");
        }else{
            return("contraseña = "+this.contraseña+ "\t no es fuerte");
        }
    }
}
