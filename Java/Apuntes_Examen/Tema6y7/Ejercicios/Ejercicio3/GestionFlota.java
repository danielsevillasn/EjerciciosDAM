package Ejercicio3;

public class GestionFlota {
    public static void main(String[] args) {
        CazaEstelar Caza = new CazaEstelar("P2", 80, "Ala x");
        NaveCarga Carga = new NaveCarga("CargaP2", 60, 20);
    
        NaveCarga CargaClon = new NaveCarga(Carga);
    
        Nave[] naves = { Caza, Carga, CargaClon};
    
        for(int i = 0; i<naves.length;i++){
            System.out.println(naves[i]);
            naves[i].desplazarse();
        }
        System.out.println("El numero de naves creadas es: "+Nave.getContadorNaves());

        ((CazaEstelar)naves[0]).atacar();
        if(naves[1].equals(naves[2])){
            System.out.println("Las dos naves son iguales");
        }else{
            System.out.println("Las dos naves son distintas");
        }
    }
}
