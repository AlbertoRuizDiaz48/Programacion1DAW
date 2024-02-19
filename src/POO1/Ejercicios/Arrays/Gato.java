package POO1.Ejercicios.Arrays;


public class Gato {
    private String sexo;
    private String raza;

    @Override
    public String toString() {
        return "sexo = " + sexo+ " raza = " + raza ;
    }

    public Gato(){
        sexo = "HEMBRA";
        this.raza = "siamés";
    }
    public Gato(String sexo){
        this.sexo = sexo;
        this.raza = "siames";
    }

    public Gato(String sexo, String raza){
        this.sexo = sexo;
        this.raza=raza;
    }

    public void comer (String comida){
        if (comida.toLowerCase().equals("pescado")){
            System.out.println("Que rico el pescado");
        }else{
            System.out.println("yo no como "+comida);
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void peleaCon(Gato enemigo){
        if (this.getSexo().equals("HEMBRA")){
            System.out.println("no voy a pelear");
        }else if (enemigo.getSexo().equals("HEMBRA")){
            System.out.println("no peleo con gatitas");
        }else{
            System.out.println("Te surrajo hermano");
        }
    }

}
