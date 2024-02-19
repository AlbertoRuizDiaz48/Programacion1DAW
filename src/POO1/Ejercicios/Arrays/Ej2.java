package POO1.Ejercicios.Arrays;

public class Ej2 {
    public static void main(String[] args) {
        Gato[]gatos= new Gato[4];
        gatos [0] = new Gato ("m","raza1");
        gatos [1] = new Gato ("f","raza2");
        gatos [2] = new Gato ("m","raza3");
        gatos [3] = new Gato ("f","raza4");
        for (int i = 0; i < gatos.length ; i++) {
            System.out.print("Gato "+(i+1)+" ");
            System.out.println(gatos[i]);
        }
    }

}
