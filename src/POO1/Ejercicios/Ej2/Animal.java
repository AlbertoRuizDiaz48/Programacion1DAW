package POO1.Ejercicios.Ej2;

public class Animal {
    private String sexo;
    Animal(){
        this.sexo = "MACHO";
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    Animal(String sexo){
        this.sexo = sexo;
    }

    public void dormir () {
       System.out.println("ZzzzZzzzZzzz");
   }
    public void comer () {
        System.out.println("ÑamÑamÑamÑam");
    }
    public void comer (String comida) {
        System.out.println("ÑamÑamÑamÑam me encanta comer " +comida);
    }
}
