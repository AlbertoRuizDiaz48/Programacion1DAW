package POO2.interfaces.Ejercicios;

import java.util.Comparator;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private int altura;
    private int edad;

    public Persona(String nombre, int altura, int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona o) {
        return 0;
    }

    public int compareToPersona(Persona o, String cadena){
        int resultado = 0;
        if(cadena.equals("edad")){
            if (this.edad<o.getEdad()){
                resultado= -1;
            }else if (this.edad>o.getEdad()){
                resultado = 1;
            }else resultado = 0;
        } else if (cadena.equals("altura")) {
            if (this.altura<o.getAltura()){
                resultado= -1;
            }else if (this.altura>o.getAltura()){
                resultado = 1;
            }else resultado = 0;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return
                nombre +" "+altura+"cm "+edad+" años";
    }
    public static Comparator<Persona> comparadorEdad = new Comparator<Persona>() {
        @Override
        public int compare(Persona p1, Persona p2) {
            return Integer.compare(p1.getEdad(), p2.getEdad());
        }
    };

    public static Comparator<Persona> comparadorAltura = new Comparator<Persona>() {
        @Override
        public int compare(Persona p1, Persona p2) {
            return -Integer.compare(p1.getAltura(), p2.getAltura());
        }
    };
}
