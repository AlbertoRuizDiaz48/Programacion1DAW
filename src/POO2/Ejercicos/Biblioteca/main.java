package POO2.Ejercicos.Biblioteca;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        // Instanciar una biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear autores
        Autor autor1 = new Autor("Stephen", "King", LocalDate.of(1947, 9, 21), GeneroLiterario.NARRATIVO);
        Autor autor2 = new Autor("J.K.", "Rowling", LocalDate.of(1965, 7, 31), GeneroLiterario.FANTASTICO);

        // Añadir libros a la biblioteca
        biblioteca.agregarLibro(new Libro("IT", autor1, "Editorial A", LocalDate.of(1986, 9, 15), 1234567890, 25.99));
        biblioteca.agregarLibro(new Libro("Harry Potter y la piedra filosofal", autor2, "Editorial B", LocalDate.of(1997, 6, 26), 987654321, 19.99));

        // Mostrar información de los libros
        System.out.println("Información de los libros en la biblioteca:");
        System.out.println(biblioteca.toString());

        try {
            biblioteca.eliminarLibro(123123);
            System.out.println("El libro ha sido eliminado correctamente.");
        } catch (LibroNoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        // Eliminar un libro por título
        try {
            biblioteca.eliminarLibro(1234567890);
            System.out.println("El libro se ha sido eliminado correctamente.");

        } catch (LibroNoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        // Intentar eliminar un libro que no existe



    }
}
