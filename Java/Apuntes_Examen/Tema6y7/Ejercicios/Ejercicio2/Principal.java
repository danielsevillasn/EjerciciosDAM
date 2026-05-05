public class Principal {
    public static void main(String[] args) {
        ActividadDirigida act1 = new ActividadDirigida("Zumba", 20, 21);
        System.out.println(act1);

        Precios precio1 = act1;
        Precios precio2 = new EntrenamientoPersonal("Gimnasio", 10, 20);
        precio1.imprimirPrecioTotal();
        precio2.imprimirPrecioTotal();
        System.out.println(
                "La suma de ambos precios totales es: " + ((((ActividadDirigida) precio1).calcularPrecioTotal())
                        + ((EntrenamientoPersonal) precio2).calcularPrecioTotal()));

        Actividades[] lista = new Actividades[2];
        lista[0] = act1;
        lista[1] = (Actividades) precio2;

        int suma = 0;
        for (Actividades a : lista) {
            suma += a.calcularPrecioTotal();
        }
        System.out.println("La suma de ambos precios totales es: "+suma);
    }

}
