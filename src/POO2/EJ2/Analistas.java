package POO2.EJ2;

public class Analistas extends Informatico{
    private double salariofinal=0;

    @Override
    public String toString() {
        return "Analistas{ " +

                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", salario_base=" + salario_base +" salariofinal=" + salariofinal +
                '}';
    }

    public Analistas(String dni, String nombre, double salario_base, String titulacion) {
        super(dni, nombre, salario_base, titulacion);
        salarioFinal();
    }

    @Override
    public void salarioFinal() {
        salariofinal=this.salario_base+(salario_base*0.30);

    }
}
