package InterfacesPolim.HerenciaInterfaces.LamparaHerenciaInterf;

public class PruebaLampara {
    public static void main(String[] arg) {

        Interruptor i1 = new Lampara("Philips");
        Potencimetro p1 = new Lampara("Siemens");
        Potencimetro p2 = (Potencimetro) i1;
        Interruptor i2 = (Interruptor) p1;

        System.out.println("Interruptor");
        i1.encender();
        i1.imprimir();

        System.out.println("Potencimetro");
        p1.encender();
        p1.imprimir();
        

        System.out.println("Conversion de Interruptor a Potencimetro");
        p2.encender();
        p2.imprimir();
    

        System.out.println("Conversion de Potencimetro a Interruptor");
        i2.encender();
        i2.imprimir();

    }

}
