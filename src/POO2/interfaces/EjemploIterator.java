package POO2.interfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploIterator {
    public static void main(String[] args) {
        ArrayList <Paises> paises = new ArrayList<>();
        paises.add(new Paises("TOKYO"));
        paises.add(new Paises("PORTUGAL"));
        paises.add(new Paises("HOLA"));
        paises.add(new Paises("Tony Perez"));

        Iterator<Paises> iterator = paises.iterator();

        while(iterator.hasNext()){
            Paises pais = iterator.next();
            if (pais.getNombres().equals("Tony Perez")){
                iterator.remove();
            }
            System.out.println(pais.getNombres());
        }

        System.out.println("NUEVO ITERADOR");
        iterator = paises.iterator();
        while(iterator.hasNext()){
            Paises pais = iterator.next();
            System.out.println(pais.getNombres());
        }
    }
}
