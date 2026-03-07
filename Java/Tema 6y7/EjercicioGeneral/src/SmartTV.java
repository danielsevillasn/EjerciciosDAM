public class SmartTV extends Televisor implements Inteligente {
    boolean conexion = false;
    public SmartTV(int pulgadas, String marca, int precio){
        super(pulgadas, marca, precio);
    }
    public SmartTV(Televisor tele){
        super(tele);
    }

    @Override
    public void conectarWifi(){
        if(conexion){
            System.out.println("Ya hay conexión WIFI");
        }else{
            conexion = true;
            System.out.println("Te conectaste a la WIFI");
        }
    }

    @Override
    protected void finalize(){
        System.out.println("La SmartTV se está destruyendo. Liberando recursos...");
    }

}
