package POO1.Ejercicios.Ej2;

public class Ave extends Animal {
    public Ave (){
        super ();
    }

    public Ave (String sexo){
        super(sexo);
    }
    public void aseate (){
        System.out.println("Me estoy limpiando las alas");
    }
    public void vuela(){
        System.out.println("Estoy flying...");
    }
}
