package POO2.EJ2;

public class Administrativos extends Gestion{
    private double salarioFinal;

    @Override
    public String toString() {
        return "Administrativos{ " +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", salario_base=" + salario_base +" salarioFinal= " + salarioFinal+
                '}';
    }

    public Administrativos(String dni, String nombre, double salario_base, int antiguedad) {
        super(dni, nombre, salario_base, antiguedad);
        salarioFinal();
    }

    @Override
    public void salarioFinal() {
        salarioFinal=salario_base+(getAntiguedad()*20);
    }
}
