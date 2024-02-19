package POO1.Ejercicios.Ej2;

public class Punto {
    //atributo estático de la clase
    private static int cantidadPuntos;
    //cada instancia incrementa este atributo
    public Punto ( ) {
        cantidadPuntos++;
    }
    //método estático que retorna un atributo estático
    public static int getPuntos( ) {
        return cantidadPuntos;
    }
}

