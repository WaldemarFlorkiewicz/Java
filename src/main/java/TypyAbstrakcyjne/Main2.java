package TypyAbstrakcyjne;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        boolean isGoing = true;
        Scanner scanner = new Scanner(System.in);
        while (isGoing) {
            System.out.println("Wybierz kształt:");
            System.out.println("1) Rectangle");
            System.out.println("2) Circle");
            System.out.println("3) ThreeAngle");
            System.out.println("4) Exit");
            Integer choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    printChoice();
                    Integer nextChoice = scanner.nextInt();
                    switch (nextChoice) {
                        case 1: {
                            System.out.println("Podaj bok \"a\"");
                            Double bokA = scanner.nextDouble();
                            System.out.println("Podaj bok \"b\"");
                            Double bokB = scanner.nextDouble();
                            Prostokat rectangle = new Prostokat(bokA, bokB);
                            System.out.println(rectangle.obliczObwod());
                            break;
                        }
                        case 2: {
                            System.out.println("Podaj bok \"a\"");
                            Double bokA = scanner.nextDouble();
                            System.out.println("Podaj bok \"b\"");
                            Double bokB = scanner.nextDouble();
                            Prostokat prostokat = new Prostokat(bokA, bokB);
                            System.out.println(prostokat.obliczPowierzchnie());
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    printChoice();
                    Integer nextChoice = scanner.nextInt();
                    switch (nextChoice) {
                        case 1: {
                            System.out.println("Podaj promień r");
                            Double promien = scanner.nextDouble();
                            Koło koło = new Koło(promien);
                            System.out.println(koło.obliczObwod());
                            break;
                        }
                        case 2: {
                            System.out.println("Podaj promień r");
                            Double promien = scanner.nextDouble();
                            Koło koło = new Koło(promien);
                            System.out.println(koło.obliczPowierzchnie());
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    printChoice();
                    Integer nextChoice = scanner.nextInt();
                    switch (nextChoice) {
                        case 1: {
                            System.out.println("Podaj podstawę \"a\"");
                            Double bokA = scanner.nextDouble();
                            System.out.println("Podaj wysokość \"h\"");
                            Double wysokosc = scanner.nextDouble();
                            //Trojkat trojkat = new Trojkat(bokA, wysokosc);
                            //System.out.println(trojkat.obliczObwod());
                            break;
                        }
                        case 2: {
                            System.out.println("Podaj bok \"a\"");
                            Double bokA = scanner.nextDouble();
                            System.out.println("Podaj bok \"b\"");
                            Double bokB = scanner.nextDouble();
                            System.out.println("Podaj bok \"c\"");
                            Double bokC = scanner.nextDouble();
                            //Trojkat trojkat = new Trojkat(bokA, bokB, bokC);
                            //System.out.println(threeAngle.calculatePerimeter());
                            break;
                        }
                    }
                    break;
                }
                case 4:{
                    isGoing = false;
                    break;
                }
            }

        }
    }

    public static void printChoice() {
        System.out.println("Wybierz co chcesz obliczyć:");
        System.out.println("1) Pole");
        System.out.println("2) Obwód");
    }
}
