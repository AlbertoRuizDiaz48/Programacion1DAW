package POO2.TryCatch;

import java.util.*;
import java.util.Scanner;

public class ej1 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        try {
            num1 = entrada.nextInt();
            num2 = Integer.parseInt("hola");
            System.out.println(num2 / num1);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());

            e.printStackTrace();

        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());

            e.printStackTrace();

        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());

            e.printStackTrace();

        }
        System.out.println("El programa termina con normalidad");
    }
}