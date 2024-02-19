package POO2.EJ2;

public abstract class Informatico extends Trabajador {
    private String titulacion;
    public Informatico(String dni, String nombre, double salario_base,String titulacion) {
        super(dni, nombre, salario_base);
        this.titulacion = titulacion;
    }
    public abstract void salarioFinal();
    }