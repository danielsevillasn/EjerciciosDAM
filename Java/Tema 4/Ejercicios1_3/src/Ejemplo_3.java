public class Ejemplo_3 {
    public static void main(String[] args) {
        String [] nombres = {"España", "Portugal", "Inglaterra", "America", "Alemania", "Francia"};
        String prefijo = "A";
        String sufijo = "a";
        for(int i = 0;i<nombres.length;i++){
            if(nombres[i].startsWith(prefijo)){
                System.out.println(nombres[i]);
            }
            if(nombres[i].endsWith(sufijo) && nombres[i] != ""){
                System.out.println("{"+nombres[i]+"}");
            }
        }
    }

}
