import java.util.Scanner;

public class ArraysBidimensionales {
    public static void main(String[] args) throws InterruptedException{

        
        Scanner s = new Scanner(System.in);
        int[][] num = new int[4][5];
        int[]sumF = new int [5];
        sumF [4] = 0;
        int[] sumC = new int [5];
        int filas = num.length;
        int columnas = num[0].length;
        int sumaFila = 0;
        int sumaColumna = 0;
        int aux = 0;
        int sumatotal = 0;
        for(int i = 0; i<filas;i++){
            for(int j = 0;j<columnas;j++){
                num [i] [j] = (int)(Math.random()*(1000-100)+100);
            }
        }
        for(int i = 0;i<columnas;i++){
            if(i>=0 && i<4){
                sumaFila = 0;
                for(int j = 0; j<columnas;j++){
                    System.out.print(num[i][j]+ "\t\t   ");
                    sumaFila +=num[i][j];
                }
                Thread.sleep(1000);
                System.out.print(sumaFila);
                sumF[i] = sumaFila;
            }
            if (i == 4){
                for(int j = 0; j<columnas;j++){
                    sumaColumna = 0;
                    for(int k = 0;k<filas;k++){
                        sumaColumna +=num[k][j];
                    }
                    Thread.sleep(1000);
                    System.out.print(sumaColumna+ "\t\t   ");
                    sumC[j] = sumaColumna;
                }
                for(int j = 0;j<columnas;j++){
                    aux = sumC[j]+sumF[j];
                    sumatotal +=aux;
                }
                Thread.sleep(1000);
                System.out.print(sumatotal);
            }
            System.out.println();
            System.out.println();
        }

        //TRES EN RAYA


        int jugador1 = 1;
        int jugador2 = 2;
        int vacio = 0;
        int turno = 0;
        int [] [] cuadrante = new int[3][3];
        int cuadrantex = cuadrante.length;
        int cuadrantey = cuadrante[0].length;
        boolean salir = false;
        int sumax = 0;
        int sumay = 0;
        int sumaz = 0;
        int suma0 = 0;
        int x = 0;
        int y = 0;
        //Inicializa el array con todo 0
        for (int i = 0; i<cuadrantex;i++){
            for(int j = 0; j<cuadrantey;j++){
                cuadrante[i][j] = vacio;
            }
        }
        //Inicia un bucle el cual no se cerrara hasta que alguno de los jugadores haya ganado
        do{
            //Muestra de quien es el turno
            if (turno == 0){
                System.out.println("Turno del jugador1");
            }else{
                System.out.println("Turno del jugador2");
            }

            int columna;
            int fila;
            //Pide y obtiene los valores tanto de la coordenada x como la de la y
            do {
                System.out.print("Coordenada y: ");
                fila = s.nextInt();
                if (fila < cuadrante[0].length && fila >= 0) {
                    break;
                }
            } while (true);// valido coordenada y
            do {
                System.out.print("Coordenada x: ");
                columna = s.nextInt();
                if (columna < cuadrante.length && columna >=0) {
                    break;
                }
            } while (true);// valido coordenada x
            //Agrega el valor correspondiente al array segun de quien sea el turno
            if(turno == 0){
                //Sirve para no poder sobrescribir 
                if(cuadrante[fila][columna] == 0){
                    cuadrante[fila][columna] = jugador1;
                }
            }
            else{
                if(cuadrante[fila][columna] == 0){
                    cuadrante[fila][columna] = jugador2;
                }
            }
            //Pinta el juego en su totalidad
            y = 0;
            for (int i = 0; i<5; i++) {
                if(i == 1 || i == 3){
                    for(int j = 0; j<5;j++){
                        System.out.print("_");
                    }
                }else{
                    x = 0;
                    for(int j = 0; j<5;j++){
                        if(j == 1 || j == 3){
                            System.out.print("|");
                            x++;
                        }else{
                            if(cuadrante[x][y] == jugador1){
                                System.out.print("X");
                            }else if (cuadrante[x][y] == jugador2){
                                System.out.print("O");
                            }else{
                                System.out.print(" ");
                            }
                        }
                    }
                    y++;
                }
                System.out.println();
            }
            //Cambio de turno
            if(turno == 0){
                turno++;
            }else{
                turno--;
            }

            //Comprueba si alguien ha ganado por filas
            for (int a = 0; a<cuadrantex;a++){
                sumax=0;
                for(int b = 0; b<cuadrantey;b++){
                    if(cuadrante[a][b] == 0){
                        sumax=0;
                        break;
                    }
                    sumax +=cuadrante[a][b];
                }
                if(sumax == 3){
                    salir = true;
                }else if (sumax == 6){
                    salir = true;
                }
            }

            //Comprueba si alguien ha ganado por columnas
            for (int a = 0; a<cuadrantex;a++){
                sumay=0;
                for(int b = 0; b<cuadrantey;b++){
                    if(cuadrante[b][a] == 0){
                        sumay=0;
                        break;
                    }
                    sumay +=cuadrante[b][a];
                }
                if(sumay == 3){
                    salir = true;
                }else if (sumay == 6){
                    salir = true;
                }
            }

            //Comprueba si alguien ha ganado por lineas cruzadas
            sumaz=0;
            sumaz = cuadrante[0][0]+cuadrante[1][1]+cuadrante[2][2];
            if (cuadrante[0][0] != 0 && cuadrante[1][1] != 0 && cuadrante[2][2] != 0 && sumaz == 3){
                salir = true;
            }
            if (cuadrante[0][0] != 0 && cuadrante[1][1] != 0 && cuadrante[2][2] != 0 && sumaz == 6){
                salir = true;
            }

            sumaz =0;
            sumaz = cuadrante[0][2]+cuadrante[1][1]+cuadrante[2][0];
            if (cuadrante[0][2] != 0 && cuadrante[1][1] != 0 && cuadrante[2][0] != 0 && sumaz == 3){
                salir = true;
            }
            if (cuadrante[0][2] != 0 && cuadrante[1][1] != 0 && cuadrante[2][0] != 0 && sumaz == 6){
                salir = true;
            }
            suma0 = 0;
            for (int a = 0; a<cuadrantex;a++){
                for(int b = 0; b<cuadrantey;b++){
                    if(cuadrante[a][b] != 0){
                        suma0++;
                    }
                }
            }
            if (suma0 == 9){
                turno = 3;
                salir = true;
            }

        }while(!salir);

        //Muestra quien ha ganado basado en el valor del turno el cual se ha modificado previamente y por ello a de ser el inverso
        System.out.println();
        if(turno == 0){
            System.out.println("Gano el jugador2");
        }else if (turno == 1){
            System.out.println("Gano el jugador1");
        }
        else if (turno == 3){
            System.out.println("Empate");
        }
        s.close();
    }
}

        s.close();
    }

}
