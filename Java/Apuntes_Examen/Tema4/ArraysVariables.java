public class ArraysVariables {
    public static void main(String[] args) {
        char [] caracter = {'a','v','c'}; //Lo mismo que cuando queremos declarar un tipo char pero dividiendolo con comas
        double [] decimales = {2.8,6.9,3.7}; //Se tiene que poner los decimales con puntos para asi marcar los decimales
        String [] palabras = {"hola","adios","hasta luego"}; //Lo mismo que cuando queremos declarar un tipo string pero dividiendolo con comas
        for (int j=0; j<10;j++){
            int aleatorio = (int)(Math.random()*3); //Numero entre 0 y 2
            System.out.println(caracter[aleatorio]);
            System.out.println(decimales[aleatorio]);
            System.out.println(palabras[aleatorio]);
        }
    }

}
