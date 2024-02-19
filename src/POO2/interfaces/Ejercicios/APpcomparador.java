package POO2.interfaces.Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class APpcomparador {
    public static void main(String[] args) {
      Persona[]personas  = new Persona[5];
        personas[0]=(new Persona("Juan", 123,12));
        personas[1]=(new Persona("Pedro", 143,52));
        personas[2]=(new Persona("Antonio", 203,32));
        personas[3]=(new Persona("Luis", 192,61));
        personas[4]=(new Persona("Maria", 183,91));

        for (int i = 0; i < personas.length ; i++) {
            System.out.println(personas[i]);
        }
        Arrays.sort(personas, Persona.comparadorEdad);
        System.out.println("Ordenado por edad de menor a mayor:");
        for (Persona p : personas) {
            System.out.println(p);
        }

        // Ordenar por altura de mayor a menor
        Arrays.sort(personas, Persona.comparadorAltura);
        System.out.println("\nOrdenado por altura de mayor a menor:");
        for (Persona p : personas) {
            System.out.println(p);
        }

    }


}
