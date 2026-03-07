public class NumerosAleatorios {
    public static void main(String[] args){

        for (int i = 1; i<=3;i++){ //Bucle que da 3 respuestas
            System.out.print(Math.random() + " "); //numeros aleatorios entre 0 y 1
        }
        System.out.println();

        for (int i = 1; i<=3;i++){ //Bucle que da 3 respuestas
            System.out.print(Math.random()*10 + " "); //numeros aleatorios entre 0 y 10 con decimales
        }
        System.out.println();

        for (int i = 1; i<=3;i++){ //Bucle que da 3 respuestas
            System.out.print((int)(Math.random()*10 ) + " "); //numeros aleatorios entre 0 y 10 sin decimales
        }
        System.out.println();

        for (int i = 1; i<=3;i++){ //Bucle que da 3 respuestas
            System.out.print((int)(Math.random()*10+1 ) + " "); //numeros aleatorios entre 1 y 10 sin decimales
        }
        System.out.println();

        for (int i = 1; i<=20;i++){ //Bucle que da 3 respuestas
            System.out.print((int)(Math.random() * 301) - 100 + " "); //numeros aleatorios entre 1 y 10 sin decimales
        } //Sumarle 50 implica que parta desde 50 siempre y multiplicarle 11 es para limitarlo hasta el 60.999 incluyendo asi que salgan numeros hasta 60 incluido

        //La formula de esto es Math.random() * (21-10)+10 
        //Donde 21 es el limite sin incluir y el 10 es el minimo
        System.out.println();

    }

}
