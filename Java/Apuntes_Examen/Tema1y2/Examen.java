import java.util.Scanner; //Para inlcuir el metodo escaner en el codigo
public class EvaluaRA1 { //Titulo de la clase
    public static void main(String[] args) {

        Scanner tecla = new Scanner(System.in); //establece un escaner de mayor precision que el readline y le atribuye un nombre

        System.out.print("Buenos días. Dime tu nombre: "); //Sirve para imponer un mensaje en el terminal que sirve como pregunta 
        final String nombre1 = tecla.next(); //Lee el mensaje que esta en tipo string que almacena cadena de caracteres y se lo atribuye al valor de la variable
        System.out.print(nombre1 + " introduce tu peso en Kg: "); //Sirve para imponer un mensaje en el terminal que sirve como pregunta 
        double peso1 = tecla.nextDouble(); //Lee y cambia el mensaje de entrada tipo string a la variable double que almacena decimales en gran escala y precision
        System.out.print("Buenos días. Dime tu nombre: "); //Sirve para imponer un mensaje en el terminal que sirve como pregunta 
        final String nombre2 = tecla.next(); //Lee el mensaje que esta en tipo string que almacena cadena de caracteres y se lo atribuye al valor de la variable
        System.out.print(nombre2 + " introduce tu peso en Kg: "); //Sirve para imponer un mensaje en el terminal que sirve como pregunta 
        double peso2 = tecla.nextDouble(); //Lee y cambia el mensaje de entrada tipo string a la variable double que almacena decimales en gran escala y precision
        System.out.print("Buenos días. Dime tu nombre: "); //Sirve para imponer un mensaje en el terminal que sirve como pregunta 
        final String nombre3 = tecla.next(); //Lee el mensaje que esta en tipo string que almacena cadena de caracteres y se lo atribuye al valor de la variable
        System.out.print(nombre3 + " introduce tu peso en Kg: "); //Sirve para imponer un mensaje en el terminal que sirve como pregunta 
        double peso3 = tecla.nextDouble(); //Lee y cambia el mensaje de entrada tipo string a la variable double que almacena decimales en gran escala y precision

        double PesoMedio = (peso1+peso2+peso3)/3; //Variable que calcula su valor a partir de la operacion integrada en ella
        System.out.printf("La media de los pesos es %.2f\n", PesoMedio); //Manda el mensaje ingresado en formato tipo C para solo mostrar 2 decimales

        final int DECENA = 10; //Constante que guarda el valor 10 en su forma entera
        int resto = ((int)PesoMedio) %DECENA; //Variable entera que calcula su valor a partir de la operacion integrada en ella
        System.out.println("Tabla del "+ resto); //Manda el mensaje al terminal con la variable agregada gracias al +
        System.out.println(resto + " X  1 =    " + (resto*1)); //Manda el mensaje y antes de ello calcula la operación integrada
        System.out.println(resto + " X  2 =   " + (resto*2)); //Manda el mensaje y antes de ello calcula la operación integrada
        System.out.println(resto + " X  3 =   " + (resto*3)); //Manda el mensaje y antes de ello calcula la operación integrada
        System.out.println(resto + " X  4 =   " + (resto*4)); //Manda el mensaje y antes de ello calcula la operación integrada
        System.out.println(resto + " X  5 =   " + (resto*5)); //Manda el mensaje y antes de ello calcula la operación integrada
        System.out.println(resto + " X  6 =   " + (resto*6)); //Manda el mensaje y antes de ello calcula la operación integrada
        System.out.println(resto + " X  7 =   " + (resto*7)); //Manda el mensaje y antes de ello calcula la operación integrada
        System.out.println(resto + " X  8 =   " + (resto*8)); //Manda el mensaje y antes de ello calcula la operación integrada
        System.out.println(resto + " X  9 =   " + (resto*9)); //Manda el mensaje y antes de ello calcula la operación integrada
        System.out.println(resto + " X 10 =   " + (resto*10)); //Manda el mensaje y antes de ello calcula la operación integrada
        tecla.close(); //Cierra el escaner para evitar errores
    }
}