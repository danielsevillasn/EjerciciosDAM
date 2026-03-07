public class Ejercicio1_3 {
    public static void main(String[] args){
        int Dado1 = ((int)(Math.random()*7+1));
        System.out.print(Dado1+ "+");
        int Dado2 = ((int)(Math.random()*7+1));
        System.out.print(Dado2+ "+");
        int Dado3 = ((int)(Math.random()*7+1));
        System.out.print(Dado3);
        int suma = Dado1+Dado2+Dado3;
        System.out.println(" = " + suma);
    }
}