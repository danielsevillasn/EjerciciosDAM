package LanzarUnaExcepcionMedianteComandoThrow;

public class Cliente {
    private String nombre;
    private float monto;

    public Cliente(String nombre, float monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public void depositar(int cantidad){
        monto += cantidad;
    }

    public void extraer(int cantidad) throws CantidadExcedida{
        if(cantidad > monto){
            throw new CantidadExcedida("La cantidad ha extraer es mayor a la depositada");
        }
        monto -= cantidad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", saldo=" + monto +
                '}';
    }
}
