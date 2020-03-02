package SpecyfikatoryDostepu.Test;

import SpecyfikatoryDostepu.Pakiet1.Point;
import SpecyfikatoryDostepu.Pakiet2.PointController;

import java.util.Scanner;

public class PointApplication {

    public static void main(String[] args) {
        //Point point = new Point(4,5);
        //PointController pointController = new PointController();

        //pointController.addX(point);
        //System.out.println(point.getX());
        //pointController.addX(point);
        //System.out.println(point.getX());
        Point point = new Point(5, 5);
        PointController pointController = new PointController();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz jedna z opcji:");
        System.out.println("0 - wyjdz z programu");
        System.out.println("1 - przesuń punkt  prawo");
        System.out.println("2 - przesuń punkt  lewo");
        System.out.println("3 - przesuń punkt do góry");
        System.out.println("4 - przesuń punkt w dół");
        System.out.println("------------------------------------------");
        final int exit = 0;
        final int add_X = 1;
        final int minus_X = 2;
        final int add_Y = 3;
        final int minus_Y = 4;

        final int option = exit;

        switch (option) {
            case exit:
                System.out.println("Koniec programu");
                break;
            case add_X:
                pointController.addX(point);
                System.out.println(point.getX());
                break;
            case minus_X:
                pointController.minusX(point);
                System.out.println(point.getX());
                break;
            case add_Y:
                pointController.addY(point);
                System.out.println(point.getY());
                break;
            case minus_Y:
                pointController.minusY(point);
                System.out.println(point.getY());
                break;
            default:
                System.out.println("Podano błędną wartość");
        }
    }
}
