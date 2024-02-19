package POO2.EJ2;

public abstract class  Trabajador {
    protected  String dni;
    protected  String nombre;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    protected double salario_base;

    public abstract void salarioFinal();

    public Trabajador(String dni, String nombre, double salario_base) {
        this.dni = dni;
        this.nombre = nombre;
        this.salario_base = salario_base;
    }





}
