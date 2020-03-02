package MethodsAndConstructors.Cwiczenie1;

public class Calculate {
    public static void main(String[] args) {

        double a = 23.6;
        double b = 67.6;

        Calculator calculator = new Calculator();
        double dodwanie = calculator.add(a, b);
        double odejmowanie = calculator.subtract(a, b);
        double mnozenie = calculator.multiply(a, b);
        double dzielenie = calculator.divide(a, b);

        System.out.println(dodwanie);
        System.out.println(odejmowanie);
        System.out.println(mnozenie);
        System.out.println(dzielenie);

    }
}
