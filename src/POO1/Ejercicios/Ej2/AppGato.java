package POO1.Ejercicios.Ej2;

public class AppGato {


    public static void main(String[] args) {
        Gato garfield = new Gato("macho","PAPA");
        Gato Juan = new Gato("macho","lala");
        Gato juana = new Gato("Hembra","kaka");

        try {
            garfield.apareaCon(juana);
        }catch (ExcepcionApareamientoImposible e){
            System.out.println("No puedo aparearme");
        }



    }
}
