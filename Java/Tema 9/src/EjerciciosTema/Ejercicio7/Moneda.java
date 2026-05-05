package EjerciciosTema.Ejercicio7;

public class Moneda {
    private double valor;
    private String tipo;
    private String posicion;

    public Moneda() {
        valorAleatorio();
        tipoMoneda();
        posicionAleatoria();
    }

    public void valorAleatorio() {
        int aleatorio = (int) (Math.random() * (9 - 1) + 1); // Entre 8 y 1

        switch (aleatorio) {
            case 1:
                valor = 0.01;
                break;
            case 2:
                valor = 0.02;
                break;
            case 3:
                valor = 0.05;
                break;
            case 4:
                valor = 0.10;
                break;
            case 5:
                valor = 0.25;
                break;
            case 6:
                valor = 0.50;
                break;
            case 7:
                valor = 1.00;
                break;
            case 8:
                valor = 2.00;
                break;
            default:
                break;
        }
    }

    private void tipoMoneda() {
        if (valor == 0.01) {
            tipo = "céntimo";
        } else if (valor < 1.0) {
            tipo = "céntimos";
        } else if (valor == 1.0) {
            tipo = "euro";
        } else {
            tipo = "euros";
        }
    }

    private void posicionAleatoria() {
        int aleatorio = (int) (Math.random() * 2); // Entre 1 y 0
        if (aleatorio == 0) {
            posicion = "cara";
        } else {
            posicion = "cruz";
        }
    }

    @Override
    public String toString() {
        int valorMostrado;
        if (valor < 1.00) {
            valorMostrado = (int) (valor * 100);
        } else {
            valorMostrado = (int) valor;
        }
        return valorMostrado + " " + tipo + " - " + posicion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Moneda other = (Moneda) obj;
        if (!(other.posicion.equals(posicion) || other.valor == valor)) {
            return false;
        }
        return true;
    }
}
