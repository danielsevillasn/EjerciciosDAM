package Ejercicio5;

public class ProductoFresco extends Producto{
    private int diasCaducidad;

    public ProductoFresco(){
        super();
        diasCaducidad = 0;
    }

    public ProductoFresco(String nombre, double precio, int diasCaducidad) throws ExcepcionPrecioNegativo {
        super(nombre, precio);
        this.diasCaducidad = diasCaducidad;
    }
    
    /**
     * Método que calcula cuanto cuesta comprar un producto una cantidad de veces
     * y toma en cuenta la caducidad para reducir el precio
     * 
     * @param cantidad
     * @return 
     */
    @Override
    public double comprar(int cantidad){
        if(diasCaducidad>=3 && diasCaducidad<=5){
            return super.comprar(cantidad)*0.6;
        }else if(diasCaducidad<3){
            return super.comprar(cantidad)*0.3;
        }else{
            return super.comprar(cantidad);
        }
    }

    @Override
    public String toString() {
        return super.toString()+"ProductoFresco [diasCaducidad=" + diasCaducidad + "]";
    }

    public int getDiasCaducidad() {
        return diasCaducidad;
    }

    public void setDiasCaducidad(int diasCaducidad) {
        this.diasCaducidad = diasCaducidad;
    }
}
