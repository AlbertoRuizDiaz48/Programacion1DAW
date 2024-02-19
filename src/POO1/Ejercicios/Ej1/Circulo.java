package POO1.Ejercicios.Ej1;

public class Circulo {
    private double radio;
    private String color;
    private int centroX, centroY;

    public Circulo() { //crea un círculo de radio 50, negro y centro en (100,100)
        radio = 50;
        color = "negro";
        centroX = 100;
        centroY = 100;
    }

    public Circulo(double r) { //crea un círculo de radio 50, negro y centro en (100,100)
        radio = r;
        color = "blanco";
        centroX = 0;
        centroY = 0;
    }

    public Circulo (double r, String col, int cX, int cY){
        radio = r;
        color = col;
        centroX=cX;
        centroY =cY;
    }

    public double getRadio() { //consulta el radio del círculo
        return radio;
    }

    public void setRadio(double nuevoRadio) { //actualiza el radio del círculo a nuevoRadio
        radio = nuevoRadio;
    }

    public void decrece() { //decrementa el radio del círculo
        radio = radio / 1.3;
    }

    public double area() { //calcula el área del círculo
        return Math.PI * radio * radio;
    }
    public String toString() { //obtiene un String con las componentes del círculo
        return
                "Círculo de radio " + radio + ", color " + color + " y centro (" + centroX + "," + centroY + ")";
    }

    public void mostrarDatos() { //obtiene un String con las componentes del círculo
        System.out.println("Círculo de radio " + radio + ", color " + color + " y centro (" + centroX + "," + centroY + "), y su area es " + area());
    }
}
