public class Ejercicio18_3 {
    public static void main(String[] args){
        int Color1;
        int Color2;
        int Color3;
        for (int i = 0; i < 1; i++) {
            Color1 = ((int)(Math.random()*6+1));
            Color2 = ((int)(Math.random()*6+1));
            Color3 = ((int)(Math.random()*6+1));
            if (Color1 == Color2 && Color1 == Color3) {
                i--;
            } 
            else if (Color2 == Color1 || Color2 == Color3 || Color1 == Color3) {
                i--;
            }
            else{
                switch (Color1) {
                case 1:
                    System.out.print("Rojo ");
                    break;
                case 2:
                    System.out.print("Verde ");
                    break;
                case 3:
                    System.out.print("Azul ");
                    break;
                case 4:
                    System.out.print("Amarillo ");
                    break;
                case 5:
                    System.out.print("Naranja ");
                    break;
                case 6:
                    System.out.print("Morado ");
                    break;
            }
                switch (Color2) {
                case 1:
                    System.out.print("Rojo ");
                    break;
                case 2:
                    System.out.print("Verde ");
                    break;
                case 3:
                    System.out.print("Azul ");
                    break;
                case 4:
                    System.out.print("Amarillo ");
                    break;
                case 5:
                    System.out.print("Naranja ");
                    break;
                case 6:
                    System.out.print("Morado ");
                    break;
                }
                switch (Color3) {
                case 1:
                    System.out.print("Rojo ");
                    break;
                case 2:
                    System.out.print("Verde ");
                    break;
                case 3:
                    System.out.print("Azul ");
                    break;
                case 4:
                    System.out.print("Amarillo ");
                    break;
                case 5:
                    System.out.print("Naranja ");
                    break;
                case 6:
                    System.out.print("Morado ");
                    break;
                }
            }
        }
    }
}