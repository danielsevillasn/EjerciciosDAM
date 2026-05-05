package InterfacesPolim.HerenciaInterfaces.LamparaHerenciaInterf;

public class Lampara implements Potencimetro {

    // atributos
    private String marca;
    private boolean encendida;
    private int potencia;

    // constructores
    public Lampara() {// por defecto
        this.marca = " ";
        this.encendida = false;
        this.potencia = 0;
    }

    public Lampara(String marca) {// con un parámetro
        this.marca = marca;
        this.encendida = false;
        this.potencia = 0;
    }

    public Lampara(String marca, boolean encendida, int potencia) {
        this.marca = marca;
        this.encendida = encendida;
        this.potencia = potencia;
    }

    // getters
    public String getMarca() {
        return marca;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public int getPotencia() {
        return potencia;
    }

    // setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    // implementación de métodos de interfaz

    public void encender() {
        encendida = true;
        potencia = MAXPOT;
    }

    public void apagar() {
        encendida = false;
        potencia = 0;
    }

    public void aumentarPotencia() {
        potencia++;
    }

    public void disminuirPotencia() {
        potencia--;
    }

    public void imprimir() {
        System.out.println("Lampara " + marca + ": Enc =" + encendida + " Pot =" + potencia);
    }

}
