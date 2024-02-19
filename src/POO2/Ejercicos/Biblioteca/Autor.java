package POO2.Ejercicos.Biblioteca;

import java.time.LocalDate;

public class Autor extends Persona{
    private GeneroLiterario genero;
    public Autor(String nombre, String apellido, LocalDate fechaNacimiento,GeneroLiterario genero) {
        super(nombre, apellido, fechaNacimiento);
        this.genero=genero;
    }

    public GeneroLiterario getGenero() {
        return genero;
    }

    public void setGenero(GeneroLiterario genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Genero literario : "+genero+" "+super.toString();
    }
}
