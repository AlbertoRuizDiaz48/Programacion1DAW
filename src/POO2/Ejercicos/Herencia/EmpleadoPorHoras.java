package POO2.Ejercicos.Herencia;

public class EmpleadoPorHoras extends Empleado{

    private int horasTrabajadas;
    private double tarifaPorHoras;

    public EmpleadoPorHoras(String nombre, String apellidos, String dni, double salario,int horasTrabajadas,double tarifaPorHoras) {
        super(nombre, apellidos, dni, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHoras = tarifaPorHoras;
    }
    @Override
    public double calcularSalario() {
        return horasTrabajadas*tarifaPorHoras + salario;
    }
    @Override
    public String toString() {
        return "Empleado Por Horas: " + super.toString();
    }
}
