public class Ejemplo_1 {
    public static void main(String[] args) {
        String palabra = "Hola";
        String OtraPalabra = "Adios";
        int comparacion = palabra.compareTo(OtraPalabra);
        int comparacion2 = OtraPalabra.compareTo(palabra);
        if(comparacion>0){
            System.out.print(palabra);
            System.out.println(comparacion);
        }else if(comparacion<0){
            System.out.print(OtraPalabra);
            System.out.println(comparacion2);
        }else{
            System.out.print("Ambas palabras tienen la misma extension de caracteres");
        }
    }

}
