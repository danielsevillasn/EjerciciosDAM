public class Televisor extends Electrodomestico implements Cloneable,Conectable {
    private int pulgadas;
    boolean encendido = false;

    public Televisor(int pulgadas, String marca, double precio) {
        super(marca, precio);
        this.pulgadas = pulgadas;
    }

    public Televisor(Televisor tele){
        super(tele.getMarca(),tele.getPrecio());
        this.pulgadas = tele.getPulgadas();
    }

    public int getPulgadas() {
        return pulgadas;
    }
    
    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println(", Pulgadas: " + pulgadas);
    }

    public double calcularPrecioFinal() {
        double precioPlus = getPrecio();
        if (pulgadas > 40) {
            precioPlus = getPrecio() * 0.20 + precioPlus;
        }
        return precioPlus;
    }

    @Override
    public String toString() {
        return super.toString() + ", pulgadas: " + pulgadas;
    }

    @Override
    public boolean equals(Object tele) {
        if (!(tele instanceof Televisor)) {
            return false;
        }

        Televisor otro = (Televisor) tele;
        if (getMarca().equals(otro.getMarca()) && pulgadas == otro.getPulgadas()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object clone(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println(("No se pudo clonar el televisor"));
        }
        return obj;
    }

    @Override //Para que el compilador te avise si te equivocas en el nombre
    public void encender(){
        if(encendido){
            System.out.println("Ya esta encendido");
        }else{
            System.out.println("Encendido!");
            encendido = true;
        }
    }

    @Override //Para que el compilador te avise si te equivocas en el nombre
    public void apagar(){
        if(encendido){
            System.out.println("Apagado!");
            encendido = false;
        }else{
            System.out.println("Ya esta apagado");
        }
    }
}
