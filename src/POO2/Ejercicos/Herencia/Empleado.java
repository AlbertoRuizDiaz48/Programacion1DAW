package POO2.Ejercicos.Herencia;

public abstract class Empleado {

    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected double salario;

    public Empleado(String nombre, String apellidos, String dni, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{ " +
                "nombre= " + nombre +
                " apellidos= " + apellidos +
                " dni='" + dni +
                " salario=" + salario +
                " }";
    }

    public abstract double calcularSalario();

}
