package POO1.Ejercicios.ej5;

public class BarGolazo {
        public static void main(String[] args) {
            Pizza p1 = new Pizza("margarita", Tamanos.MEDIANA);
            Pizza p2 = new Pizza("funghi", Tamanos.FAMILIAR);
            p2.sirve();
            Pizza p3 = new Pizza("cuatro quesos", Tamanos.MEDIANA);
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
            p2.sirve();
            System.out.println("pedidas: " + Pizza.getPizzaPedidas());
            System.out.println("servidas: " + Pizza.getPizzaServidas());
        }
    }


