public class Ejercicio4 {
    public static void main(String[] args) {
        int [] numero;
        int [] cuadrado;
        int [] cubo;
        for (int i = 0; i < 20; i++) {
            numero = new int[20];
            cuadrado = new int[20];
            cubo = new int[20];
            numero[i] = (int) (Math.random() * 101-1);
            cuadrado[i] = (int) Math.pow(numero[i], 2);
            cubo[i] = (int) Math.pow(numero[i], 3);
            System.out.printf("%-10d %-10d %-10d%n", numero[i], cuadrado[i], cubo[i]);
        }
    }

}
