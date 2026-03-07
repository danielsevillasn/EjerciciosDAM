
public class Ejercicio18 {
    public static void main(String[] args) {
        int [] num = new int[10];
        for(int i = 0; i<num.length;i++){
            num[i] = (int) (Math.random()*201);
        }
        for(int i = 0; i<2;i++){
            if ( i == 0){
                System.out.print("Índice: ");
                for (int j = 0; j<num.length;j++){
                    System.out.print(j+ "\t");
                }
            }
            if ( i == 1){
                System.out.print("Valor:  ");
                for (int j : num){ //Foreach que sirve para mostrar por pantalla el array
                    System.out.print(j+ "\t");
                }
            }
            System.out.println();
        }
        int [] menores = new int[num.length];
        int [] mayores = new int[num.length];
        int menor = 0;
        int mayor = 0;
        for(int i = 0; i<num.length;i++){
            if(num[i]<= 100){
                menores[menor++] = num[i];
            }
            if(num[i]>100){
                mayores[mayor++] = num[i];
            }
        }
        final int limiteM = mayor;
        final int limitem = menor;
        for(int i = 0; i<num.length;i++){
            if(i % 2 ==0 && menor >0){
                num[i]=menores[limitem-(menor--)];
            }else if(i % 2 !=0 && mayor >0){
                num[i]=mayores[limiteM-(mayor--)];
            } else if(menor == 0){
                num[i]=mayores[limiteM-(mayor--)];
            } else{
                num[i]=menores[limitem-(menor--)];
            }
        }
        System.out.println();
        for(int i = 0; i<2;i++){
            if ( i == 0){
                System.out.print("Índice: ");
                for (int j = 0; j<num.length;j++){
                    System.out.print(j+ "\t");
                }
            }
            if ( i == 1){
                System.out.print("Valor:  ");
                for (int j : num){ //Foreach que sirve para mostrar por pantalla el array
                    System.out.print(j+ "\t");
                }
            }
            System.out.println();
        }
    }
}