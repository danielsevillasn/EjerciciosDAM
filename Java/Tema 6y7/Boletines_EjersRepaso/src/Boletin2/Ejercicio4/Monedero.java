package Boletin2.Ejercicio4;

public class Monedero {
    // Atributo privado: solo se puede consultar mediante el método disponible()
    private double cantidad;

    // Constructor con cantidad inicial
    public Monedero(double cantidadInicial) {
        if (cantidadInicial < 0) {
            this.cantidad = 0;
            System.out.println("No se puede iniciar con saldo negativo. Se establece a 0.");
        } else {
            this.cantidad = cantidadInicial;
        }
    }

    /**
     * Añade dinero al monedero.
     */
    public void meterDinero(double cuanto) {
        if (cuanto > 0) {
            this.cantidad += cuanto;
            System.out.println("Has metido: " + cuanto + "euros. Nuevo saldo: " + cantidad + "euros.");
        }
    }

    /**
     * Saca dinero si hay suficiente disponible.
     */
    public void sacarDinero(double cuanto) {
        if (cuanto > this.cantidad) {
            System.out.println("Error: No puedes sacar " + cuanto + "euros. Solo tienes " + cantidad + "euros.");
        } else if (cuanto <= 0) {
            System.out.println("Error: La cantidad a sacar debe ser positiva.");
        } else {
            this.cantidad -= cuanto;
            System.out.println("Has sacado: " + cuanto + "euros. Quedan: " + cantidad + "euros.");
        }
    }

    /**
     * Única forma de conocer el saldo desde fuera de la clase.
     */
    public double disponible() {
        return this.cantidad;
    }
}