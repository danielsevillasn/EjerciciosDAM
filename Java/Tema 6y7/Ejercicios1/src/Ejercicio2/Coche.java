public class Coche extends Vehiculo{
    public Coche(){
        super();
    }

    public Coche(int kilometrosRecorridos){
        super();
        setKilometrosRecorridos(kilometrosRecorridos);
    }

    public void andar(){
        System.out.println("Has recorrido 5 km!");
        setKilometrosTotales(getKilometrosTotales()+5);
        setKilometrosRecorridos(getKilometrosRecorridos()+5);
    }

    public void truco(){
        System.out.println("Has quemado rueda con el coche!");
    }

    @Override
    public String toString() {
        return "Coche [] "+super.toString();
    }
    
}
