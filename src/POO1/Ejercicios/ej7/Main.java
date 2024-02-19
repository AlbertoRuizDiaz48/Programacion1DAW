package POO1.Ejercicios.ej7;

import java.security.Principal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zona principal = new Zona (1000);
        Zona vip = new Zona (25);
        Zona reventa = new Zona (200);
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Mostrar número de entradas libres\n" +
                "2. Vender entradas\n" +
                "3. Salir\nElige:");
        int sel = sc.nextInt();
        while (sel!=3){

            switch (sel){
                case 1:
                    System.out.println("De que Zona quieres verla");
                    System.out.println("1-Principal\n2-VIP\n3-Compra-Venta\n");
                    int sz = sc.nextInt();
                    switch (sz){
                        case 1:
                            System.out.println(principal.getEntradasPorVender());
                            break;
                        case 2:
                            System.out.println(vip.getEntradasPorVender());
                            break;
                        case 3:
                            System.out.println(reventa.getEntradasPorVender());
                            break;
                    }
                    break;
                case 2:
                    System.out.println("De que Zona quieres comprar");
                    System.out.println("1-Principal\n2-VIP\n3-Compra-Venta\n");
                    int sz1 = sc.nextInt();
                    System.out.println("Cuantas quieres comprar");
                    int cant = sc.nextInt();
                    switch (sz1){
                        case 1:
                            principal.vender(cant);
                            break;
                        case 2:
                            vip.vender(cant);
                            break;
                        case 3:
                            reventa.vender(cant);
                            break;
                    }
                    break;
            }
            System.out.println("1. Mostrar número de entradas libres\n" +
                    "2. Vender entradas\n" +
                    "3. Salir\nElige:");
            sel = sc.nextInt();
        }


    }
}
