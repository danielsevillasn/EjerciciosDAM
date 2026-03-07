public class Ejercicio6 {
    public static void main(String[] args) {
        int [] [] num = new int[6][10];
        int filas = num.length;
        int columnas = num[0].length;
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;
        int numero;
        Boolean repetido;
        String posicionMinimo = "";
        String posicionMaximo = "";
        //Asigna a todos los valores del array un numero aleatorio en un intervalor de 0-1000
        for(int i = 0; i<filas;i++){
            for(int j = 0; j<columnas;j++){
                num [i] [j] = (int) (Math.random()*1001);
            }
        }
        //Mira el numero maximo y el numero minimo del array en su totalidad y guarda el valor de su posicion
        for(int i = 0; i<filas;i++){
            for(int j = 0; j<columnas;j++){
                if (num [i] [j]>maximo){
                    maximo = num[i] [j];
                    posicionMaximo = ("["+(i+1)+"],["+(j+1)+"]");
                }
                if (num [i] [j]<minimo){
                    minimo = num[i] [j];
                    posicionMinimo = ("["+(i+1)+"],["+(j+1)+"]");
                }
            }
        }
        //Mira si se repite algun numero
        do {
            numero = (int)(Math.random() * 1001);
            repetido = false;
            // Comprobamos si ya existe en la matriz
            for (int x = 0; x < 6; x++) {
                for (int y = 0; y < 10; y++) {
                    if (num[x][y] == numero) {
                        repetido = true;
                        break;
                    }
                }
            }
        } while (repetido);
        //Muestra el array en su totalidad
        for(int i = 0; i<filas;i++){
            System.out.print("Fila"+ (i+1) +": ");
            for(int j = 0; j<columnas;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("El maximo esta en la posicion: "+ posicionMaximo);
        System.out.println("El minimo esta en la posicion: "+ posicionMinimo);
    }

}
