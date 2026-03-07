public class Ejemplo_2 {
    public static void main(String[] args) {
        String [] nombres = {"España", "Portugal", "Inglaterra", "America", "Alemania", "Francia"};
        String prefijo = "A";
        for(int i = 0;i<nombres.length;i++){
            if(nombres[i].startsWith(prefijo)){
                System.out.println(nombres[i]);
            }
        }
    }

}
