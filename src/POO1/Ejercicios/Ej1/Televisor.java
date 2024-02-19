package POO1.Ejercicios.Ej1;

public class Televisor {
    private int canal;
    private int volumen;
    public Televisor(){
    volumen=5;
    canal=1;
    }



    public void setCanal(int canal) {
        if (canal>100||canal<1){
            canal=1;
        }
        this.canal = canal;
    }

    public void setVolumen(int volumen) {
        if (volumen>100||volumen<1){
            volumen=1;
        }
        this.volumen = volumen;
    }

    public int getCanal() {
        return canal;
    }
    public void subirCanal(){
        setCanal(canal+1);
        System.out.println("El canal actual es "+canal);
    }
    public void bajarCanal(){
        setCanal(canal-1);
        System.out.println("El canal actual es "+canal);
    }
    public void subirVolumen(){
        setVolumen(volumen+1);
        System.out.println("El volumen actual es: " + volumen);
    }

    public String toString() {
        return "canal= "+ canal + ", volumen= " + volumen ;
    }

    public void bajarVolumen(){
        setVolumen(volumen-1);
        System.out.println("El volumen actual es: " + volumen);
    }

}
