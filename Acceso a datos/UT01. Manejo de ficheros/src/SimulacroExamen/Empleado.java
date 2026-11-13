package SimulacroExamen;

/**
 * Modelo de un empleado. Solo almacena datos: no conoce ficheros ni XML.
 * Separarlo evita pasar arrays de String que pueden confundirse fácilmente.
 */
public class Empleado {
    private final int id;
    private final String apellido;
    private final int departamento;
    private final double salario;

    public Empleado(int id, String apellido, int departamento, double salario) {
        this.id = id;
        this.apellido = apellido;
        this.departamento = departamento;
        this.salario = salario;
    }

    public int getId() { return id; }
    public String getApellido() { return apellido; }
    public int getDepartamento() { return departamento; }
    public double getSalario() { return salario; }

    @Override
    public String toString() {
        return "ID: " + id + " | APELLIDO: " + apellido
                + " | DEP: " + departamento + " | SALARIO: " + salario;
    }
}
