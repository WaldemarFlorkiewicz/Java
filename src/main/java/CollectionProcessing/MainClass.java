package CollectionProcessing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
    public static int sCounter = 0;
    public static int fiveWordsCounter = 0;

    public static void main(String[] args) throws FileNotFoundException {
        var reader = new BufferedReader(new FileReader("LoremIpsum"));

        List<String> words = reader.lines()
                .map(line -> line.split(" "))
                .flatMap(Arrays::stream)
                .map(s -> s.replaceAll(",", "").replaceAll("\\.", ""))
                .collect(Collectors.toList());


        long sCounter = words.stream()
                .filter(s -> s.startsWith("s"))
                .count();


        long count = words.stream()
                .filter(s -> s.length() == 5)
                .count();


        System.out.println(sCounter);
        System.out.println(count);
        for (String word : words) {
            System.out.println(word);
        }

    }
}





