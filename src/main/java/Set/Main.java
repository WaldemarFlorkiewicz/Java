package Set;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return -s1.compareTo(s2);
            }
        };

        TreeSet<String> listOfNames = new TreeSet<>(comp);

        try (FileReader fileReader = new FileReader("namespl.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String name = " ";
            while ((name = bufferedReader.readLine()) != null) {
                listOfNames.add(name);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Plik nie istenieje");
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println(listOfNames.size());
        System.out.println(listOfNames);
        System.out.println(listOfNames.first());
        System.out.println(listOfNames.last());

    }

}
