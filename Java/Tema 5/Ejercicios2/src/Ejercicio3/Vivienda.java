package Ejercicio3;

public class Vivienda {
    String direccion = "";
    int area;
    int numero;
    int codigoPostal;

    Vivienda (int area, int codigoPostal){
        this.area = area;
        this.codigoPostal = codigoPostal;
    }
    void pinta(){
        for (int i = area;i>0;i--){
            for(int j = area;j>0;j--){
                System.out.print("█");
            }
            System.out.println();
        }
    }
    @Override
    public String toString(){
        String resultado = "El area es: "+area+"m2 y el codigo postal es: "+codigoPostal;
        return resultado;
    }
}