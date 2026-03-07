package Ejercicio3;

public class NaveCarga extends Nave{
    private double capacidadCarga;

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public NaveCarga(String nombre, int combustible, double capacidadCarga) {
        super(nombre, combustible);
        this.capacidadCarga = capacidadCarga;
    }
    
    public NaveCarga(NaveCarga nave){
        super(nave.nombre, nave.getCombustible());
        this.capacidadCarga = nave.capacidadCarga;
    }

    @Override
    public String toString() {
        return "NaveCarga [capacidadCarga=" + capacidadCarga + "]"+ super.toString();
    }

    public void desplazarse(){
        System.out.println("La nave viaja a velocidad constante por rutas comerciales");
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof NaveCarga){
            NaveCarga otro = (NaveCarga) obj;
            if(otro.nombre.equalsIgnoreCase(nombre) && otro.capacidadCarga == capacidadCarga && otro.getCombustible() == getCombustible()){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
