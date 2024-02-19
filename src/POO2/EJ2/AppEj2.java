package POO2.EJ2;

import java.util.ArrayList;

public class AppEj2 {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("1234","HOLA.SL");


        Programador p1 = new Programador("12321","Juan",1100,"Ninguna");
        Programador p2 = new Programador("43123","Pedro",1200,"CFGS");

        Analistas an1 = new Analistas("431223","Maria",2800,"CFGS");
        Analistas an2 = new Analistas("3213","Pepe",3000,"Carrera");

        Administrativos ad1 = new Administrativos("123213","Leonel",1300,5);
        Administrativos ad2 = new Administrativos("43123","Pedro",1400,10);

        Auxiliares au1 = new Auxiliares("12221","Juana",1000,10);
        Auxiliares au2 = new Auxiliares("32213","Pepe",1100,1);

        empresa1.anadirTrabajador(p1);
        empresa1.anadirTrabajador(p2);
        empresa1.anadirTrabajador(an1);
        empresa1.anadirTrabajador(an2);
        empresa1.anadirTrabajador(ad1);
        empresa1.anadirTrabajador(ad2);
        empresa1.anadirTrabajador(au1);
        empresa1.anadirTrabajador(au2);
        for (Trabajador t : empresa1.getTrabajadores()){
            System.out.println(t);
        }




    }
}
