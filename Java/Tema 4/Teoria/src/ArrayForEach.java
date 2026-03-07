public class ArrayForEach {
    public static void main(String[] args) {
        int num[] = new int[10];
        for(int i = 0; i<num.length;i++){
            num[i] = (int) (Math.random()*10+1);
        }
        for (int i : num){ //1 se inicicaliza una variable del mismo tipo que el array donde se va a guardar los valores de este
        //2 se mete el nombre del array sin el []
            System.out.print(i+ " "); //Se muestra por pantalla todo el array
        }
    }
}
