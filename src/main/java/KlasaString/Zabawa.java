package KlasaString;

import java.util.Scanner;

public class Zabawa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc wyrazów do wpisania: ");
        int iloscWyrazow = scanner.nextInt();
        scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < iloscWyrazow ; i++) {
            String wyraz = scanner.nextLine();
            stringBuilder.append(wyraz.substring(wyraz.length() -1));
            //stringBuilder.append("\n");


        }
        scanner.close();

        System.out.println("Wyraz składający się z ostatnich liter wyrazów to: " + stringBuilder.toString().toUpperCase());


        //Scanner input = new Scanner(System.in);

        //System.out.println("Podaj liczbę wyrazów: ");
        //int wordsNumber = input.nextInt();
        //input.nextLine();

        //String[] words = new String[wordsNumber];

        //for (int i = 0; i < wordsNumber; i++) {
        //    System.out.println("Podaj kolejne słowo: ");
        //    words[i] = input.nextLine();
        //}

        //StringBuilder build = new StringBuilder();
        //for (int i = 0; i < wordsNumber; i++) {
        //    build.append(words[i].charAt(words[i].length() - 1));
        //}

        //System.out.println("Nowe słowo: " + build.toString());

        //input.close();

    }
}
