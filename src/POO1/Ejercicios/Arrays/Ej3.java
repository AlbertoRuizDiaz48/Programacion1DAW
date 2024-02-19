package POO1.Ejercicios.Arrays;

import java.util.Scanner;


public class Ej3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Disco[] disco = new Disco[10];
        for (int i = 0; i <disco.length ; i++) {
            disco[i]=new Disco();
        }
        disco[0] = new Disco("uso0","Dario","Un stumble V2","RockCerveza",3);
        disco[1] = new Disco("uso1","El Fary","Torito Guapo","Clasica",4);
        disco[2] = new Disco("uso2","Mr.Tartaria","Popapeltec","Empirico",10);

        System.out.println("Menu:");
        System.out.print("1-Nuevo disco\n2-Ver todos los discos grabados\n3-Modificar los discos ya creados\n4-Borrar discos ya creados\n5-Salir\nElige:");
        int selector = sc.nextInt();
        while (selector!=5){
            switch (selector){
                case 1:
                    System.out.println("Que disco quieres usar");
                    for (int i = 0; i < disco.length ; i++) {
                        if(disco[i].getCodigo().equals("LIBRE")){
                            System.out.println((i+1)+"- "+disco[i]);
                        }
                    }
                    System.out.println("elige");
                    int selDisc = sc.nextInt();
                    System.out.println("Ahora dame separado por espacios los atributos Autor, titulo, genero y duracion");
                    String nAutor= sc.next();
                    String nTitulo= sc.next();
                    String ngenero= sc.next();
                    int nduracion = sc.nextInt();

                    disco[selDisc-1]=new Disco("uso"+(selDisc-1),nAutor,nTitulo,ngenero,nduracion);
                    System.out.println(disco[selDisc-1]);
                    break;
                case 2:
                    System.out.println("¿Quieres filtrar por Autor? S/N");
                    String sn = sc.next().toLowerCase();
                    while ((!sn.equals("s"))&&(!sn.equals("n"))){
                        System.out.println("¿Quieres filtrar por Autor? S/N");
                        sn = sc.next().toLowerCase();
                    }
                    if (sn.equals("s")){
                        System.out.println("Dime el autor");
                        String searchAutor = sc.next();
                        for (int i = 0; i <disco.length ; i++) {
                            if (disco[i].getCodigo().contains("uso")&& disco[i].getAutor().equals(searchAutor)){
                                System.out.println(disco [i]);
                            }
                        }
                    }else{
                        System.out.println("¿Quieres filtrar por genero? S/N");
                        String sn1 = sc.next().toLowerCase();
                        while ((!sn1.equals("s"))&&(!sn1.equals("n"))){
                            System.out.println("¿Quieres filtrar por Autor? S/N");
                            sn1 = sc.next().toLowerCase();
                        }
                        if (sn1.equals("s")) {
                            System.out.println("Dime el genero");
                            String searchGenero = sc.next();
                            for (int i = 0; i < disco.length; i++) {
                                if (disco[i].getCodigo().contains("uso") && disco[i].getGenero().contains(searchGenero)) {
                                    System.out.println(disco[i]);
                                }
                            }
                        }else{
                        for (int i = 0; i <disco.length ; i++) {
                            if (disco[i].getCodigo().contains("uso")) {
                                System.out.println(disco[i]);
                                 }
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Que disco quieres modificar");
                    for(Disco d : disco){
                        if (!d.getCodigo().equals("LIBRE")){
                            System.out.println(d);
                        }
                        System.out.println("elige");
                        int selDiscModify = sc.nextInt();
                        System.out.println("Que Valor quieres cambiar");
                        System.out.println("1-Autor\n2-Titulo\n3-Genero\n4-Duracion");
                        int menu1 = sc.nextInt();
                        while (menu1!=5) {
                            switch (menu1) {
                                case 1:
                                    System.out.println("Dime el autor nuevo");
                                    String mAutor = sc.next();
                                    disco[selDiscModify].setAutor(mAutor);
                                    break;
                                case 2:
                                    System.out.println("Dime el Titulo nuevo");
                                    String mTitulo = sc.next();
                                    disco[selDiscModify].setTitulo(mTitulo);
                                    break;
                                case 3:
                                    System.out.println("Dime el Genero nuevo");
                                    String mGenero = sc.next();
                                    disco[selDiscModify].setGenero(mGenero);
                                    break;
                                case 4:
                                    System.out.println("Dime el nuevo tiempo de duracion");
                                    int mDuracion = sc.nextInt();
                                    disco[selDiscModify].setDuracion(mDuracion);
                                    break;
                            }
                            System.out.println("Que Valor quieres cambiar");
                            System.out.println("1-Autor\n2-Titulo\n3-Genero\n4-Duracion");
                            menu1 = sc.nextInt();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Dime el codigo del disco para borrarlo");
                    String cCod = sc.next();

                    for (int j = 0; j <disco.length ; j++) {
                        boolean existe = false;
                        if (disco[j].getCodigo().equals(cCod)) {
                            existe = true;
                        }
                        if (existe){
                            disco[j].BorrarDatos();
                        }
                        break;
                    }
            }
            System.out.println("Menu:");
            System.out.print("1-Nuevo disco\n2-Ver todos los discos grabados\n3-Modificar los discos ya creados\n4-Borrar discos ya creados\n5-Salir\nElige:");
            selector = sc.nextInt();
        }
    }
}
