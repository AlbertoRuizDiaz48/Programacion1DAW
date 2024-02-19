package POO1.Ejercicios.Vehiculos;
import java.util.Scanner;
public class MenuVehiculo {
    public static void main(String[] args) {
        Coche coche1 = new Coche("juaquinSabina","A2");
        Bicicleta bici1 = new Bicicleta(6);
        Scanner sc = new Scanner(System.in);
        System.out.println("1-Marca de coche\n2-Modelo de coche\n3-Piñones de la bici\n4-Recorrer Km\n5-Km Recorridos\n6-Hacer Caballito\n7-Salir");
        System.out.println("Elige opcion");
        int var = sc.nextInt();

        while (var!=7){
            switch (var){
                case 1:
                    System.out.println(coche1.getMarca());
                    break;
                case 2:
                    System.out.println(coche1.getModelo());
                    break;
                case 3:
                    System.out.println(bici1.getPinones());
                    break;
                case 4:
                    System.out.println("De que vehiculo quieres recorrer km?");
                    System.out.println("1-Bici\n-2Coche");
                    int sel = sc.nextInt();
                    while (sel==1||sel==2){
                        if (sel==1){
                            System.out.println("cuantos km recorre");
                            int km = sc.nextInt();
                            bici1.recorre(km);
                        }else{
                            System.out.println("cuantos km recorre");
                            int km = sc.nextInt();
                            coche1.recorre(km);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Se ha recorrido " + Vehiculo.getKilometrajeTotal()+"Km");

            }
        }

    }
}
