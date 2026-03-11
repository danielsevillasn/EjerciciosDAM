public class ProductoRefrigerado extends Producto{
    private int nCajon;

    public ProductoRefrigerado(String nombre, double precio, int nCajon) throws ExcepcionPrecioNegativo {
        super(nombre, precio);
        this.nCajon = nCajon;
    }

    public ProductoRefrigerado() {
        super();
        nCajon = 0;
    }

    public int getnCajon() {
        return nCajon;
    }

    public void setnCajon(int nCajon) {
        this.nCajon = nCajon;
    }

    @Override
    public String toString() {
        return super.toString()+"ProductoRefrigerado [nCajon=" + nCajon + "]";
    }
}
