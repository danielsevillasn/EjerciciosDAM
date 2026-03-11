public class VideoJuego implements Prestable{
    private String nombre;
    private double precio;
    private boolean prestado;
    private int vecesPrestado;

    public VideoJuego(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
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


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public boolean isPrestado() {
        return prestado;
    }


    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }


    public int getVecesPrestado() {
        return vecesPrestado;
    }


    public void setVecesPrestado(int vecesPrestado) {
        this.vecesPrestado = vecesPrestado;
    }


    /**
     * Presta el videojuego si no esta prestado y aumenta el numero de veces prestadas
     */
    @Override
    public void prestar(){
        if(!prestado){
            System.out.println("Se ha prestado el videojuego "+nombre);
            prestado = true;
            vecesPrestado++;
        }else{
            System.out.println("El videojuego "+nombre+" ya esta prestado");
        }
    }

    /**
     * Se devuelve el videojuego poniendo la variable a false
     */
    @Override
    public void devolver(){
        if(prestado){
            System.out.println("Se ha devuelte el videojuego "+nombre);
            prestado = false;
        }else{
            System.out.println("El videojuego "+nombre+" no se puede devolver");
        }
    }

    @Override
    public String toString() {
        return "VideoJuego [nombre=" + nombre + ", precio=" + precio + ", prestado=" + prestado + ", vecesPrestado="
                + vecesPrestado + "]";
    }

    
}
