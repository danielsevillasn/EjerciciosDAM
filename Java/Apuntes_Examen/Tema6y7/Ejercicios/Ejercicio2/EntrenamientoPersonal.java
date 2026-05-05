public class EntrenamientoPersonal extends Actividades implements Precios{
    private int sesiones;

    public EntrenamientoPersonal(String nombre, int cuotaBase, int sesiones) {
        super(nombre, cuotaBase);
        this.sesiones = sesiones;
    }

    public int calcularPrecioTotal(){
        int precioTotal = cuotaBase*sesiones +50;
        return precioTotal;
    }

    public void imprimirPrecioTotal(){
        System.out.println("El precio total del entrenamiento personal \""+super.nombre+"\" es: "+ calcularPrecioTotal());
    }
}
