package DataInput;

public class CalculatorService {

    double dodawanie(double a, double b) {
        return a + b;
    }

    double odejmowanie(double a, double b) {
        return a - b;
    }

    double mnożenie(double a, double b) {
        return a * b;
    }

    double dzielenie(double a, double b) {
        return a / b;
    }

    double obliczanie(double a, double b, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = a + b;
            break;
            case "-":
                result = a - b;
            break;
            case "*":
                result = a * b;
            break;
            case "/":
                result = a / b;
            break;
            default:
                System.out.println("Podany operator nie istnieje");
        }
        return result;
    }
}
