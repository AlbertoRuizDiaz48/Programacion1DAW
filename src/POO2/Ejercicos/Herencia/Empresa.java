package POO2.Ejercicos.Herencia;

import java.util.ArrayList;

public class Empresa {
    protected ArrayList<Empleado> empleados;

    public Empresa(){
        this.empleados = new ArrayList<>();
    }


    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void mostrarEmpleados() {
        for (Empleado e:empleados) {
            System.out.println(e.toString());
        }
    }

    public void addEmpleado(Empleado e){
        empleados.add(e);
    }
    public void delEmpleado(String dni) throws EmpleadoNoEncontradoException{
        boolean existe = false;
        for (int i = 0; i < empleados.size(); i++) {
            Empleado e = empleados.get(i);
            if (e.getDni().equals(dni)) {
                empleados.remove(i); // Elimina el empleado en la posición i
                existe = true;
                break;
            }
        }
        if (!existe){
            throw new EmpleadoNoEncontradoException("El empleado con DNI "+dni+" No se ha encontrado");
        }
    }

}
