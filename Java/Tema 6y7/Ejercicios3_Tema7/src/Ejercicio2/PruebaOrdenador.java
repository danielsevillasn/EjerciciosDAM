public class PruebaOrdenador {
    public static void main(String[] args) throws ExcepcionTranseferenciaInvalida,ExcepcionRamNoValida{

        // Creo una instancia de Ordenador
        Ordenador ordenador1 = new Ordenador("DELL", "XPS", 8, 50);

        // Muestro la informacion del ordenador
        System.out.println(ordenador1);

        // Encendemos el ordenador
        ordenador1.encender();

        // Encendemos el ordenador de nuevo, no nos deja
        ordenador1.encender();

        // Muestro la informacion del ordenador
        System.out.println(ordenador1);

        // Apagamos el ordenador
        ordenador1.apagar();

        // Encendemos el ordenador
        ordenador1.encender();

        // Muestro la informacion del ordenador
        System.out.println(ordenador1);

        // Transferimos 30GB
        ordenador1.transferirArcivos(30);

        // Transferimos 30GB, no nos deja, seguimos teniendo 30GB
        ordenador1.transferirArcivos(10);

        // eliminamos 20GB
        ordenador1.eliminarArcivos(20);

        // eliminamos 20GB, se queda en 0
        ordenador1.eliminarArcivos(20);

        // Creo una instancia de Ordenador
        Ordenador ordenador2 = new Ordenador("DELL", "XPSV2", 64, 50);

        // Indico si los ordenadores son iguales
        if (ordenador1.equals(ordenador2)) {
            System.out.println("Los ordenadores son iguales");
        } else {
            System.out.println("Los ordenadores no son iguales");
        }

    }
}
