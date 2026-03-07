public class SentenciaIf {
    public static void main(String[] args) {
        String a = "aaaa";
        if ("aaaa".equals(a)){ //El equals es un metodo que se emplea cuando quieres establecer una comparacion en string
            System.out.println("La palabra es aaaa");
        } 
        else if ("aaa".equals(a)){ //Sirve para incluir otra condicion en el mismo if
            System.out.println("La palabra es aaa");
        } else { //Sirve para dar un resultado en caso de no concretarse ninguna de las condiciones anteriores
            System.out.println("La palabra es aa");
        }   
        int x = 5;
        if (x == 5){ //Los operadores de comparación como el == sirven para los numeros
            System.out.println("El numero es 5");
        }
        else {
            System.out.println("El numero no es 5");
        }

    }

}
