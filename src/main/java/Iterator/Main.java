package Iterator;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Person> persons = new TreeMap();

        persons.put("Kowalczyk", new Person("Kamil", "Kowalczyk", 23));
        persons.put("Florkiewicz", new Person("Waldemar", "Florkiewicz", 22));
        persons.put("Nowak", new Person("Tomasz", "Nowak", 21));
        persons.put("Dziedzic", new Person("Zbigniew", "Dziedzic", 20));

        Collection<Person> values = persons.values();
        Iterator<Person> iterator = values.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
