public class Prestamo implements Prestable{
    private double cantidad;
    private double adeudo;
    private String titular;

    public Prestamo(double cantidad, String titular) {
        this.cantidad = cantidad;
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getAdeudo() {
        return adeudo;
    }

    public void setAdeudo(double adeudo) {
        this.adeudo = adeudo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * Se presta una cantidad al titular y se actualiza el valor de adeudo
     */
    @Override
    public void prestar(){
        this.adeudo += this.cantidad + (this.cantidad * 0.05);
        System.out.println("Se ha prestado " + this.cantidad + "euros al titular " + this.titular + ". Adeudo total: " + this.adeudo + "euros");
    }

    @Override
    public void devolver(){
        if (this.adeudo < this.cantidad) {
            this.adeudo = 0;
        } else {
            this.adeudo -= this.cantidad;
        }

        System.out.println("Se ha devuelto " + this.cantidad + "euros del titular " + this.titular + ". Adeudo total: " + this.adeudo + "euros");
    }

    @Override
    public String toString() {
        return "Prestamo [cantidad=" + cantidad + ", adeudo=" + adeudo + ", titular=" + titular + "]";
    }

    
}
