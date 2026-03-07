import java.util.Scanner;
public class EvaluaRA6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String menu = "";

        //Variables y arrays de la matriz magica
        int [] [] matrizMagica = new int[3][3];
        int filas = matrizMagica.length;
        int columnas = matrizMagica[0].length;
        boolean magica;
        int sumaFila = 0;
        int sumaColumna = 0;
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;
        int contador = 0;
        int [] diagonal = new int[2];
        int [] fila = new int [filas];
        int [] columna = new int[columnas];

        //Variables y arrays del traductor Javalandia
        String frase;
        String filtro;
        String condicion1 = "Javalin, javalon";
        int condicionN1 = 16;
        String condicion2 = "javalen, len, len";
        int condicionN2 = 17;
        int Javalandia = 0;
        char [] fraseLimpia;

        //Da inicio abriendo el menu
        System.out.println("MENU");
        System.out.println("0- Salir");
        System.out.println("1- Matriz Mágica");
        System.out.println("2- Traductor Javalandia");
        System.out.print("Elija opción: ");
        menu = s.nextLine();
        while (true){
            if (menu.equals("0")){ //SALIR
                break;
            }else if (menu.equals("1")){ //MATRIZ MAGICA
                //Atribuye los valores ingresados del usuario en todo el array
                for(int i = 0;i<filas;i++){
                    for(int j = 0; j<columnas;j++){
                        System.out.print("Dime un numero que quieras insertar en la fila"+i+" y la columna"+j+" : ");
                        matrizMagica[i][j] = s.nextInt();
                    }
                }

                //Le atribuye los valores de la suma tanto de las filas como de las columnas a 2 array e imprime el array
                System.out.println("\t  MATRIZ MÁGICA");
                for(int i = 0;i<4;i++){
                    if(i>=0 && i<3){
                        sumaFila = 0;
                        for(int j = 0; j<columnas;j++){
                            System.out.print(matrizMagica[i][j]+ "\t\t   ");
                            sumaFila +=matrizMagica[i][j];
                        }
                        fila [contador++] =sumaFila;
                    }
                    if (i == 3){
                        contador = 0;
                        for(int j = 0; j<columnas;j++){
                            sumaColumna = 0;
                            for(int k = 0;k<filas;k++){
                                sumaColumna +=matrizMagica[k][j];
                            }
                            columna [contador++] = sumaColumna;
                        }
                    }
                    System.out.println();
                }

                //Le atribuye los valores de la suma de la diagonal al array
                for(int i = 0; i<filas;i++){
                    for(int j = 0; j<columnas;j++){
                        if(i == j){
                            sumaDiagonal1 += matrizMagica[i] [j];
                        }
                        if(i+j == 3-1){
                            sumaDiagonal2 += matrizMagica[i] [j];
                        }
                    }
                }
                for(int i = 0;i<2;i++){
                    if(i == 0){
                        diagonal[i] = sumaDiagonal1;
                    }else{
                        diagonal[i] = sumaDiagonal2;
                    }
                }

                //Imprime los valores de las sumas
                System.out.print("Suma de las filas:");
                for(int elemento : fila){
                    System.out.print(elemento+" ");
                }
                System.out.println();
                System.out.print("Suma de las columnas:");
                for(int elemento : columna){
                    System.out.print(elemento+" ");
                }
                System.out.println();
                System.out.print("Suma de las diagonales:");
                for(int elemento : diagonal){
                    System.out.print(elemento+" ");
                }

                //Comprueba si la matriz es magica
                if(fila[0]==fila[1] && fila[0]==fila[2]){
                    if(columna[0]==fila[0] && columna[0]==columna[1] && columna[0]==columna[2]){
                        if(diagonal[0]==columna[0]&&diagonal[0]==diagonal[1]){
                            magica = true;
                        }
                        else{
                            magica = false;
                        }
                    }
                    else{
                        magica = false;
                    }
                }else{
                    magica = false;
                }
                //Dice si es magica o no
                System.out.println();
                if(magica){
                    System.out.println("La matriz es magica");
                }else{
                    System.out.println("La matriz no es magica");
                }

                //Vuelve al menu
                s.nextLine(); //Limpia el bufer para evitar errores
                System.out.println();
                System.out.println("MENU");
                System.out.println("0- Salir");
                System.out.println("1- Matriz Mágica");
                System.out.println("2- Traductor Javalandia");
                System.out.print("Elija opción: ");
                menu = s.nextLine();

            }else if (menu.equals("2")){ //TRADUCTOR JAVALANDIA
                System.out.println("Bienvenido a JAVALANDIA: Javalin, javalon ---- javalen, len, len");
                System.out.print("Escriba una frase: ");
                frase = s.nextLine();
                filtro = frase.trim(); //Borra los espacios del final y del principio
                //Comprueba si es Idioma javalandia
                Javalandia = 0;
                if(filtro.startsWith(condicion1)){
                    Javalandia = 1;
                }
                if(filtro.endsWith(condicion2)){
                    Javalandia = 2;
                }
                if (filtro.startsWith(condicion1) && filtro.endsWith(condicion2)){
                    Javalandia = 3;
                }
                //Lo que sucede si es idioma javalandia o no
                if(Javalandia == 1 || Javalandia == 2 || Javalandia == 3){
                    System.out.println("Usted habla Javalandia");
                    fraseLimpia = filtro.toCharArray();
                    System.out.print("El traductor dice: ");
                    if(Javalandia == 1){
                        for(int i = condicionN1;i<fraseLimpia.length;i++){
                            System.out.print(fraseLimpia[i]);
                        }
                    }else if (Javalandia ==2){
                        for(int i = 0;i<fraseLimpia.length-condicionN2;i++){
                            System.out.print(fraseLimpia[i]);
                        }
                    }else{
                        for(int i = condicionN1;i<fraseLimpia.length-condicionN2;i++){
                            System.out.print(fraseLimpia[i]);
                        }
                    }
                }else{
                    System.out.println("No es idioma Javalandia");
                }

                //Vuelve al menu
                System.out.println();
                System.out.println("MENU");
                System.out.println("0- Salir");
                System.out.println("1- Matriz Mágica");
                System.out.println("2- Traductor Javalandia");
                System.out.print("Elija opción: ");
                menu = s.nextLine();

            }else{ ///ERROR
                System.out.println();
                System.out.println("El mensaje introducido no es una opcion del menu, intenta de nuevo");
                System.out.println();
                System.out.println("MENU");
                System.out.println("0- Salir");
                System.out.println("1- Matriz Mágica");
                System.out.println("2- Traductor Javalandia");
                System.out.print("Elija opción: ");
                menu = s.nextLine();
                s.nextLine(); //Limpia el bufer
            }
            
        }
        s.close();
    }
}
