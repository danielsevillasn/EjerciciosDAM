public class Producto implements Comparable<Producto>{
    private static int idIncrementado = 1;
    private int id;
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) throws ExcepcionPrecioNegativo{
        if(precio<0){
            throw new ExcepcionPrecioNegativo("El precio es negativo");
        }
        id=idIncrementado++;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(){
        nombre = "";
        precio = 0.0;
    }

    public static int getIdIncrementado() {
        return idIncrementado;
    }

    public static void setIdIncrementado(int idIncrementado) {
        Producto.idIncrementado = idIncrementado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws ExcepcionPrecioNegativo{
        if(precio<0){
            throw new ExcepcionPrecioNegativo("El precio es negativo");
        }
        this.precio = precio;
    }

    /**
     * Método que calcula cuanto cuesta comprar un producto una cantidad de veces
     * 
     * @param cantidad
     * @return
     */
    public double comprar(int cantidad){
        return cantidad*precio;
    }

    @Override
    public String toString() {
        return "Producto "+id+" [nombre=" + nombre + ", precio=" + precio + "]";
    }

    @Override
    public int compareTo(Producto o){
        if(this.precio < o.getPrecio()){
            return -1;
        }else if (this.precio > o.getPrecio()){
            return 1;
        }
        return 0;
    }
}
