package POO2.EJ2;

public class Auxiliares extends Gestion{
    private double salarioFinal;

    @Override
    public String toString() {
        return "Auxiliares{ " +

                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", salario_base=" + salario_base + " salarioFinal=" + salarioFinal +
                '}';
    }

    public Auxiliares(String dni, String nombre, double salario_base, int antiguedad) {
        super(dni, nombre, salario_base, antiguedad);
        salarioFinal();
    }

    @Override
    public void salarioFinal() {
        salarioFinal=salario_base+100;
    }
}
