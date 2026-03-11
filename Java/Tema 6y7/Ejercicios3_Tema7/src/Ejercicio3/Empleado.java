import java.util.Objects;

public class Empleado {
    private String dni;
    private String nombre;
    private int edad;
    private Departamento departamento;
    private boolean teletrabajo;
    private Empresa empresa;
    private static double salarioBase = 1000;

    public Empleado(String dni, String nombre, int edad, Departamento departamento, boolean teletrabajo,
            Empresa empresa) {

        try {
            Validator.validarDNI(dni);
        } catch (Exception ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }

        if (empresa == null) {
            throw new IllegalArgumentException("La empresa es obligatoria");
        }

        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
        this.teletrabajo = teletrabajo;
        this.empresa = empresa;
    }

    public String getDNI() {
        return dni;
    }

    public void setDNI(String dni) {
        try {
            Validator.validarDNI(dni);
        } catch (Exception ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public boolean isTeletrabajo() {
        return teletrabajo;
    }

    public void setTeletrabajo(boolean teletrabajo) {
        this.teletrabajo = teletrabajo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        if (empresa == null) {
            throw new IllegalArgumentException("La empresa es obligatoria");
        }
        this.empresa = empresa;
    }

    public static double getSalarioBase() {
        return salarioBase;
    }

    public static void setSalarioBase(double salarioBase) {
        Empleado.salarioBase = salarioBase;
    }

    public double calcularSueldo() {

        double salario = Empleado.salarioBase;

        if (this.edad > 30) {
            salario += 200;
        }

        if (departamento == Departamento.Contabilidad) {
            salario += 50;
        } else if (departamento == Departamento.Informática) {
            salario += 80;
        } else {
            salario += 100;
        }

        if (this.teletrabajo) {
            salario += 30;
        }

        return salario;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        return Objects.equals(this.dni, other.dni);
    }

    @Override
    public String toString() {
        return "Empleado{" + "DNI=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", departamento=" + departamento
                + ", teletrabajo=" + teletrabajo + ", empresa=" + empresa + '}';
    }
}
