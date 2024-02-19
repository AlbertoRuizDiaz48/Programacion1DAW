package POO2.EJ2;

import java.util.ArrayList;

public class Empresa {
    private String nif;
    private String nombre;
    private ArrayList<Trabajador>trabajadores;

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public Empresa(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
        this.trabajadores = new ArrayList<>();
    }

    public void anadirTrabajador(Trabajador trabajador){
        trabajadores.add(trabajador);
    }
}
