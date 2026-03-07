public class PalabrasAleatorias {
    public static void main(String[] args) {
        int numero = (int)(Math.random()*3+1); //Coge numeros entre 1 y 3 incluidos sin decimales
        switch (numero){
            case 1->
            System.out.println("Papel");
            case 2->
            System.out.println("Piedra");
            case 3->
            System.out.println("Tijeras");
        }
    }

}
