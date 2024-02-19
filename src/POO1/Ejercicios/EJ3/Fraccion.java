package POO1.Ejercicios.EJ3;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion (int num, int denom){
        this.numerador = num;
        this.denominador=denom;
    }

    public void invierte (){
        int aux = numerador;
        numerador = denominador;
        denominador=aux;
    }

}
