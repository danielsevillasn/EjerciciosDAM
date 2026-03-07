/*
 Notas de cada evaluación en cada módulo

      eva1    eva2    eva3
PRG    8         7           9
BD     6         2           3
LM     4         4           5
SI     9         6           7
 */

/**
 *Para obtener el número de filas de la matriz, podemos recurrir a la propiedad length de los arrays:
          int numFilas = matriz.length;

 *Para el caso del número de columnas sería de la siguiente forma :
          int numColumnas = matriz[0].length;
 * @author Inma
 */
import java.util.Scanner;
public class MiBidimensional {
  public static void main(String[] args) {
    //creo inicializo variables
    Scanner sc = new Scanner(System.in);
    int [][] notas;
    notas= new int [4][3];
    int numFilas=notas.length;
    int numColum=notas[0].length;
    System.out.println("\nFilas(módulos) : "+numFilas+  "\tColumnas (evaluaciones): " + numColum );
    int sumaMod=0;
    int sumaEva=0;
    int modulo=0;
    
    
    //creo mi tabla pidiendo notas por teclado
    for(int mod=0; mod<numFilas; mod++){
      for(int eva=0; eva< numColum;eva++){
        System.out.print("Dame nota de módulo"+(mod+1)+ " de evaluación"+(eva+1)+ "): ");
        notas[mod][eva]=sc.nextInt();
      }//módulos
    }//evaluaciones
   
    //recorremos array bidemensional para mostrar las notas.
    System.out.println("\n\teva1\teva2\teva3");
    for(int mod=0; mod<numFilas; mod++){
      System.out.print("mod"+(mod+1));
      for(int eva=0; eva< numColum;eva++){
        System.out.print("\t"+notas[mod][eva]);
      }//módulos
      System.out.println("");
    }
    //evaluaciones
    //Media de notas por módulo
    System.out.println("\n\t MEDIAS MÓDULOS");
    for  (int mod=0;mod<numFilas;mod++){
      sumaMod = 0;
      for(int eva=0; eva<numColum;eva++){
          sumaMod+=notas[mod][eva];
      }
      System.out.println("La media del módulo"+ (mod+1) +" es: "+ (float)sumaMod/(float)numColum);
    }
      //Media de notas por módulo con for each
    for  (int mod[] : notas){
      modulo++;
      sumaMod = 0;
      for(int unaNota : mod){
          sumaMod+=unaNota;
      }
       //System.out.println("Estamos en el módulo"+ mod);
      System.out.println("La media del módulo"+ modulo +" es: "+ (float)sumaMod/(float)numColum);
     
    }
    
    //Media de notas por evaluaciones
    System.out.println("\n\t MEDIAS EVALUACIONES");
    for  (int eva=0;eva<numColum;eva++){
      sumaEva = 0;
      for(int mod=0; mod<numFilas;mod++){
          sumaEva+=notas[mod][eva];
      }
      System.out.println("La media del la evaluación"+ (eva+1) +" es: "+ (float)sumaEva/(float)numFilas);
    
    }
    sc.close();
    
    
  }
}
