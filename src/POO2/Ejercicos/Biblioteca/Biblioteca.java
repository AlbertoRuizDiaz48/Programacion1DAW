package POO2.Ejercicos.Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
   private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<Libro>();
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro l){

        libros.add(l);
    }
    public void eliminarLibro(int isbn) throws LibroNoEncontradoException{

        for (Libro l:libros){
            if (l.getIsbn()==isbn){
               libros.remove(l);
               return;
            }
        }
        throw new LibroNoEncontradoException("Libro con isbn:"+isbn+" no encontrado");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Libro libro : libros) {
            sb.append(libro.toString()).append("\n");
        }
        return sb.toString();
    }
}
