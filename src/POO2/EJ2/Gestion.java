package POO2.EJ2;

public abstract class Gestion extends Trabajador {

    private int antiguedad;

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Gestion(String dni, String nombre, double salario_base, int antiguedad) {
        super(dni, nombre, salario_base);
        this.antiguedad=antiguedad;
    }
    public abstract void salarioFinal();

}
