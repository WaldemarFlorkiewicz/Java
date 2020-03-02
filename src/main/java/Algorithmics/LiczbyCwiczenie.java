package Algorithmics;

import java.util.Scanner;

public class LiczbyCwiczenie {
    public static void main(String[] args) {

       int sum = getSum();
       print(sum);

    }

    private static int getSum() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int next = scanner.nextInt(); next <= 100; next = scanner.nextInt()) {
            sum += next;
        }
        return sum;
    }

    private static void print(int sum) {
        int mod = sum % 2;
        if (mod == 0) {
            System.out.println(sum + " Parzysta");
        } else {
            System.out.println(sum + " Nieparzysta");
        }
    }



    //----------------------------------------------------------
    // petla while.

    //private static int getSum() {
    //    int sum = 0;
    //    int next = 0;
    //    Scanner scanner = new Scanner(System.in);
    //    while((next = scanner.nextInt()) <= 100) {
    //        sum += next;
    //    }
    //    return sum;
    //}

    //-----------------------------------------------------------
    // petla do while.

    //  do {
    //      next = scanner.nextInt();
    //      if(next <= 100)
    //          sum += next;
    //  } while(next <= 100);


}

