import java.util.Scanner;
public class Alumnos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Dime la cantidad de notas: ");
        int alumnos = s.nextInt();
        int max = 0;
        int nota [] = new int[alumnos];
        for(int i = 0;i<alumnos;i++){
            System.out.print("Dame la nota del alumno"+ (i+1)+" : ");
            nota [i] = s.nextInt();
        }
        for (int i = 0;i<alumnos;i++){
            if (nota [i]>max){
                max = nota[i];
            }
        }
        System.out.println("La máxima nota es " + max);
        s.close();
    }

}
