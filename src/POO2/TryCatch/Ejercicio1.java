package POO2.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valido;
        System.out.println("Dame 6 numeros");
        int num = 0;
        for (int i = 1; i < 7 ; i++) {
            valido=false;
            System.out.print("Numero "+(i)+"=");
            do {
                try {
                    num=Integer.parseInt(sc.next());
                    valido = true;
                }catch (Exception noint){
                    System.out.println("Numero Erroneo vuelve a introducirlo");
                }
            }while(!valido);
            System.out.println("");


        }
    }
}
