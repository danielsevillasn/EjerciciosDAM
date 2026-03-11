public class PruebaAeropuerto {
    public static void main(String[] args) {

        // Creo instancias de Aeropuerto
        // De la clase Aeropuerto no puedo crear instancias
        AeropuertoPublico ap = new AeropuertoPublico("adolfo suarez",1980,20000 , 100000, 10);
        AeropuertoPrivado apr = new AeropuertoPrivado("quijote airport", 2000 ,20000, 10);
        
        // Muestro su informacion
        System.out.println(ap);
        System.out.println(apr);
        
        // Muestro las ganancias de los aeropuertos
        ap.gananciasTotales(20000);
        apr.gananciasTotales(20000);
        
        
    }
}
