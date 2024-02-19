package POO1.Ejercicios.Vehiculos;

public class Bicicleta extends Vehiculo {
    private int pinones;
    public Bicicleta(int pinones){
        this.pinones=pinones;
    }

    public Bicicleta (){
        this.pinones=6;
    }

    public int getPinones() {
        return pinones;
    }

    public void setPinones(int pinones) {
        this.pinones = pinones;
    }

    public void caballito(){
        System.out.println("Estoy haciendome un bocadilloo");
    }

}
