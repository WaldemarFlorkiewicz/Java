package Lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App {

    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> list = generateList(10, () -> random.nextInt(100));
        printNumbersInList(list, p -> System.out.print(p + " "));
        removeNumbersByTwo(list, p -> p % 2 != 0);
        System.out.println();
        printNumbersInList(list, p -> System.out.print(p + " "));

    }

    public static <T> void printNumbersInList (List<T> list, Consumer<T> consumer){
        for (T t : list){
            consumer.accept(t);
        }
    }

    public static <T> List<T> generateList(int elements, Supplier<T> supplier){
        List<T> listOfNumbers = new ArrayList<>();
        for (int i = 0; i < elements ; i++) {
            listOfNumbers.add(supplier.get());
        }
        return listOfNumbers;
    }

    public static <T> void removeNumbersByTwo (List<T> list, Predicate<T> predicate){
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()){
            T tmp = iterator.next();
            if (predicate.test(tmp)){
                iterator.remove();
            }
        }
    }


}
