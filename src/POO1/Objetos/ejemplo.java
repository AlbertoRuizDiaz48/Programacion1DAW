package POO1.Objetos;


public class ejemplo {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        persona1.cambiarProfesion("Hola");

        Libro harryPotter = new Libro();
        harryPotter.modificaGenero("Fantasia");
        harryPotter.modificarIsbn(231148991);
        harryPotter.modificarAutor("J.K Rowling");
    }



}
