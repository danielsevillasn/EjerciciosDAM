public class Bicicleta extends Vehiculo{
    public Bicicleta(){
        super();
    }

    public Bicicleta(int kilometrosRecorridos){
        super();
        setKilometrosRecorridos(kilometrosRecorridos);
    }

    public void andar(){
        System.out.println("Has recorrido 2 km!");
        setKilometrosTotales(getKilometrosTotales()+2);
        setKilometrosRecorridos(getKilometrosRecorridos()+2);
    }

    public void truco(){
        System.out.println("Has hecho un caballito con el coche!");
    }

    @Override
    public String toString() {
        return "Bicicleta [] "+super.toString();
    }
}
