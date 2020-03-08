package Recursion;

public class Main {
    public static void main(String[] args) {
        int factorial = factorial(4);
        System.out.println(factorial);
    }

    private static int factorial(int n) {
        if (n > 1){
            return n * factorial(n - 1);
        }else
            return 1;
    }
}
