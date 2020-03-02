package Exceptions;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag){
            try {
                System.out.println("Witamy w kalkulatorze MADE BY W.FLORKIEWICZ (Wszystkie prawa zastrzeżone !)");
                Calculator.printOptions();
                String operator = Calculator.wczytywanieOperatora();
                System.out.println("Podaj pierwsza liczbe: ");
                double a = Calculator.wczytywanieLiczby();
                System.out.println("Podaj druga liczbe: ");
                double b = Calculator.wczytywanieLiczby();
                System.out.println("Wynik " + operator + " to: " + Calculator.obliczanie(operator, a, b));
            }catch (InputMismatchException e){
                System.out.println("Nie podano liczby ! Sprobuj jeszcze raz !");
            }catch (UnknownOperatorException e){
                System.out.println(e.getMessage());
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }

        }
    }

}
