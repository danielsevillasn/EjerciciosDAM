public class Ejercicio22 {
    public static void main(String[] args) {
        boolean Primo = true;
        for (int i = 1; i <= 100; i++) {
            if (i <= 1) { //Comprueba si el número es 0, 1 o negativo
            Primo = false; // 0, 1 y negativos no son primos
            } else {
                for (int j = 2; j < i; j++) { //Comprueba si i es divisible entre algún número entre 2 y i-1
                    if (i % j == 0) {
                        Primo = false;
                    }
                }
            }
            if (Primo) { //Si Primo sigue siendo true, es que es un número primo
                System.out.println(i);
            }
            Primo = true; //Sirve para que si la variable se ha cambiado a false en la iteración anterior, vuelva a ser true para la siguiente.
        }
    }
}
