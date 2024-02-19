package POO1.Ejercicios.Ej1;

public class AplicacionCirculo {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(123.5);
        Circulo c3 = new Circulo(123.4,"azul",12,10);
        c1.mostrarDatos();
        c2.mostrarDatos();
        c3.mostrarDatos();
    }
}
