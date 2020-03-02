package WprowadzanieDanych;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        CalculatorService calculatorService = new CalculatorService();
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Podaj pierwsza liczbe: ");
        double pierweszaLiczba = scanner.nextDouble();//  /n
        scanner.nextLine();
        System.out.println("Dodaj  + ");
        System.out.println("Odejmij  - ");
        System.out.println("Pomnóż  * ");
        System.out.println("Podziel  / ");
        String znakDziałania = scanner.nextLine();
        System.out.println("Podaj druga liczbe: ");
        double drugaLiczba = scanner.nextDouble();
        scanner.close();
        System.out.println("Twoj wynik to : " + calculatorService.obliczanie(pierweszaLiczba,drugaLiczba,znakDziałania));


        switch (znakDziałania){
            case "+":
                System.out.println("Wynik to : " + calculatorService.dodawanie(pierweszaLiczba , drugaLiczba));
                break;
            case  "-":
                System.out.println("Wynik to : " + calculatorService.odejmowanie(pierweszaLiczba , drugaLiczba));
                break;
            case "*":
                System.out.println("Wynik to : " + calculatorService.mnożenie(pierweszaLiczba,drugaLiczba));
                break;
            case "/":
                System.out.println("Wynik to : " + calculatorService.dzielenie(pierweszaLiczba, drugaLiczba));
                break;
            default:
                System.out.println("Wybrałes zly znak !!!");
        }



    }



}
