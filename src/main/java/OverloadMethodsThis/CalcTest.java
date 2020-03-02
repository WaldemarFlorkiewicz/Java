package OverloadMethodsThis;

public class CalcTest {
    public static void main(String[] args) {


        Calculator calculator = new Calculator();
        int add1 = calculator.add(14,14);
        System.out.println(add1);
        int add2 = calculator.add(14,14,14);
        System.out.println(add2);

        int subtract = calculator.subtract(15,14);
        System.out.println(subtract);
        int subtract2 = calculator.subtract(100,50,40);
        System.out.println(subtract2);
    }

}
