package POO2.EJ2;

public class Programador extends Informatico{
    private double salariofinal;

    @Override
    public String toString() {
        return "Programador{ " +

                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", salario_base=" + salario_base +" salariofinal=" + salariofinal+
        '}';
    }

    @Override
    public void salarioFinal() {
        salariofinal=this.salario_base+(this.salario_base*0.15);
    }
    public Programador(String dni, String nombre, double salario_base, String titulacion) {
        super(dni, nombre, salario_base, titulacion);
        salarioFinal();
    }


}
