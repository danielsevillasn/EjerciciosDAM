package SevillaNavarreteDaniel.Clases;

import java.io.Serializable;

import SevillaNavarreteDaniel.Excepciones.ExcepcionEdadVendedor;

/**
 * Clase vendedor que guarda diferentes atributos, es serializable y es
 * comparable (Ordenable)
 * 
 * @author Dani S
 */
public class Vendedor implements Comparable<Vendedor>, Serializable {
    // Atributos/////////////////////
    private String nombre;
    private String apellidos;
    private int edad;

    // Metodos////////////////////////

    // Constructor para instanciar objeto con dos parametros
    public Vendedor(String nombre, String apellidos, int edad) throws ExcepcionEdadVendedor {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        if (edad < 18) {
            throw new ExcepcionEdadVendedor("El vendedor debe ser mayor de edad: 18 años.");
        } else if (edad > 60) {
            throw new ExcepcionEdadVendedor("El vendedor debe tener menos de 60 años");
        }
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Otros metodos

    // toString
    @Override
    public String toString() {
        return "Vendedor [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
    }

    // HashCode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
        result = prime * result + edad;
        return result;
    }

    // Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vendedor other = (Vendedor) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (apellidos == null) {
            if (other.apellidos != null)
                return false;
        } else if (!apellidos.equals(other.apellidos))
            return false;
        if (edad != other.edad)
            return false;
        return true;
    }

    // Compare to que ordena por edad
    @Override
    public int compareTo(Vendedor o) {
        Integer edadComparada1 = (Integer) edad;
        Integer edadComparada2 = (Integer) o.edad;
        return edadComparada1.compareTo(edadComparada2);
    }

}
