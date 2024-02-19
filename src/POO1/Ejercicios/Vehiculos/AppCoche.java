package POO1.Ejercicios.Vehiculos;

public class AppCoche {
    public static void main(String[] args) {
        Coche coche1 = new Coche("papa","mx1");
        Coche coche2 = new Coche("Nissan","GTR");

        coche2.recorre(123);
        coche1.recorre(22);

        System.out.println("Coche 1 ha recorrido "+coche1.getKilometraje()+"km");
        System.out.println("Coche 2 ha recorrido "+coche2.getKilometraje()+"km");
        System.out.println("En total los dos ha recorrido "+Coche.getKilometrajeTotal()+"km");
    }
}
