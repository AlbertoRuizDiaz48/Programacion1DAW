package POO1.Ejercicios.Ej2;

    public class AppPunto {
        public static void main (String[] args) {
//se crean instancias
            Punto p1 = new Punto ( );
            Punto p2 = new Punto ( );
            Punto p3 = new Punto ( );
//accedemos al método estático para ver el
//número de instancias de tipo Punto creadas
            System.out.println(Punto.getPuntos( ));
        }

}
