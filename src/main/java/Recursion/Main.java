package Recursion;

public class Main {
    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println(factorial);
    }

    //private static int factorial(int n) {
    //    if (n > 1){
    //        return n * factorial(n - 1);
    //    }else
    //        return 1;
    //}

    private static int factorial(int n ){
        return n > 1 ? n * factorial(n - 1) : 1;
    }
}
