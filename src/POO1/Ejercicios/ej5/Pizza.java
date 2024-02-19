package POO1.Ejercicios.ej5;

public class Pizza {
    private Tamanos tamanos;
    private String sabor;
    private PedidaServida estado;
    private static int pizzaServidas = 0;
    private static int pizzaPedidas = 0;


    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public static int getPizzaServidas() {
        return pizzaServidas;
    }

    public static void setPizzaServidas(int pizzaServidas) {
        Pizza.pizzaServidas = pizzaServidas;
    }

    public static int getPizzaPedidas() {
        return pizzaPedidas;
    }

    public static void setPizzaPedidas(int pizzaPedidas) {
        Pizza.pizzaPedidas = pizzaPedidas;
    }

    public Pizza(){
        this.tamanos = Tamanos.MEDIANA;
        this.sabor = "Margarita";
        this.estado = PedidaServida.PEDIDA;
        this.pizzaPedidas+=1;
    }

    public Pizza( String sabor,Tamanos tamanos) {
        this.tamanos = tamanos;
        this.sabor = sabor;
        this.estado = PedidaServida.PEDIDA;
        this.pizzaPedidas+=1;

    }

    @Override
    public String toString() {
        return "Pizza " +sabor + " " + tamanos+ " " + estado;
    }

    public void sirve (){
        if (this.estado.equals(PedidaServida.SERVIDA)){
            System.out.println("Lo siento esa pizza ya esta servida");
        }else{
            this.estado = PedidaServida.SERVIDA;
            this.pizzaServidas+=1;

        }
    }
}
