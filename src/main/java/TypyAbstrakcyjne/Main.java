package TypyAbstrakcyjne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        String figura = null;
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            // try {
            System.out.println("Podaj nazwe figury której chcesz obliczyc pole bądz obwód: ");
            System.out.println("Prostokąt");
            System.out.println("Koło");
            System.out.println("Trojkąt");
            try {
                figura = scanner.nextLine().toLowerCase();
                if (figura.equals("prostokąt") || figura.equals("prostokat") || figura.equals("koło") ||
                        figura.equals("kolo") || figura.equals("trojkąt") || figura.equals("trojkat")) {
                    figura = figura;
                } else
                    throw new NieznanyKsztaltException("Nie znaleziono kształtu. Sprobuj jeszcze raz !");
            } catch (NieznanyKsztaltException e) {
                System.out.println(e.getMessage());
            }
            if (figura.equals("prostokąt") || figura.equals("prostokat")) {
                try {
                    System.out.println("Podaj pierweszy bok prostokata: ");
                    double a = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Podaj drugi bok prostokata: ");
                    double b = scanner.nextDouble();
                    scanner.nextLine();
                    Prostokat prostokat = new Prostokat(a, b);
                    System.out.println("Chcesz obliczyc Pole czy Obwod ?");
                    String coObliczyc = scanner.nextLine().toLowerCase();
                    if (coObliczyc.equals("pole")) {
                        System.out.println("Pole prostokąta wynosi: " + " " + prostokat.obliczPowierzchnie() + " cm");
                    } else if (coObliczyc.equals("obwod")) {
                        System.out.println("Obwod prostokąta wynosi: " + " " + prostokat.obliczObwod() + " cm");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Nie podano liczby. Sprobuj jeszcze raz !");
                    scanner.nextLine();
                }
            } else if (figura.equals("koło") || figura.equals("kolo")) {
                try {
                    System.out.println("Podaj promień koła: ");
                    double r = scanner.nextDouble();
                    scanner.nextLine();
                    Koło koło = new Koło(r);
                    System.out.println("Chcesz obliczyc Pole czy Obwod ?");
                    String coObliczyc = scanner.nextLine().toLowerCase();
                    if (coObliczyc.equals("pole")) {
                        System.out.println("Pole koła wynosi: " + " " + koło.obliczPowierzchnie() + " cm");
                    } else if (coObliczyc.equals("obwod")) {
                        System.out.println("Obwod koła wynosi: " + " " + koło.obliczObwod() + " cm");
                    } else
                        throw new NieznanyObwodLubKsztaltException("Nieprawidłowe dane. Sprobuj jeszcze raz !");
                } catch (InputMismatchException e) {
                    System.out.println("Nie podano liczby. Sprobuj jeszcze raz !");
                    scanner.nextLine();
                } catch (NieznanyObwodLubKsztaltException e) {
                    System.out.println(e.getMessage());
                }
            } else if (figura.equals("trojkąt") || figura.equals("trojkat")) {
                try {
                    System.out.println("Podaj pierwszy bok: ");
                    double a = scanner.nextDouble();

                    System.out.println("Podaj drugi bok: ");
                    double b = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Podaj trzeci bok: ");
                    double c = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Podaj wysokosc trojkata: ");
                    double h = scanner.nextDouble();
                    scanner.nextLine();
                    Trojkat trojkat = new Trojkat(a, b, c, h);
                    System.out.println("Chcesz obliczyc Pole czy Obwod ?");
                    String coObliczyc = scanner.nextLine().toLowerCase();
                    if (coObliczyc.equals("pole")) {
                        System.out.println("Pole trojkata wynosi: " + " " + trojkat.obliczPowierzchnie() + " cm");
                    } else if (coObliczyc.equals("obwod")) {
                        System.out.println("Obwod trojkata wynosi: " + " " + trojkat.obliczObwod() + " cm");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Nie podano liczby. Sprobuj jeszcze raz !");
                    scanner.nextLine();
                }
            }
            //} catch (InputMismatchException e) {
            //    System.out.println("Nie podales figury. Sprobuj jeszcze raz !");
            //}

        }

    }
}
