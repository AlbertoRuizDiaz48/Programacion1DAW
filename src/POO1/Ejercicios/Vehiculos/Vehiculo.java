package POO1.Ejercicios.Vehiculos;

public abstract class Vehiculo {


    private static int kilometrajeTotal = 0;

    private int kilometraje;

    public Vehiculo(){
        kilometraje = 0;
    }

    public int getKilometraje() {
        return kilometraje;
    }
    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public static int getKilometrajeTotal() {
        return kilometrajeTotal;
    }


    public static void setKilometrajeTotal(int kilometrajeTotal) {
        kilometrajeTotal = kilometrajeTotal;
    }

    public void recorre (int km){
        kilometrajeTotal+=km;
        kilometraje+=km;
    }
}
