package TypWyliczeniowyEnum;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dostępne Pizze: ");
        for (Pizza value : Pizza.values()) {
            System.out.println(value.name() + ": " + value.toString());
        }

        System.out.println("Wybierz pizze dla siebie: ");
        Pizza wybranaPizza = Pizza.valueOf(scanner.nextLine().toUpperCase());
        scanner.close();

        System.out.println("Wybrałes: " + wybranaPizza.name() + ": " + wybranaPizza.toString());
        System.out.println("Smacznego !!!");

    }

    //public static void main(String[] args) {
    //    System.out.println("Dostępne pizze:");
    //    for (Pizza p : Pizza.values()) {
    //        System.out.println(p);
    //    }

    //    Scanner input = new Scanner(System.in);
    //    System.out.println("Jaką pizzę wybierasz?");
    //    Pizza pizza = Pizza.valueOf(input.nextLine());

    //    System.out.println("Dziękujemy za zamówienie pizzy " + pizza.name());
    //    input.close();
    //}
}
