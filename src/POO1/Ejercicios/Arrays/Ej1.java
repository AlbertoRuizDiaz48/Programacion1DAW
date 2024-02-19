package POO1.Ejercicios.Arrays;

public class Ej1 {
    public static void main(String[] args) {
        Gato[] gatos=new Gato[4];

        for (int i = 0; i < gatos.length ; i++) {
            gatos[i]=new Gato("Siames","MACHO");
        }

        for (int i = 0; i < gatos.length ; i++) {
            System.out.println("Gato "+i);
            System.out.println(gatos[i]);
        }

    }
}
