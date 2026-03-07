public class Ejercicio19_3 {
    public static void main(String[] args){
        int suma = 0;
        int contador=0;
        int ParMaximo1;
        int ParMaximo2 = -100;
        int ImparMinimo1;
        int ImparMinimo2 = -99;
        for (int i = 0; i <50; i++) {
            int numero = ((int)(Math.random() * 301) - 100);
            suma += numero;
            contador++;
            if (numero % 2 == 0){
                ParMaximo1 = numero;
                if (ParMaximo1 > ParMaximo2){
                    ParMaximo2 = ParMaximo1;
                }
            }
            else {
                ImparMinimo1 = numero;
                if (ImparMinimo1 < ImparMinimo2){
                    ImparMinimo1 = ImparMinimo2;
                }
            }

        }
        int media = suma / contador;
        System.out.println("El número par máximo generado es: " + ParMaximo2);
        System.out.println("El número impar mínimo generado es: " + ImparMinimo2);
        System.out.println("La media de los números generados es: " + media);
    }
}
