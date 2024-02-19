package POO1.Ejercicios.Ej2;

public class Caballo extends Animal{
    private String raza;
    private int alturaEnCm;
    private int peso;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAlturaEnCm() {
        return alturaEnCm;
    }

    public void setAlturaEnCm(int alturaEnCm) {
        this.alturaEnCm = alturaEnCm;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Caballo(String sexo, String raza, int alturaEnCm, int peso) {
        super(sexo);
        this.raza = raza;
        this.alturaEnCm = alturaEnCm;
        this.peso = peso;
    }

    public Caballo (){
        super("macho");
        alturaEnCm = 160;
        peso = 750;
        raza = "arabe";
    }

    public void relincha(){
        System.out.println("IIYIYIYIYIIYIY");
    }

}
