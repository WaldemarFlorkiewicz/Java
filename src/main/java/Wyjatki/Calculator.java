package Wyjatki;

import java.util.Scanner;

public class Calculator {


    public static double obliczanie (String operator, double a, double b){
        double wynik = 0;
        if (operator.equals("+")){
            wynik =  a + b;
        }else if (operator.equals("-")){
            wynik = a - b;
        }else if (operator.equals("*")){
            wynik =  a * b;
        }else if (operator.equals("/")){
            if (b == 0){
                throw new ArithmeticException ("Nie dziel przez 0 !");
            }
            wynik = a / b;
        }
        return wynik;
    }

    public static String wczytywanieOperatora (){
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.nextLine();
        if (operator.equals("+")){
            operator = "+";
        }else if (operator.equals("-")){
            operator = "-";
        }else if (operator.equals("*")){
            operator = "*";
        }else if (operator.equals("/")){
            operator = "/";
        }else {
            throw new UnknownOperatorException("Podano niewlasciwy operator.");
        }
        return operator;

    }

    public static double wczytywanieLiczby (){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        scanner.nextLine();
        return a;
    }



    public static void printOptions(){
        System.out.println("Wybierz opcje: ");
        System.out.println("+ (Dodawanie) ");
        System.out.println("- (Odejmowanie) ");
        System.out.println("* (Mnozenie)");
        System.out.println("/ (Dzielenie) ");
    }

}
