package Ejercicio7;

public class ventana {
    private int almacenamiento;
    private int tamaño;
    private String tipo = "";

    public ventana(int tamaño){
        this.tamaño=tamaño;
    }

    public void setAlmacenamiento(int almacenamiento){
        this.almacenamiento=almacenamiento;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }

    public int getAlmacenamiento(){
        return this.almacenamiento;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void pintar(){
        for(int i = 0; i<tamaño;i++){
            for(int j = 0;j<tamaño;j++){
                System.out.print("ª");
            }
            System.out.println();
        }
    }

    @Override
    public String toString(){
        return "La ventana de "+this.tipo+" tiene "+almacenamiento+" de almacenamiento y "+tamaño+" de tamaño";
    }
}
