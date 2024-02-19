package POO2.Ejercicos.Herencia;

public class EmpleadoFijo extends Empleado{

    private double salarioMensual;

    public EmpleadoFijo(String nombre, String apellidos, String dni, double salario,double salarioMensual) {
        super(nombre, apellidos, dni, salario);
        this.salarioMensual=salarioMensual;
    }
    @Override
    public double calcularSalario() {
        return this.salarioMensual;
    }

    @Override
    public String toString() {
        return "Empleado fijo: " + super.toString();
    }
}
