package POO2.Ejercicos.Biblioteca;

import java.time.*;
import java.util.Objects;

public class Libro {
    private String nombre;
    private Autor autor;
    private String editorial;
    private LocalDate fechaPublicacion;
    private int isbn;
    private double precio;

    public Libro(String nombre, Autor autor, String editorial, LocalDate fechaPublicacion, int isbn, double precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.isbn = isbn;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre= " + nombre +
                ", autor= " + autor.getNombre()+" "+autor.getApellido() +
                ", editorial= " + editorial +
                ", fechaPublicacion= " + fechaPublicacion +
                ", isbn= " + isbn +
                ", precio= " + precio
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return isbn == libro.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
