package CollectionClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoApp {
    public static void main(String[] args) {
        List<Integer> numbers = readNumbersFromPlayer();
        Lotto lotto = new Lotto();
        int result = lotto.checkResult(numbers);
        List<Integer> lottoResult = lotto.getLottoResult();
        System.out.println("Twoje liczby: " + numbers);
        System.out.println("Wynik losowania: " + lottoResult);
        System.out.println("Liczba trafień: " + result);

    }

    public static List<Integer> readNumbersFromPlayer() {
        List<Integer> listOfNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz 6 liczb.");
        for (int i = 1; i < 7; i++) {
            System.out.println("Podaj " + i + " liczbe: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            listOfNumbers.add(number);
        }
        return listOfNumbers;
    }
}
