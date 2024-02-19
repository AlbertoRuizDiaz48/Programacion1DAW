package POO1.Objetos;

public class Libro {
    public static int isbn;
    public static String autor;
    public static int precio;
    public static String editorial;
    public static String genero;

    static public void modificarIsbn(int isbn1){
        isbn = isbn1;
    }
    static public void modificarAutor(String nombre){
        autor = nombre;
    }
    static public void modificarPrecio (int euros){
        precio = euros;
    }
    static public void modificarEditorial(String nombre){
        editorial = nombre;
    }
    static public void modificaGenero(String estilo){
        genero = estilo;
    }

}
