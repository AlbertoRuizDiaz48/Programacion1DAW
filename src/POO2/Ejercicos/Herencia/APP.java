package POO2.Ejercicos.Herencia;

public class APP {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.addEmpleado(new EmpleadoFijo("Juan", "Herrador Rello", "12345678A", 1234.50, 1300));
        empresa.addEmpleado(new EmpleadoFijo("Ismael", "Herrador Rello", "12345678B", 1234.50, 1320));
        empresa.addEmpleado(new EmpleadoPorHoras("Paco", "Herrador Rello", "12345678C", 1234.50, 13, 14.11));
        empresa.addEmpleado(new EmpleadoPorHoras("Pedro", "Herrador Rello", "12345678D", 1234.50, 130, 14.11));

        empresa.mostrarEmpleados();

       try {
           empresa.delEmpleado("12345678A");
           empresa.delEmpleado("594564");
       }catch (EmpleadoNoEncontradoException e){
           System.out.println(e.getMessage());
       }

        for (Empleado e:empresa.getEmpleados()) {
            System.out.println(e.calcularSalario());
        }


    }
}
