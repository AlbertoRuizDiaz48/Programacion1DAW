package POO1.Ejercicios.Vehiculos;

public class Coche extends Vehiculo {

    private String modelo;
    private String marca;

    public Coche(String marca, String modelo) {
        this.marca=marca;
        this.modelo=modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


}
