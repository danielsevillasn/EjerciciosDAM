import java.util.Objects;

public class Ordenador {
    //Atributos///////////////////////
    private String marca;
    private String modelo;
    private int ram;
    private int capacidad;
    private int espacioUtilizado;
    private boolean encendido;

    //Metodos/////////////////////////

    //Constructor por defecto
    public Ordenador(){
        marca = "";
        modelo = "";
        ram = 4;
        capacidad = 50;
        espacioUtilizado = 0;
        encendido = false;
    }

    //Constructor con un parametro que puede lanzar una excepcion
    public Ordenador(int ram) throws ExcepcionRamNoValida {
        ramCorrecta(ram);
        this.ram = ram;
    }

    //Constructor con dos parametros que puede lanzar una excepcion
    public Ordenador(int ram, int capacidad) throws ExcepcionRamNoValida{
        ramCorrecta(ram);
        this.ram = ram;
        this.capacidad = capacidad;
    }

    //Constructor con cuatro parametros que puede lanzar una excepcion
    public Ordenador(String marca, String modelo, int ram, int capacidad) throws ExcepcionRamNoValida{
        ramCorrecta(ram);
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.capacidad = capacidad;
    }

    //Setter y getters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getEspacioUtilizado() {
        return espacioUtilizado;
    }

    public void setEspacioUtilizado(int espacioUtilizado) {
        this.espacioUtilizado = espacioUtilizado;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    /**
     * Si la ram es menor que 0 o no es logaritmo de dos entonces se lanza una excepcion
     * 
     * @param ram
     * @throws ExcepcionRamNoValida
     */
    public void ramCorrecta(int ram) throws ExcepcionRamNoValida{
        double logBase2 = Math.log(ram)/Math.log(2);
        if(ram <=0){
            throw new ExcepcionRamNoValida("La ram no puede ser negativa");
        }else if(!((double)logBase2==(int)logBase2)){
            throw new ExcepcionRamNoValida("La ram no es logaritmo de dos");
        }
    }

    /**
     * Método que impone el atributo encender a true
     */
    public void encender(){
        encendido = true;
    }

    /**
     * Método que impone el atributo encender a false
     */
    public void apagar(){
        encendido = false;
    }

    /**
     * Método que realiza la transferencia de archivos haciendo que el almacenamiento aumente
     * y si la transferencia sobre pasa el límite o no esta encendido el ordenador lanza una excepcion
     * 
     * @param numero
     * @throws ExcepcionTranseferenciaInvalida
     */
    public void transferirArcivos(int numero) throws ExcepcionTranseferenciaInvalida{
        if(numero<=(capacidad-espacioUtilizado) && encendido){
            espacioUtilizado += numero;
        }else if(numero > (capacidad-espacioUtilizado)){
            throw new ExcepcionTranseferenciaInvalida("Se sobre pasa el límite de almacenamiento");
        }else{
            throw new ExcepcionTranseferenciaInvalida("El ordenador no esta encendido");
        }
    }

    /**
     * Método que realiza la transferencia de archivos haciendo que el almacenamiento aumente
     * y si la transferencia se realiza cuando no esta encendido el ordenador lanza una excepcion
     * 
     * @param numero
     * @throws ExcepcionTranseferenciaInvalida
     */
    public void eliminarArcivos(int numero) throws ExcepcionTranseferenciaInvalida{
        if(numero>(capacidad-espacioUtilizado) && encendido){
            espacioUtilizado += numero;
        }else if(numero > (capacidad-espacioUtilizado)){
            capacidad = 0;
        }else{
            throw new ExcepcionTranseferenciaInvalida("El ordenador no esta encendido");
        }
    }

    /**
     * Método que compara dos objetos para devolver true si son iguales o si 
     * ambos tienen el mismo modelo y marca
     * 
     * @param obj cualquier objeto
     * @return boolean 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ordenador other = (Ordenador) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return Objects.equals(this.modelo, other.modelo);
    }

    @Override
    public String toString() {
        return "Ordenador [marca=" + marca + ", modelo=" + modelo + ", ram=" + ram + ", capacidad=" + capacidad
                + ", espacioUtilizado=" + espacioUtilizado + ", encendido=" + encendido + "]";
    }
    
}
