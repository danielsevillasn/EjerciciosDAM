import java.util.Scanner;

public class ClasesString {
    public static void main(String[] args) {


        //CHARAT
        String texto = "Hola Mundo";

        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
        }


        //COMPARE TO
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


        //CONTAINS
        String frase = "El perro corre por el parque";
        String palabra = "corre";

        if (frase.toLowerCase().contains(palabra.toLowerCase())) {
            System.out.println("La palabra está en la frase.");
        } else {
            System.out.println("No está.");
        }


        //ENDS WITH
        String[] nombre = { "Paco Córdoba", "Bernardino Abascal Díaz", "René Ezequiel Carrión Borrás", "Joan de Torralba",
        "Silvestre Colom Lasa", "Purificación Rodrigo-Cámara", "Fabio Heras-Plaza", "Quirino Mas-Garriga",
        "Griselda Estrada Querol",
        "Patricio Arturo Cervera Manso", "Encarnación Sabater Aramburu", "Beatriz Mercedes Cabanillas Vizcaíno",
        "Mariana Castelló Roma",
        "Iván Salinas Rico", "Antonia Bárbara Poza Tamayo", "Felisa Jiménez Rivero", "Virgilio Gelabert Amorás",
        "Rufina Tejera Casal",
        "Valero Frías Casals", "Mohamed Pedrosa", "Maricruz Sosa Gil", "Ana Sofía Escobar Domingo",
        "Nacho Camacho Abella",
        "Olga Teresa Gomila Sosa", "Dionisia Alsina Salcedo", "Roberta Morante Carvajal",
        "Brunilda Fernández Castañeda", "Manola Ortega Bosch",
        "Obdulia Santiago Manso", "Rolando Basilio Soria Guitart", "Prudencia Herrero Sola",
        "Inocencio Bermádez Rosellá", "Hernán Jaume Zapata",
        "Mayara Rovira-Pinedo", "Olivia Clavero Briones", "Odalis Mármol-Niño", "Aroa Gomis-Quesada",
        "Emelina Pareja Pérez", "Isidro de Borrego",
        "Coral Alberola Valentín", "Francisca Pulido Prado", "Amor Arnal Sosa", "Ricarda Domingo Manjón",
        "Flavia de Bermúdez",
        "Caridad Ariel Sanjuan Escalona", "Gloria Talavera Blanco", "Quique Escolano Tamayo", "Ezequiel Puerta Ramón",
        "Ester Angélica Montesinos Rodrigo", "Encarnita Vilaplana Larrea" };

        String filtro = Pide.cadena("Dime por qué deben empezar los nombres que buscas ");
        // compara filtro en minúsculas con final de nombres en minúscula
        String filtroMinus = filtro.toLowerCase();
        for (int i = 0; i < nombre.length; i++) {
            String nombreMinus = nombre[i].toLowerCase();
            if (nombreMinus.startsWith(filtroMinus)) {
                System.out.println(nombre[i]);
            }
        }


        //EqualsIgnoreCase
        Scanner s = new Scanner(System.in);
        System.out.print("Dime una palabra: ");
        String palabra = s.next();
        final String palabrainicio = palabra;
        System.out.print("Dime otra palabra: ");
        palabra =s.next();
        while (true){
            if(palabra.equalsIgnoreCase(palabrainicio)){
                break;
            }else{
                System.out.println("No es la misma palabra");
                System.out.print("Dime otra palabra: ");
                palabra =s.next();
                s.nextLine();
            }
        }


        //REPLACEALL
        String frase = "Tengo una hormiguita en la patita, que me esta haciendo cosquillitas y no me puedo aguantar";
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce una vocal: ");
        String v = s.nextLine();

        frase = frase.replaceAll("[aeiou]", v);

        System.out.println(frase);
        s.close();


        //SPLIT
        System.out.print("Introduce tu nombre completo: ");
        String nombre = s.nextLine().trim();

        String[] partes = nombre.split("\\s+");
        String iniciales = "";

        for (int i = 0; i < partes.length; i++) {
            iniciales = iniciales + partes[i].toUpperCase().charAt(0);
        }

        System.out.println("Iniciales: " + iniciales);


        //TO CHAR ARRAY Y TRIM
        String parrafo = "En un lugar de La Mancha, de cuyo nombre no quiero acordarme,\nno ha mucho tiempo que vivía un hidalgo de los de lanza en astillero,\nadarga antigua, rocín flaco y galgo corredor.";
        System.out.println(parrafo);
        char[] caracteres = parrafo.toCharArray();
        parrafo = parrafo.trim();
        for (int i = 0; i < caracteres.length; i++) {
            if(caracteres[i] == 'd'&& caracteres[i+1] == 'e'){
                System.out.println("Encontrado 'de' en la posición: " + i);
            }
        }
    }
}
