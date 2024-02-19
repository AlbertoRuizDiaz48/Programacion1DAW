package POO1.Ejercicios.Ej2;

public class PruebaGato {
    public static void main(String[] args) {
        Gato garfield = new Gato("MACHO","Gordo");
        Gato obama = new Gato("MACHO");
        Gato binLaden = new Gato("MACHO","BOOOOM");
        Gato perroSanxe = new Gato();

        System.out.println(garfield);
        garfield.comer("pescao");
        binLaden.dormir();
        perroSanxe.comer("pescadO");

        garfield.peleaCon(perroSanxe);

    }
}
