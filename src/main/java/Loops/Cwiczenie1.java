package Loops;

import java.util.Scanner;

public class Cwiczenie1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe wprowadzanych liczb: ");
        int wprowadzoneLiczbny = 3;
        int suma = 0;

        // Petla for !!!

        //for (int i = 0; i < wprowadzoneLiczbny; i++) {
        //    System.out.println("Podaj " + (i + 1) + " liczbe: ");
        //    suma += scanner.nextInt();
        //}
        //System.out.println("Suma : " + suma);

        // Petla while !!!

        while (wprowadzoneLiczbny-- > 0) {
            System.out.println("Podaj " + (wprowadzoneLiczbny + 1) + " liczbe: ");
            suma += scanner.nextInt();
        }
        System.out.println("Suma:" + suma);
        //scanner.close();



        // Petla do - while !!!

        //do {
        //    System.out.println("Podaj liczbe : ");
        //    suma = suma + scanner.nextInt();
        //    wprowadzoneLiczbny--;
        //}while (wprowadzoneLiczbny > 0);

        //System.out.println(suma);
        //scanner.close();

    }


}
