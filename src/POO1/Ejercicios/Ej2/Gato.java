package POO1.Ejercicios.Ej2;

public class Gato extends Animal{
    private String raza;
    public Gato(){
        super("HEMBRA");
        this.raza = "siamés";
    }
    public Gato (String sexo){
        super(sexo);
        this.raza = "siames";
    }

    public String toString() {
        return super.toString()+ " Raza:"+ raza + " Sexo:" + getSexo();
    }

    public Gato (String sexo, String raza){
        super(sexo);
        this.raza=raza;
    }

    public void comer (String comida){
        if (comida.toLowerCase().equals("pescado")){
            System.out.println("Que rico el pescado");
        }else{
            System.out.println("yo no como "+comida);
        }
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

    public Gato apareaCon(Gato pareja) throws ExcepcionApareamientoImposible{
        if (this.getSexo().equals(pareja.getSexo())){
        throw new ExcepcionApareamientoImposible();
        }
        return new Gato("Macho");
    }

}
